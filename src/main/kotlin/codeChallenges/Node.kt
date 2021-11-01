package codeChallenges

data class BadNode<T>(var item: T, var next: BadNode<T>? = null) { // , next: Node<E>?

//    private var value = item
//    private var next: Node<T>? = null

//    fun seeValue(): T = item
//    fun addNext(theNext: Node<T>) { next = theNext }

    override fun toString(): String {
        return "Node(value=$item, next=$next)"
    }
}