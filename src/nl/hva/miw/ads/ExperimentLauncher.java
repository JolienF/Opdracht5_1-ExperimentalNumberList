package nl.hva.miw.ads;

public class ExperimentLauncher {

	public static void main(String[] args) {
		// Write your own main method.


        // Example
		ExperimentalNumberList exList = new ExperimentalNumberList(20);
//		exList.generateNumbers(-10, 10);
//		System.out.println(exList);
//		System.out.println(exList.numberOfDifferentValues());

//		ExperimentalNumberList exList2 = new ExperimentalNumberList(50);
//		exList2.generateNumbers(1, 365);
//		System.out.println(exList2.equalValuesExist());

		for (int lijst = 0; lijst < 100; lijst++) {
			ExperimentalNumberList experimentalNumberList = new ExperimentalNumberList(30);
			experimentalNumberList.generateNumbers(1, 365);
			System.out.println(experimentalNumberList.equalValuesExist());
		}
	}
}
