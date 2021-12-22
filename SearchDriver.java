public class SearchDriver{

  public static void print1( long[][] a )
  {
    for (int i = 0; i < a.length; i++){
        for(int j = 0; j < a[i].length; j++){
          System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
  }

    public static void main(String[] args){
	//20 trials of an array 10 million units large where we only find 1 randomly chosen target
        Comparable[] bob = new Integer[9_999_999];
        Comparable target = ((int)(Math.random()*9_999_999));
        long [][] avgTime = new long[2][20];

        for(int i = 0; i < bob.length; i++){
            bob[i] = i;
        } 
        
        BinSearch bin = new BinSearch();
        LinSearch lin = new LinSearch();

      //  System.out.println(target);
      //  System.out.println(bin.binSearch(bob, target));
      //  System.out.println(lin.linSearch(bob, target));
 
	/*
        Comparable[] bob2 = new Integer[10];
        Comparable target2 = ((int)(Math.random()*10));
	for(int i = 0; i < bob2.length; i++){
            bob2[i] = i;
        }
	*/

        long binAvg = 0;
        long linAvg = 0;

        for (int j = 0; j < 20; j++){
          target = ((int)(Math.random()*9_999_999));
          avgTime[0][j] = bin.binSearch(bob, target);
          avgTime[1][j] =lin.linSearch(bob, target);
          //System.out.println(avgTime[0][j]);
          //System.out.println(avgTime[1][j]);
          binAvg += avgTime[0][j];
          linAvg += avgTime[1][j];
        }

        binAvg = binAvg / 20;
        linAvg = linAvg / 20;
        print1(avgTime);
        System.out.println("Binary average time taken: " + binAvg);
        System.out.println("Linear average time taken: " + linAvg);

	/*
        long binAvg2 = 0;
        long linAvg2 = 0;

        for (int j = 0; j < 20; j++){
          target = ((int)(Math.random()*10));
          avgTime[0][j] = bin.binSearch(bob2, target);
          avgTime[1][j] =lin.linSearch(bob2, target);
          //System.out.println(avgTime[0][j]);
          //System.out.println(avgTime[1][j]);
          binAvg2 += avgTime[0][j];
          linAvg2 += avgTime[1][j];
        }

        binAvg2 = binAvg2 / 20;
        linAvg2 = linAvg2 / 20;
        print1(avgTime);
        System.out.println("Binary average time taken: " + binAvg2);
        System.out.println("Linear average time taken: " + linAvg2);
        */

          System.out.println("Binary worst case for big guy: " + bin.binSearch(bob, 9_999_998));
          System.out.println("Linear worst case for big guy: " + lin.linSearch(bob, 9_999_998));
        
	/*
          System.out.println("Binary worst case for small guy: " + bin.binSearch(bob2, 9));
          System.out.println("Linear worst case for small guy: " + lin.linSearch(bob2, 9));
	*/

    }

    //we might have to convert stuff to long for bigger stuff


}
