public class UserInfo {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    public UserInfo(){

    }
    public UserInfo(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String nameString(){
        String result;

        result = "First Name: " + firstName;
        result = "Last Name: " + lastName;
        result = "Mobile Phone: " + phoneNumber;

        return result;
    }
}
