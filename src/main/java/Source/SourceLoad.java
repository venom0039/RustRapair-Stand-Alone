package Source;

public class SourceLoad {
    String vin;
    String chassisNo;
    String fuel;
    String type;
    String brand;
    String model;
    String color;
    int year;
    String ownerName;
    String nic;
    String address;
    String email;
    String contact;
    String date;
    String mode = "Null";
    String complete = "Null";
    
   
    public SourceLoad(String vin, String chassisNo, String fuel, String type, String brand, String model, String color, int year, String ownerName, String nic, String address, String email, String contact, String date, String mode, String complete) {
        this.vin = vin;
        this.chassisNo = chassisNo;
        this.fuel = fuel;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.nic = nic;
        this.address = address;
        this.email = email;
        this.contact = contact;
        this.date = date;
        this.mode = mode;
        this.complete = complete;
        
    }


    
    
    
    public String getVin() {
        return vin;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public String getFuel() {
        return fuel;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getNic() {
        return nic;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public String getDate() {
        return date;
    }
    
        public String getMode() {
        return mode;
    }

    public String getComplete() {
        return complete;
    }
    
}
