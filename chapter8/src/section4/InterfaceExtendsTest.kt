package section4

interface InterfaceA {
    val propA: Int
        get() = 5

    fun testA()
}

interface InterfaceB {
    val propB: Int
        get() = 6

    fun testB()
}

interface InterfaceC : InterfaceA, InterfaceB {
    val propC: Int
        get() = 7

    fun testC()
}