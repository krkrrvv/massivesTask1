fun main() {
    var str: Int
    while (true)
    {
        print("Введите количество строк: ")
        val s = readln().toIntOrNull()
        if (s == null)
        {
            println("Необходимо ввести число!")
        }
        else if (s < 1)
        {
            println("Количество строк должно быть положительным!")
        }
        else
        {
            str = s
            break
        }
    }
    var stl: Int
    while (true)
    {
        print("Введите количество столбцов: ")
        val s = readln().toIntOrNull()
        if (s == null)
        {
            println("Необходимо ввести число!")
        }
        else if (s < 1)
        {
            println("Количество столбцов должно быть положительным!")
        }
        else
        {
            stl = s
            break
        }
    }
    val m = Array(str)
    { IntArray(stl) }
    for (i in 0 .. m.size - 1)
    {
        for (j in 0 .. m[0].size - 1)
        {
            print("Введите трехзначное число: ")
            var num = readln()
            while ( num.toIntOrNull() == null || num.toInt() < 100 || num.toInt() > 999)
            {
                println("Ошибка ввода!")
                print("Введите трехзначное число: ")
                num = readln()
            }
            m[i][j] = num.toInt()
        }
    }
    val dig = mutableSetOf<Int>()
    println("Полученный массив:")
    for (i in 0 .. m.size - 1)
    {
        for (j in 0 .. m[0].size - 1)
        {
            print("${m[i][j]}\t")
            var num = m[i][j]
            while (num > 0)
            {
                dig.add(num % 10)
                num /= 10
            }
        }
        println()
    }
    println("В массиве использовано ${dig.size} различных цифр")

}

