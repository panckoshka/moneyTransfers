package musicLover

const val STANDARTDISCOUNT: Int = 100
const val MAXDISCOUNT: Double = 0.05
const val LOVERDISCOUNT: Double = 0.01
const val NAME: String = "покупатель"
const val LOVERNAME: String = "меломан"

fun main() {
    print("Ведите имя покупателя (покупатель или меломан): ")
    val buyerName = readln()

    print("Ведите сумму покупики(в рублях): ")
    val check: UInt = readln().toUInt()

    if (buyerName == NAME && check < 1_001u) {
        println("никаких скидок нет")
        return
    } else if (buyerName == LOVERNAME && check < 1_001u) {
        val count: Double = check.toDouble() * LOVERDISCOUNT
        println("скидка соствавит: ${Math.ceil(count)} руб.")
        return
    } else if (buyerName == NAME && check < 10_001u) {
        println("скидка: $STANDARTDISCOUNT")
        return
    } else if (buyerName == LOVERNAME && check < 10_001u) {
        val count: Double = check.toDouble() * LOVERDISCOUNT + STANDARTDISCOUNT
        println("скидка соствавит: ${Math.ceil(count)} руб.")
        return
    } else if (buyerName == NAME && check >= 10_001u) {
        val count: Double = check.toDouble() * MAXDISCOUNT
        println("скидка соствавит: ${Math.ceil(count)} руб.")
        return
    } else {
        val count: Double =
            ((check.toDouble() - (check.toDouble() * MAXDISCOUNT)) * LOVERDISCOUNT) + (check.toDouble() * MAXDISCOUNT)
        println("скидка соствавит: ${Math.ceil(count)} руб.")
    }
}
