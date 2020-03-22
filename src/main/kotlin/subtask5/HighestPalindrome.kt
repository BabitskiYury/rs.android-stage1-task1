package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val size = digitString.length/2

        val result = StringBuilder(digitString)

        var changes = k
        var numberOfChangesAvailable = 0
        for(i in 0 until size)
        {
            if(digitString[i]!=digitString[digitString.length-1-i])
                numberOfChangesAvailable++
        }
        numberOfChangesAvailable = changes-numberOfChangesAvailable
        if(numberOfChangesAvailable<0)
            return "-1"

        for(i in 0 until size)
        {
            if(digitString[i]!=digitString[digitString.length-1-i]) {
                if (numberOfChangesAvailable > 0 && (digitString[i] != '9'
                            && digitString[digitString.length - 1 - i] != '9')) {
                    result.setCharAt(i, '9')
                    result.setCharAt(digitString.length - i - 1, '9')
                    numberOfChangesAvailable--
                    changes -= 2
                } else {
                    val temp = maxOf(digitString[i], digitString[digitString.length - 1 - i])
                    result.setCharAt(i, temp)
                    result.setCharAt(digitString.length - 1 - i, temp)
                    changes--
                }
            }
        }
        return result.toString()
    }
}
