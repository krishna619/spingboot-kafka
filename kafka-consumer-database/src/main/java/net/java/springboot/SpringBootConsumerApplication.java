package net.java.springboot;

import net.java.springboot.entity.WikimediaData;
import net.java.springboot.repository.WikimediaDataRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumerApplication.class);

    }
}
