import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Map<String, MathObject> mathObjectMap = new HashMap<>();

        Vector2 v1 = new Vector2(3, 4, "Vector A");
        Vector2 v2 = new Vector2(1, 2, "Vector B");
        Vector2 v3 = new Vector2(-2, 6, "Vector C");

        mathObjectMap.put(v1.getDescription(), v1);
        mathObjectMap.put(v2.getDescription(), v2);
        mathObjectMap.put(v3.getDescription(), v3);

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a description to retrieve a Vector2: ");
        String inputDescription = scanner.nextLine();

       
        MathObject retrievedObject = mathObjectMap.get(inputDescription);
        if (retrievedObject instanceof Vector2) {
            System.out.println("Retrieved Vector2: " + retrievedObject);
        } else {
            System.out.println("No Vector2 found with the specified description.");
        }

        
        System.out.println("All objects in the HashMap:");
        for (MathObject mathObject : mathObjectMap.values()) {
            System.out.println(mathObject);
        }

        // Calculate and display the magnitude of Vector v1
        int magnitudeV1 = v1.magnitude();
        System.out.println("Magnitude of v1: " + magnitudeV1);

        // Add Vector v1 and v2
        Vector2 sumVector = v1.add(v2);
        System.out.println("Sum of v1 and v2: " + sumVector);

        // Check if v1 and v2 are equal
        boolean areEqualVectors = v1.isEqual(v2);
        System.out.println("Are v1 and v2 equal? " + areEqualVectors);

        // Get the description of v2
        String descriptionV2 = v2.getDescription();
        System.out.println("Description of v2: " + descriptionV2);

        // Get the dimension of v2
        int dimensionV2 = v2.getDimension();
        System.out.println("Dimension of v2: " + dimensionV2);

        scanner.close();
    }
}
