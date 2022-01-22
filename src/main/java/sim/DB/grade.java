package sim.DB;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity(name="grade")
@IdClass(gradePK.class)
public class grade {
    @Id
    @GeneratedValue
    @Column(length = 10,columnDefinition ="char")
    @OneToOne
    @JoinColumn
    private student student_id;

    @Id
    @GeneratedValue
    @Column(columnDefinition="TINYINT")
    private int grade_year;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "TINYINT")
    private int grade_semester;

    @OneToOne
    @JoinColumn
    @Column(length = 20)
    private student major;

    @Column(columnDefinition = "TINYINT")
    private int rank;

    @Column(columnDefinition = "Decimal(2,1)")
    private BigDecimal grade_avg;

    @Column(columnDefinition = "Decimal(2,1)")
    private BigDecimal major_grade_avg;

    @Column(columnDefinition = "TINYINT")
    private int student_semester;
}

class gradePK implements Serializable {
    private student student_id;
    private int year;
    private int semester;

}

