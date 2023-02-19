package sn.esmt.admin.entities;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "approles")
public class AppRoleEntity {
    @Id //JPA est clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id devient autoIncrement et dans l'ordre
    private int id;
    @Column(length = 150, nullable = false, unique = true)
    private String name;





}