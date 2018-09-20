public class recursivePractice
{

   public static void main(String[] args)
   {
      //int[] coins = {1, 5, 10, 25};
      int[] coins = {1, 7, 9};

      
      System.out.println(waysChange(18, 3, coins));
      //System.out.println(waysChoose(6, 3));
      //printAll(2,6);

   }
   
   public static int waysChange(int n, int k, int[] D) {
      if(n < 0 || k <= 0) return 0;
      if(n == 0) return 1;
      else return waysChange(n-D[k-1], k, D) + waysChange(n, k-1, D);
   }
   
   public static int waysChoose(int n, int k) {
      if (k == 0 || k == n) return 1;
      else return waysChoose(n-1, k-1) + waysChoose(n-1, k);
   }
   
   public static void printAll(int a, int b) {
      if(a == b) System.out.println(a);
      else {
         System.out.println(a);
         printAll(a+1, b);
      }
   }

}

