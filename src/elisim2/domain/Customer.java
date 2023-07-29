package elisim2.domain;

public class Customer {

    private  String fincode;
    private  String name;
    private  String surname;
    private  String birthdate;
    private  String birthplace;

    public String getFincode() {
        return fincode;
    }

    public void setFincode(String fincode) {
        this.fincode = fincode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fincode='" + fincode + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", birthplace='" + birthplace + '\'' +
                '}';
    }
}
