package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if(sadArray.size<3)
            return sadArray

        var end = sadArray.size-3

        val mList = sadArray.toMutableList()

        var isOk = false
        while (!isOk){
            isOk = true

            for (i in 0..end){
                if(mList[i] + mList[i+2] < mList[i+1]){
                    mList.removeAt(i+1)
                    isOk = false
                    end-=1
                    break
                }
            }
        }

        return mList.toIntArray()
    }
}
