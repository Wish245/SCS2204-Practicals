object Area {
    def areaOfDisk(radius:Double):Double =
        {
            var area = math.Pi * radius *radius;
            return area;
        }
    def main(args: Array[String])={
        println("Area of the disk is " + areaOfDisk(5) +"square centemeters");
    }
}