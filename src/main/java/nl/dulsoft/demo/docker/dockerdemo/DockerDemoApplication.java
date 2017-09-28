package nl.dulsoft.demo.docker.dockerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDemoApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(DockerDemoApplication.class);
    private final MessageService messageService;

    public DockerDemoApplication(@Autowired MessageService messageService) {
        this.messageService = messageService;
    }

    public static void main(String[] args) {
        LOGGER.info("Booting DockerDemoApplication");
        SpringApplication.run(DockerDemoApplication.class, args);
    }

    @Override
    public void run(String... arguments) throws Exception {
        showMessage(arguments);
    }

    private void showMessage(String... arguments) {
        LOGGER.info("showMessage called with {} arguments", arguments);
        String name = "SDB Colleagues";
        if (arguments != null && arguments.length > 0 && !arguments[0].isEmpty()) {
            name = arguments[0];
        }

        String message = retrieveMessageFromService(name);
        printMessageOnScreen(message);
        printMessageOnScreen("Welcome to Dublin.");
    }

    private String retrieveMessageFromService(String name) {
        LOGGER.info("retrieveMessageCalled with {}", name);
        return messageService.getMessage(name);
    }

    private void printMessageOnScreen(String message) {
        LOGGER.info("printMessage called with {}", message);
        System.out.println(message);
    }
}
