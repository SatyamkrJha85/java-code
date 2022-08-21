package satya;
import java.util.*;
public class lslf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your array no");
	    int n=sc.nextInt();
		int arr[]=new int [10];
	    System.out.println((" enter your array element "));
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
		
         System.out.println("enter your searching element");
         int search=sc.nextInt();
         
         
         
         int start =0;
         int x=0;
         int last=arr.length;
         while(start<=last) {
        	 int mid=(start+last)/2;
        	 if(arr[mid]<search) {
        		 mid=mid+1;
        	 }
        	 else if(arr[mid]>search){
        		 mid=mid+1;
        	 }
        	 else {
        		 System.out.println(mid);
        	 }
         }
         
         
        
	}

}
