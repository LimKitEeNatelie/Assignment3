import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("~ Welcome to Natelie's Boat Shop ~");
		System.out.print("Please enter your name: ");
		String name = in.next();
		
		System.out.print("Please enter your IC number: ");
		String ic = in.next();
		
		System.out.print("Please enter your phone number: ");
		String hp = in.next();
		
		System.out.println();
		
		System.out.println("Here's our list for out brand and type of boat:");
		
		String[][] menu = { {"1.MasterCraft", "2.Bayliner Canoe","3.MasterCraft", "4.Bayliner" },
	                        {"Canoe","Canoe","Sailboat","Sailboat"}
                          };
		
        System.out.println(menu[0][0] + " " +menu[1][0]);
        System.out.println(menu[0][1] + " " +menu[1][1]);
        System.out.println(menu[0][2] + " " +menu[1][2]);
        System.out.println(menu[0][3] + " " +menu[1][3]);
		
		System.out.println();
		System.out.println("The pricelist for our products (followed the arrangement, 1stline = MasterCraft Canoe etc):");
		
		int[] price = {1000,900,62000,60000};
		Print (price);
		
		
		System.out.print("Please enter the number to purchase (1 = MasterCraft Canoe etc): ");
		int number = in.nextInt();
		System.out.print("Please enter the amount you want to purchase (maximum 2): ");
		int amount = in.nextInt();
		
		System.out.println();
		
		int number2=0;
		do {
			number2++;
		} while (number2<=4);

		number2=number;
		System.out.println("Your number is " +number2);
		
		int amount2=0;
		while(amount2<=2) {
			amount2++;
		}
		amount2=amount;
		System.out.println("Your amount is " + amount2);
		
		System.out.println();
		
	
		int totalprice =0;
		if (number == 1 && amount == 1) {
			totalprice = 1000;
			System.out.println("Confirmation: Your purchase is 1 MasterCraft Canoe" +"\n" + "Totalprice is RM1000");
		} else if (number == 1 && amount == 2) {
			totalprice = 2000;
			System.out.println("Confirmation: Your purchase is 2 MasterCraft Canoe" +"\n" + "Totalprice is RM2000");
		} else if (number == 2 && amount == 1) {
			totalprice = 900;
			System.out.println("Confirmation: Your purchase is 1 Bayliner Canoe" +"\n" + "Totalprice is RM900");
		} else if (number == 2 && amount == 2){
			totalprice = 1800;
			System.out.println("Confirmation: Your purchase is 2 Bayliner Canoe" +"\n" + "Totalprice is RM1800");
		} else if (number == 3 && amount == 1){
			totalprice = 62000;
			System.out.println("Confirmation: Your purchase is 1 MasterCraft Sailboat" +"\n" + "Totalprice is RM62000");
		} else if (number == 3 && amount == 2) {
			totalprice = 124000;
			System.out.println("Confirmation: Your purchase is 2 MasterCraft Sailboat" +"\n" + "Totalprice is RM124000");
		} else if (number == 4 && amount == 1) {
			totalprice = 60000;
			System.out.println("Confirmation: Your purchase is 1 Bayliner Sailboat" +"\n" + "Totalprice is RM60000");
		} else if (number == 4 && amount == 2) {
			totalprice = 120000;
			System.out.println("Confirmation: Your purchase is 2 Bayliner Sailboat" +"\n" + "Totalprice is RM120000");
		} else {
			System.out.println("Not valid, Please enter another correct number or amount");
		}
			
		System.out.println();
		
		System.out.println("Here's a good news for you! Due to our YEAR-END PROMOTION, You will be entitiled for 20% off for your purchase!");
		int discount = (totalprice*20)/100;
		int pricetobepaid = totalprice - discount;
		
		System.out.println("Total price: RM" +totalprice );
		System.out.println("Discount received: RM" +discount);
		System.out.println("Price to be paid: RM" +pricetobepaid);
		System.out.println("To express my greatest gratitude, I would like to say");
		for(int tq=1; tq<=3;tq++) {
			System.out.println("Thank you so much!");
		}
		System.out.println("Hope to see you soon again! Have a nice day :)");
		
		
		in.close();
	}
	
	public static void Print(int x[]) {
		for(int counter=0;counter<x.length;counter++) {
					System.out.println("-RM"+ x[counter]);
		}
	}
	
	

}
