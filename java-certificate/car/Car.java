package car;

public class Car {

    private String color;
    private String type;

    public Car(){}

    public Car(String color, String type){
        this.color = color;
        this.type = type;
    }

    public void start(){
        System.out.println("Get Started!");
    }

    public void printDescription(){
        System.out.println("This is a " + this.color + " " + this.type);
    }

}