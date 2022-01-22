package sim.DB;

import javax.persistence.*;
import java.util.Date;

@Entity
public class board {

    @Id
    @GeneratedValue
    private int board_id;

    @Column(length = 14,columnDefinition ="char")
    private String syllabus_id;

    @Column(columnDefinition = "TINYINT")
    private int category;

    @Column(length = 30)
    private String title;

    @Column(length = 500)
    private String content;

    @Column(length = 10)
    private String writer;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private int view;

    @Column(columnDefinition="bit(1)")
    private boolean state;

    @Column(length = 100)
    private String attachment_name;

    @Column(length = 300)
    private String attachment_path;

    public board(){}
}
