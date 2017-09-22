package nl.dulsoft.demo.docker.dockerdemo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Collections;

import static junit.framework.TestCase.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
@RunWith(SpringRunner.class)
public class DockerDemoApplicationTest {


//    @MockBean
//    MessageService messageService;

    @Test
    public void itShoudldCallMessageServiceWithoutArgument() {
//        assertNotNull(messageService);
//        when(messageService.getMessage()).thenReturn("Hello world");
        String[] args = new String[]{""};

        DockerDemoApplication.main(args);

//        verify(messageService).getMessage();
    }
}

