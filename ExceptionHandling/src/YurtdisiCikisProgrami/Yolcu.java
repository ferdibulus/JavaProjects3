package YurtdisiCikisProgrami;
import java.util.Scanner;

class SiyasiException extends Exception {

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("Siyasi yasaginiz bulunuyor");
	}
	
	
}

class VizeException extends Exception {

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("Gideceginiz ulkeye vizeniz bulunmamaktadir");
	}
	
	
}

class HarcException extends Exception {

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("Lutfen yurtdisi harcini tam yatirin..");
	}
	
	
}

public class Yolcu{
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Yatirdiginiz harc bedeli:");
			this.harc = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Herhangi bir siyasi yasaginiz bulunuyormu?");
			String cevap = scanner.nextLine();
			if(cevap.equals("evet")) {
				this.siyasiYasak = true;
				
			}
			else {
				this.siyasiYasak= false;
			}
			
			System.out.println("Vizeniz bulunuyormu?");
			String cevap2 = scanner.nextLine();
			if(cevap2.equals("evet")) {
				this.vizeDurumu = true;
				
			}
			else {
				this.vizeDurumu= false;
			}
		
	}
	
	public void yurtdisiHarci() throws HarcException {
		// TODO Auto-generated method stub
		if(this.harc <15) {
			throw new HarcException();
		}
		else {
			System.out.println("Yurt disi harci islemi tamam");
			
		}
	}

	public void siyasiYasak() throws SiyasiException {
		// TODO Auto-generated method stub
		if(this.siyasiYasak == true) {
			throw new SiyasiException();
		}
		else {
			System.out.println("Siyasi yasaginiz bulunmuyor.");
			
		}
	}
	
	public void vizeDurumu() throws VizeException {
		// TODO Auto-generated method stub
		if(this.vizeDurumu == false) {
			throw new VizeException();
		}
		else {
			System.out.println("Vizeniz onaylanmistir");
			
		}
	}
	
}
