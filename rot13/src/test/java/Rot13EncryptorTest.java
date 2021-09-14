import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Rot13EncryptorTest {
    private Rot13Encryptor sut;

    @Before
    public void setUp(){
        sut = new Rot13Encryptor();
    }

    @After
    public void teardown(){
        sut = null;
    }

    @Test
    public void aaaa(){
        assertEquals("nnnn", sut.encrypt("aaaa"));
    }

    @Test
    public void message1(){
       assertEquals("Jul qvq gur puvpxra pebff gur ebnq?", sut.encrypt("Why did the chicken cross the road?"));
    }

    @Test
    public void message2(){
        assertEquals("To get to the other side!", sut.encrypt("Gb trg gb gur bgure fvqr!"));
    }


}
