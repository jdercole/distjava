package edu.wctc.dj.week8.beans;


import edu.wctc.dj.week8.model.Yarn;
import edu.wctc.dj.week8.model.YarnService;
import java.io.IOException;
import javax.inject.Named;
import java.util.List;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;


/**
 *
 * @author Jenna
 */

@Named(value="yarnBean")
@SessionScoped
public class YarnBean implements Serializable {
    
    private final YarnService yarnService = new YarnService();
    
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
    
    public String allYarns() {
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
