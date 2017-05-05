package ssup.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class MUser extends User{

	private final String language;

	public MUser(String username, String password,boolean enabled,boolean accountNotExpired,boolean credentialsNotExpired,boolean accountNotLocked,Collection<GrantedAuthority> authorities,String language)
	{
		super(username, password, enabled, accountNotExpired,
	              credentialsNotExpired, accountNotLocked, authorities);

	    this.language = language;

		
	}
	
	public String getLanguage() {
		return language;
	}
	
		
	
}
