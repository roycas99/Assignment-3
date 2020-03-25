package pa3;

public class TruckOfProduce {
	private int count;
	private Produce[] truckload;

	public TruckOfProduce(int size) {

		this.truckload = new Produce[size];
		this.count = 0;

	}

	public void addProduce(Produce produce) {
		if (count >= truckload.length) {
			ensureCapacity();
		}
		truckload[count++] = produce;

	}

	public boolean search(String name) {
		for (int i = 0; i < count; i++) {
			if (this.truckload[i].getName().equals(name))
				return true;
		}
		return false;
	}

	public boolean remove(Produce produce) {
		for (int i = 0; i < count; i++) {
			if (truckload[i].getName().equals(produce.getName())) {
				truckload[i] = null;

				for (int j = i; j < count - 1; j++)
					truckload[j] = truckload[j + 1];
				count--;
				truckload[count] = null;
				return true;
			}
		}
		return false;
	}

	public double computeTotal() {
		double total = 0;
		for (int i = 0; i < count; i++) {
			Produce produce = this.truckload[i];
			if (produce instanceof Fruit) {
				total += ((Fruit) produce).getQuantity() * ((Fruit) produce).getPrice();
			} else if (produce instanceof Vegetable) {
				total += ((Vegetable) produce).getQuantity() * ((Vegetable) produce).getPrice();

			}
		}
		return total;
	}

	public String toString() {
		StringBuilder retString = new StringBuilder();
		for (int i = 0; i < count; i++) {
			retString.append(this.truckload[i].toString() + "\n");
		}
		return retString.toString();
	}

	public void ensureCapacity() {
		Produce[] temp = new Produce[truckload.length * 2];
		for (int i = 0; i < count; i++) {
			temp[i] = this.truckload[i];
		}
		this.truckload = temp;
	}

}
