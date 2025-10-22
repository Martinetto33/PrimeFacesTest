package org.example.primefacestest;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("helloPFBean")
@SessionScoped
public class HelloPFBean implements Serializable {
    private String firstName = "Prime";
    private String lastName = "Faces";
    private String componentSuite;
    private List<Technology> technologies = List.of(
            new Technology("Java", "10"),
            new Technology("Spring", "5.0")
    );

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getComponentSuite() {
        return componentSuite;
    }

    public void setComponentSuite(String componentSuite) {
        this.componentSuite = componentSuite;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }
}
