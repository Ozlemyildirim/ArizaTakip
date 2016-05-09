package com.project.primefaces;
 
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;

 
@ManagedBean
@ViewScoped
public class UserWizard implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 2498673808170627016L;


     
    private boolean skip;
     
    
   
     
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }
}