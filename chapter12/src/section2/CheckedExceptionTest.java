package section2;

import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        //下面代码错误，编译器会检查IOException异常
        //因此程序要么捕获该异常，要么显式声明抛出该异常
        try {
            CheckedExceptionKt.foo2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
