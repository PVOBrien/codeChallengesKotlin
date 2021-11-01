package codeChallenges

import org.junit.Test
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse

@DisplayName("Tests")
class CodeChallengeTests {

    @Test
    @DisplayName("first Test...")
    fun `play Hello World`() {
        println("Hello WOrld!")
    }

    @Test
    fun playOtherHW() {
        var helloW = CodeChallenges.helloWorldOne() // how to initialize an object in kotlin
        helloW.hW()
    }

    @Test
    fun seeNode() {
        val thisLL = HomeBrewLinkList<Int>()
        assert(thisLL.getHead() == null)
        assert(thisLL.isEmpty())

        thisLL.add(9)
        assertEquals(9, thisLL.getHead())
        assertEquals(1, thisLL.getSize())

        assertFailsWith<IllegalArgumentException> {
            thisLL.addAt(
                5,
                5
            )
        } // https://www.baeldung.com/kotlin/assertfailswith#:~:text=The%20Kotlin%20standard%20library%20also%20provides%20a%20function,the%20failure%20message%20only%20when%20the%20assertion%20fails%3A

        thisLL.add(8)
        assertEquals(2, thisLL.getSize())

        println(thisLL.toString())
    }

    @Test
    fun reverseFive() {
        reverseIt("howdy there you")

//        val number = 9
//        var aNode = Node(number)

//        val anotherNumber = 8
//        var nextNode = Node(anotherNumber)

//        aNode.next = nextNode

//        println(aNode.next)

//        assertEquals(9, aNode.item)
//        assert(nextNode == aNode.next)
    }
}