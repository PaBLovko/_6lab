import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;


public class Collection {

    public static double average(List<Integer> listInt) throws MyException{
        try {
            return listInt.stream().mapToInt(e -> e).average().orElseThrow(NoSuchElementException::new);
        }catch (NoSuchElementException e) {throw new MyException(ErrorCode.NotFindElem);}
    }

    public static int listLength(List<Integer> listInt) {
        return listInt.size();
    }

    public static List<String> strToChar(List<String> listStr) throws MyException {
        try {
            if(listStr.isEmpty()){
                throw new NoSuchElementException();
            }
            return listStr.stream().map(e->e.split("")).flatMap(e->Arrays.stream(e)).collect(Collectors.toList());
        }catch (NoSuchElementException e) {throw new MyException(ErrorCode.NotFindElem);}
    }
}
