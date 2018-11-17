package section2;

import java.util.HashSet;
import java.util.Set;

public class WildVarianceExtends {
    public static void main(String[] args) {
        Set<Number> numSet = new HashSet<>();
        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(3);
        // addAll(Collection<? extends E> c)使用？支持型变
        numSet.addAll(intSet); //此处支持型变：intSet能被当成numSet
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(2.3);
        doubleSet.add(4.3);
        // addAll(Collection<? extends E> c)使用？支持型变
        numSet.addAll(doubleSet); //此处支持型变：doubleSet能被当成numSet
        System.out.println(numSet);
    }
}
