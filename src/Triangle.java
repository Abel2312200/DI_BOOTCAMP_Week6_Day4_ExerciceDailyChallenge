public class Triangle {
    // class attributes
    private double side1;
    private double side2;
    private double side3;

    // constructor without parameters

    public Triangle() {
        this.side1 = 3.0;
        this.side2 = 4.0;
        this.side3 = 5.0;
    }

    // constructor using parameters : not necessary

    // getters and setters

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // class methods

    /*
    * Displays triangle information
    * -  @param : empty
    * -  @returns : void
    * */
    public void displayTriangle(){
        System.out.println(String.format("Side 1 : %f Side 2 : %f Side 3 : %f ", side1,side2,side3));
    }

    /*
     * compute value of triangle perimeter
     * -  @param : empty
     * -  @returns : double
     * */
    private double perimeter(){
        return (side3 + side2 + side1);
    }

    /*
     * compute value of triangle area
     * -  @param : empty
     * -  @returns : double
     * */
    private double area(){
        return ((side1 * side2)/2.0);
    }


    /**
     * @apiNote Description
     * @returns void
     */
    public void displayPerimeter(){
        System.out.println(String.format("Perimeter : %.2f", this.perimeter()));
    }

    /*
     * Displays triangle area
     * -  @param : empty
     * -  @returns : void
     * */
    public void displayArea(){
        System.out.println(String.format("Perimeter : %.2f", this.area()));
    }
}
