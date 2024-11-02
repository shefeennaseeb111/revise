package multilevelinheritance;

public class Child3 extends Child2 {
	public void pro()
	{
		e=a*b;
		System.out.println("product is"+e);
	}
	public void div()
	{
		
		 r=a/b;
		System.out.println("div is"+r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child3 o=new Child3();
		o.add();
		o.aub();
		o.pro();
		o.div();
	}

}
