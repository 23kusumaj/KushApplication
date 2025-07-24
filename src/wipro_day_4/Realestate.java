package wipro_day_4;
import java.util.Scanner;
abstract class Realestate1 {
abstract void tax(double rent);
}
class Apartment extends Realestate1 {
@Override
void tax(double r1) {
    double t = 10 * r1 / 100;
    double r2 = t + r1;
    System.out.println("Tax for Apartment (10% of " + r1 + "): " + t);
    System.out.println("Final Apartment Rent: " + r2);
}
}
class House extends Realestate1 {
@Override
void tax(double r1) {
    double t = 20 * r1 / 100;
    double r2 = t + r1;
    System.out.println("Tax for House (20% of " + r1 + "): " + t);
    System.out.println("Final House Rent: " + r2);
}
}
public class Realestate {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your category (Apartment/House): ");
    String category = sc.next();
    System.out.print("Enter base rent amount: ");
    double rent = sc.nextDouble();
    Realestate re = null;
    if (category.equalsIgnoreCase("Apartment")) {
        Apartment re1 = new Apartment();	
    } else if (category.equalsIgnoreCase("House")) {
        House re1 = new House();
    } else {
        System.out.println("Invalid category entered.");
        sc.close();
        return;
    }
    re .tax(rent);
    sc.close();
}

private void tax(double rent) {
	// TODO Auto-generated method stub
	
}
}
