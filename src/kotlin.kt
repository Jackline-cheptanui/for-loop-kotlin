fun main() {
    digit()
    people()
    name(5)
    name(10)
    name(16)
    place()

}
fun digit(){
    for(x in 1..100){
        if(x%2==1){
            println(x)
        }
    }
}
fun people(){
    var name= arrayOf("sharon","sheila","dog","mammal","house")
    for (people in name){
        if (people.length>5){
            println(people)

        }
    }
}
fun name(age:Int){
    if(age<6){
        println("milk")}
    else if(age<15 && age > 6){
        println("fanta orange") }
    else{
        println("coca cola")
    }
    }
fun number(){
    for(r in 1..100){

    }
}
fun place(){
    for (t in 1..100){
        println(t)
    }
    for (t in 1..100){
        if(t%3==0){
            println("fizz")

        }
        if (t%5==0){
            println("buzz")
        }


    }
    for (t in 1..100){
        if (t%3==0&&t%5==0){
            println("fizzbuzz")
        }
    }

}









