package section7

//使用主构造器声明cnName只读属性
enum class Gender(val cnName: String) {
    MALE("男"), FEMALE("女");

    //定义方法
    fun info() {
        when (this) {
            MALE -> println("天行健，君子以自强不息")
            FEMALE -> println("地势坤，君子以厚德载物")
        }
    }
}