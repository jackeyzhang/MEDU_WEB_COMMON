package bean.edu;
// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Person entity. @author MyEclipse Persistence Tools
 */

public class Person extends bean.education.MClass implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private Date birthday;
     private String hobby;
     private String nativplace;
     private String sex;
     private String normallycity;
     private String phone;
     private String address;
     private Set<MClass> MClasses = new HashSet<MClass>(0);
     private Set paymentsForPayer = new HashSet(0);
     private Set<Student> students = new HashSet<Student>(0);
     private Set paymentsForPayee = new HashSet(0);


    // Constructors

    /** default constructor */
    public Person() {
    }

	/** minimal constructor */
    public Person(String name) {
        this.name = name;
    }
    
    /** full constructor */
    public Person(String name, Date birthday, String hobby, String nativplace, String sex, String normallycity, String phone, String address, Set MClasses, Set paymentsForPayer, Set students, Set paymentsForPayee) {
        this.name = name;
        this.birthday = birthday;
        this.hobby = hobby;
        this.nativplace = nativplace;
        this.sex = sex;
        this.normallycity = normallycity;
        this.phone = phone;
        this.address = address;
        this.MClasses = MClasses;
        this.paymentsForPayer = paymentsForPayer;
        this.students = students;
        this.paymentsForPayee = paymentsForPayee;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return this.hobby;
    }
    
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getNativplace() {
        return this.nativplace;
    }
    
    public void setNativplace(String nativplace) {
        this.nativplace = nativplace;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNormallycity() {
        return this.normallycity;
    }
    
    public void setNormallycity(String normallycity) {
        this.normallycity = normallycity;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public Set getMClasses() {
        return this.MClasses;
    }
    
    public void setMClasses(Set MClasses) {
        this.MClasses = MClasses;
    }

    public Set getPaymentsForPayer() {
        return this.paymentsForPayer;
    }
    
    public void setPaymentsForPayer(Set paymentsForPayer) {
        this.paymentsForPayer = paymentsForPayer;
    }

    public Set getStudents() {
        return this.students;
    }
    
    public void setStudents(Set students) {
        this.students = students;
    }

    public Set getPaymentsForPayee() {
        return this.paymentsForPayee;
    }
    
    public void setPaymentsForPayee(Set paymentsForPayee) {
        this.paymentsForPayee = paymentsForPayee;
    }
   








}