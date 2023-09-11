package day09;
//try~catch로 예외처리 하되, for루프 바깥쪽에서
public class ExceptionTest2 {

	public static void main(String[] args) {
		try {
			for(int i=1;i<=5;i++) {
				int x=50/(i-3);				
				System.out.println("x: "+x);
			}//for------------
		}catch(ArithmeticException e) {
			System.out.println("분모가 0이 되었네요. 0으로는 나눌 수 없어요!!");
		}
		
		System.out.println("The End~~~~");
	}

}
