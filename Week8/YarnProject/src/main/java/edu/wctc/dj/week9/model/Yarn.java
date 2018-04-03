
package edu.wctc.dj.week9.model;

/**
 *
 * @author Jenna
 */
public class Yarn implements Product {
    private String id;
    private String name;
    private double skeinLength;
    private String color;
    private double price;
    
    public Yarn(String id, String name, double skeinLength, String color, double price) {
        setId(id);
        setName(name);
        setSkeinLength(skeinLength);
        setColor(color);
        setPrice(price);
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }
    
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getSkeinLength() {
        return skeinLength;
    }

    public final void setSkeinLength(double skeinLength) {
        this.skeinLength = skeinLength;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }
    
    
}
