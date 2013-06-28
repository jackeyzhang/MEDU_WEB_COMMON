package bean.edu;
// default package

import java.sql.Timestamp;


/**
 * Payment entity. @author MyEclipse Persistence Tools
 */

public class Payment extends bean.education.MClass implements java.io.Serializable {


    // Fields    

	private static final long serialVersionUID = -4997993422794997708L;
	private Integer payid;
     private Person personByPayer;
     private Person personByPayee;
     private Float payed;
     private Timestamp paydate;
     private String payway;


    // Constructors

    /** default constructor */
    public Payment() {
    }

	/** minimal constructor */
    public Payment(Person personByPayer, Person personByPayee) {
        this.personByPayer = personByPayer;
        this.personByPayee = personByPayee;
    }
    
    /** full constructor */
    public Payment(Person personByPayer, Person personByPayee, Float payed, Timestamp paydate, String payway) {
        this.personByPayer = personByPayer;
        this.personByPayee = personByPayee;
        this.payed = payed;
        this.paydate = paydate;
        this.payway = payway;
    }

   
    // Property accessors

    public Integer getPayid() {
        return this.payid;
    }
    
    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public Person getPersonByPayer() {
        return this.personByPayer;
    }
    
    public void setPersonByPayer(Person personByPayer) {
        this.personByPayer = personByPayer;
    }

    public Person getPersonByPayee() {
        return this.personByPayee;
    }
    
    public void setPersonByPayee(Person personByPayee) {
        this.personByPayee = personByPayee;
    }

    public Float getPayed() {
        return this.payed;
    }
    
    public void setPayed(Float payed) {
        this.payed = payed;
    }

    public Timestamp getPaydate() {
        return this.paydate;
    }
    
    public void setPaydate(Timestamp paydate) {
        this.paydate = paydate;
    }

    public String getPayway() {
        return this.payway;
    }
    
    public void setPayway(String payway) {
        this.payway = payway;
    }
   








}