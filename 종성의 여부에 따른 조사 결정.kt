fun main() {
    val word = readLine()!!.toString()

    //todo 단어의 뒤에 올 조사를 결정함
    println("${decidePostposition(word, "은", "는")} ~~~")
    println()
}

fun decidePostposition(word: String, existCoda: String, notExistCoda: String): String  {
    val lastChar: Char = word[word.length - 1]

    // 한글의 시작(가)이나 끝(힣) 범위 초과시 오류
    if(lastChar.code < 0xAC00 || lastChar.code > 0xD7A3) {
        return word
    }
    val postposition: String =
        if ((lastChar.code - 0xAC00) % 28 > 0) existCoda
        else notExistCoda

    return word+postposition
}
