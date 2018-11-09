package section7.interface7

//使用主构造器声明cnName只读属性
enum class Gender(val cnName: String) : GenderDesc {
    MALE("男"), FEMALE("女");

    //重写接口中定义的抽象方法
    override fun info() {
        when (this) {
            section7.Gender.MALE -> println("天行健，君子以自强不息")
            section7.Gender.FEMALE -> println("地势坤，君子以厚德载物")
        }
    }
}