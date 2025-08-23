package com.exemplo.springboot_jpa_workshop.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.exemplo.springboot_jpa_workshop.entities.Category;
import com.exemplo.springboot_jpa_workshop.entities.Order;
import com.exemplo.springboot_jpa_workshop.entities.Product;
import com.exemplo.springboot_jpa_workshop.entities.User;
import com.exemplo.springboot_jpa_workshop.entities.enums.OrderStatus;
import com.exemplo.springboot_jpa_workshop.repositories.CategoryRepository;
import com.exemplo.springboot_jpa_workshop.repositories.OrderRepository;
import com.exemplo.springboot_jpa_workshop.repositories.ProductRepository;
import com.exemplo.springboot_jpa_workshop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        User u1 = new User(null, "Victor Heitor André Brito", "victor_heitor_brito@optovac.com.br", "(83) 3554-2144", "QWsxqyHJn7");
        User u2 = new User(null, "Caroline Pietra Sophie Novaes", "caroline_novaes@raioazul.com.br", "(68) 2749-7187", "3hqIBFaMc1");
        User u3 = new User(null, "Elza Bruna Débora Barbosa", "elza.bruna.barbosa@gaviola.com", "(68) 3899-6815", "fJ1cDKrE0j");
        User u4 = new User(null, "Anderson Marcos Vinicius Arthur Dias", "anderson_dias@said.adv.br", "(46) 2830-7856", "IdQIucbCbi");
        User u5 = new User(null, "Alexandre Theo Santos", "alexandre.theo.santos@pibnet.com.br", "(24) 3670-8920", "r0H0xSSCIZ");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID ,u1);

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }


}
