package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40){
    init {
        println("aquarium initializing")
    }
    init {
        println("Volume: ${width * length * height / 1000} liters")
    }
//     3.3
       constructor(numberOfFish: Int) : this() {

        val tank = numberOfFish * 2000 * 1.1

        height = (tank / (length * width)).toInt()
    }
    fun printSize(){
        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm ")
    }
}
