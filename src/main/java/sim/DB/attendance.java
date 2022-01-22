package sim.DB;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class attendance {

    @Id
    @Column(length = 10,columnDefinition ="char")
    @OneToOne
    @JoinColumn
    private student student_id;

    @Id
    @Column(length = 14,columnDefinition ="char")
    @OneToOne
    @JoinColumn
    private syllabus syllabus_id;


    @Column
    private int year;

    @Column(columnDefinition = "TINYINT")
    private int semester;

    @Column(columnDefinition="TINYINT")
    @OneToOne
    @JoinColumn
    private grade grade_year;


    @Column(columnDefinition = "TINYINT")
    @OneToOne
    @JoinColumn
    private grade grade_semester;

    @Column(columnDefinition = "TINYINT")
    private int week1;

    @Column(columnDefinition = "TINYINT")
    private int week2;

    @Column(columnDefinition = "TINYINT")
    private int week3;

    @Column(columnDefinition = "TINYINT")
    private int week4;

    @Column(columnDefinition = "TINYINT")
    private int week5;

    @Column(columnDefinition = "TINYINT")
    private int week6;

    @Column(columnDefinition = "TINYINT")
    private int week7;

    @Column(columnDefinition = "TINYINT")
    private int week8;

    @Column(columnDefinition = "TINYINT")
    private int week9;

    @Column(columnDefinition = "TINYINT")
    private int week10;

    @Column(columnDefinition = "TINYINT")
    private int week11;

    @Column(columnDefinition = "TINYINT")
    private int week12;

    @Column(columnDefinition = "TINYINT")
    private int week13;

    @Column(columnDefinition = "TINYINT")
    private int week14;

    @Column(columnDefinition = "TINYINT")
    private int week15;

    @Column(columnDefinition = "TINYINT")
    private int week16;

}

class attendancePK implements Serializable {
    private student student_id;
    private syllabus syllabus_id;

}