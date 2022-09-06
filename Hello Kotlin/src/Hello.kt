fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
}
//2.1
//fun main(args: Array<String>) {
//    val isUnit = println("This is an expression")
//    println(isUnit)
//}
//2.3 2.4
//fun main(args: Array<String>) {
//    val temperature = 10
//    val isHot = if (temperature > 50) true else false
//    println(isHot)
//}
//2.5
// fun main(args: Array<String>) {
//     val temperature = 10
//     val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
//     println(message)
// }
// 3.1
// fun feedTheFish() {
//     val day = randomDay()
//     val food = "pellets"
//     println ("Today is $day and the fish eat $food")
// }

// fun main(args: Array<String>) {
//     feedTheFish()
// }
// fun randomDay(): String {
//     var week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
//         "Friday", "Saturday", "Sunday")
//     return week[java.util.Random().nextInt(week.size)]
// }
