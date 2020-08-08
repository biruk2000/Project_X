package com.AASTU.Model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class DiseaseRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "date")
    private LocalDate date;
    @Column(name="disease_Name")
    private String diseaseName;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "mLess1", column = @Column(name = "MaleLessThan_1", length = 20)),
            @AttributeOverride( name = "m1to4", column = @Column(name = "Male1_4", length = 20)),
            @AttributeOverride( name = "m5to14", column = @Column(name = "Male5_14", length = 20)),
            @AttributeOverride( name = "m15to29", column = @Column(name = "Male15_29", length = 20)),
            @AttributeOverride( name = "m30to64", column = @Column(name = "Male30_64", length = 20)),
            @AttributeOverride( name = "mGreater65", column = @Column(name = "MaleGreaterThan_65", length = 20)),
            @AttributeOverride( name = "fLess1", column = @Column(name = "FemaleLessThan_1", length = 20)),
            @AttributeOverride( name = "f1to4", column = @Column(name = "Female1_4", length = 20)),
            @AttributeOverride( name = "f5to14", column = @Column(name = "Female5_14", length = 20)),
            @AttributeOverride( name = "f15to29", column = @Column(name = "Female15_29", length = 20)),
            @AttributeOverride( name = "f30to64", column = @Column(name = "Female30_64", length = 20)),
            @AttributeOverride( name = "fGreater65", column = @Column(name = "FemaleGreaterThan_65", length = 20))
    })
    private AgeScale age;

    public DiseaseRecord(){ }

    public DiseaseRecord(LocalDate date, String diseasName, AgeScale age) {
        this.date = date;
        this.diseaseName = diseasName;
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public AgeScale getAge() {
        return age;
    }

    public void setAge(AgeScale age) {
        this.age = age;
    }
}
