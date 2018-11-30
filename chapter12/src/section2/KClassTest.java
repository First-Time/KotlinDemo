package section2;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;

public class KClassTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.util.ArrayList");
            System.out.println(clazz);

            //获取Class对象的KClass对象
            KClass kc = JvmClassMappingKt.getKotlinClass(clazz);
            System.out.println(kc);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
