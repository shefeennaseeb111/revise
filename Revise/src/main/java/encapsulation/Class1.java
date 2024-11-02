package encapsulation;

public class Class1 {
	private int a;
  public void setter(int a)
	{
		this.a=a;
	}
  public void getter()
  {
	if((a==1001)||(a==1234)||(a==1212))  
	{
		System.out.println("password is correct");
	}
	else
	{
		System.out.println("Pass word is incorrect");
	}
  }

}
