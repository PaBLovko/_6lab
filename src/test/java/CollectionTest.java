import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class CollectionTest {

    @Test(expected = MyException.class)
    public void average() throws MyException {
        Collection.average(Arrays.asList());
    }

    @Test
    public void listLength() {
        assertEquals("Длина коллекции", 5, Collection.listLength(Arrays.asList(1, 2, 3, 4, 5)), 0.01);
    }

    @Test
    public void strToChar() {
        assertEquals("Перевод из коллекции строки в коллекцию символов", Arrays.asList("1", "+", "1", "2", ",", "4", "3", "4", "5"),
                Collection.strToChar(Arrays.asList("1+1", "2,4", "3", "4", "5")));
    }
}
