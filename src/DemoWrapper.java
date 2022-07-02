import java.util.ArrayList;

public class DemoWrapper {

	public static void main(String[] args) {
		int i=20;
		double d=9.34;
		//Boxing
		//Integer iob=new Integer(i);
		Integer iob=i;//autoboxing(conversion of primitive type to wrapper)
		System.out.println("this autoboxing"+iob);
		
		//unboxing(converting of wrapper to pt)
		//int j=iob.intValue();
		int j=iob;
		System.out.println("After unboxing"+j);
		
		ArrayList<String> a1=new ArrayList();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		a1.add("d");
		

	}

}
