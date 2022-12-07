import java.util.*;
class Hamburger{
public static void main (String args []){
Scanner mom = new Scanner(System.in);
int moneyhamburger = 8;
int moneycheese = 2;
int moneycombo = 4;
String namecheese = "";
String namecombo = "";
String order;
int price = 0;
String moreOrder;
int number;
System.out.println("Customer: Hello");
System.out.println("Waiter: Hello!");
for(int i=1;;i++)
{
	System.out.println("Waiter: how can I help you?");
	System.out.print("Customer: Iwant ");
	order = mom.next().toLowerCase();
	if(order.equals("hamburger"))
	{
		price = moneyhamburger;
		System.out.println("Waiter: How many hamburger you want?");
		System.out.print("Customer: ");
		number = mom.nextInt();
		price = price * number;
		System.out.println("Waiter: Do you want your hamburger with cheese?");
		System.out.print("Customer: ");
		namecheese = mom.next().toLowerCase();
		if(namecheese.equals("yes"))
		{
			System.out.println("Waiter: Cheese costs extra 2 dolars? Do you agree?");
			System.out.print("Customer: ");
			namecheese = mom.next().toLowerCase();
			if(namecheese.equals("yes"))
			{
				price = price + (number*moneycheese);
			}
		}
		System.out.println("Waiter: Do you want a combo?");
		System.out.print("Customer: ");
		namecombo = mom.next().toLowerCase();
		if(namecombo.equals("yes"))
		{
			System.out.println("Waiter: Combo will cost extra 4 dolars, Do you agree?");
			System.out.print("Customer: ");
		    namecombo = mom.next().toLowerCase();
		    if(namecombo.equals("yes"))
		    {
				price = price + (number*moneycombo);
			}
		}
}
System.out.println("Waiter: Do you need anything eles?");
System.out.print("Customer: ");
moreOrder = mom.next().toLowerCase();
if(moreOrder.equals("no"))
break;
}
System.out.println("Customer: What is the total please?");
if(order.equals("hamburger"))
{
	if(namecombo.equals("yes") && namecheese.equals("yes"))
	{
		System.out.println("Waiter: " + moneyhamburger + " Dolars per " +  order + " " + moneycheese + " Dolars per cheese and " + moneycombo + " Dolars per combo, it means total is " + price + " Dolars");
    }
    else if(namecheese.equals("yes"))
    {
	System.out.println("Waiter: " + moneyhamburger + " Dolars per " +  order +" "+ moneycheese + " Dolars per cheese it means total is " + price + " Dolars");
    }
else if(namecombo.equals("yes"))
    {
	System.out.println("Waiter: " + moneyhamburger + " Dolars per " + order +" "+ moneycombo + " Dolars per combo it means total is " + price + " Dolars");
    }
System.out.println("Customer: Here is it, Thanks");
}
}
}









































