public class recursivePractice
{

   public static void main(String[] args)
   {
      int[] coins = {1, 5, 10, 25};
      
      System.out.println(waysChange(10, 4, coins));
   }
   
   static public int waysChange(int n, int k, int[] D) {
      if(n < 0 || k <= 0) return 0;
      if(n == 0) return 1;
      else return waysChange(n-D[k-1], k, D) + waysChange(n, k-1, D);
   }

}