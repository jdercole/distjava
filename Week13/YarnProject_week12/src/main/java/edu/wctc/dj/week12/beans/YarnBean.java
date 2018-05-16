package edu.wctc.dj.week12.beans;

import edu.wctc.dj.week12.model.Yarn;
import edu.wctc.dj.week12.services.YarnService;
import java.io.IOException;
import java.util.List;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="yarnBean")
@Scope("session")
public class YarnBean implements Serializable {
    
    @Autowired
    private YarnService yarnService;
    
    private String search;
    private Yarn yarn;
    private List<Yarn> yarnList;
    
    public YarnBean() {
    }
    
    public final YarnService getYarnService() {
        return yarnService;
    }
    
    public void setSearch(String search) {
        this.search = search;
    }

    public final Yarn getYarn() {
        return yarn;
    }

    public final void setYarn(Yarn yarn) {
        this.yarn = yarn;
    }

    public final List<Yarn> getYarnList() {
        return yarnList;
    }

    public final void setYarnList(List<Yarn> yarnList) {
        this.yarnList = yarnList;
    }
    
    public String allYarns() throws Exception {
        yarnList = yarnService.getAllYarns();
        return "yarnList";
    }
    
    public void yarnDetail(AjaxBehaviorEvent event) {
        try {
            FacesContext.getCurrentInstance().getExternalContext()
                    .redirect("yarnDetail.xhtml?id=" + yarn.getId());
        } catch(IOException ex) {
            FacesMessage msg = new FacesMessage("IOException", yarn.getId());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
}
