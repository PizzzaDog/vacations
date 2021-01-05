package by.andersen.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String dateCreation;

    private String dateChange;

    private boolean isDeleted;

    private String name;

    private String parameters;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private Set<Person> people;
}
