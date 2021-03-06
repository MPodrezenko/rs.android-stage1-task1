package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {

        var sumArr = input.mapIndexed() { index, value ->
            input.reduce() { total, next -> total + next } - value
        }
        var result = intArrayOf(sumArr.min()!!, sumArr.max()!!)
        return result
    }
}
