package Static;

public class Static_Dolar {

	
	//atributos
	private static final double IOF = 6;
	private static double dolar;
	private static double boughtDolar;
	private static double paidReais;
	
	//Metodos getters e setters
	public static double getDolar() {
		return dolar;
	}
	public static void setDolar(double dolar) {
		Static_Dolar.dolar = dolar;
	}
	public static double getBoughtDolar() {
		return boughtDolar;
	}
	public static void setBoughtDolar(double boughtDolar) {
		Static_Dolar.boughtDolar = boughtDolar;
	}
			public static double getPaidReais() {
		return paidReais;
	}
	public static void setPaidReais(double paidReais) {
		Static_Dolar.paidReais = paidReais;
	}
	
	
	
	public static double dollars() {
		paidReais = dolar * boughtDolar;
		return paidReais;
	}
	
	public static double amountPaid() {
		return paidReais += paidReais * IOF/100.0;
	}
	
}
