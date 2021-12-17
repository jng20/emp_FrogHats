import java.lang.System;
public class BinSearch
{
  long start, end, timeTaken;
  
  public BinSearch(){
  	start = 0;
  	end = 0;
  	timeTaken = 0;
  }
  


  public  int binSearchIter( int[] a, int target )
  {
    int hi = a.length - 1;
    int lo = 0;
    int tPos = -1; //init return var to flag value -1
    int m = (lo + hi) / 2; //init mid pos var
    start = System.currentTimeMillis();
    System.out.println(start);

    while( lo != hi ) { // run until lo & hi cross

      //update mid pos var
      m = (lo + hi) / 2;

      // target found
      if(a[m] == target){
            end = System.currentTimeMillis();
    	    System.out.println(end);
            timeTaken = end - start;
            System.out.println(timeTaken);
            
            System.out.println(tPos);
            return m;
      }

      // value at mid index higher than target
      else if( a[m] > target){
            hi = m - 1;
      }  
      // value at mid index lower than target
      else
            lo = m + 1;
      }
    }
    if(a[lo] == target){
        tPos = lo;
        end = System.currentTimeMillis();
        System.out.println(end);
        timeTaken = end - start;
        System.out.println(timeTaken);
        
        System.out.println(tPos);
        return tPos;
    }
    end = system.currenttimemillis();
    system.out.println(end);
    timetaken = end - start;
    system.out.println(timetaken);
    
    System.out.println(tPos);
    return tPos;
  }//end binSearchIter

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
  
}


