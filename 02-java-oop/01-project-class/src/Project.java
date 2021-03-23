
public class Project {
	private String name;
	private String description;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesc() {
		return description;
	}
	
	public void setDesc(String description) {
		this.description = description;	
	}
	
	public Project() {
	}
	
	public Project(String name) {
		this.name = name;
	}
	
	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String elevatorPitch() {
		return this.name + ": " + this.description;
	}
}
