package bean.edu;
// default package



/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher extends bean.education.MClass implements java.io.Serializable {


    // Fields    
	private static final long serialVersionUID = 8415121027972556516L;
	private Integer id;
     private String grade;
     private Float basesalary;
     private Float classsalary;
     private Float bonus;
     private Integer person;


    // Constructors

    /** default constructor */
    public Teacher() {
    }

    
    /** full constructor */
    public Teacher(String grade, Float basesalary, Float classsalary, Float bonus, Integer person) {
        this.grade = grade;
        this.basesalary = basesalary;
        this.classsalary = classsalary;
        this.bonus = bonus;
        this.person = person;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrade() {
        return this.grade;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Float getBasesalary() {
        return this.basesalary;
    }
    
    public void setBasesalary(Float basesalary) {
        this.basesalary = basesalary;
    }

    public Float getClasssalary() {
        return this.classsalary;
    }
    
    public void setClasssalary(Float classsalary) {
        this.classsalary = classsalary;
    }

    public Float getBonus() {
        return this.bonus;
    }
    
    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }

    public Integer getPerson() {
        return this.person;
    }
    
    public void setPerson(Integer person) {
        this.person = person;
    }
   








}