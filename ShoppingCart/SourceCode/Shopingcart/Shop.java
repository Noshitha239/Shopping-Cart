/**
 * 
 */
package com.gqt.Shopingcart;
import java.util.Scanner;
/**
 * @author 91817
 *
 */
public class Shop {
	public static void Furniture() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your option: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected chairs.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("Chairs\tPlastic\tRs.10000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs10000");

				System.out.println("----------------------");
				System.out.println("Total Price\tRs.10000");
				System.out.println("----------------------");
				System.out.println();
				System.out.println("Thankyou for Purchacing Our Products.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected Coffee Tables.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("coffee Tables\tWood\tRs.15000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.5000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.15000");
				System.out.println("----------------------");
				System.out.println();
				System.out.println("Thankyou for Purchacing Our Products.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}	
		}
		System.exit(0);
	}
	public static void Blankets() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected weighted Blanket.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\t\t\tType\tPrice");
				System.out.println("-------------------------------");
				System.out.println("Weighted blanket\twool\tRs.5000");
				System.out.println("--------------------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.5000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.5000");
				System.out.println("----------------------");
				System.out.println();
				System.out.println("Thankyou for Purchacing Our Products.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected Throw Blanket.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\t\t\tType\tPrice");
				System.out.println("-----------------------------------------");
				System.out.println("Throw blanket\tLightweight silk\tRs.8000");
				System.out.println("-----------------------------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.12000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.12000");
				System.out.println("----------------------");
				System.out.println();
				System.out.println("Thankyou for Purchacing Our Products.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		}
		System.exit(0);
	}
	public static void Carpets() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Red carpets.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("Red Carpets\tNylon\tRs.1000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs1000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.1000");
				System.out.println("----------------------");
				System.out.println();
				System.out.println("Thankyou for Purchacing Our Products.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected Blue carpets.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("Blue Carpets\tPolyester\tRs.2000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs2000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.2000");
				System.out.println("----------------------");
				System.out.println();
				System.out.println("Thankyou for Purchacing Our Products.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");

			}
			Shopingcart.main(null);
			break;
		}
		}
		System.exit(0);
	}
	public static void Kitchen() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Dining set.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("Dining set\tPingani\tRs.5000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs5000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.5000");
				System.out.println("----------------------");
				System.out.println();
				System.out.println("Thankyou for Purchacing Our Products.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected cofee cups.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("Coffee cups\tGlass\tRs.1000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs1000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.1000");
				System.out.println("----------------------");
				System.out.println();
				System.out.println("Thankyou for Purchacing Our Products.");
				Shopingcart.main(null);
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		}
		System.exit(0);
	}
	//this is methods for electronics
	public static void Mobiles() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected POCO mobile.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
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
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
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
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected MI Mobile.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tModel\tRam\tPrice");
				System.out.println("---------------------");
				System.out.println("MI\tNote8\t8GB\tRs.20000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.20000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.20000");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		}
		System.exit(0);
	}
	public static void HeadPhones() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Boat Head Phones.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tModel\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("Boat\tH4\tWireless\tRs.20000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.20000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.20000");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");

			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected MIVI Head Phones.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tModel\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("Mivi\tm7\tWired\tRs.12000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.12000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.12000");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		}
		System.exit(0);
	}
	public static void LapTops() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected DELL LapTop.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tRam\tProcesor\tPrice");
				System.out.println("---------------------");
				System.out.println("DELL\t8GB\ti3\tRs.58000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.58000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.58000");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected HP LapTop.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tRam\tProcesor\tPrice");
				System.out.println("---------------------");
				System.out.println("HP\t8GB\ti5\tRs.42000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.58000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.58000");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		default:
			System.out.println("");
		}
		System.exit(0);
	}
	public static void Tabs() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Samsung Tab.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tRam\tPrice");
				System.out.println("---------------------");
				System.out.println("Samsung\t8GB\tRs.35000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.35000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.35000");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected OPPO Tab.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tRam\tPrice");
				System.out.println("---------------------");
				System.out.println("OPPO\t4GB\tRs.25000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.25000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.25000");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		default:
			System.out.println("");
		}
		System.exit(0);
	}
	//this is fasion method
	public static void Men() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected T-shirts.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tSize\tPrice");
				System.out.println("---------------------");
				System.out.println("T-Shirt\tColler\txl\tRs.500");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.500");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.500");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected Shirts.");
			System.out.println("Your selected Shirts.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tSize\tPrice");
				System.out.println("---------------------");
				System.out.println("Shirts\tFull hands\tl\tRs.800");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.800");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.800");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		}
		System.exit(0);
	}
	public static void Women() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Kurthi sets.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();

			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tSize\tPrice");
				System.out.println("---------------------");
				System.out.println("Kurthi sets\tUmbrella cutting\tS\tRs.1000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.1000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.1000");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected Sarees.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tSize\tPrice");
				System.out.println("---------------------");
				System.out.println("Sarees\tPlain\t5meeters\tRs.2000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.2000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.2000");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		default:
			System.out.println("");
		}
		System.exit(0);
	}
	public static void Child() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Frocks.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tSize\tPrice");
				System.out.println("---------------------");
				System.out.println("Frocks\tBow sleeveless\tS\tRs.3000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.3000");

				System.out.println("----------------------");
				System.out.println("Total Price\tRs.3000");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected Boy coting set.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tSize\tPrice");
				System.out.println("---------------------");
				System.out.println("Boy Coting set\tCoting\tM\tRs.5000");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.5000");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.5000");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		default:
			System.out.println("");
		}
		System.exit(0);
	}
	//This is method for insta mart
	public static void Fruit() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Apple.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tColor\tType\tSize\tPrice");
				System.out.println("---------------------");
				System.out.println("Apple\tred\tSimla apple\tsmall\tRs.500");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.500");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.500");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected Cauliflower.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tColor\tType\tSize\tPrice");
				System.out.println("---------------------");
				System.out.println("Cauliflower\tWhite\tVegitable\tsmall\tRs.200");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.200");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.200");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 3:{
			System.out.println("Your selected Grapes.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tColor\tType\tSize\tPrice");
				System.out.println("---------------------");
				System.out.println("Grapes\tBlack\tSeedless\tsmall\tRs.300");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.300");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.300");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 4:{
			System.out.println("Your selected Carrot.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tColor\tType\tSize\tPrice");
				System.out.println("---------------------");
				System.out.println("Carrot\tOrange\tVegitable\tsmall\tRs.100");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.100");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.100");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		default:
			System.out.println("");
		}
		System.exit(0);
	}
	public static void Juice() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Orange Juice.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tColor\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("Orange Juice\tOrange\tplain\tRs.600");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.600");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.600");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected Grapes Juice.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tColor\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("Grapes Juice\tPurple\tMixed\tRs.100");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.100");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.100");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		default:
			System.out.println("");
		}
		System.exit(0);
	}
	public static void Prov() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Rice.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tQuantity\tPrice");
				System.out.println("---------------------");
				System.out.println("Rice\t30kg\tRs.500");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.500");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.500");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected sugar.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tQuantity\tPrice");
				System.out.println("---------------------");
				System.out.println("Sugar\t3kg\tRs.250");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.250");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.250");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		}
		System.exit(0);
	}
	//this is sports methods
	public static void s1() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Sports T-Shirt");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tsize\tPrice");
				System.out.println("---------------------");
				System.out.println("Sports T-Shirts\tT-shirt\txxl\tRs.1250");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.1050");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.1050");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected Sports Dress");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tType\tsize\tPrice");
				System.out.println("---------------------");
				System.out.println("Sports Dress\tcricket suit\txl\tRs.1050");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.1050");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.1050");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		}
		System.exit(0);
	}
	public static void s2() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Running shoes.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tcolor\tsize\tPrice");
				System.out.println("---------------------");
				System.out.println("Running shoes\tBlack\t7\tRs.1450");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.1450");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.1450");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected Jogging shoes.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tcolor\tsize\tPrice");
				System.out.println("---------------------");
				System.out.println("Jogging shoes\tWhite\t9\tRs.1550");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.1550");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.1550");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		}
		System.exit(0);
	}
	public static void s3() {
		Scanner sc=new Scanner(System.in);   
		System.out.println("Choose your choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Your selected Bat.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tcolor\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("Bat\tWhite\tcricket Equipement\tRs.2550");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.2550");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.2550");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		case 2:{
			System.out.println("Your selected Volly ball.");
			System.out.println("Are you Intrested to purchace:");
			String a=sc.next();
			if(a.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("Product Specifications:");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Product\tcolor\tType\tPrice");
				System.out.println("---------------------");
				System.out.println("Volly Ball\tred\tvolly ball Equipement\tRs.3550");
				System.out.println("---------------------");
				System.out.println();
			}
			else {
				System.out.println("Thank you for visiting our stores.");
				System.out.println("Visit Again.");
				Shopingcart.main(null);
			}
			System.out.println("Do you want to make payment?");
			String c=sc.next();
			if(c.equalsIgnoreCase("yes")) {
				System.out.println();
				System.out.println("RECIEPT OF YOUR PRODUCT");
				System.out.println("***********************");
				System.out.println();
				System.out.println("Quantity\t1");
				System.out.println("Price\t\tRs.3550");
				System.out.println("----------------------");
				System.out.println("Total Price\tRs.3550");
				System.out.println("----------------------");
				System.out.println("Thankyou for Purchacing Our Products.");
				System.out.println("Visit Again.");
			}
			else {
				System.out.println("Thank you for visiting our stores.");
			}
			Shopingcart.main(null);
			break;
		}
		default:
			System.out.println("");
		}
		System.exit(0);
	}
}
