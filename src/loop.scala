
object Loop {
    def main(args:Array[String]){

        // 第一种
        var a = 0
        for(a <- 1 to 10){
            println(a)
        }
        // 
        for(a <- 1 until 10){
            println(a)
        } 
        //相当于嵌套循环
        var b = 0
        for(a <- 1 to 2;b <- 2 to 5){
            println("a = " + a)
            println("b = " + b)
        }

        //for循环集合
        var numList = List(1,2,3,4,5,6)
        for(a <- numList){
            println(a)
        }

        //循环过滤（带有过滤条件的循环）
        for(a <- numList if a > 2 ; if a < 4){
            println(a)
        }

        //使用yield的循环
        var reVal = for{a <- numList if a != 3}yield a
        for(a <- reVal){
            println(a)
        }
    }
}