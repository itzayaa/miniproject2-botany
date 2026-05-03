package botany;

public class Main {
    public static void main(String[] args) {
        Plant p = new Plant("Fern");
        p.showName();
        p.photosynthesis();

        Bryophyte b = new Bryophyte("Moss");
        b.reproduce();

        Spermatophyte s = new Spermatophyte("Seed Plant");
        s.reproduce();

        Angiosperm a = new Angiosperm("Rose", "red");
        a.showFlower();

        //implicit super()
        Cactus c = new Cactus();
        c.showCactus();

        //static method hiding
        Plant.category();
        Bryophyte.category();

        //Java doesn't support multiple inheritance with classes
    }
}