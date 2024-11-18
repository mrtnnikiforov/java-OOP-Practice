package lab2;

public class Company {
    private String name;
    private String dateCreated;
    private String vat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        if (vat.length() == 10){
            this.vat = vat;
        }
        else {
            System.out.println("Invalid vat.");
        }
    }

    Company(String name, String dateCreated, String vat){
        this.name = name;
        this.dateCreated = dateCreated;
        setVat(vat);
    }
}
