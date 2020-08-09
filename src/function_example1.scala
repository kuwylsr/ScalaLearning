
// 写一个 scala 脚本

def addMultiply(x: Int, y: Double, s: String): Double = {
    println(s)
    (x + y) * 2.1
}

val r2: Double = addMultiply(7,9,"Inside addMultipy")

def test(x: Int, y: Double, s: String, expected: Double): Unit = {
    val result = addMultiply(x,y,s)
    assert(result == expected, "Expected " + expected + " But, Got " + result)
    println("result: " + result)
}

test(7,9,"Inside addMultipy", 33.5)