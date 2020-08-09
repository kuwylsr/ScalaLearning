class Outer{
    class Inner{
        private def f(){
            println("f")
        }
        def main(args: Array[String]){ 
            var a : String = "F00"
            a += "s"
            val b : String = "static"
            println(a)
            println(b)
            println("Hello \t world \n!")
        }

        class InnerMost{
            f() //正确
        }
    }
    // f() //错误
}
