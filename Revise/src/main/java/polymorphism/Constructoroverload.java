package polymorphism;

public class Constructoroverload {
	
	int a,b,c;
	public Constructoroverload(int a,int b)
	{
		c=a+b;
		System.out.println(c);
	}
	public Constructoroverload(float d)
	{
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoroverload o=new Constructoroverload(20, 50);
		Constructoroverload o1=new Constructoroverload(40);
		
		
	}

}
