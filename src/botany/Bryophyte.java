package botany;

public class Bryophyte extends Plant { //extends keyword, subclass and single inheritance

    public Bryophyte(String name) {
        super(name); //super() constructor calls
    }

    @Override //method overriding
    public void reproduce() {
        super.reproduce(); //super method
        System.out.println(name + " reproduces by using spores.");
    }

    //static method hiding
    static void category() {
        System.out.println("Bryophyte plants.");
    }
}
