public class Vector2 extends MathObject implements Cloneable {
    private int x;
    private int y;

    public Vector2(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Vector2(int x, int y, String description) {
        super(description);
        this.x = x;
        this.y = y;
    }

    public int magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector2 add(Vector2 other) {
        return new Vector2(this.x + other.x, this.y + other.y);
    }

    public boolean isEqual(Vector2 other) {
        return this.x == other.x && this.y == other.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Vector2(" + this.x + ", " + this.y + ")";
    }

    @Override
    public int getDimension() {
        return 2;
    }

    @Override
    public Vector2 clone() {
        try {
            return (Vector2) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should not happen since Vector2 implements Cloneable
            throw new InternalError(e);
        }
    }
}