package com.codepuran.maleficent.j8;

public class ImmutableRunner {

    public static void main(String[] args) {

        var address = new Address("Vishal Nagar", "Pune");

        var person = new ImmutablePerson(1L, "Akshay", address);

        System.out.println("Person: " + person.toString());
    }
}

final class ImmutablePerson {
    private final Long id;

    private final String name;

    private final Address address;

    public ImmutablePerson(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = new Address(address.getStreet(), address.getCity());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address implements Cloneable{

    private String street;

    private String city;

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

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}