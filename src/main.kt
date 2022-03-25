fun main(){
    var person = Human("Maureen",19,64)
    println("i am eating ${person.eat(20)} kg of food")
    println(person.weight)
    println(person.speak("i am dancing"))
    person.birthday()

    var foreigner = Data("Abel","Juma","abeljuma@gmail.com","+(33)65775527","ajrenee")
    println(foreigner.firstName)
    println(foreigner.lastName)
    println(foreigner.email)
    println(foreigner.phoneNumber)
    println(foreigner.passWord)

}
class Human(var name:String, var age:Int,var weight:Int){
    fun eat(foodWeight:Int):Int{
        weight+=foodWeight
        return foodWeight
    }
    fun speak(speech: String):String{
        return speech
    }
    fun birthday(){
        age++
        println(age)



    }




}
class Data(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var passWord:String)