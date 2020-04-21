package ThreadInterrupt;

public class Main {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread calisiyor");
				
				for(int i=0; i<10; i++) {
					System.out.println("Thread yaziyor:" + i);
					try {
						Thread.sleep(1000);
						System.out.println("Uyku " + i + "inci saniyesindeyim..");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("Uyku bolundu...");
					}
				}
			}
		});
		
		t.start();
		try {
			Thread.sleep(2000);//uyku 2.saniyede bolundu
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.interrupt();

	}

}
