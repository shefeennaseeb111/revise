package abstarction;

public class Child2 implements Child,Child3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child d=new Child2();
		d.write();
		Child3 r=new Child2();
		r.dis();
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
	System.out.println(a);
	System.out.println(b);
	
	}
	public Child2()
	{
		System.out.println("thanku");
	}

	@Override
	public void dis() {
		// TODO Auto-generated method stub
		System.out.println(x);
	}

}
