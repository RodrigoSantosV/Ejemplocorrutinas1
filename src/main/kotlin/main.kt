import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println("Empezamos aqui")
    for (i in 0..10) {
        GlobalScope.launch {
            println("Soy una corrotina $i y estoy ejecutandome en segundo plano")
            delay(2000)
            println("Soy una corrotina $i y he terminado aqui")
        }
    }


    println("Esperamos un rato")
    Thread.sleep(20000)
    println("Terminamos aqui")


}