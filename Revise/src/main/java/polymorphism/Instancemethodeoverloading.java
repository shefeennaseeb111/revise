package polymorphism;

public class Instancemethodeoverloading {
	int a,b,c;
	float d,e,f;
	public void add(int a,int b)
	{
		c=a+b;
		System.out.println(c);
	}
	public void add(float e,float f){
		{
			d=e-f;
			System.out.println(d);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancemethodeoverloading o=new Instancemethodeoverloading();
		o.add(15, 500);
		o.add(47f, 24f);
	}

}
