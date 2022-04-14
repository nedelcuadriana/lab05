package ro.ase.cts.lab05.Adapter;

public class MasinaJucarie implements JucarieMobila{
    public void seDeplaseaza() {
        System.out.println("0,5 km/h");
    }

    public void emiteSunete() {
        System.out.println("Melodie");
    }
}
