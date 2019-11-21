package model;


import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="range")
@ApplicationScoped
public class ValidItemRange {
    private int low;
    private int high;
    
    @PostConstruct
    public void postConstruct () {
        this.low = 1;
        this.high = 20;
    }

    public int getHigh() {
        return this.high;
    }

    public int getLow() {
        return this.low;
    }
}