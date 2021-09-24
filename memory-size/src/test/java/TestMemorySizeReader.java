import org.junit.Test;
import static org.junit.Assert.*;

public class TestMemorySizeReader {
    @Test
    public void test_32GB(){
        assertEquals(MemorySizeReader.actualMemorySize("32GB"), "29.76GB");
    }

    @Test
    public void test_2GB(){
        assertEquals(MemorySizeReader.actualMemorySize("2GB"), "1.86GB");
    }

    @Test
    public void test_512GB(){
        assertEquals(MemorySizeReader.actualMemorySize("512MB"), "476MB");
    }

}
