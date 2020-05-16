package spring.love2code;


import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import spring.love2code.validation.CourseCode;
import spring.love2code.validation.Link;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;


    @Min(value = 0)
    @Max(value = 10)
    @NotNull(message = "is required")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 digits/characters")
    private String postalCode;

    @CourseCode
    private String courseCode;

    @Link(value = {"https", "linkedin"}, message = "Must be the link to linkedin")
    private String link;

    public Customer() {
        System.out.println(" Const");
    }

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
