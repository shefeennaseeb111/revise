package singleinherritance;



public class Child extends Parent {
	public void sub()
	{
		c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child s=new Child();
		s.add();
		s.sub();
	}

}
