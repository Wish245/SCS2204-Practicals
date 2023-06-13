object Run{
    def totalRunTime(easy:Int,tempo:Int):Int={
        var total = (easy*4) +(tempo*3);
        return total;
    }
    def main(args:Array[String])={
        println("Total time ran = "+totalRunTime(8,7) + " minuites");
    }
}