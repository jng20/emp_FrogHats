public class SearchDriver{

    public static void main(String[] args){
        int[] bob = new int[999999999];
        int target = ((int)(Math.random()*999999999));
        
        for(int i = 0; i < bob.length; i++){
            bob[i] = i;
        }
        BinSearch bin = new BinSearch();
        LinSearch lin = new LinSearch();
        
        bin.binSearchIter(bob, target);
        lin.linSearch(bob, target);
        
    }
    
    //we might have to convert stuff to long for bigger stuff
    //binSearch is about 6 milliseconds faster in this case

}
