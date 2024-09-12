package Static;
import java.util.Scanner;
public class Static_MainDolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sr = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		Static_Dolar.setDolar(sr.nextDouble());
		
		System.out.print("How many dollars will be bought? ");
		Static_Dolar.setBoughtDolar(sr.nextDouble());
		
		Static_Dolar.dollars();
		System.out.printf("Amount to be paid in reais = %.2f ", Static_Dolar.amountPaid());
		
		sr.close();
	}

}
