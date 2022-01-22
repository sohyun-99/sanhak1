package sim.DB;

import javax.persistence.*;
import java.io.Serializable;

public class lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10,columnDefinition ="char")
    @OneToOne
    @JoinColumn
    private student student_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 14,columnDefinition ="char")
    @OneToOne
    @JoinColumn
    private syllabus syllabus_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @OneToOne
    @JoinColumn
    private syllabus year;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 64)
    @OneToOne
    @JoinColumn
    private syllabus password;

    @Column(columnDefinition = "TINYINT")
    private int student_semester;

    @Column(length = 2,nullable = true)
    private String grade;

}

class lecturePK implements Serializable {
    private student student_id;
    private syllabus syllabus_id;
    private syllabus year;
    private syllabus semester;

}

