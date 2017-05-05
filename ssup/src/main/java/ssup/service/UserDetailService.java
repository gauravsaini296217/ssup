package ssup.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ssup.dao.UserDao;
import ssup.model.MUser;
import ssup.model.UserRole;

@Service("userDetailService")
public class UserDetailService  implements UserDetailsService{

	
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		ssup.model.User user=userDao.findByUsername(username);
		List<GrantedAuthority> authorities=buildUserAuthority(user.getUserRoles());
		
		return buildUserForAuthentication(user, authorities);
	}
	
	
	public User buildUserForAuthentication(ssup.model.User user,List<GrantedAuthority> authorities)
	{
		
		return new MUser(user.getUsername(), user.getPassword(), user.isEnabled(), true, true, true, authorities, user.getLanguage());
	}

	private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {

		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

		// Build user's authorities
		for (UserRole userRole : userRoles) {
			setAuths.add(new SimpleGrantedAuthority(userRole.getUrole()));
		}

		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

		return Result;
	}
	


	}
