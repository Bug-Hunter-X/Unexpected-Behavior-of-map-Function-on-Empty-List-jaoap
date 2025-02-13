fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }
    println(emptyResult) // Output: []

    //Solution: Using orEmpty() to handle the potential empty list scenario.
    val list2 = listOf(1,2,3)
    val emptyList2 = emptyList<Int>()
    val safeResult = (emptyList2?: listOf(0)).map{ it * 2 }
    val safeResult2 = list2.orEmpty().map{it * 2}
    println(safeResult) //Output: [0]
    println(safeResult2) //Output: [2,4,6]

    //Another approach: Check for emptiness before mapping
    val list3 = listOf<Int>()
    val result3 = if(list3.isNotEmpty()) list3.map {it * 2 } else listOf()
    println(result3) //Output: []
}