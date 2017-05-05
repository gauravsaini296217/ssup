package ssup.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="ssup_karvy_user_roles", uniqueConstraints=@UniqueConstraint(columnNames={"urole","username"}))
public class UserRole {
	
	private Integer userRoleId;
	private User user;
	private String urole;
	
	public UserRole()
	{
		
		
	}
	
	public UserRole(User user, String urole)
	{
		
		this.user=user;
		this.urole=urole;
		
	}

	@Id
	@GeneratedValue(strategy=IDENTITY)
	@Column(name="userRoleId", unique=true, nullable=false)
	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="username", nullable=false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name="urole", nullable=false, length=45)
	public String getUrole() {
		return urole;
	}

	public void setUrole(String urole) {
		this.urole = urole;
	}

	
}
