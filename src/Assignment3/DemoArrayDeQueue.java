package Assignment3;
import java.util.ArrayDeque;

public class DemoArrayDeQueue {

	public static void main(String[] args) {
		
		ArrayDeque<String> animals= new ArrayDeque<>();

        // Using add()
        animals.add("Dog");

        // Using addFirst()
        animals.addFirst("Cat");

        // Using addLast()
        animals.addLast("Horse");
        System.out.println("ArrayDeque: " + animals);
     // Using offer()
        animals.offer("Dog");

        // Using offerFirst()
        animals.offerFirst("Cat");

        // Using offerLast()
        animals.offerLast("Horse");
        System.out.println("ArrayDeque: " + animals); // Get the first element
        String firstElement = animals.getFirst();
        System.out.println("First Element:"+firstElement);               // Using add()
        
        // Get the last element
        String lastElement = animals.getLast();
        System.out.println("Last Element: " + lastElement);
        // Using peek()
        String element = animals.peek();
        System.out.println("Head Element: " + element);

        // Using peekFirst()
        String firstElement1 = animals.peekFirst();
        System.out.println("First Element: " + firstElement);

        // Using peekLast
        String lastElement1 = animals.peekLast();
        System.out.println("Last Element: " + lastElement);// Using remove()
        String element1 = animals.remove();
        System.out.println("Removed Element: " + element);

        System.out.println("New ArrayDeque: " + animals);

        // Using removeFirst()
        String firstElement2 = animals.removeFirst();
        System.out.println("Removed First Element: " + firstElement);
        
        // Using removeLast()
        String lastElement2 = animals.removeLast();
        System.out.println("Removed Last Element: " + lastElement);


       }

}
