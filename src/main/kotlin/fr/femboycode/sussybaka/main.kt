package fr.femboycode.sussybaka

fun main(args: Array<String>) {
    val result: Pair<Boolean, String?> = when(args.length) {
        0 -> Pair(false, "Please input a process to run.")
        1 -> Pair(true, null)
        else -> Pair(false, "Invalid input")
    }

    if(!result.first) {
        println(result.second)
        return
    }
}