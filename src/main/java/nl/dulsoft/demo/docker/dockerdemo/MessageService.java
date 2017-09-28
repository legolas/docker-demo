package nl.dulsoft.demo.docker.dockerdemo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
@Service
public class MessageService {

    static final String MESSAGE_FMT = "Hello, %s!%nWelcome in Dublin.";

    String getMessage(String... names) {
        if (names.length<= 0) {
            names = new String[] {"SDB Collega's"};
        }
        return getNamedMessage(names[0]);
    }

    private String getNamedMessage(String name) {
        return String.format(MESSAGE_FMT, name);
    }
}
