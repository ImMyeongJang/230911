package day09;
/*
 * try블럭 하나에 catch블럭을 여러 개 사용할 수 있다.
 * 이 때 주의사항. 자식 예외를 먼저 catch하고
 * 부모 예외를 나중에 catch해야 한다.
 * 
 * 발생된 예외 handle하세요
 * 
 * try{
 * 
 * }catch(  ){
 * 
 * }finally{
 * 		//반드시 한번은 수행하는 블럭이다.
 *      //위에 return문이 있더라도 반드시 finally수행하고 제어권을 넘긴다
 *      //단, 위에 System.exit()코드가 있다면 =>바로 프로그램 종료된다
 * }
 * */
public class ExceptionTest4 {

	public static void main(String[] args) {
		try {
			String num1=args[0];//명령줄 인수
			String num2=args[1];
			//javac -d . ExceptionTest4.java
			//java day09.ExceptionTest4 국어 영어
			//java day09.ExceptionTest4 100 88
			System.out.println("num1: "+num1);
			System.out.println("num2: "+num2);
			
			int n1=Integer.parseInt(num1);
			int n2=Integer.valueOf(num2);
			
			int n3=n1/n2;
			System.out.println("n3: "+n3);
			String str=null;
			System.out.println(str.toUpperCase());
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령줄 인수를 2개 주어야 해요");
			System.out.println("java day09.ExceptionTest4 10 5");
		}catch(NumberFormatException e) {
			System.out.println("명령줄 인수는 숫자로 입력해야 해요!!");
		}catch(ArithmeticException e) {
			System.out.println("0을 입력해선 안돼요!!");
			System.exit(-1);//시스템 종료. finally{}는 수행되지 않음
		}catch(Exception e) {
			System.out.println("기타 예상치 못한 에러 발생: "+e.getMessage());
			return;//finally{}를 수행한 뒤에 return된다
		}finally {
			System.out.println("###반드시 실행되어야 할 코드########");
		}
		
		System.out.println("~~~~The End~~~~~~~~~~~~~~~~~~~~~");

	}

}








