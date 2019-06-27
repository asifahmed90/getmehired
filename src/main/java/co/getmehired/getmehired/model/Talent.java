package co.getmehired.getmehired.model;

import java.util.Date;

<<<<<<< HEAD
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Talent {
	
	private String name; 
	@NotNull(message = "phone no can't be null")
	private Integer phoneNumber;
	@Size(min=3,max=10,message="email must be netween 3 and 10")
	private String emailAddress;
	private String immigrationExpiaryStr;
	private Date immigrationExpiary;
	private String address;
	private String calendlyUrl;
	private Integer ssnNumber;
	private Integer bankAccount;
	private Integer routingNumber;
	private String degreeSubject;
	private Date graduationDate;
	private String graduationDatestr;
	private Objective objective;
	private Integer salaryStart;
	private String currentJob;
	private String currentEmployer;
	private Date jobStartDate;
	private String jobStartDatestr;
	private Integer jobSalary;
	private String newEmployer;
	private String newPosition;

	private Timezone timezone;
	private DegreeStatus academicDegree;
	private Citizenship citizenship;
	private ImmigrationStatus immigrationStatus;
	private DegreeStatus  accademicDegree;
	private SupportNeeded supportNeeded;
	private employmentStatus employmentStat;
	
	
	public DegreeStatus getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(DegreeStatus academicDegree) {
		this.academicDegree = academicDegree;
	}

	public Citizenship getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(Citizenship citizenship) {
		this.citizenship = citizenship;
	}

	public ImmigrationStatus getImmigrationStatus() {
		return immigrationStatus;
	}

	public void setImmigrationStatus(ImmigrationStatus immigrationStatus) {
		this.immigrationStatus = immigrationStatus;
	}

	public DegreeStatus getAccademicDegree() {
		return accademicDegree;
	}

	public void setAccademicDegree(DegreeStatus accademicDegree) {
		this.accademicDegree = accademicDegree;
	}

	public SupportNeeded getSupportNeeded() {
		return supportNeeded;
	}

	public void setSupportNeeded(SupportNeeded supportNeeded) {
		this.supportNeeded = supportNeeded;
	}

	public employmentStatus getEmploymentStat() {
		return employmentStat;
	}

	public void setEmploymentStat(employmentStatus employmentStat) {
		this.employmentStat = employmentStat;
	}

	public String getDegreeSubject() {
		return degreeSubject;
	}

	public void setDegreeSubject(String degreeSubject) {
		this.degreeSubject = degreeSubject;
	}

	public Date getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}


	
	public Integer getSalaryStart() {
		return salaryStart;
	}

	public void setSalaryStart(Integer salaryStart) {
		this.salaryStart = salaryStart;
	}

	public String getCurrentJob() {
		return currentJob;
	}

	public void setCurrentJob(String currentJob) {
		this.currentJob = currentJob;
	}

	public String getCurrentEmployer() {
		return currentEmployer;
	}

	public void setCurrentEmployer(String currentEmployer) {
		this.currentEmployer = currentEmployer;
	}

	public Date getJobStartDate() {
		return jobStartDate;
	}

	public void setJobStartDate(Date jobStartdate) {
		this.jobStartDate = jobStartdate;
	}

	public String getJobStartDatestr() {
		return jobStartDatestr;
	}

	public void setJobStartdatestr(String jobStartdatestr) {
		this.jobStartDatestr = jobStartdatestr;
	}

	public Integer getJobSalary() {
		return jobSalary;
	}

	public void setJobSalary(Integer jobSalary) {
		this.jobSalary = jobSalary;
	}

	public String getNewEmployer() {
		return newEmployer;
	}

	public void setNewEmployer(String newEmployer) {
		this.newEmployer = newEmployer;
	}

	public String getNewPosition() {
		return newPosition;
	}

	public void setNewPosition(String newPosition) {
		this.newPosition = newPosition;
	}

	public String getAddress() {
	
			return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCalendlyUrl() {
		
			return calendlyUrl;
	}
	

	public void setCalendlyUrl(String calendlyUrl) {
		this.calendlyUrl = calendlyUrl;
	}
	
	
	public Integer getSsnNumber() {

			return ssnNumber;

	}
	
	public void setSsnNumber(Integer ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	
	
	public Integer getBankAccount() {

			return bankAccount;

	}
	
	public void setBankAccount(Integer bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
	public Integer getRoutingNumber() {

			return routingNumber;

	}
	
	public void setRoutingNumber(Integer routingNumber) {
		this.routingNumber = routingNumber;
	}
	
	public String getName() {

			return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPhoneNumber() {

			return phoneNumber;

	}
	
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmailAddress() {

			return emailAddress;

	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public Timezone getTimezone() {
	
		return timezone;
	}
	public void setTimezone(Timezone timezone) {
		this.timezone = timezone;
	}
	
	public Date getImmigrationExpiary() {
		return immigrationExpiary;
	}
	public void setImmigrationExpiary(Date immigrationExpiary) {
		this.immigrationExpiary = immigrationExpiary;
	}
	public String getImmigrationExpiaryStr() {
		return immigrationExpiaryStr;
	}
	public void setImmigrationExpiaryStr(String immigrationExpiaryStr) {
		this.immigrationExpiaryStr = immigrationExpiaryStr;
	}

	public Objective getObjective() {
		return objective;
	}

	public void setObjective(Objective objective) {
		this.objective = objective;
	}

	public String getGraduationDatestr() {
		return graduationDatestr;
	}

	public void setGraduationDatestr(String graduationDatestr) {
		this.graduationDatestr = graduationDatestr;
	}

=======
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "talents")
public class Talent {
	
	@Id
	private String id;
	
	private String name; 
	
	private Integer phoneNumber;
	
	private String emailAddress;
	
	private Timezone timezone;
	
	private String immigrationExpiaryStr;
	
	private Date immigrationExpiary;
	
	private String address;
	
	@NotBlank(message = "SSN Number must not be empty")
	private String ssnNumber;
	
	private Integer bankAccount;
	
	private Integer routingNumber;
	
	private Citizenship citizenship;
	
	private Immigration immigrationStatus;
	
	private Degree accademicDegree;
	
	private String degreeSubject;
	
	private Date graduationDate;
	
	private String graduationDateStr;
	
	private Support suuportNeeded;
	
	private Objective objective;
	
	private EmploymentStatus employmentStart;
	
	private Integer salaryStart;
	
	private String cuurrentJob;
	
	private String currentEmployer;
	
	private Integer jobSalary;
	
	private String newEmployer;
	
	private String newPosition;
	
	private Date jobStartdate;
	
	private String jobStartdateStr;
>>>>>>> 3bcbf0e4a6c0903f0c3c59ee428a650870fcf51c
	
}
