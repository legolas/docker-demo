package nl.dulsoft.demo.docker.dockerdemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
public class MessageServiceTest {

    @Test
    public void itShouldReturnDefaultMessage() {
        assertEquals(MessageService.DEFAULT_MESSAGE, new MessageService().getMessage());
    }

    @Test
    public void itShouldReturnCustomMessage() {
        assertEquals(String.format(MessageService.MESSAGE_FMT, "Test"), new MessageService().getMessage("Test"));
    }

    @Test
    public void itShouldReturnCustomMessageUsingOnlyFirstArgument() {
        assertEquals(String.format(MessageService.MESSAGE_FMT, "Test1"), new MessageService().getMessage("Test1", "Test2"));
    }
}