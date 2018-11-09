package section1

//该方法的实现思路是：先生成List集合所有索引的随机排列
//然后根据随机排列的索引去List集合中取元素
fun <T> List<T>.shuffle(): List<T> {
    val size = this.size
    //下面的indexArr用于保存List集合的索引的随机排列
    var indexArr = Array(size) { 0 }
    var result: MutableList<T> = mutableListOf()
    //创建随机对象
    val rand = java.util.Random()
    var i = 0
    outer@ while (i < size) {
        //生成随机数
        var r = rand.nextInt(size)
        for (j in 0 until i) {
            //如果r和前面已生成的任意数字相等，则该随机数不可用，需要重新生成
            if (r == indexArr[j]) {
                continue@outer
            }
        }
        //如果上面的循环结束了都没有执行continue，则说明该r是一个不重复的随机数
        //将随机数r存入indexArr数组中
        indexArr[i] = r
        //根据随机的索引读取List集合元素，并将元素添加到result集合中
        result.add(this[r])
        i++
    }
    return result.toList()
}