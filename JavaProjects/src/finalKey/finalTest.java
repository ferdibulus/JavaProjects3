package finalKey;

public class finalTest {
//	//public final int obje_Sayisi=3;
//	public final int obje_Sayisi;
//	public finalTest() {
//		obje_Sayisi = 3;
//	}
//	
	public final int obje_Sayisi;
	
	private static int say =0;
	private String isim;
	
	public finalTest(String isim) {
		this.isim = isim;
		say++;
		obje_Sayisi= say;
	}

	public static int getSay() {
		return say;
	}

	public static void setSay(int say) {
		finalTest.say = say;
	}
	
}
