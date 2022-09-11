package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40){
    init {
        println("aquarium initializing")
    }
//    3.4 init {
//         println("Volume: ${width * length * height / 1000} liters")
//     }
//     3.3
       constructor(numberOfFish: Int) : this() {

        val tank = numberOfFish * 2000 * 1.1

        height = (tank / (length * width)).toInt()
    }
//        3.4
         val volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 liter
    fun printSize(){
        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm ")
          println("Volume: $volume litres")
    }
}
