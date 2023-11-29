package nl.hva.miw.ads;

public class ExperimentLauncher {

	public static final int AMOUNT_OF_LISTS = 100;

	public static void main(String[] args) {

		System.out.print(System.currentTimeMillis() + ", ");
		ExperimentalNumberList experimentalNumberList2 = new ExperimentalNumberList(16000000);
		System.out.print(System.currentTimeMillis() + ", ");
		experimentalNumberList2.generateNumbers(-100, 100);
		System.out.println(System.currentTimeMillis());


//		System.out.println("Number of positives: "  + experimentalNumberList2.countPositives());
//		System.out.println("Sum of positives: "  + experimentalNumberList2.sumOfPositives());
//		System.out.println("Maxvalue: "  + experimentalNumberList2.maxValue());
//		System.out.println("Number of different values: "  + experimentalNumberList2.numberOfDifferentValues());
//		System.out.println("Is local maximum at 8: "  + experimentalNumberList2.isLocalMaximum(8));
//		System.out.println("Number of local maximum: "  + experimentalNumberList2.numberOfLocalMaximum());
//		System.out.print("Location of local maximum: ");
//		int[] maxLocation = experimentalNumberList2.locationOfLocalMaximum();
//		for (int i = 0; i < maxLocation.length; i++) {
//			System.out.print(maxLocation[i] + ", ");
//		}
	}
}
