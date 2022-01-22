package sim.DB;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(quizPK.class)
public class quiz {
    @Id
    @Column(length = 14,columnDefinition ="char")
    private String syllabus_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String quiz_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int question_num;

    @Column(length = 500)
    private String question;

    @Column(columnDefinition = "TINYINT")
    private int category;

    @Column(length = 100)
    private String attachment_name;

    @Column(length = 300)
    private String attachment_path;

    @Column(length = 200)
    private String correct_answer;

    public quiz(){}
}

class quizPK implements Serializable {
    private String syllabus_id;
    private String quiz_id;
    private int question_num;

}