import java.lang.System;
public class LinSearch
{
  long start, end, timeTaken;

  public LinSearch(){
  	start = 0;
  	end = 0;
  	timeTaken = 0;
  }


  public long linSearch ( Comparable[] a, Comparable target )
  {
    int tPos = -1;
    int i = 0;
    start = System.currentTimeMillis();
  //  System.out.println("start: " + start);

    while ( i < a.length ) {
      if ( a[i].compareTo(target) == 0 ) {
        tPos = i;
        break;
      }
      i++;
    }

    end = System.currentTimeMillis();
  //  System.out.println("end: " + end);
    timeTaken = end - start;
  //  System.out.println("time taken: " + timeTaken);

  //  System.out.println("target at: " + tPos);
    return timeTaken;
  }
}
