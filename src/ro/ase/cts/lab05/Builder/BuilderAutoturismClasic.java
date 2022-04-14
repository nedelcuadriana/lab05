package ro.ase.cts.lab05.Builder;

public class BuilderAutoturismClasic {
    private Masina auto;

    public BuilderAutoturismClasic() {
        auto = (Masina) new AutoturismClasic("Sasiu", "roti", "motor", "interior", "aditivi");
    }

    public BuilderAutoturismClasic buildSasiu(String sasiu){
        auto.setSasiu(sasiu);
        return this;
    }

    public BuilderAutoturismClasic buildRoti(String roti){
        auto.setRoti(roti);
        return this;
    }

    public BuilderAutoturismClasic buildMotor(String motor){
        auto.setMotor(motor);
        return this;
    }

    public BuilderAutoturismClasic buildInterior(String interior){
        auto.setInterior(interior);
        return this;
    }

//    public BuilderAutoturismClasic buildAditivi(String aditivi){
//        auto.setAditivi(aditivi);
//        return this;
//    }

    public AutoturismClasic getMasina(){
        return (AutoturismClasic) auto;
    }
}
