public class Loops{
	public static void main(String[] args) {
		//String s = "My String";
		//int length = findLength(s);
		//System.out.println(length);
		
		//int x= 45;
		//while (x >= 20) {
			//System.out.println(x);
			//x= x-5;

		//}
		//for (int i=24;i<=68 ;i+=2) {
			//System.out.println(i);
			
		//}
		System.out.println("There are " + drugPotency(.04, 50) + " month(s) left. DONT DIE!");
		
	}
	public static int drugPotency(double decrease, double limit){
		int month = 0;

		for (double i = 100.0; i > limit; i= i - (i * decrease)) {
			System.out.println(i);	
			month++;
			
		}
		return month;
	}
	
}