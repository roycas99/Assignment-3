package pa3;

public class Produce {
	private String name;
	private static int size;

	public Produce(String name) {

		this.name = name;
		size++;

	}
	// public Produce() {
	//
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Produce [name=" + name + "]";
	}

}
