
package edu.wctc.dj.week8.model;

/**
 *
 * @author Jenna
 */
public class Needle implements Product {
    private String id;
    private NeedleType needleType;
    private Material material;
    private double size;
    
    public Needle(String id, NeedleType needleType, Material material, double size) {
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
    
    public final NeedleType getNeedleType() {
        return needleType;
    }
    
    public final void setNeedleType(NeedleType needleType) {
        this.needleType = needleType;
    }
    
    public final Material getMaterial() {
        return material;
    }

    public final void setMaterial(Material material) {
        this.material = material;
    }

    public final double getSize() {
        return size;
    }

    public final void setSize(double size) {
        this.size = size;
    }
    
    
}
