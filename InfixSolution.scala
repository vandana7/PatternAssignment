import scala.util.control._
object InfixSolution
{
   def main(args: Array[String]) = {
    var input="12*3*6*90"
    var outputstring=""
    val inner = new Breaks;
    inner.breakable
    {
     for(index <- 0 to input.length-1)
      {
        val ch=input.charAt(index)
        var prev:String=""
        var next:String=""
        var first=true;
        var prevope=""
        var firstno:Int=0
        var output=0
        var secondno:Int=0
        println(s"previous$prev")
        ch match {
                 println("p:"+p)
		case '*' => if(first)
				{
                                   firstno=prev.toInt
                                    prev=""
                                    first=false
				}
                           else
                            {
                               val temp=secondno.toInt
                               output=firstno+secondno
                               outputstring=""+output+'*'+input.substring(index)
                               inner.break
                            }
		case p => prev=prev+p
		
	}
        print(ch)
      }
   }

  println(outputstring)
 }  
}
