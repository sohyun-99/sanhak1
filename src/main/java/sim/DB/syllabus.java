package sim.DB;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class syllabus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 14,columnDefinition ="char")
    private String syllabus_id;

    @Column(length = 20,columnDefinition ="char")
    private String professor_id;

    @Column(length = 20)
    private String name;

    @Column
    private int year;

    @Column(columnDefinition = "TINYINT")
    private int semester;

    @Column(length = 2)
    private String category;

    @Column(columnDefinition = "TINYINT")
    private int credit;

    @Column(length = 3)
    private String day_of_week1;

    @Column(columnDefinition = "TINYINT")
    private int time1;

    @Column(length = 3)
    private String day_of_week2;

    @Column(columnDefinition = "TINYINT")
    private int time2;

    public syllabus(){}
}


