package nl.dulsoft.demo.docker.dockerdemo;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
//@RunWith(SpringRunner.class)
public class DockerDemoApplicationTest {

    public static final String SDB_COLLEAGUES = "SDB Colleagues";
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Mock
    MessageService messageService;
    @InjectMocks
    private DockerDemoApplication objectUnderTest;

    @Test
    public void itShoudldCallMessageServiceWithoutArgument() throws Exception {
        String[] args = new String[]{};
        when(messageService.getMessage("World")).thenReturn("Hello world");

        objectUnderTest.run();

        verify(messageService).getMessage("World");
    }

    @Test
    public void itShoudldCallMessageServiceWithNameArgument() throws Exception {
        String[] args = new String[]{};
        when(messageService.getMessage(SDB_COLLEAGUES)).thenReturn("Hello " + SDB_COLLEAGUES);

        objectUnderTest.run(SDB_COLLEAGUES);

        verify(messageService).getMessage(SDB_COLLEAGUES);
    }

    @Test
    public void itShouldCallMessageServiceWithoutArguments() {
        objectUnderTest.main(new String[]{});
    }
}
