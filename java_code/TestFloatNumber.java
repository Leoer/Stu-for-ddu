//测试浮点数的应用
public class TestFloatNumber{
	
	public static void main(String [  ] args){
		double d1=314;
		double d2=3.14E2;//科学计数法
		double e=3.14/0.01;
		System.out.println(d1==e);
		BigDecimal j=8712548753458L;
		BigDecimal h=j+1;
		System.out.println (j==h);
		
	}
}