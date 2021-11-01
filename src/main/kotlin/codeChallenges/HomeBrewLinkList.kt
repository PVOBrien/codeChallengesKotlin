package codeChallenges

import java.lang.IllegalArgumentException

class HomeBrewLinkList<F> { // https://github.com/chandragithub2014/LeetCodeAlgorithms/blob/master/app/src/main/java/colruyt/android/techgig/SingleLinkedLst.kt

    private data class InnerNode<T>(var item: T, var next: InnerNode<T>? = null) // , next: Node<E>?
    private var head: InnerNode<F>? = null
    private var tail: InnerNode<F>? = null
    private var size: Int = 0

    fun getSize(): Int {
        return size
    }
    fun isEmpty(): Boolean {
        return size == 0
    }

    fun add(item: F) {
        size++
        val nextHead = InnerNode(item)
        nextHead.next = head
        head = nextHead
        if (tail == null) tail = head
    }

    fun addAt(item: F, location: Int) {

        if (location > size) throw IllegalArgumentException("no location yet available")

//        try {
//            var theNode= head
//            var count: Int = 0
//
//            while (count != location-1) {
//
//            }
//
//        } catch (e: Exception) {
//            e.toString()
//        }
    }

//    fun noLocation(location: Int) {
//        throw
//    }

    fun getHead(): F? {
        return head?.item
    }

    override fun toString(): String {
        var theNode: InnerNode<F>? = head

        val finalString: StringBuilder = StringBuilder().append("The linkedlist head: ${theNode?.item} ")

        while (theNode?.next != null) {
            finalString.append("and next is the ${theNode.next?.item}")
            theNode = theNode?.next
        }

        return "$finalString."
    }

//    private

}