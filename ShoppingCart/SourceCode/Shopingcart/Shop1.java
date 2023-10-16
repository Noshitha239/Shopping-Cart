/**
 * 
 */
package com.gqt.Shopingcart;

import java.util.Scanner;

/**
 * @author 91817
 *
 */
public class Shop1 {

	public static void Poco(){
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your are selected Poco Mobile..Please select Which model do you want:\n"
					+"1. Poco M2 pro\n"
					+"2. Poco X3 Pro");
			int k=sc.nextInt();
			switch(k){
			case 1:{
				System.out.println("You are selected POCO M2 pro.");
				System.out.println("Are you Intrested to purchace:");
				String a=sc.next();
				System.out.println();
				if(a.equalsIgnoreCase("yes")) {
					System.out.println();
					System.out.println("Product Specifications:");
					System.out.println("***********************");
					System.out.println();
					System.out.println("Product\tmodel\tRam\tPrice");
					System.out.println("---------------------");
					System.out.println("POCO\tm2 pro\t6GB\tRs.14000");
					System.out.println("---------------------");
					System.out.println();
				}
				else {
					System.out.println("Thank you for visiting our stores.");
					System.out.println("Visit Again.");
				}
				System.out.println("Do you want to make payment?");
				String c=sc.next();
				if(c.equalsIgnoreCase("yes")) {
					System.out.println();
					System.out.println();
					System.out.println("RECIEPT OF YOUR PRODUCT");
					System.out.println("***********************");
					System.out.println();
					System.out.println("Quantity\t1");
					System.out.println("Price\t\tRs.14000");
					System.out.println("----------------------");
					System.out.println("Total Price\tRs.14000");
					System.out.println("----------------------");
					System.out.println("Thankyou for Purchacing Our Products.");
					System.out.println("Visit Again.");
					Shopingcart.main(null);

				}
				else {
					System.out.println("Thank you for visiting our stores.");
					Shopingcart.main(null);
				}
				break;
			}
			case 2:{
				System.out.println("You are selected POCO X3 pro.");
				System.out.println("Are you Intrested to purchace:");
				String a=sc.next();
				System.out.println();
				if(a.equalsIgnoreCase("yes")) {
					System.out.println();
					System.out.println("Product Specifications:");
					System.out.println("***********************");
					System.out.println();
					System.out.println("Product\tmodel\tRam\tPrice");
					System.out.println("---------------------");
					System.out.println("POCO\tX3 pro\t6GB\tRs.14000");
					System.out.println("---------------------");
					System.out.println();
				}
				else {
					System.out.println("Thank you for visiting our stores.");
					System.out.println("Visit Again.");
				}
				System.out.println("Do you want to make payment?");
				String c=sc.next();
				if(c.equalsIgnoreCase("yes")) {
					System.out.println();
					System.out.println();
					System.out.println("RECIEPT OF YOUR PRODUCT");
					System.out.println("***********************");
					System.out.println();
					System.out.println("Quantity\t1");
					System.out.println("Price\t\tRs.14000");
					System.out.println("----------------------");
					System.out.println("Total Price\tRs.14000");
					System.out.println("----------------------");
					System.out.println("Thankyou for Purchacing Our Products.");
					System.out.println("Visit Again.");
					Shopingcart.main(null);
				}
				else {
					System.out.println("Thank you for visiting our stores.");
					Shopingcart.main(null);
				}
				break;
			}
			}
		}}
	}}