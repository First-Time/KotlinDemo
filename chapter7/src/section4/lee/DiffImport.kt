package section4.lee

import java.util.Date
import java.sql.Date as sDate

fun main(args: Array<String>) {
    //使用java.util.Date
    var d = Date()
    //使用java.sql.Date
    var d2 = sDate(System.currentTimeMillis())
    println(d)
    println(d2)
}