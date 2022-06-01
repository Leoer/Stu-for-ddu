/*测试算术运算符的用法*/
public class TestOperator01{
	
	public static void main(String [ ] args){
		int a =3;
		long b =5;
		long c =a+b;
		System.out.println("c的大小为："+c);
		double d=31.0/3;//
		int e=31/3;//俩整数相除，直接保留整数部分
		System.out.println("d的结果为："+d);
		System.out.println("e的结果为："+e);
		/*取余数%*/
		int w=32%5;//取余操作，结果符号和左边操作数相同
			System.out.println("w的结果为："+w);
		//自增、自减
		int f=30;
		/*
		g++;//相当于：g=g+1
		g--;//相当于：g=g-- 
		*/
		int g=10;
		int h=g++;//g++先赋值，后自增
		int i=++g;//++g先自增，后赋值
		System.out.println("h的值为："+h);
		System.out.println("i的值为："+i);
		if(g==12){
				System.out.println("答对了");
		}else{	System.out.println("傻逼");
		}
		if(h==10){
			System.out.println("牛逼");
		}else{
			System.out.println("废物");
		}
		if(i==g){
			System.out.println("good");
		}else{
			System.out.println("nonono");
		}
	}
}