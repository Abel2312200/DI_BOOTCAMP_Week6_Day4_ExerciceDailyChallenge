public class Rectangle {

    // class attributes
    private double lenght;
    private double breadth;

    // constructor without parameters
    public Rectangle() {
        super();
    }

    // constructor using parameters
    public Rectangle(double lenght, double breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    // setters and getters
    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    // class methods

    public double area(){
        return (lenght * breadth);
    }

    public void displayArea(){
        lenght = (double)Math.round(lenght*100)/100;
          System.out.println(String.format("Lenght: %.2f Breadth: %.2f Area: %.2f",lenght,breadth, this.area()));
    }

}
