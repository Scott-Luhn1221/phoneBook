package finalphonebook;

public class Person {
	private String phoneNum;
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetNum;
	private String streetName;
	private String fullName;

	public Person(String phoneNum, String firstName, String middleName, String lastName, String streetNum,
			String streetName, String city, String state, String zipCode) {

		this.phoneNum = phoneNum;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;

	}

	public String getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	private String city;
	private String state;
	private String zipCode;

	public Person() {
	}

	public void addAddress(String streetNum, String streetName, String city, String state, String zipCode) {
		Address tempAddress = new Address(streetNum, streetName, city, state, zipCode);
		address = tempAddress;
	}

	private Address address;

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void printPerson() {
		System.out.println("First Name: " + firstName + " Middle Name: " + middleName + " Last Name: " + lastName
				+ " Street: "  + streetName + " City: " + city + " State: " + state + " Zip Code: "
				+ zipCode + " Phone Number: " + phoneNum);
	}

}
