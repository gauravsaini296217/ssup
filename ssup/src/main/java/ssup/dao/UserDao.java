package ssup.dao;

import java.util.List;

import ssup.model.RequestStatusResult;
import ssup.model.User;

public interface UserDao {

	User findByUsername(String username);
	List<RequestStatusResult> findByInward(String input);
	List<RequestStatusResult> findByAadhaar(String input);
	List<RequestStatusResult> findByUrn(String input);
	
}
