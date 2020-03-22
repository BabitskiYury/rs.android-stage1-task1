package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = (bill.sum() - bill[k])/2

        if(sum!=b)
            return (b-sum).toString()
        else
            return "Bon Appetit"
    }
}
