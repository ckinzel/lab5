fun main() {
    var cardPoints = 7_000
    // TODO: replace this if with a when
    // try to use ranges!

    val cardLevel:String

    when (cardPoints){
        in 0..999 -> cardLevel = "pearl"
        in 1000..4999 -> cardLevel = "silver"
        in 5000..9999 -> cardLevel = "gold"
        else -> cardLevel = "platinum"
    }
    val plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level, jerk.")
}
