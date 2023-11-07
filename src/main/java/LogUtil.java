import java.util.*;
import java.util.stream.Collectors;

public class LogUtil {

    public static <T> Set<T> getUniqueData(List<T> list) {
        return list.stream().collect(Collectors.toSet());
    }

    public static <T> Map<T, Long> getTopData(List<T> list) {
        return list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }

}
