package day09;
/*super.변수
 *super.method
 *super() : 생성자 안에서만 호출 가능. 생성자의 첫번째 라인에 위치해야 함
 * 
 * */

public class Student extends Person
{
	String className;
	/*
	public Student() {
		super();  //자식클래스의 생성자에서는 묵시적으로  super()를 호출한다
				//따라서 부모클래스에 기본생성자가 존재해야 한다
				 * 만약 부모클래스에 기본생성자가 없다면, 자식 클래스는 super(인자)를 명시적으로 호출해주어야 한다
	}
	*/
	public Student(int n, String name, String addr, String cname) {
		super(n, name, addr); //명시적으로 super(인자들...)를 호출
		className=cname;
	}
	@Override
	public String toString() {
		return "Student [className=" + className +
				", no=" + no + ", name=" + name + ", addr=" + addr + "]";
	}
	
	

}//////////////////
