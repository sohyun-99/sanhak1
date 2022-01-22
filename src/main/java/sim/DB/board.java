package sim.DB;

import javax.persistence.*;
import java.sql.Date;

public class board {
    @Id
    @GeneratedValue
    private int board_id;

    @Column(length = 14,columnDefinition ="char")
    @OneToOne
    @JoinColumn
    private syllabus syllabus_id;

    @Column(columnDefinition = "TINYINT")
    private int category;

    @Column(length = 30)
    private String title;

    @Column(length = 500)
    private String content;

    @Column(length = 10)
    private String writer;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column
    private int view;

    @Column(columnDefinition="bit(1)")
    private boolean state;

    @Column(length = 100)
    private String attachment_name;

    @Column(length = 300)
    private String attachment_path;


}
