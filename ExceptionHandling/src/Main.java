
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a = 30/0; //unchecked exception
		//int [] a = {1,2,3,4,5};
		//System.out.println(a[6]);
		
		
		//System.out.println("Burasi calisiyor");
		
//		try {
//			//int a = 30/0; //AritmeticException
//			int [] a = {1,2,3,4,5};	
//			System.out.println(a[6]);
//		}
//		catch(RuntimeException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("Burasi calisiyor");
		
		try {
			int [] a = {1,2,3,4,5};
			System.out.println(a[4]);
			
			int b = 30/12;
			System.out.println(b);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Bir hata olustu");
			e.printStackTrace();
		}
		
		
		 System.out.println("Burasi calisiyor");
	}

}
