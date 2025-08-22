package com.exemplo.springboot_jpa_workshop.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.exemplo.springboot_jpa_workshop.entities.User;
import com.exemplo.springboot_jpa_workshop.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Victor Heitor André Brito", "victor_heitor_brito@optovac.com.br", "(83) 3554-2144", "QWsxqyHJn7");
        User u2 = new User(null, "Caroline Pietra Sophie Novaes", "caroline_novaes@raioazul.com.br", "(68) 2749-7187", "3hqIBFaMc1");
        User u3 = new User(null, "Elza Bruna Débora Barbosa", "elza.bruna.barbosa@gaviola.com", "(68) 3899-6815", "fJ1cDKrE0j");
        User u4 = new User(null, "Anderson Marcos Vinicius Arthur Dias", "anderson_dias@said.adv.br", "(46) 2830-7856", "IdQIucbCbi");
        User u5 = new User(null, "Alexandre Theo Santos", "alexandre.theo.santos@pibnet.com.br", "(24) 3670-8920", "r0H0xSSCIZ");

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));
    }


}
