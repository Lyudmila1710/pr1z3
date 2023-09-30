fun main() {
    println("Введите число:")
    var a=readln().toInt()
    var s1=""
    var s2=""
    var b:Int
    while(a>0){
        b=a%2
        s1=b.toString()
        a/=2
        s2=s1+s2}
    println("Вот ваше число в 2-ичной системе: $s2")
}