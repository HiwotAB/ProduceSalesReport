import java.util.Scanner;

public class ProdSalesReport {
	/*Design a program that will read a file of sales records and produce a sales report. 
	 * Each record in the file contains a customer's number and name, 
	 * a sales amount and a tax code. The tax code is to be applied to the sales amount to 
	 * determine the sales tax due for that sale, as follows: 
	Tax Code 	Sales Tax
	0 	tax exempt
	1 	3%
	2 	5%

	The report must print a heading, "Sales Report",
	 followed by detail lines. Each detail line must list the customer number, 
	 name, sales amount, sales tax and the total amount due.*/
	public static void main(String[] args) {
		 
		String names=null;
		int numbers;
		double salesAmount=0.0;
		int taxCode;
		double totalAmountDue=0.0;
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter Customer's Name:");
		names=scan.nextLine();
		System.out.print("Enter Customer's Number:");
		numbers=scan.nextInt();
		System.out.print("Enter Sales Amount:");	
		salesAmount=scan.nextDouble();
		System.out.print("Enter Tax Code:");	
		taxCode=scan.nextInt();
				
		 switch (taxCode) {
         case 0: 	taxCode=0; 
        	 		totalAmountDue=salesAmount;        	 		
         		         			
                  break;
         case 1:  	taxCode=1;         
        	 		totalAmountDue=salesAmount*0.03;
         							
				 break;
         case 2: taxCode=2; 
				 totalAmountDue=salesAmount*0.05;
					
				 break;
			
		 }
		 
		 System.out.println("Sales Report");		 
		 System.out.println("Customer's Name:"+names);
		 System.out.println("Customer's Number:"+numbers);	
		 System.out.println("Sales Amount:"+ salesAmount);	
		 System.out.println("Total Amount Due:"+totalAmountDue);	
			 

	}

}
