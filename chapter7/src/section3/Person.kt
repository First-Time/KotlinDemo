package section3

class Person(name: String, age: Int) {
    //使用private修饰属性，将这些属性隐藏起来
    private var name = name
    set(newName) {
        //执行合理性校验，要求用户名必须在2~6位之间
        if (newName.length > 6 || newName.length < 2) {
            println("您设置的人名不符合要求")
        } else {
            field = newName
        }
    }
    var age = age
    set(newAge) {
        //执行合理性校验，要求用户年龄必须在0~100之间
        if (newAge > 100 || newAge < 0) {
            println("您设置的年龄不合法")
        } else {
            field = newAge
        }
    }
}