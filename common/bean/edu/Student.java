package bean.edu;
// default package



/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student extends bean.education.MClass implements java.io.Serializable {


    // Fields    
	private static final long serialVersionUID = 2079288112370962395L;
	private Integer idmeduStudent;
     private Person person;
     private MClass MClass;


    // Constructors

    /** default constructor */
    public Student() {
    }

    
    /** full constructor */
    public Student(Person person, MClass MClass) {
        this.person = person;
        this.MClass = MClass;
    }

   
    // Property accessors

    public Integer getIdmeduStudent() {
        return this.idmeduStudent;
    }
    
    public void setIdmeduStudent(Integer idmeduStudent) {
        this.idmeduStudent = idmeduStudent;
    }

    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }

    public MClass getMClass() {
        return this.MClass;
    }
    
    public void setMClass(MClass MClass) {
        this.MClass = MClass;
    }
   








}