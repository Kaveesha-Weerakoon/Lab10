
object Q01 {
  def main(args: Array[String]) {
    def calculateAverage(l:List[Double]):Double = {
      val f_arr:List[Double] = l.map((x:Double) => ((x*9.0)/5)+32);
      val total:Double = f_arr.reduce((x,y) => x+y);
      return total/f_arr.length;
    }
    
    println("Average Fahrenheit temperature : "+calculateAverage(List(0,10,20,30)))
  }
}