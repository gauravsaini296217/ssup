package ssup.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class RequestStatus {

	@NotNull
	private InputType inputType;
	
	@NotEmpty
	private String input;

	public enum InputType{
		
		Inward, Aadhaar, Urn
	}

	public InputType getInputType() {
		return inputType;
	}

	public void setInputType(InputType inputType) {
		this.inputType = inputType;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
	
	
}
