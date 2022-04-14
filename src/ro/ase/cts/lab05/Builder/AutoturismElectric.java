package ro.ase.cts.lab05.Builder;

public class AutoturismElectric implements Masina{
    private String sasiu;
    private String roti;
    private String motor;
    private String interior;
    private String tipIncarcator;

    public AutoturismElectric() {
    }

    public AutoturismElectric(String sasiu, String roti, String motor, String interior, String tipIncarcator) {
        this.sasiu = sasiu;
        this.roti = roti;
        this.motor = motor;
        this.interior = interior;
        this.tipIncarcator = tipIncarcator;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setTipIncarcator(String tipIncarcator) {
        this.tipIncarcator = tipIncarcator;
    }
}
