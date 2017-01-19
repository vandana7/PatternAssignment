import scala.util.control._
object InfixSolution
{
   def main(args: Array[String]) = {
    var input="8*15/5+27*3"
    var outputstring=""
    var prev=""
 	var next:String=""
        var first=true;
        var prevope=""
        var firstno:Int=0
        var output=0
        var secondno:Int=0
        var temp=0
        var leftstr=""
        var lastopr=""
        var count:Int=0
     //println("Outside for")
     //println("count"+count)
     //for(index <- count to input.length-1)
      while(count<input.length)
      {
        //println("Inside for")
        val ch=input.charAt(count)
        
       
        
        ch match {
		case '*' => lastopr="*"
                             if(first)
				{
                                   
                                    firstno=prev.toInt
                                    //println("fno : "+firstno)
                                    prev=""
                                    first=false
				}
                           else
                            {
                                temp=prev.toInt
                                 prev=""
                              // println("second No "+temp)
                               output=firstno*temp
                               outputstring=leftstr+""+output+'*'+input.substring(count+1)
				input=outputstring  
                                //println("Output : "+outputstring)                             
				//inner.break
                                count=0
                                count=count-1
				first=true
                            }
                 
		case '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '0' =>  prev=prev+""+ch 
	       // println("P : "+ch +"Pre : "+prev)
                case '+' | '-' | '/' => lastopr="+"
                            if(!first)
                            {
                              leftstr=leftstr+""+firstno*prev.toInt+ch
                              prev=""
                             
                              first=true
                            }
                            else
                              leftstr=leftstr+prev+ch
                // println("left str : "+leftstr)
                 prev=""
	}
       count=count+1
       if(count==input.length && lastopr=="*"){
           output=firstno*prev.toInt
          // println("output : "+output)
           outputstring=leftstr+""+output
        }
       else
          outputstring=leftstr+""+prev
       
      }
      //solving divide operand
      println(s"After Solving * :$outputstring")
     input=outputstring
     count=0
     prev=""
     firstno=0
     temp=0
     output=0
    leftstr=""
    outputstring=""
    first=true
   while(count<input.length)
      {
        //println("Inside for")
        val ch=input.charAt(count)
        
       
        
        ch match {
		case '/' => lastopr="/"
                             if(first)
				{
                                   
                                    firstno=prev.toInt
                                   // println("fno : "+firstno)
                                    prev=""
                                    first=false
				}
                           else
                            {
                                temp=prev.toInt
                                 prev=""
                              // println("second No "+temp)
                               output=firstno/temp
                               outputstring=leftstr+""+output+'/'+input.substring(count+1)
				input=outputstring  
                              //  println("Output : "+outputstring)                             
				//inner.break
                                count=0
                                count=count-1
				first=true
                            }
                 
		case '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | '0' =>  prev=prev+""+ch 
	       // println("P : "+ch +"Pre : "+prev)
                case '+' | '-' | '/' => lastopr="+"
                            if(!first)
                            {
                              leftstr=leftstr+""+firstno/prev.toInt+ch
                              prev=""
                             // println("left str : "+leftstr)
                              first=true
                            }
                            else
                              leftstr=leftstr+prev+ch
                 prev=""
	}
       count=count+1
       if(count==input.length && lastopr=="/"){
           output=firstno/prev.toInt
          // println("fno : "+firstno )
           outputstring=leftstr+""+output
        }
       else
          outputstring=leftstr+""+prev
      }
   
  
  
  //println(outputstring)
    println(s"After Solving / : $outputstring")
 }  
}
