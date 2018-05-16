
package edu.wctc.dj.week12.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Yarn implements Product {
    
    @Id
    @GeneratedValue
    @Column(name="yarnId")
    private String id;
    
    private String name;
    private double skeinLength;
    private String color;
    private double price;
    
    public Yarn(String name, double skeinLength, String color, double price) {
        setName(name);
        setSkeinLength(skeinLength);
        setColor(color);
        setPrice(price);
    }
    
    public Yarn() {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSkeinLength() {
        return skeinLength;
    }

    public void setSkeinLength(double skeinLength) {
        this.skeinLength = skeinLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
