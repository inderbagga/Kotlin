import java.util.*

fun main(){

     var notes=Notes()
     println(notes.getValue())
     notes.setValue("notes about life.")
     println(notes.getValue())

     println("aPlayer declared at ${Date(System.currentTimeMillis())}")
     val aPlayer=Player("Beckham",32)

     println("bPlayer declared at ${Date(System.currentTimeMillis())}")
     val bPlayer by lazy { Player("Pele",45) }
}

class Notes{

     private lateinit var about:String

     fun setValue(about:String){ this.about=about }

     fun getValue()=if(::about.isInitialized)this.about else "To do list ..."
}

class Player(name:String,age:Int){

     init {
          println("$name called at ${Date(System.currentTimeMillis())}")
     }
}