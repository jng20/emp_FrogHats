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
/*
*/
        print1(avgTime);
        System.out.println("Binary average time taken: " + binAvg);
        System.out.println("Linear average time taken: " + linAvg);

    }

    //we might have to convert stuff to long for bigger stuff


}
