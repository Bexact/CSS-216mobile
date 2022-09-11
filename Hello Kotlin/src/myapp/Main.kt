package example.myapp
// 1
// fun buildAquarium(){
//     val myAguarium = Aquarium()
//     myAguarium.printSize()
//     myAguarium.height = 60
//     myAguarium.printSize()
// }

// 2
// fun buildAquarium() {
//     val aquarium1 = Aquarium()
//     aquarium1.printSize()

//     val aquarium2 = Aquarium(width = 25)
//     aquarium2.printSize()

//     val aquarium3 = Aquarium(height = 35, length = 110)
//     aquarium3.printSize()

//     val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
//     aquarium4.printSize()
// }
// // 3.3
// fun buildAquarium() {
//     val aquarium6 = Aquarium(29)
//     aquarium6.printSize()
// //     3.4
// //     println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
// // 3.5
//     aquarium6.volume = 70
//     aquarium6.printSize()
// }
// 5.1
fun buildAquarium() {
    val aquarium6 = Aquarium(25,25,40)
    aquarium6.printSize()

}

fun main(){
    buildAquarium()
}
