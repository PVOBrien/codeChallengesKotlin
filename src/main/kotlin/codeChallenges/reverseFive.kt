package codeChallenges

fun reverseIt(message: String): String {

    val reverseWord = fun(it: String) : String {
        var newIt = it
        if (it.length > 4) newIt = it.reversed()
        return newIt
    }

    val newWords = message.split(" ").asSequence()
        .map { reverseWord(it) }
        .joinTo(StringBuilder("")," ","","",-1,"...")
        .toString()

    println(newWords)
    return newWords
}

//listOf(1, 2, 3, 4, 5)
//.asSequence()
//.filter { it < 3 }
//.onEach { println("filtered $it") }
//.map { it * 10 }
//.forEach { println("final: $it") }