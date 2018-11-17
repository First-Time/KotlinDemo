package section1

import java.io.FileInputStream

fun main(args: Array<String>) {
    var fis: FileInputStream? = null

    try {
        fis = FileInputStream("a.txt")
    } catch (e: Exception) {
        println(e.message)
        //return语句强制方法返回
//        return
        //使用exit退出虚拟机
        System.exit(1)
    } finally {
        //关闭磁盘文件，回收资源
        fis?.close()
        println("执行finally块里的资源回收！")
    }
}