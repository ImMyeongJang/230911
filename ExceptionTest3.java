package day09;
//try~catch로 예외처리 하되, for루프 안 쪽에서
public class ExceptionTest3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			try {
				int x=50/(i-3);
				System.out.println("x: "+x);
			}catch(ArithmeticException e) {
				System.out.println("0으로 나누면 안돼요!!");
			}
		
		}//for------------
		
		System.out.println("The End~~~~");
	}

}
