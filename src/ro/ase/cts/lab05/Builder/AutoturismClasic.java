package ro.ase.cts.lab05.Builder;

public class AutoturismClasic implements Masina{
    private String sasiu;
    private String roti;
    private String motor;
    private String interior;
    private String aditivi;

    public AutoturismClasic(String sasiu, String roti, String motor, String interior, String aditivi) {
        this.sasiu = sasiu;
        this.roti = roti;
        this.motor = motor;
        this.interior = interior;
        this.aditivi = aditivi;
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

    public void setAditivi(String aditivi) {
        this.aditivi = aditivi;
    }
}
