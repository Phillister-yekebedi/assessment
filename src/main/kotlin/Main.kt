import javax.naming.Name

fun main() {
    println(sentence("Hopper", "ada"))
    println(arrayOf(2,45,88,2))
//   println((use.split))
    println(senten("hopper", "Lab"))
    Calculator(55,66,6)





}
fun sentence(Name: String, name: String): String{
    var   y= ("$Name")
    var z = ("$name")
    return y

    {}}
fun arrayOf(numb1: Int, numb2: Int, numb3: Int, numb4: Int): Int{
    var numbers = numb1+numb2+numb3+numb4
    return numbers


}
fun split( use:String){
    val use=  "banana"
//    println(use.split)


}
fun senten(Names: String, names: String): String {
    var v = ("$Names" + "$names")
    return v

}
class Calculator(var num1: Int, var num2: Int, var num3: Int){
    fun addition (){
        var additon = num1+num2
        println(additon)
    }
    fun difference(){
        var sub = num2- num3
        println(sub)
    }
    fun division(){
        var div = num3/num1
        println(div)

    }
    fun multiplictaion(){
        var multi= num2*num3
        println()
    }

}

