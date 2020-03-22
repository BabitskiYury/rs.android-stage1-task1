package subtask4

import sun.rmi.runtime.Log
import java.lang.Exception

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val result = ArrayList<String>()

        val symbols = "[<("
        val closingSymbol = "]>)"

        var symbolType = 0
        var counter = 0

        for(i in inputString.indices){
            symbolType = symbols.indexOf(inputString[i])
            if(symbolType != -1){
                counter = 0
                var tmpStr = ""
                for(j in i + 1 until inputString.length){
                    if(inputString[j] == closingSymbol[symbolType] && counter == 0)
                        break
                    tmpStr += inputString[j]
                    if(inputString[j] == symbols[symbolType])
                        counter++
                    if(inputString[j] == closingSymbol[symbolType])
                        counter--
                }
                result.add(tmpStr)
            }
        }
        return result.toTypedArray()
    }
}