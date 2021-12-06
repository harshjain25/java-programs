class MyEmployee {
    private int id;
    private String name;

    public MyEmployee() {
        id = 45;
        name = "your name here: ";
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}
public class Constructors {
    public static void main(String[] args){
         MyEmployee harsh = new MyEmployee();
         System.out.println(harsh.getId());
         System.out.println(harsh.getName());
    }
}

