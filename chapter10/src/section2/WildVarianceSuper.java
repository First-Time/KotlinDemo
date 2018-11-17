package section2;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class WildVarianceSuper {
    public static void main(String[] args) {
        //定义一个Predicate对象
        Predicate<Number> pred = it -> it.doubleValue() > 10;
        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(9);
        intSet.add(32);
        intSet.add(15);
        //removeIf(Predicate<? super E> filter)使用？支持型变
        intSet.removeIf(pred); //使用Predicate<Number>对Set<Int>进行过滤
        System.out.println(intSet);

        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(2.5);
        doubleSet.add(14.4);
        doubleSet.add(3.8);
        doubleSet.add(15.8);
        //removeIf(Predicate<? super E> filter)使用？支持型变
        doubleSet.removeIf(pred); //使用Predicate<Number>对Set<Int>进行过滤
        System.out.println(doubleSet);
    }
}
