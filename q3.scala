object Sphere {
    def volOfSphere(radius:Double): Double={
        var vol = (4/3) * math.Pi * radius * radius * radius;
        return vol;
    }
    def main(args: Array[String])={
        println("volume of the sphere is "+ volOfSphere(5) + "cubick centemeteres");
    }
}