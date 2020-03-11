package pa3;

public class Produce {
	private String name;
	
	public Produce(String name) {
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Produce [name=" + name + "]";
	}
	
	

}
