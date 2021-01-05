package by.andersen.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String dateCreation;

    private String dateChange;

    private boolean isDeleted;//?

    private String name;

    private String surname;

    private String login;

    private String email;

    private String parameters;

    @OneToMany()
    private Set<Position> positions;

    @OneToOne
    private Credentials credentials;

    @ManyToOne
    private Office office;

    @OneToMany
    private Set<Request> request;

    @ManyToMany
    private Set<Project> projects;

    @OneToMany
    private Set<Person> chiefs;

}