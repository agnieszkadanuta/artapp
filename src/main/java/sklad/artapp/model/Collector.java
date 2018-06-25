package sklad.artapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@Entity
public class Collector extends ArtAppUser {

    private Role role = Role.COLLECTOR;
}
