fun main() {
    println("Введите число в 10-тичной системе счисления, которое хотите перевести в 2-ичную:")
    var a=readln().toInt()
    var s1=""
    var s2=""
    var b:Int
    while(a>0){
        b=a%2
        s1=b.toString()
        a/=2
        s2=s1+s2}
    println("Вот ваше число в 2-ичной системе счисления: $s2")
}
