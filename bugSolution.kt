fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.mapIndexed { index, value -> list[index] = value * 2 }
    println(list) // Output: [2, 4, 6, 8, 10]

    //Alternatively:
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.replaceAll { it * 2 }
    println(list2) // Output: [2, 4, 6, 8, 10]
}