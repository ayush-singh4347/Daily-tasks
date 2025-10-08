package com.test.SpringJDBC;

public class Person {
	private Integer id;
    private String firstName;
    private String lastName;

    // getters & setters
    
    public Integer getid() { return id; }
    public void setid(Integer id) { this.id = id; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Override
    public String toString() {
        return "Person [id="+id+", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
	
}

