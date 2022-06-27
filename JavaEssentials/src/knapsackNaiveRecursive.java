public class knapsackNaiveRecursive {

    public static void main(String args[])
    {


        // int[] wt = { 1, 2, 4, 2, 5 };
        // int[] val = { 5, 3, 5, 3, 2 };
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }



    public static int knapSack(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;
  
        // If weight of the nth item is more 
        // than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
  
        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
        else
            return Math.max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1),
                       knapSack(W, wt, val, n - 1));
    }
    
}
