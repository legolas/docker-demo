package nl.dulsoft.demo.docker.dockerdemo;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.Collections;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
public class DockerDemoApplicationTest {

    @MockBean
    MessageService messageService;

    @Test
    @Ignore
    public void itShoudldCallMessageServiceWithoutArgument() {
        when(messageService.getMessage()).thenReturn("Hello world");
        String[] args = new String[]{""};

        DockerDemoApplication.main(args);

        verify(messageService).getMessage();
    }
}

