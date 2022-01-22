package sim.DB;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(lecturePK.class)
public class lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10,columnDefinition ="char")
    private String student_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 14,columnDefinition ="char")
    private String syllabus_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int year;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "TINYINT")
    private int semester;

    @Column(length = 2,nullable = true)
    private String grade;

    public lecture(){}
}

class lecturePK implements Serializable {
    private String student_id;
    private String syllabus_id;
    private int year;
    private int semester;

}

