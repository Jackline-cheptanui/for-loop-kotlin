fun main() {
   println (isEven(2))
    println(isEven(7))
   println(isEven(9))

    var shop=product("cabbage",10,20,"groceries")
    println(shop.option())

    var b=game("football")
    print(b[0])
    print(b[2])
    print(b[4])
    print(b[6])
print(game("Banana"))



}
fun isEven(num:Int):Boolean {
    if(num%2==0){
        return true
    }
    else{
        return false
    }
}







data class  product(var name:String,val weight:Int ,var price: Int,var category:String) {
    fun  list(product:String){
        when(category){
          var  groceries-> listOf<String>()
            var hygiene-> listOf<String>()
            when(product)
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




}
        fun student( name:String,Place:){

        }





