import java.lang.System;
public class BinSearch
{
  long start, end, timeTaken;

  public BinSearch(){
  	start = 0;
  	end = 0;
  	timeTaken = 0;
  }


//Iterative binary search
  public long binSearch( Comparable[] a, Comparable target )
  {
    int hi = a.length - 1;
    int lo = 0;
    int tPos = -1; //init return var to flag value -1
    int m = (lo + hi) / 2; //init mid pos var
    start = System.currentTimeMillis();
    //System.out.println("start: " + start);

    while( lo <= hi ) { // run until lo & hi cross

      //update mid pos var
      m = (lo + hi) / 2;

      // target found
      if(a[m].compareTo(target) == 0){
            end = System.currentTimeMillis();
    	      //System.out.println("end: " + end);
            timeTaken = end - start;
          //  System.out.println("time taken: " + timeTaken);

            //System.out.println("target at: " + m);
            return timeTaken;
      }

      // value at mid index higher than target
      else if( a[m].compareTo(target) > 0){
            hi = m - 1;
      }
      // value at mid index lower than target
      else if ( a[m].compareTo(target) < 0 ){
            lo = m + 1;
      }
    }
    end = System.currentTimeMillis();
  //  System.out.println("end: " + end);
    timeTaken = end - start;
  //  System.out.println("time taken: " + timeTaken);

  //  System.out.println("not found: " + tPos);
    return timeTaken;
  }//end binSearchIter
/*
  public static int binSearchRec( Comparable[] a, Comparable target, int lo, int hi )
  {
    int tPos = -1; //init return var to flag value -1
    int m = (lo + hi) / 2; //init mid pos var
    int comparison = a[m].compareTo( target );
	start = System.currentTimeMillis();
	System.out.println(start);


    if ( comparison == 0 )
      return m;
    else if ( lo != hi ) {
      if ( comparison < 0 )
	lo = m + 1;
      else
	hi = m - 1;
      return binSearchRec( a, target, lo, hi );
    }
    return tPos;
  }//end binSearchRec
*/
}
