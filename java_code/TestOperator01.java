/*����������������÷�*/
public class TestOperator01{
	
	public static void main(String [ ] args){
		int a =3;
		long b =5;
		long c =a+b;
		System.out.println("c�Ĵ�СΪ��"+c);
		double d=31.0/3;//
		int e=31/3;//�����������ֱ�ӱ�����������
		System.out.println("d�Ľ��Ϊ��"+d);
		System.out.println("e�Ľ��Ϊ��"+e);
		/*ȡ����%*/
		int w=32%5;//ȡ�������������ź���߲�������ͬ
			System.out.println("w�Ľ��Ϊ��"+w);
		//�������Լ�
		int f=30;
		/*
		g++;//�൱�ڣ�g=g+1
		g--;//�൱�ڣ�g=g-- 
		*/
		int g=10;
		int h=g++;//g++�ȸ�ֵ��������
		int i=++g;//++g����������ֵ
		System.out.println("h��ֵΪ��"+h);
		System.out.println("i��ֵΪ��"+i);
		if(g==12){
				System.out.println("�����");
		}else{	System.out.println("ɵ��");
		}
		if(h==10){
			System.out.println("ţ��");
		}else{
			System.out.println("����");
		}
		if(i==g){
			System.out.println("good");
		}else{
			System.out.println("nonono");
		}
	}
}