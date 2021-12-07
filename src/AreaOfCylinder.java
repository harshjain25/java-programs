class Cylinder1 {
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
public double surfaceArea(){
    return 2*3.142*radius*radius + 2*3.142*radius*height;
}
public double volume(){
    return 3.142*radius*radius*height;
}
        }
public class AreaOfCylinder {
    public static void main(String[] args){
        Cylinder1 mycylinder = new Cylinder1();
        mycylinder.setHeight(12);
        int h = mycylinder.getHeight();
        System.out.println(h);
        mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
    }
}
