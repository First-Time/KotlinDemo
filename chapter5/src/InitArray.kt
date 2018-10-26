fun main(args: Array<String>) {
    //创建包含指定元素的数组（相当于Java数组的静态初始化）
    var arr1 = arrayOf("Java", "Kotlin", "Swift", "Go")
    var intArr1 = arrayOf(2, 4, 500, -34)
    //创建指定长度、元素为null的数组（相当于Java数组的静态初始化）
    var arr2 = arrayOfNulls<Double>(5)
    var intArr2 = arrayOfNulls<Int>(6)
    //创建长度为0的数组
    var arr3 = emptyArray<String>()
    var intArr3 = emptyArray<Int>()
    //创建指定长度、使用Lambda表达式初始化数组元素的数组
    var arr4 = Array(5) { (it * 2 + 97).toChar() }
    var strArr4 = Array(6) { "fkit" }
}