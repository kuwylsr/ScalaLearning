
object Add{
    
    def addInt(a:Int,b:Int):Int = {
        var sum : Int = 0
        sum = a + b
        return sum
    }

    def printMe() : Unit = {
        println("Hello Scala!")
    }

    // 函数的传名调用以及传值调用
    def time() = {
        println("获取时间，单位为纳秒")
        System.nanoTime
    }
    def delayed1(t:Long,a:Int) = { // 传值调用
        println("在delayed方法内")
        println("参数: "+t)
    }
    def delayed2(t: =>Long,a:Int) = { // 传名调用
        println("在delayed方法内")
        println("参数: "+t)
    }


    def main(args: Array[String]){
        var a : Int = 5
        var sum : Int = addInt(1,2)
        printMe()
        println(sum)
        println("传值调用：")
        delayed1(time(),a)
        println("传名调用：")
        // delayed2(time(),a)

        println(a)
    }
}

