import customer.Customer;
import car.Car;

class HelloWorld {

    public static void main(String[] args) {

        Customer customer = new Customer("Vinicius", "Santos", 22);
        System.out.println("Hello World\nMr. " + customer.getLastName() + ", Very Welcome! Your age is: " + customer.getAge());

        Car car = new Car("Blue", "Sedan");
        car.start();
        car.printDescription();

        Car test = new Car();
        
    }

}
