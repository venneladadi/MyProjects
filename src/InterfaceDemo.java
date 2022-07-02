//import com.tnsif.testdemo.myInterface;
interface A1 
{
	void display();
}
interface B1 extends A1
{
	int i=10;
	public static final int b=10;
	public void display();
	//void display();
	
	void print();
			
}
class c
{
	
}

public class InterfaceDemo extends c implements A1,B1
{
	public void show()
	{
		
	}
	public void display()
	{
		
		
	}
	public void print()
	{
		
	}
	public void display1()
	{
		System.out.println("in interface B");
		
	}
	public static void main(String[] args) 
	{
		InterfaceDemo obj=new InterfaceDemo();
		obj.display();
		obj.display1();
		System.out.println(i);

	}

}
