package DSA;
import java.io.*;
import java.util.*;
import java.util.Arrays;
public class MyClass {
    static int search(int arr[],int n,int chk){
        for(int i=0;i<n;i++){
            if(chk == arr[i])
                return i;
        }
            return -1;
        }
public static int[] sort(int arr[],int n,int chk){
        for(int i=0;i<n;i++){
            for(int j=0+i;j<n;j++){
              //  System.out.println("Element...arr[i]"+arr[i]+"  arr[j]...."+arr[j]  );
                int tmp =0;
                if(arr[i]>arr[j]){
                    tmp = arr[i];  
                    //System.out.println("Tmp......"+arr[i] +"\n"+"interchange");
                    arr[i] = arr[j];  
                    arr[j] = tmp;
                }
            }
        }
        //System.out.println("Max order no is:"+arr);
        return arr;
    }
 static int[] insert(int arr[],int ar2[],int n,int cap,int add){
        if(n > cap){
            System.out.println("Size to be Increased..."+n);
        }
        else{
        	System.out.println("Size to be Increased...n..."+n+"...cap..."+cap);
        	int n1=cap,j=0;
        	 int arr1[] = new int[arr.length + 1];
        	 System.out.println("Array Size..."+arr1.length);
             int i = 0;
             for (i = 0; i < arr1.length; i++) {
                 if (add <= arr[i]) {
                     arr1[i] = add;
                     break;
                 }
                 else
                     arr1[i] = arr[j++];
             }
             for (int k = i + 1; k < arr1.length; k++)
                 arr1[k] = arr[j++];
             
             int a=0;
              System.out.println("New_Array aar1...."+Arrays.toString(arr1));
              
        }
		return ar2;
     //  System.out.println("New_Array..."+arr);}
}
 static int[] delete(int arr[],int ar2[],int n,int cap,int del) {
	 int flag = 1,loc=0;
	 for (int i = 0; i < n; i++) 
     {
         if(arr[i] == del)
         {
             flag =1;
             loc = i;
             break;
         }
         else
         {
             flag = 0;
         }
     }
         if(flag == 1)
         {
//             for(int i = loc+1; i < n; i++)
//             {
//                 arr[i-1] = arr[i];
//             }
             for(int i = 0; i < n - 1; i++)
 	         {
 	            arr[i] = arr[i+1];
 	         }
             System.out.println("After Deleting:");
             for (int i = 0; i <= n; i++) 
             {
                 System.out.println("FECECA      "+arr[i]);
             }
             System.out.println("OKAY "+arr[n-2] /n);
         }
	/* for(int i = 0; i < n; i++)
	    {
	      if(arr[i] == del)   //If element found
	      {
	        // shifting elements
	        for(int j = i; j < n - 1; j++)
	        {
	            arr[j] = arr[j+1];
	        }
	        break;
	      }
	    }
	      
	       System.out.println("Elements after deletion " );
	       for(int i = 0; i <n-1; i++)
	       {
	             System.out.print(arr[i]+" ");
	       }
	  */
	 System.out.println("dh "+ar2.length);
		return ar2;  
	    }
 
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_YELLOW = "\u001B[33m";
  
      int count=0;
      int cap =7;
      int add = 50;
      int del;
      int arr[] ={1,35,65,34,52,23};
      for(int i:arr){
          count++;
      }
      int n=count;
      System.out.println("Size of an array  = " + n);
      int chk =100;
      System.out.println(ANSI_YELLOW+"Chking element ...:"+chk+ANSI_RESET);
      int find = search(arr,n,chk);
      if(find == -1){
          System.out.println(ANSI_YELLOW+"Didn't found..:"+ANSI_RESET);
      }
      else{
          System.out.println(ANSI_YELLOW+"Position of "+chk +" is "+(find+1));
      }
      //System.out.println("Sum of x+y = " + z);
      int ar[] = sort(arr,n,chk);
      
      System.out.println("Max order no is   :"+Arrays.toString(arr));
      int ar1[] = insert(arr,ar,n,cap,add);
      System.out.println("Max order no is I:"+Arrays.toString(ar1));
      System.out.println("Enter the no to be Deleted.....");
      int del1 = sc.nextInt();
      int[] ar3=delete(arr,ar,n-1,cap,del1);
      System.out.println("Max order no in D :"+Arrays.toString(ar3));
    }
}
