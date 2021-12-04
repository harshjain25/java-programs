class Employee {
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class Getter_Setter {
    public static void main(String[] args){
        Employee harsh=new Employee();
        harsh.setName("helloharsh");
        System.out.println(harsh.getName());
    }
}
