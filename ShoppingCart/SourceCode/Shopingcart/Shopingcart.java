/**
 * 
 */
package com.gqt.Shopingcart;
import java.util.Scanner;
/**
 * @author 91817
 *
 */
public class Shopingcart {
	/**
	 * @param args
	 */
	// TODO Auto-generated method stub
	//This is method for  Home Decors
	public static void CollectInput(){
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to Furnitures..Please select the option what you want:\n"
					+"1.Chairs\n"
					+"2.coffee Tables");

			Shop.Furniture();
			break;
		}
		case 2:{
			System.out.println("Welcome to blankets..Please select what you want:\n"
					+"1. Throw Blanket\n"
					+"2. Weighted Blanket");
			Shop.Blankets();
			break;
		}
		case 3:{
			System.out.println("welcome to Corpets..Please select what you want:\n"
					+"1.Red Carpet1\n"
					+"2.Blue Carpet2");
			Shop.Carpets();
			break;
		}
		case 4:{
			System.out.println("welcome to Kitchen Decors..Please select what you want:\n"
					+"1. Dining sets\n"
					+"2. Coffee cups");
			Shop.Kitchen();
			break;
		}
		}
		main(null);
	}
	//This Electronics method
	public static void CollectInput1(){
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to Mobiles..Please select the option what you want:\n"
					+"1. Poco\n"
					+"2. MI");
			Shop1.Poco();
			Shop.Mobiles();
			break;
		}
		case 2:{
			System.out.println("Welcome to Head Phones..Please select what you want:\n"
					+"1. Boat\n"
					+"2. Mivi");
			Shop.HeadPhones();
			break;
		}
		case 3:{
			System.out.println("welcome to Laptops..Please select what you want:\n"
					+"1. Hp\n"
					+"2. Dell");
			Shop.LapTops();
			break;
		}
		case 4:{
			System.out.println("welcome to Tabs..Please select what you want:\n"
					+"1. Samsang\n"
					+"2. Oppo");
			Shop.Tabs();
			break;
		}
		}
		main(null);
	}
	//This is fashion method
	public static void CollectInput2(){
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to Mens wear..Please select the option what you want:\n"
					+"1. T-shirts\n"
					+"2. Shirts");
			Shop.Men();
			break;
		}
		case 2:{
			System.out.println("Welcome to Women's wear..Please select what you want:\n"
					+"1. Kurthi sets\n"
					+"2. sarees");
			Shop.Women();
			break;
		}
		case 3:{
			System.out.println("welcome to Children's wear..Please select what you want:\n"
					+"1. Frocks\n"
					+"2. Boy Coting set");
			Shop.Child();
			break;
		}
		}
		main(null);
	}
	//This is instamart method
	public static void CollectInput3(){
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to Fruits&Vegitables section..Please select the option what you want:\n"
					+"1. Apple\n"
					+"2. cauliflower\n"
					+"3. Grapes\n"
					+"4. carrot");
			Shop.Fruit();
			break;
		}
		case 2:{
			System.out.println("Welcome to Juices..Please select what you want:\n"
					+"1. Orange juice\n"
					+"2. grapes juice");
			Shop.Juice();
			break;
		}
		case 3:{
			System.out.println("welcome to Provisions..Please select what you want:\n"
					+"1. Rice\n"
					+"2. sugar");
			Shop.Prov();
			break;
		}
		default:
			System.out.println("");
			main(null);
		}
		main(null);
	}
	//This is instamart method
	public static void CollectInput4(){
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to Sports wear section..Please select the option what you want:\n"
					+"1. Sports T-shirts\n"
					+"2. Sports Dresses"
					);

			Shop.s1();
			break;
		}
		case 2:{
			System.out.println("Welcome to Sports shooes section..Please select what you want:\n"
					+"1. Running shooes\n"
					+"2. Jogging Shooes");
			Shop.s2();
			break;
		}
		case 3:{
			System.out.println("welcome to Sports Equipments..Please select what you want:\n"
					+"1. Bat\n"
					+"2. volly ball");
			Shop.s3();
			break;
		}
		}
		main(null);
	}
	//This is main method
	public static void main(String []args) {     
		Scanner sc=new Scanner(System.in);
		System.out.println("\t \t \t\tWelcome to Shopsy");
		System.out.println("\t\t\t\t*****************");
		System.out.println();
		System.out.println("Please select the option what you want :\n"+"1. Home Decors\n"
				+"2. Electronics\n"
				+"3. Fashion\n"
				+"4. Instamart\n"
				+"5. Sports");
		System.out.println("Choose your option: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Welcome to Home Decors..Please select the option what you want:\n"
					+"1. Furnitures\n"
					+"2. Blankets\n"
					+"3. Corpets\n"
					+"4. Kitchen Items");
			System.out.println("Choose your option: ");
			CollectInput();
			break;
		}
		case 2:{
			System.out.println("Welcome to Electronics..Please select what you want:\n"
					+"1. Mobiles\n"
					+"2. Head Phones\n"
					+"3. Laptops\n"
					+"4. Tabs");
			CollectInput1();
			break;
		}
		case 3:{
			System.out.println("welcome to Fasion..Please select what you want:\n"
					+"1. Men\n"
					+"2. Women\n"
					+"3. Children");
			CollectInput2();
			break;
		}
		case 4:{
			System.out.println("welcome to Instamart..Please select what you want:\n"
					+"1. Fruits and Vegitables\n"
					+"2. Juices\n"
					+"3. Provisions");
			CollectInput3();
			break;
		}
		case 5:{
			System.out.println("welcome to Sports..Please select what you want:\n"
					+"1. Sports wear\n"
					+"2. Sports Shoes\n"
					+"3. Sports Equipments");
			CollectInput4();
			break;
		}
		case 6:{
			System.out.println("Thank you");
			System.exit(0);
		}
		case 7:{
			main(null);
		}
		default:
			System.out.println("");
			main(null);

		}	

	}
}