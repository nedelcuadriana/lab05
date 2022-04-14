package ro.ase.cts.lab05.Builder;

public class BuilderAutoturismElectric {
    private Masina auto;



    public BuilderAutoturismElectric() {
        auto = (Masina) new AutoturismElectric("Sasiu", "roti", "motor", "interior", "tipIncarcator");
    }

    public BuilderAutoturismElectric buildSasiu(String sasiu){
        auto.setSasiu(sasiu);
        return this;
    }

    public BuilderAutoturismElectric buildRoti(String roti){
        auto.setRoti(roti);
        return this;
    }

    public BuilderAutoturismElectric buildMotor(String motor){
        auto.setMotor(motor);
        return this;
    }

    public BuilderAutoturismElectric buildInterior(String interior){
        auto.setInterior(interior);
        return this;
    }

//    public BuilderAutoturismElectric buildIncarcator(String incarcator){
//        auto.setIncarcator(incarcator);
//        return this;
//    }

    public AutoturismElectric getMasina(){
        return (AutoturismElectric) auto;
    }
}
