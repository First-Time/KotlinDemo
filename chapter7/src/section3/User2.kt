package section3

class User2(first: String, last: String) {
    var first: String = first
    var last: String = last
    //由于可通过getter方法推断出该属性的类型，因此可省略类型声明
    var fullName
    //自定义getter方法
        get() = "$first.$last"
        set(value) {
            println("执行fullName的setter方法")
            //value字符串中不包含"."或包含几个"."都不行
            if ("." !in value || value.indexOf(".") != value.lastIndexOf(".")) {
                println("您输入的fullName不合法")
            } else {
                var tokens = value.split(".")
                first = tokens[0]
                last = tokens[1]
            }
        }
}