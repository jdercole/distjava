
package edu.wctc.dj.week8.model;

/**
 *
 * @author Jenna
 */
public class Yarn implements Product {
    private String id;
    private String name;
    private double skeinLength;
    private Color color;
    private double price;
    
    public Yarn(String id, String name, double skeinLength, Color color, double price) {
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

    public void setSkeinLength(double skeinLength) {
        this.skeinLength = skeinLength;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
