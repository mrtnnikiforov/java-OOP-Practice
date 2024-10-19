package lab2;

public class CompanyET extends Company {
    private String creatorName;
    private double startCapital;
    private double currentCapital;

    CompanyET(String name, String dateCreated, String vat, String creatorName, double startCapital, double currentCapital) {
        super(name, dateCreated, vat);
        this.creatorName = creatorName;
        this.startCapital = startCapital;
        this.currentCapital = currentCapital;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public double getStartCapital() {
        return startCapital;
    }

    public void setStartCapital(double startCapital) {
        this.startCapital = startCapital;
    }

    public double getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital(double currentCapital) {
        this.currentCapital = currentCapital;
    }

    double profit(){
        return currentCapital - startCapital;
    }

}
