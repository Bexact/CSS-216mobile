package example.myapp

// abstract class AquariumFish {
//     abstract val color: String
// }
// interface FishAction{
//     fun eat()
// }
// class Shark: AquariumFish(), FishAction {
//     override val color = "grey"
//     override fun eat() {
//         println("hunt and eat fish")
//     }
// }

// class Plecostomus: AquariumFish(), FishAction {
//     override val color = "gold"
//     override fun eat() {
//         println("eat algae")
//     }
// }
// 7
interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

class Plecostomus (fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("eat algae"),
        FishColor by fishColor

class Shark: FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}
object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
