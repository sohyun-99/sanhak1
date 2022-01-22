package sim.DB;

import javax.persistence.*;

@Entity
public class professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10,columnDefinition ="char")
    private String student_id;

    @Column(length = 64)
    private String password;

    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String major;
}
