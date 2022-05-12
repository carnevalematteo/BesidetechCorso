package corso.eredincap;

public class Scuola {

    String nameSc;
    String citySc;
    String addressSc;


    public Scuola() {
    }

    public String getNameSc() {
        return nameSc;
    }

    public void setNameSc(String nameSc) {
        this.nameSc = nameSc;
    }

    public String getCitySc() {
        return citySc;
    }

    public void setCitySc(String citySc) {
        this.citySc = citySc;
    }

    public String getAddressSc() {
        return addressSc;
    }

    public void setAddressSc(String addressSc) {
        this.addressSc = addressSc;
    }

    @Override
    public String toString() {
        return "Scuola {" +
                "School's name ='" + nameSc + '\'' +
                ", School's city='" + citySc + '\'' +
                ", School's address='" + addressSc + '\'' +
                '}';
    }
}


