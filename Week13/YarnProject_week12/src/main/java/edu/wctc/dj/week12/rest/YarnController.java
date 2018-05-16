
package edu.wctc.dj.week12.rest;

import edu.wctc.dj.week12.model.Yarn;
import edu.wctc.dj.week12.services.YarnService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YarnController {
    
    @Autowired
    private YarnService yarnService;
    
    @RequestMapping(method = GET, path = "/yarn")
    public List<Yarn> getYarns() throws Exception {
        List<Yarn> yarnList = yarnService.getAllYarns();
        return yarnList;
    }
    
    @RequestMapping(method = GET, path = "/yarn/{id}")
    public Yarn getYarn(@PathVariable String id) {
        Yarn yarn = yarnService.getYarn(id);
        return yarn;
    }
    
    @RequestMapping(method= POST, path = "/yarn")
    public void createYarn(@RequestBody Yarn yarn) {
        yarnService.createYarn(yarn.getName(), yarn.getSkeinLength(), yarn.getColor(), yarn.getPrice());
    }
    
    @RequestMapping(method = PUT, path = "/yarn")
    public void updateYarn(@RequestBody Yarn yarn) {
        yarnService.updateYarn(yarn);
    }
    
    @RequestMapping(method = DELETE, path = "/yarn/{id}")
    public void deleteYarn(@PathVariable String id) {
        yarnService.deleteYarn(id);
    }
}
