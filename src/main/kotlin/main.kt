fun main() {
    val timeAgoGo = agoToText(1260)
    println(timeAgoGo)
}

fun agoToText(timeAgo: Int): String {
    val timeAgoTxt: String = when {
        timeAgo >= 0 && timeAgo <= 60 -> "был(а) только что"
        timeAgo > 60 && timeAgo <= 3600 -> calculateMin(timeAgo) + " назад"
        timeAgo >= 3601 && timeAgo <= 86400 -> calculateHours(timeAgo) + " назад"
        timeAgo > 86400 && timeAgo <= 172800 -> "был(а) вчера"
        timeAgo > 172800 && timeAgo <= 259200 -> "был(а) позавчера"
        else -> "был(а) давно"
    }
    return timeAgoTxt
}
fun calculateMin(secAgo: Int): String {
    val secToMin = (secAgo / 60).toInt()
    val minAgoTxt = when {
        secToMin % 10 == 1 && secToMin != 11 -> "был(а) $secToMin минуту"
        secToMin % 10 == 2 && secToMin != 12 -> "был(а) $secToMin минуты"
        secToMin % 10 == 3 && secToMin != 13 -> "был(а) $secToMin минуты"
        secToMin % 10 == 4 && secToMin != 14 -> "был(а) $secToMin минуты"
        else -> "был(а) $secToMin минут"
    }
    return minAgoTxt
}

fun calculateHours(secAgo: Int): String {
    val secToHours = (secAgo / 60 / 60).toInt()
    val hoursAgoTxt = when {
        secToHours % 10 == 1 && secToHours != 11 -> "был(а) $secToHours час"
        secToHours % 10 == 2 && secToHours != 12 -> "был(а) $secToHours часа"
        secToHours % 10 == 3 && secToHours != 13 -> "был(а) $secToHours часа"
        secToHours % 10 == 4 && secToHours != 14 -> "был(а) $secToHours часа"
        else -> "был(а) $secToHours часов"
    }
    return hoursAgoTxt
}
