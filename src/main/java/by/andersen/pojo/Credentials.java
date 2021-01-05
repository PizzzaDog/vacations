package by.andersen.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Credentials {

    @Id
    @Column(name = "id")
    private Long id;

    private String password;
    
    private String login;

    @OneToOne
    @JoinColumn(name = "user_id")
    @MapsId
    private Person person;

}
