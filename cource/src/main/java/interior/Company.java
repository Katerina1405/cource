package interior;

public class Company extends Wall {
    private int phoneNumber;

    public Company(int price, String name, int phoneNumber){
        super(name, price);
        this.phoneNumber = phoneNumber;
    }
    public Company() {
    }
    public int getTelephoneNumber() {
        return phoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.phoneNumber = telephoneNumber;
    }


}
