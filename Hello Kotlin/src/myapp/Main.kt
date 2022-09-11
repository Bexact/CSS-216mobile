package example.myapp

fun buildAquarium(){
    val myAguarium = Aquarium()
    myAguarium.printSize()
    myAguarium.height = 60
    myAguarium.printSize()
}

fun main(){
    buildAquarium()
}