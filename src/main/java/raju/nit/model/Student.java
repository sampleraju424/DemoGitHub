package raju.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_tab")
public class Student {
	
	
	@Id
	@GeneratedValue
	private Integer studentId;
	private String studentName;
	private String studentAddress;
	

}
