package sim.DB;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(attendancePK.class)
public class attendance {

    @Id
    @Column(length = 10,columnDefinition ="char")
    private String student_id;

    @Id
    @Column(length = 14,columnDefinition ="char")
    private String syllabus_id;


    @Column
    private int year;

    @Column(columnDefinition = "TINYINT")
    private int semester;

    @Column(columnDefinition="TINYINT")
    private int grade_year;

    @Column(columnDefinition = "TINYINT")
    private int grade_semester;

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

    public attendance(){}
}

class attendancePK implements Serializable {
    private String student_id;
    private String syllabus_id;

}