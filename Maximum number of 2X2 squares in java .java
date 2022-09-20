class Solution
{
    public static long numberOfSquares(long base)
    {
        //code here
       base = base-2;
       base = base/2;
       long ans = base*(base+1) /2;
       return ans;
        
    }
}
