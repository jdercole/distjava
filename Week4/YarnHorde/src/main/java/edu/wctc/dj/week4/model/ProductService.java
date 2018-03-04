package edu.wctc.dj.week4.model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Jenna
 */
public class ProductService {
    private Yarn yarn;
    
    private List<Yarn> yarnList = Arrays.asList(
            new Yarn("1", "Cherry Blossom", 425.0, Color.RED, 35.99),
            new Yarn("2", "Mountain Jewel", 825.0, Color.PURPLE, 40.99),
            new Yarn("3", "Terra Cotta", 210.0, Color.ORANGE, 16.99)
    );
    
    public Yarn getYarn(String id) {
        
        Yarn yarn = null;
        for (Yarn y : yarnList) {
            if (y.getId().equals(id)) {
                yarn = y;
            }
        }
        return yarn;
    }
    
    public List<Yarn> getAllYarns() {
        return yarnList;
    }
    
    public List<Yarn> findYarns(String search) {
        search = search.toLowerCase();
        List<Yarn> theList = new ArrayList<Yarn>();
        for (Yarn y : yarnList) {
            if (y.getName().toLowerCase().startsWith(search)) {
                theList.add(yarn);
            }
        }
        return theList;
    }
}
