package edu.wctc.dj.week10.services;
import edu.wctc.dj.week10.data.dao.IYarnDAO;
import edu.wctc.dj.week10.model.Yarn;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class YarnService {
    
    @Autowired
    private IYarnDAO yarnDao;
    
    public Yarn getYarn(String id) {
        return yarnDao.findOne(id);
    }
    
    public List<Yarn> getAllYarns() throws Exception {
        return yarnDao.findAll();
    }
    
    public List<Yarn> findYarns(String search) {
        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("name", startsWith().ignoreCase());
        Yarn yarn = new Yarn();
        yarn.setName(search);
        return yarnDao.findAll(Example.of(yarn, matcher));
//        search = search.toLowerCase();
//        List<Yarn> yarns = new ArrayList<>();
//        for (Yarn y : yarnList) {
//            if (y.getName().toLowerCase().startsWith(search)) {
//                yarns.add(yarn);
//            }
//        }
//        return yarns;
    }
    
}


