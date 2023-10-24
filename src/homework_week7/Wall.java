package homework_week7;

public class Wall {
    // Fields
    private double width;
    private double height;
    // Constructors
public Wall() {
// No-arg constructor
}
public Wall(double width, double height) {
    setWidth(width);
    setHeight(height);
}
// Methods

public double getWidth() {
return this.width;
}
public double getHeight(){
return this.height;
}
public void setWidth(double width) {
    if (width<0) {
        this.width = 0;
    } else {
        this.width = width;
    }
}
public void setHeight(double height){
    if (height<0) {
        this.height = 0;
    } else {
        this.height = height;
    }
}
public double getArea() {
    return this.width * this.height;
}
public static void main(String[] args) {
    Wall wall = new Wall(5, 4);
    System.out.println("area = " + wall.getArea());
    wall.setHeight(-1.5);
    System.out.println("width= " + wall.getWidth());
    System.out.println("height= " + wall.getHeight());
    System.out.println("area= " + wall.getArea());
}
}