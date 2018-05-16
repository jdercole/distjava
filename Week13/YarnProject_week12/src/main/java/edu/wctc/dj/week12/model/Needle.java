
package edu.wctc.dj.week12.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Needle implements Product {
    
    @Id
    @GeneratedValue
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
    
    public Needle() {
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNeedleType() {
        return needleType;
    }
    
    public void setNeedleType(String needleType) {
        this.needleType = needleType;
    }
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    
}
