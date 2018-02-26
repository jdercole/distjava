
package edu.wctc.dj.model;

/**
 *
 * @author Jenna
 */
public class Yarn {
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

    public final void setSkeinLength(double skeinLength) {
        this.skeinLength = skeinLength;
    }

    public final Color getColor() {
        return color;
    }

    public final void setColor(Color color) {
        this.color = color;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }
    
    
}
