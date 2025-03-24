package DSA1;
// (1) print max subarray with Brute Force O(n³)

/*public class Subarray
{
    public static void main(String args[])
{
    int array[]={1,2,3};
    int ans = array[0];
    int n=array.length;
    for(int start=0;start<n;start++){
        for(int end=start;end<n;end++){
            int sum=0;
            for(int k=start;k<=end;k++){
                sum+=array[k];
            }
            System.out.print(" "+sum+" ");
            ans = Math.max(ans, sum);
        }

    }
    System.out.println();

    System.out.println("Maximum Subarray Sum (Brute Force O(n³)) = " + ans);

}
}*/

// (2) Carry Forward Approach for Maximum Subarray Sum (O(n²)) #positive nums

public class Subarray
{
    public static void main(String args[])
    {
        int array[]={1,2,3};
        int ans = array[0];
        int n=array.length;
        for(int start=0;start<n;start++){
            int sum=0;
            for(int end=start;end<n;end++){
                sum+=array[end]; // Carry forward sum instead of recalculating
                System.out.print(" "+sum+" ");
                ans = Math.max(ans, sum);
            }

        }
        System.out.println();

        System.out.println("Maximum Subarray Sum (Brute Force (O(n²)) = " + ans);

    }
}

