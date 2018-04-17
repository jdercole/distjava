package edu.wctc.dj.week10.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart implements Serializable {

    @Id
    private final List<Product> contents = new ArrayList<>();
    
    public List<Product> getContents() {
        return contents;
    }
    
    public int getItemsInCart() {
        return contents.size();
    }
    
    public void add(Product product) {
        contents.add(product);
    }
    
    public void remove(Product product) {
        contents.remove(product);
    }
    
    public void removeAll() {
        contents.clear();
    }
}
