package DSA1;

public class MaxSumSubArray
{
    public static void main(String args[])
    {
        int arr[]={-1,3,-3,-7,-1,0,-2,4,3,-4,7};
        int CurSum=0;
        int MaxSum=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            CurSum+=arr[i];
            MaxSum=Math.max(MaxSum,CurSum);

            if(CurSum< 0){
                CurSum=0;
            }
        }
        System.out.println("MaxSum= "+MaxSum);
    }









}
