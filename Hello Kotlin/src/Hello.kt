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

// 3.2.1
// fun feedTheFish() {
//     val day = randomDay()
//     val food = fishFood(day)

//     println ("Today is $day and the fish eat $food")
// }
// fun fishFood (day : String) : String {
//     var food = ""
//     when (day) {
//         "Monday" -> food = "flakes"
//         "Tuesday" -> food = "pellets"
//         "Wednesday" -> food = "redworms"
//         "Thursday" -> food = "granules"
//         "Friday" -> food = "mosquitoes"
//         "Saturday" -> food = "lettuce"
//         "Sunday" -> food = "plankton"
//     }
//     return food
// }
// fun main(args: Array<String>) {
//     feedTheFish()
// }
// fun randomDay(): String {
//     var week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
//         "Friday", "Saturday", "Sunday")
//     return week[java.util.Random().nextInt(week.size)]


// 3.2.2
// fun feedTheFish() {
//     val day = randomDay()
//     val food = fishFood(day)

//     println ("Today is $day and the fish eat $food")
// }
// fun fishFood (day : String) : String {
//     val food : String
//     when (day) {
//         "Monday" -> food = "flakes"
//         "Wednesday" -> food = "redworms"
//         "Thursday" -> food = "granules"
//         "Friday" -> food = "mosquitoes"
//         "Sunday" -> food = "plankton"
//         else -> food = "nothing"
//     }
//     return food
// }
// fun main(args: Array<String>) {
//     feedTheFish()
// }
// fun randomDay(): String {
//     var week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
//         "Friday", "Saturday", "Sunday")
//     return week[java.util.Random().nextInt(week.size)]
// }

// 3.2.3

// fun randomDay() : String {
//     val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//         "Friday", "Saturday", "Sunday")
//     return week[Random().nextInt(week.size)]
// }

// fun fishFood (day : String) : String {
//     return when (day) {
//         "Monday" -> "flakes"
//         "Wednesday" -> "redworms"
//         "Thursday" -> "granules"
//         "Friday" -> "mosquitoes"
//         "Sunday" -> "plankton"
//         else -> "nothing"
//     }
// }

// fun feedTheFish() {
//     val day = randomDay()
//     val food = fishFood(day)
//     println ("Today is $day and the fish eat $food")
// }

// fun main(args: Array<String>) {
//     feedTheFish()
// }



// 4.1
// import java.util.*
// fun swim(speed : String = "fast") {
//     println("swimming $speed")
// }

// fun main(args: Array<String>) {
//     swim()
//     swim("slow")
//     swim(speed = "turtle-like")
// }

// 4.2
// import java.util.*
// fun swim(speed : String = "fast") {
//     println("swimming $speed")
// }

// fun main(args: Array<String>) {
//     feedTheFish()
//     swim()
//     swim("slow")
//     swim(speed = "turtle-like")
// }
// fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
//     return when {
//         temperature > 30 -> true
//         dirty > 30 -> true
//         day == "Sunday" ->  true
//         else -> false
//     }
// }

// fun feedTheFish() {
//     val day = randomDay()
//     val food = fishFood(day)
//     println ("Today is $day and the fish eat $food")
//     println("Change water: ${shouldChangeWater(day)}")
// }
//  fun randomDay() : String {
//      val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//          "Friday", "Saturday", "Sunday")
//      return week[Random().nextInt(week.size)]
//  }
//  fun fishFood (day : String) : String {
//      return when (day) {
//          "Monday" -> "flakes"
//          "Wednesday" -> "redworms"
//          "Thursday" -> "granules"
//          "Friday" -> "mosquitoes"
//          "Sunday" -> "plankton"
//          else -> "nothing"
//      }
//  }

// 4.3 
// import java.util.*
// fun swim(speed : String = "fast") {
//     println("swimming $speed")
// }

// fun main(args: Array<String>) {
//     feedTheFish()
//     swim()
//     swim("slow")
//     swim(speed = "turtle-like")
// }
// fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
//     return when {
//         isTooHot(temperature) -> true
//         isDirty(dirty) -> true
//         isSunday(day) -> true
//         else  -> false
//     }
// }

// fun feedTheFish() {
//     val day = randomDay()
//     val food = fishFood(day)
//     println ("Today is $day and the fish eat $food")
//     println("Change water: ${shouldChangeWater(day)}")
// }
//  fun randomDay() : String {
//      val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//          "Friday", "Saturday", "Sunday")
//      return week[Random().nextInt(week.size)]
//  }
//  fun fishFood (day : String) : String {
//      return when (day) {
//          "Monday" -> "flakes"
//          "Wednesday" -> "redworms"
//          "Thursday" -> "granules"
//          "Friday" -> "mosquitoes"
//          "Sunday" -> "plankton"
//          else -> "nothing"
//      }
//  }
// fun isTooHot(temperature: Int) = temperature > 30

// fun isDirty(dirty: Int) = dirty > 30

// fun isSunday(day: String) = day == "Sunday"


// 5.1

// val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

// fun main() {
//     println( decorations.filter {it[0] == 'p'})
// }

// 5.2

// fun main() {
//     val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")


//     val eager = decorations.filter { it[0] == 'p' }
//     println("eager: $eager")
// }

// 5.3
// fun main() {
//     val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

//     val filtered = decorations.asSequence().filter { it[0] == 'p' }
//     println("filtered: $filtered")
//     val newList = filtered.toList()
//     println("new list: $newList")
// }

// 5.4 
// fun main() {
//     val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

//     val lazyMap = decorations.asSequence().map {
//         println("access: $it")
//         it
//     }

//     println("lazy: $lazyMap")
//     println("-----")
//     println("first: ${lazyMap.first()}")
//     println("-----")
//     println("all: ${lazyMap.toList()}")
// }

// 5.5

// fun main() {
//     val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//     val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
//         println("access: $it")
//         it
//     }
//     println("-----")
//     println("filtered: ${lazyMap2.toList()}")
// }

// 5.6

// fun main() {
//     val mysports = listOf("basketball", "fishing", "running")
//     val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
//     val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
//     val mylist = listOf(mysports, myplayers, mycities)     // list of lists
//     println("-----")
//     println("Flat: ${mylist.flatten()}")
// }
// 6.1
// fun main() {
//     var dirtyLevel = 20
//     val waterFilter = { dirty : Int -> dirty / 2}
//     println(waterFilter(dirtyLevel))
// }

// 6.2
// fun main() {
//     var dirtyLevel = 20
//     val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
//     println(waterFilter(dirtyLevel))
// }
// 6.3
// fun main() {
//     val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
//     println(updateDirty(30, waterFilter))
// }

// fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
//     return operation(dirty)
// }

// 6.4
// fun main() {

//     println(updateDirty(15, ::increaseDirty))
// }

// fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
//     return operation(dirty)
// }
// fun increaseDirty( start: Int ) = start + 1

