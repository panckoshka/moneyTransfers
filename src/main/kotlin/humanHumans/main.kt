package humanHumans

const val HUMAN: String = "человеку"
const val HUMANS: String = "людям"


fun main() {
    print("Введите число likes: ")
    val likes: String = readln()
    if (likes == "11" && likes.last() != '1') {
        println("Понравилось $likes $HUMANS")
    } else {
        println("Понравилось $likes $HUMAN")
    }
}