package sklad.artapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@Entity
public class Artist extends User {

    private Role role = Role.ARTIST;
    private LocalDate yearOfBirth;
    private String cityOfBirth;
    private String academy;
    private String description;

}
