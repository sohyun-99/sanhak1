package sim.DB;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class quiz_submit {
    @Id
    @Column(length = 14,columnDefinition ="char")
    @OneToOne
    @JoinColumn
    private syllabus syllabus_id;

    @Id
    @Column(length = 10,columnDefinition ="char")
    @OneToOne
    @JoinColumn
    private student student_id;

    @Id
    @OneToOne
    @JoinColumn
    private quiz quiz_id;

    @Id
    @OneToOne
    @JoinColumn
    private quiz question_num;

    private String student_answer;

    @Column(columnDefinition="bit(1)")
    private boolean is_correct;

}

class quiz_submitPK implements Serializable {
    private syllabus syllabus_id;
    private student student_id;
    private quiz quiz_id;
    private quiz question_num;

}
