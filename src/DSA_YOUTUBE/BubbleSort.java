package DSA_YOUTUBE;

public class BubbleSort {

    public static void main(String[] args) {
        int num[]={4,6,2,8,1,30,11,10,100};
        int n=num.length;
        boolean flag=false;

        //n-1 round is reqed and each time 1 element will be sorted

        for(int i=0;i<n-1;i++) //n-1 pass
        {
            for(int j=0;j<n-1-i;j++)//2 comparison
            {
                if(num[j]>num[j+1])
                {
                    //swap
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    flag=true;    // If no swaps in this pass, array is already sorted, break early
                }
            }
            if(!flag){break;}
        }

        System.out.println("bubble sort array:");
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }


    }
}
