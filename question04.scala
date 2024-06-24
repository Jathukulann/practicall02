import scala.io.StdIn.readLine

object theatre{
    def attendees(price: Int): Int= 120+(15-price)/5*20

    def revenue(price: Int): Int=attendees(price)*price

    def cost (price:Int): Int = 500+attendees(price)

    def profit(price :Int ): Int = revenue(price)-cost(price)
    
    def main(args: Array[String]) :Unit ={
     println(profit(13))
     println(profit(18))
     println(profit(21))
     println(profit(24))
     println(profit(30))
    }
}