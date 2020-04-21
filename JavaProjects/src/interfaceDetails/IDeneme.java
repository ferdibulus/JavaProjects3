package interfaceDetails;

public interface IDeneme {
	 public int a=4;//this value can be accesible from main by using Inteface name.
	 
	 
	 public static String deneme = "Deneme";
	 public final int c=6;//constructer yazamayacagimiz icin burada direk deger atandi.
	 
	 public static void Deneme() {//mutlaka static anahtar kelimesi olmasi gerekiyor
		 System.out.println("deneme");
	 }
}
