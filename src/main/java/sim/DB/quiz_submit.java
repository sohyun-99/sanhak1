package sim.DB;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(quiz_submitPK.class)
public class quiz_submit {
    @Id
    @Column(length = 14,columnDefinition ="char")
    private String syllabus_id;

    @Id
    @Column(length = 10,columnDefinition ="char")
    private String student_id;

    @Id
    private String quiz_id;

    @Id
    private int question_num;

    private String student_answer;

    @Column(columnDefinition="bit(1)")
    private boolean is_correct;

    public quiz_submit(){}
}

class quiz_submitPK implements Serializable {
    private String syllabus_id;
    private String student_id;
    private String quiz_id;
    private int question_num;

}
