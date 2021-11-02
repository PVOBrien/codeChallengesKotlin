package codeChallenges

class oneAtATime {

    fun biggAh(s: String): String {
        var buildit: StringBuilder = StringBuilder("")
        for ((index, value) in s.iterator().withIndex()) { // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/with-index.html
            var charSB: StringBuilder = StringBuilder("")
            for (i in 1..index+1) {
                if (i == 1) charSB.append(value.uppercaseChar())
                else charSB.append(value.lowercaseChar())
            }
            buildit.append(charSB)
            if (index+1 != s.length) buildit.append("-")
        }
        return buildit.toString()
    }

}