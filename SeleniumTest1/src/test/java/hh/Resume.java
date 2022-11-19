package hh;

public class Resume {
    private String gender;
    private int age;
    private String city;
    private boolean confirmedPhoneNumber;
    private boolean readyToRelacete;

    public Resume(String gender, int age, String city, boolean confirmedPhoneNumber, boolean readyToRelacete) {
        this.gender = gender;
        this.age = age;
        this.city = city;
        this.confirmedPhoneNumber = confirmedPhoneNumber;
        this.readyToRelacete = readyToRelacete;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public boolean isConfirmedPhoneNumber() {
        return confirmedPhoneNumber;
    }

    public boolean isReadyToRelacete() {
        return readyToRelacete;
    }
}
