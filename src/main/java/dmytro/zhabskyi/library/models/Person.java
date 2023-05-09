package dmytro.zhabskyi.library.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
    @Id
    private int person_id;

    @Column(name = "name")
    @NotEmpty(message = "Name should not be empty!")
    @Size(min=2, max = 30, message = "Name must have more characters!")
    @Pattern(regexp = "[A-Z]\\w+ [A-Z]\\w+ [A-Z]\\w+", message = "Enter your full name!")
    private String name;

    @Column(name = "year_of_birth")
    @Min(value = 1990, message = "Enter your true date of birth")
    private int  yearOfBirth;

    public Person(int person_id, String name, int yearOfBirth) {
        this.person_id = person_id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }


    public Person() {

    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int id) {
        this.person_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
