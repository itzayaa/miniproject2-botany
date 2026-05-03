package botany;

public class Plant { //superclass
    protected String name; //protected access modifier & visibility

    public Plant() {
        this.name = "Saguaro";
    }

    public Plant(String name) {
        this.name = name; //this keyword
    }

    public void showName() {
        System.out.println("This plant is called " + name + ".");
    }

    public void reproduce() {
        System.out.println("Plants reproduce in different ways.");
    }

    //final method
    final void photosynthesis() {
        System.out.println(name + " makes its own food through photosynthesis.");
    }

    //static method hiding
    static void category() {
        System.out.println("All plants.");
    }
}
