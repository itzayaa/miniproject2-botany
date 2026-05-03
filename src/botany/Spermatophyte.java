package botany;

public class Spermatophyte extends Plant { //hierarchical inheritance

    public Spermatophyte(String name) {
        super(name);
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces by producing seeds.");
    }
}
