package bean.edu;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * MClass entity. @author MyEclipse Persistence Tools
 */

public class MClass extends bean.education.MClass implements java.io.Serializable {


    // Fields    

	private static final long serialVersionUID = 4290715984248995656L;
	private Integer id;
     private Person person;
     private String classtime;
     private String classroom;
     private Set<Student> students = new HashSet<Student>(0);


    // Constructors

    /** default constructor */
    public MClass() {
    }

    
    /** full constructor */
    public MClass(Person person, String classtime, String classroom, Set<Student> students) {
        this.person = person;
        this.classtime = classtime;
        this.classroom = classroom;
        this.students = students;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }

    public String getClasstime() {
        return this.classtime;
    }
    
    public void setClasstime(String classtime) {
        this.classtime = classtime;
    }

    public String getClassroom() {
        return this.classroom;
    }
    
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Set<Student> getStudents() {
        return this.students;
    }
    
    public void setStudents(Set<Student> students) {
        this.students = students;
    }

}