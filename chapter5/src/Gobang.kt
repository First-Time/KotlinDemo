//定义棋盘的大小
val BOARD_SIZE = 15
//定义一个二维数组来冲当棋盘
var board = Array(BOARD_SIZE) { Array(BOARD_SIZE) { "" } }

fun initBoard() {
    //把每个元素赋为"+"，用于在控制台画出棋盘
    for (i in 0 until BOARD_SIZE) {
        for (j in 0 until BOARD_SIZE) {
            board[i][j] = "+"
        }
    }
}

/**
 * 在控制台输出棋盘的方法
 */
fun printBoard() {
    //打印每个数组元素
    for (i in 0 until BOARD_SIZE) {
        for (j in 0 until BOARD_SIZE) {
            //打印数组元素后不换行
            print(board[i][j])
        }
        //每打印完一行数组元素后输出一个换行符
        println()
    }
}

fun main(args: Array<String>) {
    initBoard()
    printBoard()
    var inputStr = readLine()
    while (inputStr != null) {
        //将用户输入的字符串以逗号(,)作为分隔符，分割成两个字符串
        var postStrArr = inputStr.split(",")
        //将两个字符串转换成用户下棋的坐标
        var xPos = postStrArr[0].toInt()
        var yPos = postStrArr[1].toInt()
        //把对应的数组元素赋为"●"
        board[xPos - 1][yPos - 1] = "●"
        /*
        电脑随机生成两个整数，作为电脑下棋的坐标，赋给board数组
        还涉及
        1.坐标的有效性，只能是数字，不能超出棋盘范围
        2.下的棋的店，不能重复下棋
        3.每次下棋后，需要扫描谁赢了
         */
        printBoard()
        println("请输入您下棋的坐标，应以x,y的格式")
        inputStr = readLine()
    }
}
