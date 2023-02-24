package tn.ey.dev.kaddemproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.ey.dev.kaddemproject.entities.Universite;

@SpringBootApplication
public class KaddemProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaddemProjectApplication.class, args);
        Universite uni = Universite.builder()
                .nomUniv("Esprit")
                .build();
    }

}
