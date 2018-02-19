
public class main {

	public static void main(String[] args) {
		
		WaterTap sanluxVilla = new WaterTap();
		System.out.println(sanluxVilla.toString());
		sanluxVilla.resetValues("Sanlux Villa", "614-H05", "silumin", 13, 500);
		System.out.println(sanluxVilla.toString());

		WaterTap hansgrone = new WaterTap("HANSGROHE", "Metric Steel Optic", "brass", 803);
		System.out.println(hansgrone.toString());
		hansgrone.printSum();
		System.out.println("");


		WaterTap tangoRio = new WaterTap("Tango Rio", "04", "brass", 35, 600);
		System.out.println(tangoRio.toString());
		System.out.println("");

		
		sanluxVilla.printSum();
		tangoRio.printSum();
		hansgrone.printSum();
		
		hansgrone.setQuantityOfTaps(200);
		hansgrone.printSum();
		
		WaterTap.printStaticSum();
		
	}

}
