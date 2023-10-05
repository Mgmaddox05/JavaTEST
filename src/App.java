public class App {
    public static void main(String[] args) {
        Vector2 v1 = new Vector2(3, 4);
        Vector2 v2 = new Vector2(1, 2, "A 2D vector");

        // Clone v1
        Vector2 v1Clone = v1.clone();

        // Check if the cloned object is equal to the original
        boolean areEqual = v1.isEqual(v1Clone);

        System.out.println("Original Vector: " + v1);
        System.out.println("Cloned Vector: " + v1Clone);
        System.out.println("Are they equal? " + areEqual);

        // Modify the cloned vector using setter methods and check again
        v1Clone.setDescription("Modified clone");
        v1Clone.setX(5);

        System.out.println("Modified Cloned Vector: " + v1Clone);
        System.out.println("Original Vector after modification of clone: " + v1);

        // Calculate and print the magnitude of v2
        int magnitudeV2 = v2.magnitude();
        System.out.println("Magnitude of v2: " + magnitudeV2);

        // Add v1 and v2
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
    }
}
