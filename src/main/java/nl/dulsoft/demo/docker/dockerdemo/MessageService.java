package nl.dulsoft.demo.docker.dockerdemo;

import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
@Service
public class MessageService {

    static final String DEFAULT_MESSAGE = "Hello, SDB Collega's!";
    static final String MESSAGE_FMT = "Hello, %s!";

    String getMessage(String... names) {
        if (names.length > 0) {
            return getNamedMessage(names[0]);
        } else {
            return getDefaultMessage();
        }
    }

    private String getNamedMessage(String name) {
        return String.format(MESSAGE_FMT, name);
    }

    private String getDefaultMessage() {
        return DEFAULT_MESSAGE;
    }
}
