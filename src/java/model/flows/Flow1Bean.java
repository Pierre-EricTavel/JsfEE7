/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.flows;

import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;


@Named
@FlowScoped("flow1")
public class Flow1Bean implements Serializable{
      
    private String name;
    
    
    public String getHomeAction(){
        return "/index";
    }

    public String getName() {
        return name==null?"":name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
