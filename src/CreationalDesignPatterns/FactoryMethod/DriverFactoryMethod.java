package CreationalDesignPatterns.FactoryMethod;

public class DriverFactoryMethod {
	
	public static void main(String[] args) {
		System.out.println("DriverFactoryMethod\n");

		// simply instantiating the logistics already defines the transportation
		Logistics logRoad = new RoadLogistics();
		Logistics logSea = new SeaLogistics();
		
		System.out.println(logRoad.planDelivery());
		System.out.println(logSea.planDelivery());
	}
	
}
