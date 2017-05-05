package ssup.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ssupuiddms")
public class RequestStatusResult {

	
	private String inwardno;
	private String nameofresident;
	private String language;
	private String aadharno;
	private String mobileno;
	private String state;
	private Date entrydate;
	private String URNO;
	private String STATUSU;
	private Date URNSTATUSDATE;
	
	@Id
	@Column(name="inwardno", nullable=false, columnDefinition="nvarchar", length=20)
	public String getInwardno() {
		return inwardno;
	}
	public void setInwardno(String inwardno) {
		this.inwardno = inwardno;
	}
	
	@Column(name="nameofresident", nullable=true, columnDefinition="nvarchar", length=100)
	public String getNameofresident() {
		return nameofresident;
	}
	public void setNameofresident(String nameofresident) {
		this.nameofresident = nameofresident;
	}
	
	@Column(name="language", nullable=true, columnDefinition="nvarchar", length=30)
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Column(name="aadharno", nullable=true, columnDefinition="nvarchar", length=20)
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	
	@Column(name="mobileno", nullable=true, columnDefinition="nvarchar", length=20)
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	@Column(name="state", nullable=true, columnDefinition="nvarchar", length=50)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Column(name="entrydate", nullable=true)
	public Date getEntrydate() {
		return entrydate;
	}
	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}
	
	@Column(name="URNO", nullable=true, columnDefinition="nvarchar", length=20)
	public String getURNO() {
		return URNO;
	}
	public void setURNO(String uRNO) {
		URNO = uRNO;
	}
	
	@Column(name="STATUSU", nullable=true, columnDefinition="nvarchar", length=20)
	public String getSTATUSU() {
		return STATUSU;
	}
	public void setSTATUSU(String sTATUSU) {
		STATUSU = sTATUSU;
	}
	
	@Column(name="URNSTATUSDATE", nullable=true)
	public Date getURNSTATUSDATE() {
		return URNSTATUSDATE;
	}
	public void setURNSTATUSDATE(Date uRNSTATUSDATE) {
		URNSTATUSDATE = uRNSTATUSDATE;
	}
	@Override
	public String toString() {
		return "RequestStatusResult [inwardno=" + inwardno + ", nameofresident=" + nameofresident + ", language="
				+ language + ", aadharno=" + aadharno + ", mobileno=" + mobileno + ", state=" + state + ", entrydate="
				+ entrydate + ", URNO=" + URNO + ", STATUSU=" + STATUSU + ", URNSTATUSDATE=" + URNSTATUSDATE + "]";
	}
	
	
	
	
}
