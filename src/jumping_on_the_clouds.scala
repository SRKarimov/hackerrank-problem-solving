object jumping_on_the_clouds extends App {
    def jumpingOnClouds(c: Array[Int]): Int = {
        var count = 0
        var i = 0
        var _c = c.length - 1

        do{
            if ((i + 2) <= _c && c(i + 2) == 0) i += 2
            else if (((i + 1) <= _c) && c(i + 1) == 0) i += 1
            count += 1
        } while (i < _c)

        count
    }

    println(jumpingOnClouds(Array(0, 0, 1, 0, 0, 1, 0)) == 4)
    println(jumpingOnClouds(Array(0, 0, 0, 1, 0, 0)) == 3)
}
