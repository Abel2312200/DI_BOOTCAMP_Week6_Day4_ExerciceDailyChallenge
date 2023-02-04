public class Student {

    // class attributes
    private String name;
    private int roll_no;

    // constructor without parameters
    public Student() {
        super();
    }

    // constructor with parameters
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    // declaration getters and setters
    public String getName() {
        return name;
    }
    public int getRoll_no() {
        return roll_no;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    // class methods
    public void displayStudent(){
        System.out.println(String.format("name: %s\n roll : %d", name,roll_no));
        //System.out.println("name: "+name+"\n roll : "+roll_no);
    }

}
