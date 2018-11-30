package section2;

public class MyClass2Test {
    public static void main(String[] args) {
        //直接访问MyObject类的name类变量
        MyObject2.name = "Kotlin";
        System.out.println(MyObject2.name);
    }
}
