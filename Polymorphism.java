package day09;


class Super{
	int a=10;
	int b=20;
	void func() {
		System.out.println("*****");
	}
	
}///////////////

class Sub extends Super
{
	int b=30;
	int c=40;
	
	@Override
	protected void func() {
		System.out.println("####");
	}
	
}////////////////////
public class Polymorphism {

	public static void main(String[] args) {
		System.out.println("1.-----------------");
		Super sp=new Super();
		System.out.println("sp.a="+sp.a);//10
		System.out.println("sp.b="+sp.b);//20
		sp.func();//***
		
		System.out.println("2.-----------------");
		Sub sb=new Sub();
		System.out.println("sb.a="+sb.a);//10
		System.out.println("sb.b="+sb.b);//30
		System.out.println("sb.c="+sb.c);//40
		sb.func();//####
		
		System.out.println("3.-----------------");
		Super ss=new Sub();
		System.out.println("ss.a="+ss.a);//10
		System.out.println("ss.b="+ss.b);//20
		//System.out.println("ss.c="+ss.c); //[x]
		System.out.println(((Sub)ss).c);
		
		ss.func();//###
		
		
		
	}

}




















