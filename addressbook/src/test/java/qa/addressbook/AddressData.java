package qa.addressbook;

public class AddressData {
    private final String firstname;
    private final String midlename;
    private final String lastname;
    private final String nickname;
    private final String address;
    private final String phoneHome;
    private final String email;

    public AddressData(String firstname, String midlename, String lastname, String nickname, String address, String phoneHome, String email) {
        this.firstname = firstname;
        this.midlename = midlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.address = address;
        this.phoneHome = phoneHome;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMidlename() {
        return midlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public String getEmail() {
        return email;
    }
}
