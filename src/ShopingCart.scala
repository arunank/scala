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