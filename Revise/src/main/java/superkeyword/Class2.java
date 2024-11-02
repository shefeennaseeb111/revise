package superkeyword;

public class Class2 extends Class1 {
	public Class2()
	{
		//super();//parent constructor
		//super.display();//super.methode name
		System.out.println(super.a);//super.variable name
		System.out.println(super.b);
		
		
		
		
	}
	public void check()
	{
		int d=c%10;
		if(d==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("not");
		}
		super.display();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Class2 o=new Class2();
	o.check();
	//o.display();
	}

}
