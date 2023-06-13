object temp {
    def farToCel(cel:Double):Double={
        var far = (cel * 1.8000) + 32.00;
        return far;
    }
    def main(args: Array[String])={
        println("Temperature in Fahrenhit "+farToCel(35.00)+"F");
    }
}