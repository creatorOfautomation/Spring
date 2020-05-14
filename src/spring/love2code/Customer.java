package spring.love2code;


import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class    Customer {

    private String firstName;
    @NotNull
    @Min(222)
    @Size(min = 1, message = "is required")
    private String lastName;

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
}
