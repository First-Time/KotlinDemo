fun main(args: Array<String>) {
    //测试把一个浮点数分解成整数部分和小数部分
    println(divide(236711125.123).contentToString())
    //测试把一个4位的数字字符串编程汉子字符串
    println(toHanStr("6109"))
}

/**
 * 把一个浮点数分解成整数部分和小数部分字符串
 * @param num 需要被分解的浮点数
 * @return 分解出来的整数部分和小数部分
 * 第一个数组元素是整数部分，第二个数组元素是小数部分
 */
fun divide(num: Double): Array<String> {
    //将一个浮点数强制类型转换为Long型，即得到它的整数部分
    var zheng = num.toLong()
    //浮点数减去证书部分，得到小数部分，小数部分乘以100后再取整得到2位小数
    var xiao = Math.round((num - zheng) * 100)
    //下面把整数转换为字符串
    return arrayOf(zheng.toString(), xiao.toString())
}

val hanArr = arrayOf("零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖")
val unitArr = arrayOf("十", "百", "千")

/**
 * 把一个4位的数字字符串编程汉子字符串
 * @param numStr 需要被转换的4位的数字字符串
 * @return 4位的数字字符串被转换成汉字字符串
 */
fun toHanStr(numStr: String): String {
    var result = ""
    val numLen = numStr.length
    //依次遍历数字字符串的每一位数字
    for (i in 0 until numLen) {
        //把Char型数字转换成Int型数字，因为它们的ASCII码值恰好相差48
        //因此把Char型数字减去48得到Int型数字，例如'4'被转成成4
        var num = numStr[i].toInt() - 48
        //如果不是最后一位数字，而且数字不是0，则需要添加单位（千、百、十）
        if (i != numLen - 1 && num != 0) {
            result += hanArr[num] + unitArr[numLen - 2 - i]
        }
        //否则不要添加单位
        else {
            result += hanArr[num]
        }
    }
    return result
}