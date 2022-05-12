package corso.testered;



public class School {
    String nameSchool;
    String citySchool;
    String addressSchool;


    public School() {

    }


    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getCitySchool() {
        return citySchool;
    }

    public void setCitySchool(String citySchool) {
        this.citySchool = citySchool;
    }

    public String getAddressSchool() {
        return addressSchool;
    }

    public void setAddressSchool(String addressSchool) {
        this.addressSchool = addressSchool;
    }

    @Override
    public String toString() {
        return "School{" +
                "School's name='" + nameSchool + '\'' +
                ", School's city='" + citySchool + '\'' +
                ", School's address='" + addressSchool + '\'' +
                '}';
    }
}
