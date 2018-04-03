package edu.wctc.dj.week9.model;
import edu.week.dj.week9.data.YarnDAO;
import java.util.List;


/**
 *
 * @author Jenna
 */
public class YarnService {
    
//    public Yarn getYarn(String id) {
//        Yarn chosenYarn = null;
//        for (Yarn yarn : yarnList) {
//            if (yarn.getId().equals(id)) {
//                chosenYarn = yarn;
//            }
//        }
//        return chosenYarn;
//    }
    
    public List<Yarn> getAllYarns() throws Exception {
        YarnDAO yarnDao = new YarnDAO();
        List<Yarn> yarnList = yarnDao.getYarn();
        return yarnList;
    }
    
//    public List<Yarn> findYarns(String search) {
//        search = search.toLowerCase();
//        List<Yarn> yarns = new ArrayList<>();
//        for (Yarn y : yarnList) {
//            if (y.getName().toLowerCase().startsWith(search)) {
//                yarns.add(yarn);
//            }
//        }
//        return yarns;
//    }
    
}


