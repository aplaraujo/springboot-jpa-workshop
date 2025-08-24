package com.exemplo.springboot_jpa_workshop.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.exemplo.springboot_jpa_workshop.entities.Order;
import com.exemplo.springboot_jpa_workshop.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable // classe auxiliar de chave composta
public class OrderItemPK implements Serializable {

    private static final long serialVersionUID = 1L;

    // referência para o produto
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    
    // referência para o pedido
    @ManyToOne // relacionamento de muitos para um com o pedido do produto
    @JoinColumn(name = "order_id")
    private Order order;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.product);
        hash = 89 * hash + Objects.hashCode(this.order);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderItemPK other = (OrderItemPK) obj;
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return Objects.equals(this.order, other.order);
    }
}
