package sim.DB;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@IdClass(gradePK.class)
public class grade {
    @Id
    @GeneratedValue
    @Column(length = 10,columnDefinition ="char")
    private String student_id;

    @Id
    @GeneratedValue
    @Column(columnDefinition="TINYINT")
    private int year;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "TINYINT")
    private int semester;

    @Column(length = 20)
    private String major;

    @Column(columnDefinition = "TINYINT")
    private int rank;

    @Column(columnDefinition = "Decimal(2,1)")
    private BigDecimal grade_avg;

    @Column(columnDefinition = "Decimal(2,1)")
    private BigDecimal major_grade_avg;

    @Column(columnDefinition = "TINYINT")
    private int student_semester;

    public grade(){}
}

class gradePK implements Serializable {
    private String student_id;
    private int year;
    private int semester;

}

