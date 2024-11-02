package methodeoverriding;

public class Chidclass extends Parent {
	public void add()
	{
		super.add();
	int c=40*1000/100;
	System.out.println(c);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chidclass o=new Chidclass();
		
		o.add();
	}

}
