fun main() {
person("mayar", 27, "","Youthful")
    person("magdi", 60, "classic","")

}
fun person (name:String ,
            age:Int ,
            old:String ,
            young:String ,
            job:String = "Engineer") {
    if (age > 35)
    println("Im $name, Im $age years old, really $old and Im $job")
     else
        println("Im $name, Im $age years old, really $young")

}