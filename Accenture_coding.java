// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class MainClass{
    public static int is_perfect_sqr(int arr[], int n){
        int count=0;
        for(int i=0; i< n; i++){
            int num =(int) Math.sqrt(arr[i]);
            if(num*num == arr[i])count++;
            else continue;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of plots");
        int n = sc.nextInt();
        System.out.print("enter the areas of plot");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("total buyable plots count are");
        System.out.print(is_perfect_sqr(arr,n));
    }
}
