fun main() {
    people("Yasmin", "Respah", "Jerop", "Atta")
    citiesName("harare", "mumbai", "dodoma", "jakarta")
    values(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    var list = names("Alla","Samiya","Mahad")
    println(list)

}

/*  Create a function that takes in 4 strings  and creates an array out of them then
prints out the array */
fun people(first:String, second:String, third:String,fourth:String){
    val personName = arrayOf(first, second, third, fourth )
    println(personName.contentToString())
}

/* Create a function that given an array below:
var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
prints out the names of the cities in the correct grammatical case.  */

fun citiesName(a:String, b:String, c:String, d:String){
    var cities = arrayOf(a,b,c,d)
    cities.forEach{ area->
        println(area.capitalize())

    }
}

/* Create one function that given the below array:
var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
(i) prints out the sum of the second and fifth elements     */
fun values(numbers:Array<Int>){
    var addition = numbers[1] + numbers[4]
    println(addition)

// (ii) prints out the index of 158
    println(numbers.indexOf(158))

// iii) prints out the elements in ascending order
    var sortNumber=numbers.sortedArray()
    println(sortNumber.contentToString())


}

/* a function that takes in 3 names and returns a string array containing
all 3 names  */

fun names(x:String, r:String, u:String):String{
    var persons = arrayOf(x,r,u)
    var nam = persons.contentToString()
    return nam
}

