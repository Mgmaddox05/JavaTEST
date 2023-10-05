public class App {
    public static void main(String[] args) throws Exception {
        Vector2 v1 = new Vector2(3, 4);
        Vector2 v2 = new Vector2(1, 2, "A 2D vector");

        System.out.println(v1); 
        System.out.println(v2.getDescription());  // Use 'v2' instead of 'vector2'
        System.out.println("Vector2 1 Dimension: " + v1.getDimension());
        System.out.println("Vector2 2 Dimension: " + v2.getDimension());
    }
}
