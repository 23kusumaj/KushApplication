package wipro_day5;

class ReceiptPrinter{
	void printreceipt(String name,double amount) {
		 System.out.println("Customer: " + name);
	        System.out.println("Amount: " + amount);
	}
}
public class Static {
	public static void main(String[] args) {
        ReceiptPrinter rp = new ReceiptPrinter();
        rp.printreceipt("Kush", 1000);
    }
}