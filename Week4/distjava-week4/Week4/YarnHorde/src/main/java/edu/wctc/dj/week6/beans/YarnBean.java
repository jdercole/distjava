package edu.wctc.dj.week6.beans;


import edu.wctc.dj.week4.model.Yarn;
import edu.wctc.dj.week4.model.YarnService;
import java.io.IOException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

/**
 *
 * @author Jenna
 */

@Named(value="yarnBean")
@SessionScoped
public class YarnBean {
 private final YarnService yarnService = new YarnService();
    private Yarn yarn;
    private List<Yarn> yarnList;
    
    public YarnBean() {
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
