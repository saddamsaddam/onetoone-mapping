package com.nvn;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
@Entity 
public class Registration {
	
	@Id
   // @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private String idnumber; 
    private String name; 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="joinemail")
    private JoinClass JoinClass;
    private String email; 
    private String password; 
    private String apppassword; 
    @Column(columnDefinition = "BLOB")
    private byte[] image;
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public JoinClass getJoinClass() {
		return JoinClass;
	}
	public void setJoinClass(JoinClass joinClass) {
		JoinClass = joinClass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getApppassword() {
		return apppassword;
	}
	public void setApppassword(String apppassword) {
		this.apppassword = apppassword;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Registration [idnumber=" + idnumber + ", name=" + name + ", JoinClass=" + JoinClass + ", email=" + email
				+ ", password=" + password + ", apppassword=" + apppassword + ", image=" + Arrays.toString(image) + "]";
	}
	
}

package com.nvn;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity 
public class JoinClass {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private int id; 
    private String useremail; 
    @OneToOne(mappedBy="JoinClass")
    private Registration registration; 
    private String classcode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	public String getClasscode() {
		return classcode;
	}
	public void setClasscode(String classcode) {
		this.classcode = classcode;
	}
	@Override
	public String toString() {
		return "JoinClass [id=" + id + ", useremail=" + useremail + ", registration=" + registration + ", classcode="
				+ classcode + "]";
	}
	
   
	
}
