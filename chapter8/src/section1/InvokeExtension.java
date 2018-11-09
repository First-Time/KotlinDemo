package section1;

public class InvokeExtension {
    public static void main(String[] args) {
        //创建Raw对象
        Raw t = new Raw();
        //调用Raw对象的成员方法
        t.test();
        //调用Raw对象的扩展方法，需要自己解析成调用扩展函数
//        Raw_infoKt.info(t);
        //创建RawSub对象
        RawSub rs = new RawSub();
        //调用RawSub对象的成员方法
        rs.test();
        rs.sub();
        //调用RawSub对象的扩展方法，需要自己解析成调用扩展函数
//        Raw_infoKt.info(rs);
    }
}
