import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OctalConverterTest {
    OctalConverter sut;

    @Before
    public void setUp(){
        sut = new OctalConverter();
    }

    @After
    public void tearDown(){
        sut = null;
    }

    @Test
    public void typeInt_Test(){
        String result = sut.convert(29);
        assertEquals(29, Integer.parseInt(result, 8));
    }

    @Test
    public void typeDouble_Test(){
        String result = sut.convert(29.29);
        assertEquals("035.224365605075", result);
    }
}
