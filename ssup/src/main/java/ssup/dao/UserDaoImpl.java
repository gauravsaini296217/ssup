package ssup.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssup.model.DailyOnlineWork;
import ssup.model.RequestStatusResult;
import ssup.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	public User findByUsername(String username) {
		
		List<User> users=new ArrayList<User>();
		
		users=sessionFactory.getCurrentSession().createQuery("from User where username=?")
				.setParameter(0, username)
				.list();
		
		if(users.size()>0)
		{
			return users.get(0);
		}
		else{
			return null;
		}
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<RequestStatusResult> findByInward(String input) {
		
		List<RequestStatusResult> resultList=new ArrayList<RequestStatusResult>();
		resultList=sessionFactory.getCurrentSession().createQuery("from RequestStatusResult where inwardno=?")
				.setParameter(0, input)
				.list();
		if(resultList.size()>0)
		{
			return resultList;
		}
		else{
		return null;
		}
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<RequestStatusResult> findByAadhaar(String input) {
	
		List<RequestStatusResult> resultList=new ArrayList<RequestStatusResult>();
		resultList=sessionFactory.getCurrentSession().createQuery("from RequestStatusResult where aadharno=?")
				.setParameter(0, input)
				.list();
		if(resultList.size()>0)
		{
			return resultList;
		}
		else{
		return null;
		}
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<RequestStatusResult> findByUrn(String input) {
		List<RequestStatusResult> resultList=new ArrayList<RequestStatusResult>();
		resultList=sessionFactory.getCurrentSession().createQuery("from RequestStatusResult where URNO=?")
				.setParameter(0, input)
				.list();
		if(resultList.size()>0)
		{
			return resultList;
		}
		else{
		return null;
		}
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<DailyOnlineWork> findByUrnDaily(String input) {
		List<DailyOnlineWork> resultList=new ArrayList<DailyOnlineWork>();
		resultList=sessionFactory.getCurrentSession().createQuery("from DailyOnlineWork where urn=?")
				.setParameter(0, input)
				.list();
		if(resultList.size()>0)
		{
			return resultList;
		}
		else{
		return null;
		}
	}
	

}
