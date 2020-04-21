package CallableandFutureInterface;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
//Deger Dondurmek istersek Callable ve Future Interface i kullanilir..
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executer = Executors.newFixedThreadPool(1);
//		executer.submit(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				Random random = new Random();
//				System.out.println("Thread calisiyor");
//				int sure = random.nextInt(1000) + 2000;
//				try {
//					Thread.sleep(sure);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println("Thread cikiyor");
//			}
//		});
//		
//		executer.shutdown();
		
		Future<Integer> future = executer.submit(new Callable<Integer>() {//Future<?> yazarsak turden bagimsiz olur(Generic olur)

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
			
				Random random = new Random();
				System.out.println("Thread calisiyor");
				int sure = random.nextInt(1000) + 2000;
				
				//in HERE,one exception can be occured.We can catch it by using throw method.(write here by ourselves)
				try {
					Thread.sleep(sure);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread cikiyor");
				return sure;
			}
			
		});
		
		executer.shutdown();
		try {
			System.out.println("Donen Deger : " + future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
