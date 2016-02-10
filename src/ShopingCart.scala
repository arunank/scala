/**
  * Created by arunan on 10/02/2016.
  */

class ShoppingCart {
  def calculate(args:String* ) : Int = {

    var appleCount = args.filter(_.equals("Apple")).length
    var orangeCount = args.filter(_.equals("Orange")).length

    //2 Apples at cost of 1 and 3 Oranges at cost of 2 and remaining at usual price per item.
    ((appleCount / 2 ) + (appleCount % 2 )) * 60  + ((orangeCount / 3 ) * 2 + (orangeCount % 3 )) * 25
  }
}

object ShoppingCart {
  def apply() = {
    new ShoppingCart()
  }
}

object Test{
  def main(args: Array[String]) {
    print("Total Cost: " + ShoppingCart().calculate("Apple","Orange","Apple","Apple","Orange"))
  }
}