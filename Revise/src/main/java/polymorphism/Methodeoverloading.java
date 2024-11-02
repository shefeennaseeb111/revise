package polymorphism;

public class Methodeoverloading {
	static int a;
	static int b;
	static int c;
	static int d;
	public static void add(int a,int b)
	{
		c=a+b;
		System.out.println("sum is"+c);
	}
	public static void add(int a,int b,int c) 
	{
		d=a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodeoverloading.add(20, 50);
		Methodeoverloading.add(30, 20, 50);
	}

}
