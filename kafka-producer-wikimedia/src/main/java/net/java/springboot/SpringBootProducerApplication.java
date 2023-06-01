package net.java.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.java.springboot.WikimediaChangesProduces;
@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApplication.class);
    }

    @Autowired
    private WikimediaChangesProduces wikimediaChangesProduces;
    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProduces.sendMessage();
    }
}
