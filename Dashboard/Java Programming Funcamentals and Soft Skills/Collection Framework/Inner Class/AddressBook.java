public class AddressBook {
    private long phoneNumber;
    private Address tempAddress;
    private Address permAddress;

    public static class Address {
        private String name;
        private String street;
        private String city;
        private String state;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(Address tempAddress) {
        this.tempAddress = tempAddress;
    }

    public Address getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(Address permAddress) {
        this.permAddress = permAddress;
    }
}
