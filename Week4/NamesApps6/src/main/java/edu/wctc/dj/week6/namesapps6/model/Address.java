
package edu.wctc.dj.week6.namesapps6.model;

/**
 *
 * @author Jenna
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public final String getStreet() {
        return street;
    }

    public final void setStreet(String street) {
        this.street = street;
    }

    public final String getCity() {
        return city;
    }

    public final void setCity(String city) {
        this.city = city;
    }

    public final String getState() {
        return state;
    }

    public final void setState(String state) {
        this.state = state;
    }

    public final String getZip() {
        return zip;
    }

    public final void setZip(String zip) {
        this.zip = zip;
    }
    
    
    
}
