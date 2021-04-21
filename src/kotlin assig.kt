fun main() {
   println (isEven(2))
    println(isEven(7))
   println(isEven(9))

    var shop=product("matama",12,20,"grocerie")
    shop.grouping()






println(game("mango"))



}
fun isEven(num:Int):Boolean {
    if(num%2==0){
        return true
    }
    else{
        return false
    }
}







data class  product(var name:String,val weight:Int ,var price: Int,var category:String){
    fun grouping(){
        var grocerie=listOf<String>()
        var hygiene= listOf<String>()
        when(category){
            "grocerie"->println(grocerie+name)
            "hygiene"->println(hygiene+name)
            else->println(name)
        }
    }
}





fun game(name:String):String {
    var k = ""
    for (items in name) {
        if (name. indexOf (items)% 2 == 0)
            print(items)
    }
    return "${k}"
}





        fun animal(name:Array<String>):ArrayList<String>{
            var nameArray=ArrayList<String>()
            return nameArray
        }








