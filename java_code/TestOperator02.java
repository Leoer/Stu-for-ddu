
public class TestOperator02{
	
	public static void main(String [ ] args ){
		int a=3;
		int b=4;
		a+=b;//即a=a+b
		int c=a;
		c+=b;
		int d=c;
		d*=a;
		int e=d;
		//a-=b;//即a=a-b
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}