import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.LinkedList;

import static org.mockito.Mockito.*;

/**
 * Created by fujioka on 2017/06/23.
 */
public class CatTest {
    private String args[] = {""};
    private String argsRF[] = {"/Users/fujioka/Dropbox/UnitTest/Cat/src/test/resources/text"};

    @Test
    public void test() {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        Cat cat = new Cat();
        cat.main(argsRF);
        verify(out).print('a');
    }

    @Test
    public void testMain_ReceiveFile() {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        Cat cat = new Cat();
        cat.main(argsRF);

        try {
            String input = "aaa\n";
            for (int i = 0; i < input.length(); i++) {
                verify(out).print(input.charAt(i));
            }
        } catch (Exception ex) { }
    }

}