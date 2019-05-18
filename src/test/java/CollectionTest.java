import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class CollectionTest {
    private static Logger log = Logger.getLogger(CollectionTest.class.getName());

    @Test
    public void average(){
        try {
            assertEquals("Среднее значение коллекции",3.0, Collection.average(Arrays.asList(1,2,3,4,5)),0.01);
        }catch (MyException e) {log.log(Level.SEVERE, "Error!", e);}
    }

    @Test
    public void listLength(){
       // try {
            assertEquals("Длина коллекции",5, Collection.listLength(Arrays.asList(1,2,3,4,5)));
        //}catch (MyException e) {log.log(Level.SEVERE, "Error!", e);}
    }

    @Test
    public void strToChar(){
        try {
            assertEquals("Перевод из коллекции строки в коллекцию символов", Arrays.asList("1", "+", "1", "2", ",", "4", "3", "4", "5"),
                    Collection.strToChar(Arrays.asList("1+1", "2,4", "3", "4", "5")));
        }catch (MyException e) {log.log(Level.SEVERE, "Error!", e);}
    }
}