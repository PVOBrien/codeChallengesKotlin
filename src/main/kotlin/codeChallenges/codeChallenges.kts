package codeChallenges

class helloWorldOne {
    fun hW() {
        println("Hello World!")
    }
}

class twoNumbersLL {

    var li = ListNode(5)
    var v = li.`val`

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        println("this is l1: " + l1)
        return l2
    }

}
