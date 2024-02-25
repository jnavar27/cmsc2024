package JNavarro_Assignment2_Complete;
public class Patient {
    private String firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyContactName, emergencyContactPhone;

    public Patient() 
    {
    	
    }
    public Patient(String firstName, String middleName, String lastName) 
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }
    public String getFirstName() 
    {
        return firstName;
    }

    public String getMiddleName() 
    {
        return middleName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public String getStreetAddress() 
    {
        return streetAddress;
    }

    public String getCity() 
    {
        return city;
    }

    public String getState() 
    {
        return state;
    }

    public String getZipCode() 
    {
        return zipCode;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public String getEmergencyContactName()
    {
        return emergencyContactName;
    }

    public String getEmergencyContactPhone() 
    {
        return emergencyContactPhone;
    }

    // Mutators
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) 
    {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) 
    {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public void setState(String state) 
    {
        this.state = state;
    }

    public void setZipCode(String zipCode) 
    {
        this.zipCode = zipCode;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public void setEmergencyContactName(String emergencyContactName)
    {
        this.emergencyContactName = emergencyContactName;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) 
    {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String buildFullName() 
    {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() 
    {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }
    public String buildEmergencyContact() 
    {
        return emergencyContactName + " " + emergencyContactPhone;
    }
    public String toString() 
    {
        return "Patient Information:\n" +
                "Full Name: " + buildFullName() + "\n" +
                "Address: " + buildAddress() + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Emergency Contact: " + buildEmergencyContact();
    }
}
