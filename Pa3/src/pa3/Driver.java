package pa3;

public class Driver {
	public static void main(String[] args) {
		Fruit fruit = new Fruit("mango", 2, 2);
		Vegetable vegatable = new Vegetable("Carrots", 1, 10);
		Fruit fruit1 = new Fruit("Apple", 3, 4);
		Produce produce = new Fruit("orange", 2, 6);
		TruckOfProduce truckProduce = new TruckOfProduce(3);

		truckProduce.addProduce(fruit1);
		truckProduce.addProduce(vegatable);
		truckProduce.addProduce(fruit);
		truckProduce.addProduce(produce);
		truckProduce.computeTotal();
		System.out.println(truckProduce.toString());
		System.out.println(truckProduce.computeTotal());

		System.out.println(truckProduce.search("Apple"));
		System.out.println(truckProduce.remove(fruit1));
		System.out.println(truckProduce.search("Apple"));

	}

}
