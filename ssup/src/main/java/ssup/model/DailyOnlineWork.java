package ssup.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ssupdailyonlinework")
public class DailyOnlineWork {

	private Long sno;
	private String urn;
	private String urnStatus;
	private String p_role;
	private String username;
	private String userId;
	private Date processDate;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="S_No", nullable=false,columnDefinition="bigint")
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	
	@Column(name="URN",nullable=true,columnDefinition="char", length=8)
	public String getUrn() {
		return urn;
	}
	public void setUrn(String urn) {
		this.urn = urn;
	}
	
	@Column(name="URN_Status",nullable=true,columnDefinition="varchar",length=10)
	public String getUrnStatus() {
		return urnStatus;
	}
	public void setUrnStatus(String urnStatus) {
		this.urnStatus = urnStatus;
	}
	
	@Column(name="P_role",nullable=true,columnDefinition="char",length=8)
	public String getP_role() {
		return p_role;
	}
	public void setP_role(String p_role) {
		this.p_role = p_role;
	}
	
	@Column(name="UserName", nullable=true,columnDefinition="varchar",length=30)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name="UserID", nullable=true, columnDefinition="varchar", length=30)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Column(name="ProcessDate", nullable=true, columnDefinition="date")
	@Temporal(TemporalType.DATE)
	public Date getProcessDate() {
		return processDate;
	}
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	
	
	
}
