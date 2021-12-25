package statickeyword;

public class TestSize {

	public static void main(String[] args) {
		GradeSIze garage = new GradeSIze();
		garage.setSize(12);
		System.out.println(garage.getSize());
		
		GradeSIze neighbourGarage = new GradeSIze();
		neighbourGarage.setSize(14);
		System.out.println(neighbourGarage.getSize());
	}

}
