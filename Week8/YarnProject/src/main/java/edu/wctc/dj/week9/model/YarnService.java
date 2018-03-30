package edu.wctc.dj.week9.model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Jenna
 */
public class YarnService {
    private Yarn yarn;
    
    private List<Yarn> yarnList = Arrays.asList(
            new Yarn("1", "Cherry Blossom", 425.0, Color.RED, 35.99),
            new Yarn("2", "Mountain Jewel", 825.0, Color.PURPLE, 40.99),
            new Yarn("3", "Terra Cotta", 210.0, Color.ORANGE, 16.99),
            new Yarn("4", "Smokestack", 425.0, Color.GREY, 32.99)
    );
    
    public Yarn getYarn(String id) {
        Yarn chosenYarn = null;
        for (Yarn yarn : yarnList) {
            if (yarn.getId().equals(id)) {
                chosenYarn = yarn;
            }
        }
        return chosenYarn;
    }
    
    public List<Yarn> getAllYarns() {
        return yarnList;
    }
    
    public List<Yarn> findYarns(String search) {
        search = search.toLowerCase();
        List<Yarn> yarns = new ArrayList<>();
        for (Yarn y : yarnList) {
            if (y.getName().toLowerCase().startsWith(search)) {
                yarns.add(yarn);
            }
        }
        return yarns;
    }
    
}


