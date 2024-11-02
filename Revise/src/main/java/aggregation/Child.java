package aggregation;

public class Child {
	Parent stu;
	String House,Place;
	public Child(Parent stu,String House,String Place) 
	{
	this.stu=stu;
	this.House=House;
	this.Place=Place;
	}
	public void display()
	{
		System.out.println(stu.rollno);
		System.out.println(stu.student);
		System.out.println(House);
		System.out.println(Place);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent o1=new Parent(1, "shefeena");
		Child o=new Child(o1," Mangattu", "Varappetty");
		o.display();
		
	}

}
