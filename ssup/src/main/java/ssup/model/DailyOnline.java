package ssup.model;

import javax.validation.constraints.Size;

public class DailyOnline {

	@Size(min=8,max=8)
	public String urn;

	public String getUrn() {
		return urn;
	}

	public void setUrn(String urn) {
		this.urn = urn;
	}
	
	
	
	
}
