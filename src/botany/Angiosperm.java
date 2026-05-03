package botany;

public class Angiosperm extends Spermatophyte { //multilevel inheritance

    String flowerColor;

    public Angiosperm(String name, String flowerColor) {
        super(name);
        this.flowerColor = flowerColor; //this keyword
    }

    public void showFlower() {
        System.out.println(name + " is a flowering plant with " + flowerColor + " flowers.");
    }
}
