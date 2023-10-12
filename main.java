//DeliFormat.java
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class DeliFormat
{
public static void main(String[] args)
{
//Set the ounces per pound as 16
final double OUNCES_PER_POUND=16.0;
//declare variables of double type
double pricePerPound;
double weightOunces;
double weight;
double totalPrice;
//create a Scanner class object
Scanner scan=new Scanner(System.in);

System.out.println("Welcome to the CS Deli! !\n");

System.out.print("Enter the price per pound of your item: ");
pricePerPound=scan.nextDouble();

System.out.print("Enter the weight (ounces): ");
weightOunces=scan.nextDouble();

weight= weightOunces/OUNCES_PER_POUND;
totalPrice = pricePerPound*weight;

//create an instance of NumberFormat for us dollar sign
NumberFormat money=NumberFormat.getCurrencyInstance(Locale.US);
//create an instance of DecimalFormat class with with two decimal on right side
//and at least one digit on left side
DecimalFormat fmt =new DecimalFormat("#.##");

System.out.println("*****CSDeli*****");
System.out.println("");
//print price per pound with money object of Number format
System.out.println("Unit price: "+money.format(pricePerPound)+" per pound");
//print price per pound with fmt object of DecimalFormat
System.out.println("Weight: "+fmt.format(weight)+" pounds");

System.out.println();
//print total price of money object of Number format
System.out.println("TOTAL : "+money.format(totalPrice));


}
}