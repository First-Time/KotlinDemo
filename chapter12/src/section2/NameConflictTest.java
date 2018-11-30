package section2;

import java.util.Arrays;
import java.util.List;

public class NameConflictTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "Kotlin", "Erlang", "Go", "Swift");
        //调用List<String>扩展的filterValid()方法
        System.out.println(NameConflictKt.filterValid(list1));

        List<Integer> list2 = Arrays.asList(200, 34, 12, 35, -23);
        //调用List<String>扩展的filterValid()方法
        System.out.println(NameConflictKt.filterValidInt(list2));
    }
}
