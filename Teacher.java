package day09;
//Person상속받아서, 컴파일문제 없도록 코드 완성하세요
//toString()오버라이드 하기
public class Teacher extends Person {
	
	String subject;
	
	public Teacher() {
		super(0,"","");
	}
	public Teacher(int no, String name, String addr, String subject) {
		super(no,name,addr);
		this.subject=subject;
	}
	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", no=" + no + ", name=" + name + ", addr=" + addr + "]";
	}
	
	public String toString(String title) {//Overload
		return "####"+title+"####\n"+this.toString();
	}
	

}
