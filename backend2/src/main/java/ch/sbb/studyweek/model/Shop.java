package ch.sbb.studyweek.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @Column
    private String location;

    @Column
    private String didok;

    @Column
    private String geschaeft;

    @Column
    private String kategorie;

    @Column
    private String ebene;

    @Column
    private String bahnhof;

    @Column
    private String offen;

    @Column
    private String url;

    @Column
    private String email;

    @Column
    private String tel;

    @Column
    private String beschreibung;

    @Column
    private String payment_accepted;

    @Column
    private String geo;

}
