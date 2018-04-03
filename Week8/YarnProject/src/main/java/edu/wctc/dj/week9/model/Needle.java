
package edu.wctc.dj.week9.model;

/**
 *
 * @author Jenna
 */
public class Needle implements Product {
    private String id;
    private String needleType;
    private String material;
    private double size;
    
    public Needle(String id, String needleType, String material, double size) {
        setId(id);
        setNeedleType(needleType);
        setMaterial(material);
        setSize(size);
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }
    
    public final String getNeedleType() {
        return needleType;
    }
    
    public final void setNeedleType(String needleType) {
        this.needleType = needleType;
    }
    
    public final String getMaterial() {
        return material;
    }

    public final void setMaterial(String material) {
        this.material = material;
    }

    public final double getSize() {
        return size;
    }

    public final void setSize(double size) {
        this.size = size;
    }
    
    
}
