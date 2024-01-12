package org.archas;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * spring scopes: singleton, prototype, request, session, global-session
 */
@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff , BeanNameAware {

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;

/*    public Doctor(String qualification) {
        this.qualification = qualification;
    }*/
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist() {
        System.out.println("Doctor is assisting ..");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Name method is called");
    }


    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct is called ");
    }
}
