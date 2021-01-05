package by.andersen.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String dateCreation;

    private String dateChange;

    private boolean isDeleted;

    private String commentary;

    private String parameters;

    @OneToOne
    private RequestType requestType;

    @OneToMany
    private Set<Document> documents;

    @ManyToOne
    private Person person;
}
