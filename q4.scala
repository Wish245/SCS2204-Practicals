 object Sales{
    def totalSales(quant:Double):Double={
        var total = (16.72*quant) - 34.5;
        return total
    }
    def main(args:Array[String])={
        println("Total Wholesale Cost = "+totalSales(60)+" rupees");
    }
 }