package sim.DB;

import org.apache.ibatis.annotations.One;

import javax.persistence.*;
import java.awt.print.Book;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity(name="assignment")
public class assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int assignment_id;

    @Column(length = 14,columnDefinition ="char")
    @OneToOne
    @JoinColumn
    private syllabus syllabus_id;

    @Column(length = 30)
    private String name;

    @Column(length = 500)
    private String content;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date submit_start;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date submit_end;

    @Column(length = 100)
    private String attachment_name;

    @Column(length = 300)
    private String attachment_path;
}

class assignmentPK implements Serializable {
    private student student_id;
    private syllabus syllabus_id;
}