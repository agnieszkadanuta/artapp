package sklad.artapp.model;


import sklad.artapp.model.Role;

import javax.persistence.*;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String lastName;
    String email;
    String password;
    @Enumerated(EnumType.STRING)
    Role role;
    List<Photo> photos;

}
