/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validateurs;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("age-validator")
public class DivisiblePar3Validator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
       int age= (Integer)value;
       if(age%3!=0){
           FacesMessage message= new FacesMessage(FacesMessage.SEVERITY_ERROR, "Age n'est pas valide", "Age doit etre multiple de 3");
           context.addMessage("age", message);
           throw new ValidatorException(message);
       }
    }
    
}
