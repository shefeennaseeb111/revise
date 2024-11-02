package heirarchichalinheritance;

public class Child2 extends Parent {
	public void sub()
	{
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 o=new Child2();
		o.sub();
	}

}
