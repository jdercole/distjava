
package edu.wctc.dj.week4.model;

/**
 *
 * @author Jenna
 */
public class Needle {
    private String id;
    private Material material;
    private double size;
    
    public Needle(String id, Material material, double size) {
        setId(id);
        setMaterial(material);
        setSize(size);
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
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
