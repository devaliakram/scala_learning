object StringInterpolations {


  def main(args: Array[String]){
    val name="ali"
    val age=2544
    println("name is "+ name+ " and age " + age)
    println(s"name is $name and age $age")
    println(f"name is $name%s and age $age%f")

  }
}