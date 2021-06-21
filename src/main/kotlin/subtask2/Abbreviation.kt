package subtask2

class Abbreviation {
    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val reA = Regex("[a-zA-Z]+")
        val reB = Regex("[A-Z]+")
        if (reA.matches(a) && reB.matches(b)){
            var achange = a.toLowerCase()
            for(char in b.toLowerCase()){
                if(achange.indexOf(char) != -1){
                    achange = achange.substring(achange.indexOf(char) + 1)
                } else return "NO"
            }
            return "YES"
        } else return "NO"
    }
}
