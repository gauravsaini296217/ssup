package ssup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ssup.dao.UserDao;
import ssup.model.RequestStatusResult;

@Service("userService")
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public List<RequestStatusResult> findByInward(String input)
	{
		
		return userDao.findByInward(input);
	}
	
	@Transactional
	public List<RequestStatusResult> findByAadhaar(String input)
	{
		
		return userDao.findByAadhaar(input);
	}
}
