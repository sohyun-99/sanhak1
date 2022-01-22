package sim;

import sim.DB.assignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sim.DB.lecture;
import sim.repository.assignmentRepository;
import sim.repository.lectureRepository;


@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private assignmentRepository aR;

    @Autowired
    private lectureRepository lR;

    public static void main(String[] args){
        SpringApplication.run(Main.class,args);
    }

    @Override
    public void run(String... args)throws Exception{
        assignment a1=new assignment();
        aR.save(a1);
    }



}
