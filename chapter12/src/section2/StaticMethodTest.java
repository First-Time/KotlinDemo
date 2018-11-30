package section2;

public class StaticMethodTest {
    public static void main(String[] args) {
        //通过INSTANCE访问MyObject3的单例，通过单例访问test()方法
        MyObject3.INSTANCE.test();
        //错误，test()方法只是单例对象的实例方法
//        MyObject3.test();
        //通过INSTANCE访问MyObject3的单例，通过单例访问foo()方法
        MyObject3.INSTANCE.foo();
        //正确，foo()方法有@JvmStatic修饰，因此foo()方法也是MyObject3类的方法
        MyObject3.foo();

        System.out.println();
        //通过companion访问MyClass3的伴生对象，通过伴生对象访问test()方法
        MyClass3.Companion.test();
        //错误，test()方法只是伴生对象的实例方法
//        MyClass3.test();
        //通过companion访问MyClass3的伴生对象，通过伴生对象访问output()方法
        MyClass3.Companion.output("疯狂软件");
        //正确，output()方法有@JvmStatic修饰，因此output()方法也是MyObject3类的方法
        MyClass3.output("疯狂软件");
    }
}
