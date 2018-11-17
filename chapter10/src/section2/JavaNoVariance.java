package section2;

import java.util.ArrayList;
import java.util.List;

public class JavaNoVariance {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        //下面代码实际上会导致编译错误
//        List<Object> objs = strs;
        //如果上面代码可以通过，这行代码就会引发异常
        //因为objs引用的集合元素实际上必须是String
//        objs.add(20);
    }
}
