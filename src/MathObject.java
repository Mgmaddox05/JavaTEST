abstract class MathObject {
    private String description;

    // Default constructor
    public MathObject() {
        this.description = "No description available";
    }

    // Constructor with a description parameter
    public MathObject(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract int getDimension();
}
