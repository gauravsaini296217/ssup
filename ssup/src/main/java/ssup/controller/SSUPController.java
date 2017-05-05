package ssup.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ssup.model.RequestStatus;
import ssup.model.RequestStatusResult;
import ssup.model.RequestStatus.InputType;
import ssup.service.UserService;

@Controller
public class SSUPController{
	
	@Autowired
	UserService userService;
	
	public SSUPController() {
		System.out.println("Inside Controller");
	}

	@RequestMapping(value={"/","/signin"})
	public ModelAndView helloWorld()
	{
		System.out.println("signin...");
		ModelAndView model=new ModelAndView("signin");
		return model;
	}
	
	@RequestMapping(value={"/user"} , method=RequestMethod.GET)
	public ModelAndView user()
	{
		List<RequestStatusResult> list=new ArrayList<RequestStatusResult>();
		System.out.println("userGet");
		ModelAndView model=new ModelAndView("request-status");
		model.addObject("requestStatus", new RequestStatus());
		model.addObject("result", list);
		return model;
	}
	
	@RequestMapping(value={"/user/request-status"} , method=RequestMethod.POST)
	public ModelAndView userRequestStatus(@Valid @ModelAttribute("requestStatus") RequestStatus requestStatus, BindingResult result)
	{
		
		System.out.println("userPost");
		System.out.println("Input:"+requestStatus.getInput());
		System.out.println("InputType:"+requestStatus.getInputType());
		
		if(result.hasErrors())
		{
		    System.out.println("error");	
			ModelAndView model=new ModelAndView("request-status");
			return model;
			
		}
		else{
			System.out.println("Ok");
			List<RequestStatusResult> list=new ArrayList<RequestStatusResult>();
			if(requestStatus.getInputType().equals(InputType.Inward))
			{
				
				list=userService.findByInward(requestStatus.getInput());
				
			}
			else if(requestStatus.getInputType().equals(InputType.Aadhaar))
			{
				System.out.println("Inside Aadhaar");
				
				list=userService.findByAadhaar(requestStatus.getInput());
				
				System.out.println(list.size());
			}
			
			for(RequestStatusResult r:list)
			{
				
				System.out.println(r.toString());
				Proper(r);
			}
		    ModelAndView model=new ModelAndView("request-status");
		    model.addObject("result", list);
		    return model;
		}
	}
	
	
	public void Proper(RequestStatusResult r)
	{
		
		StringBuffer sb=new StringBuffer(r.getNameofresident().toLowerCase().trim());
		sb.setCharAt(0, String.valueOf(sb.charAt(0)).toUpperCase().toCharArray()[0]);
		for(int i=1;i<sb.length();i++)
		{
			if(sb.charAt(i)==' ')
			{
				sb.setCharAt(i+1, String.valueOf(sb.charAt(i+1)).toUpperCase().toCharArray()[0]);
			}
		}
		
		
		r.setNameofresident(sb.toString());
		
		sb=new StringBuffer(r.getLanguage().toLowerCase().trim());
		sb.setCharAt(0, String.valueOf(sb.charAt(0)).toUpperCase().toCharArray()[0]);
		for(int i=1;i<sb.length();i++)
		{
			if(sb.charAt(i)==' ')
			{
				sb.setCharAt(i+1, String.valueOf(sb.charAt(i+1)).toUpperCase().toCharArray()[0]);
			}
		}
		
		
		r.setLanguage(sb.toString());
		
		sb=new StringBuffer(r.getState().toLowerCase().trim());
		sb.setCharAt(0, String.valueOf(sb.charAt(0)).toUpperCase().toCharArray()[0]);
		for(int i=1;i<sb.length();i++)
		{
			if(sb.charAt(i)==' ')
			{
				sb.setCharAt(i+1, String.valueOf(sb.charAt(i+1)).toUpperCase().toCharArray()[0]);
			}
		}
		
		
		r.setState(sb.toString());
		
		sb=new StringBuffer(r.getSTATUSU().toLowerCase().trim());
		sb.setCharAt(0, String.valueOf(sb.charAt(0)).toUpperCase().toCharArray()[0]);
		for(int i=1;i<sb.length();i++)
		{
			if(sb.charAt(i)==' ')
			{
				sb.setCharAt(i+1, String.valueOf(sb.charAt(i+1)).toUpperCase().toCharArray()[0]);
			}
		}
		
		
		r.setSTATUSU(sb.toString());
	}
	
}
