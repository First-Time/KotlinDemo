fun main(args: Array<String>) {
    val s = "java.lang.String"
    //使用反射获取String类的length()方法
    val mtd = Class.forName(s).getMethod("length")
    //使用传统方法，使用Method对象的invoke方法
    println(mtd.invoke("java")) //输出4
    //使用调用运算符
    println(mtd("java")) //输出4
}