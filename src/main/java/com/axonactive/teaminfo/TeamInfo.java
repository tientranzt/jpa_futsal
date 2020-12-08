package com.axonactive.teaminfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TeamInfo")
public class TeamInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "team_logo")
    private String logo;

    @Column(name = "team_name")
    private String name;

    @Column(name = "team_gender")
    private String gender;

    @Column(name = "team_phone")
    private String phone;

    @Column(name = "team_email")
    private String email;

}
