package moneyTransfers

const val MINTASK: Double = 3_500.0
const val PENNY: Double = 100.0
const val PERCENT: Double = 0.0075


fun main() {
    print("Введите сумму перевода в рублях (не менее 35(руб)): ")
    val transfer: Int = readln().toInt()
    val amount: Double = transfer * PENNY

    if (amount < MINTASK) {
        println("Перевод меньше 35 руб.")
        return
    }
    if (amount == MINTASK) {
        println("Перевод равен 35 руб. Комиссия съела ваш перевод :Р")
        return
    }
    val transferTask: Double = amount * PERCENT / PENNY
    if (transfer <= MINTASK) {
        println("Комиссия составит 35 руб.")
    } else {
        println("Комиссия составит: $transferTask руб")
    }
}