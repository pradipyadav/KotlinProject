import android.os.Build
import android.support.annotation.RequiresApi

/**
 * Created by sony on 25/3/18.
 */


//List

fun list(){

    var l= arrayListOf<String>()
    l.add("Android")
    l.add("Kotlin")
    l.add("Java")
    l.add("Angularjs")
    l.add("php")

    l.forEach {
        println(it)
    }
    for (ls in l) println(ls)
}

@RequiresApi(Build.VERSION_CODES.N)
fun map()
{
    val mapp= mapOf(
            1 to "Android",
            2 to "Kotlin",
            3 to "Java",
            4 to "Angular",
            5 to "php"
    )
    mapp.forEach{v,e -> println("Key : $v value : $e" )}
}

@RequiresApi(Build.VERSION_CODES.N)
fun hashmap(){

    var hm= hashMapOf<Int,String>()

    hm.put(1,"Android")
    hm.put(2,"Kotlin")
    hm.put(3,"Android")
    hm.put(4,"Java")

    hm.forEach { (t, u )-> println("key : $t value : $u")  }
    hm.forEach ({ t, u -> println("key : $t value : $u") })

    hm.forEach(fun(t,u){
        println("key : $t value : $u")
    })
}

fun main(args: Array<String>) {
    list()
   // map()
   // hashmap()
}