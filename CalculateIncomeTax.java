package apnaCollefge;
import java.util.*;
public class CalculateIncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int income=sc.nextInt();
     int tax;
     if(income<=500000) {
    	 tax=0;
     }
     else if(income>=500000 && income<=100000) {
    	 tax= (int) (income*0.2);
     }
     else {
    	 tax=(int)(income*0.3);
     }
     
    System.out.println("your income tax is "+tax);
  //   System.out.println("tax");
	}

}
