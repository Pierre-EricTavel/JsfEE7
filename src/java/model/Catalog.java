package model;


import java.io.Serializable;
import javax.annotation.PostConstruct;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UICommand;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

@ManagedBean()
@RequestScoped
public class Catalog implements Serializable {

    private Integer item;
    private boolean invalidItem;
    private FacesContext facesContext;
    
    @ManagedProperty(value="#{range}")
    private ValidItemRange range;

    @PostConstruct
    public void postConstruct() {
        facesContext = FacesContext.getCurrentInstance();
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public void checkItem() {
        if (item.intValue() >= range.getLow() && item.intValue() <= range.getHigh()) {
            invalidItem=false;
            return ;//null;
        }
        facesContext.addMessage(null, new FacesMessage("Le numero est invalide."));
        invalidItem=true;
       // return "addcatalog";
    }

   
  
    public ValidItemRange getRange() {
        return range;
    }

    public void setRange(ValidItemRange range) {
        this.range = range;
    }

    public boolean isInvalidItem() {
        return invalidItem;
    }
}