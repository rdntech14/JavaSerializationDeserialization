import java.io.Serializable;

public class Emp implements Serializable {

	String name;
	int id;
	
	public Emp(String name, int id) {
		this.name = name;
		this.id = id;
	}

	
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
	
	

}
