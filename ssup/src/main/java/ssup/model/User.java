package ssup.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ssup_karvy_users")
public class User {

	
	private String username;
	private String password;
	private boolean enabled;
	private String language;
	private Set<UserRole> userRoles=new HashSet<UserRole>(0);
	
	public User()
	{
		
		
	}

	public User(String username, String password, boolean enabled, String language) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.language = language;
	}

	public User(String username, String password, boolean enabled, String language, Set<UserRole> set) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.language = language;
		this.userRoles = set;
	}

	@Id
	@Column(name="username", unique=true, nullable=true, length=60)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name="password",nullable=false, length=60)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="enabled",nullable=false)
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name="language",nullable=false)
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
	
	
	
}
