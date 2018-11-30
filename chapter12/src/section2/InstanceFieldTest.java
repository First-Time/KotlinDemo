package section2;

public class InstanceFieldTest {
    public static void main(String[] args) {
        InstanceField ins = new InstanceField("Kotlin");
        //访问InstanceField对象的实例变量
        System.out.println(ins.myName);
    }
}
