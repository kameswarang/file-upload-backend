package me.kamesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

import static java.util.logging.Level.FINE;
import static java.util.logging.Logger.getLogger;

@SpringBootApplication
public class Application {
    private static final Logger LOG = getLogger(Application.class.getName());
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        LOG.log(FINE, "{}", context);
    }
}
