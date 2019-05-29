import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;


public class Collection {

    public static double average(List<Integer> listInt) throws MyException{
        if(listInt.isEmpty()){
            throw new MyException(ErrorCode.NotFindElem);
        }
        return listInt.stream().mapToInt(e -> e).average().orElseThrow(NoSuchElementException::new);
    }

    public static double listLength(List<Integer> listInt) { return listInt.stream().count(); }

    public static List<String> strToChar(List<String> listStr) {
        return listStr.stream().map(e->e.split("")).flatMap(e->Arrays.stream(e)).collect(Collectors.toList());
    }
}
