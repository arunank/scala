/**
  * Created by arunan on 10/02/2016.
  */


class ShoppingCart {
  def calculate(args:String* ) : Int = {

    args.filter(_.equals("Apple")).length * 60 + args.filter(_.equals("Orange")).length * 25

    //Alternate approach
    /**
    var sum = 0
		 args.foreach( i => if( i.equals("Apple") ) sum += 60 else if( i.equals("Orange") ) sum += 25 )
		 sum
      **/
  }

  def calculateWithOffers(args:String* ) : Int = {

    val offers = (x: Int, y: Int) => {
      //2 Apples(x) at cost of 1 and 3 Oranges(y) at cost of 2 and remaining at usual price per item.
      ((x / 2) + (x % 2)) * 60 + ((y / 3) * 2 + (y % 3)) * 25
    }

    offers(args.filter(_.equals("Apple")).length,args.filter(_.equals("Orange")).length)
  }
}

object ShoppingCart {
  def apply() = {
    new ShoppingCart()
  }
}

object Test{
  def main(args: Array[String]) {

    println("Total Cost: " + ShoppingCart().calculate())

    println("Total Cost: " + ShoppingCart().calculate("Apple","Orange","Apple","Apple","Orange","Orange","Orange"))

    println("Total Cost: " + ShoppingCart().calculateWithOffers(""))

    print("Total Cost with Offers: " + ShoppingCart().calculateWithOffers("Apple","Orange","Apple","Apple","Orange","Orange","Orange"))
  }
}