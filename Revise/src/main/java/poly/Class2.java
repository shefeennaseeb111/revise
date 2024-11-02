package poly;

public class Class2 extends Class1 {
	public void add()
	{
		super.add();
		int c=a-b;
		System.out.println("The difference is"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 o=new Class2();
		
		o.add();
		
	}

}
