
fun main(){
    nameofgirls("carol","brenda","joyce","fridah")
    cities(arrayOf("harare","mumbai","dodoma","jakarta"))
    getNumbers(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
    var x=girlsName("carol","jasmine","lavenda")
    println(x)
    println(createarray(arrayOf(1,2,3,4)))
    var y=createstring(arrayOf("i","am","awesome"))
    println(y)
    var z=sumIntegers(arrayOf(23,5.2,6,32,"water",false,32.5f))
    println(z)


}
fun nameofgirls(name1:String,name2:String,name3:String,name4:String){
    var name= arrayOf(name1,name2,name3,name3,name4)
    println(name.contentToString())
}
fun cities(name:Array<String>){
    name.forEach { names ->
        println(names.capitalize())


    }
}
fun getNumbers(name:Array<Int>){
    var numbers= name[2]+name[5]
    println(numbers)

    var answer=name.indexOf(158)
    println(answer)
    var add=name.sortedArray()
    println(add.contentToString())
}
fun girlsName(name1:String,name2:String,name3:String): String {
    var result= arrayOf(name1,name2,name3)
    return result.contentToString()
}
//create a function that takes in an array of integers
//and returns their sum without using the inbuilt.sum() function
//eg given [1,2,3,4] returns 10
fun createarray(nums:Array<Int>):Int{
    var sum=0
    nums.forEach { num->
        sum+= num
    }
    return sum
}
//create a function that takes in a string array and returns
//a sentence composes of all the elements
fun createstring(words:Array<String>):String{
    var sentence=""
    words.forEach { word->
        sentence+=word+ " "
    }
    return sentence
}
//create a function that takes in an array of mixed types
//and sums up the integers only return the sum

fun sumIntegers(mixedArr:Array<Any>):Int{
    var sum=0
    mixedArr.forEach { num ->
      if (num is Int)
            sum+=num
        }
        return sum


}


