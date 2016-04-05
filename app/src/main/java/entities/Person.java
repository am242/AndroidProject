package entities;

import java.io.Serializable;

/**
 * Created by ${ibuktshin} on 19/03/2016.
 */
public class Person implements Serializable {
// Varibles
    private int id;
    private int password;
    private long phoneNumber;
    private String userName;
    private String fName;
    private String lName;
    private String address;
//Ctors
    public Person(String address, String fName, int id, String lName, int password, long phoneNumber, String userName) {
        this.address = address;
        this.fName = fName;
        this.id = id;
        this.lName = lName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
    }
    public Person() {
        this.address = "";
        this.fName = "";
        this.id = 0;
        this.lName = "";
        this.password = 0;
        this.phoneNumber = 0;
        this.userName = "";
    }
//Getter & Setters
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
//ToString Methoed
    @Override
    public String toString() {
        return "Entities.Person{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", password=" + password +
                ", phoneNumber=" + phoneNumber +
                ", userName='" + userName + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
//Equals Methoed
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (id != person.id) return false;
        if (password != person.password) return false;
        if (phoneNumber != person.phoneNumber) return false;
        if (userName != null ? !userName.equals(person.userName) : person.userName != null) return false;
        if (fName != null ? !fName.equals(person.fName) : person.fName != null) return false;
        if (lName != null ? !lName.equals(person.lName) : person.lName != null) return false;
        return address != null ? address.equals(person.address) : person.address == null;

    }
}
