import java.lang.System;
public class LinSearch
{
  long start, end, timeTaken;
  
  public LinSearch(){
  	start = 0;
  	end = 0;
  	timeTaken = 0;
  }
 
  
  public int linSearch ( int[] a, int target )
  {
    int tPos = -1;
    int i = 0;
    start = System.currentTimeMillis();
    System.out.println(start);
    
    while ( i < a.length ) {
      if ( a[i] == target ) {
        tPos = i;
        break;
      }
      i++;
    }
    
    end = System.currentTimeMillis();
    System.out.println(end);
    timeTaken = end - start;
    System.out.println(timeTaken);
    
    System.out.println(tPos);
    return tPos;
  }
}
