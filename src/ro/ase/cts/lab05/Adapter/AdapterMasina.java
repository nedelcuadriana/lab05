package ro.ase.cts.lab05.Adapter;

public class AdapterMasina implements JucarieMobila{
    private Masina m;

    public AdapterMasina() {
        m = new Autoturism();
    }

    public void seDeplaseaza(){
        m.ruleazaCuVitezaMare();
    }

    public void emiteSunete(){
        m.claxoneaza();
    }
}
