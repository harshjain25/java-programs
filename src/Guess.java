class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class Guess {
    public static void main(String[] args){
        Cylinder mycylinder = new Cylinder();
        mycylinder.setHeight(12);
        int h = mycylinder.getHeight();
        System.out.println(h);
        mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());
    }
}
