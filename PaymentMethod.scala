object PaymentMethod {


	def Cal(amt:Int,method:String) = method match {
		case "Paytm" | "Freecharge" => print(s"amount to be paid:${amt + (2*amt)/100}")

		case "NetBanking" => print(s"amount to be paid : ${amt + 5}")

		case "CardPayment" => print(s"amount to be paid: ${amt + 1.5}")

		case "Cash" => print(s"amount to be paid: ${amt}")
		
		case _ => print("choose a valid method for payment")

	}


	def main(args: Array[String]) = {
	Cal(230,"NetBanking")
}
}