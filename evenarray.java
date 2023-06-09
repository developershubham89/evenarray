package Array;

import java.util.Scanner;

public class evenarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array :");
        int n=sc.nextInt();
        System.out.println("enter "+n+ " array :");
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        while(left<right){
            if(a[left]%2==0 && a[right]%2!=0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if(a[left]%2==0){
                left++;
            }
            if(a[right]%2!=0){
                right--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
