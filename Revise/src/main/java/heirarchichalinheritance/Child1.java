package heirarchichalinheritance;

public class Child1 extends Parent {
	public void add()
	{
			
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 o=new Child1();
		o.div();
		o.add();
	}

}
