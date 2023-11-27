package nl.hva.miw.ads;

public class ExperimentLauncher {

	public static void main(String[] args) {
		// Write your own main method.


        // Example
		ExperimentalNumberList exList = new ExperimentalNumberList(20);
		exList.generateNumbers(-10, 10);
		System.out.println(exList);
		System.out.println(exList.numberOfDifferentValues());
	}
}
