package section2

fun List<String>.filterValid(): List<String> {
    val result = mutableListOf<String>()
    for (s in this) {
        if (s.length < 5) {
            result.add(s)
        }
    }
    return result.toList()
}

@JvmName("filterValidInt")
fun List<Int>.filterValid(): List<Int> {
    val result = mutableListOf<Int>()
    for (i in this) {
        if (i < 20) {
            result.add(i)
        }
    }
    return result.toList()
}