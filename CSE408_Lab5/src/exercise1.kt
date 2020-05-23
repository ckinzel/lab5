fun main() {
    print("Enter number(x): ")
    val x = Integer.valueOf(readLine())

    print("Enter number(y): ")
    val y = Integer.valueOf(readLine())

    var ret: Int
    if (x > y) {
        ret = -1
    }
    else if (x < y){
        ret = 1
    }
    else {
        ret = 0
    }
}
