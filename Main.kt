fun main() {
    print("Введите число: ")
    val num = readln().toInt()
    sieve_of_eratosthenes(num)
}
fun removeNum(array: IntArray, num: Int): IntArray {
    return array
        .filter { it != num }
        .toIntArray()
}

fun sieve_of_eratosthenes(n: Int) {
    var array = IntArray(n-1, { 0 })
    var i = 0
    while(i <= n - 2){
        array[i] = i + 2
        i++
    }

    var j = 2
    var p = generateSequence(j*j){ if (it < n) it + j else null}

    var z = 0
    var d = array[z]
    for (d in p) {
        array = removeNum(array, d)
        }
    z++
    j++

    print("Список простых чисел до $n: ")
    println(array.contentToString())
}


