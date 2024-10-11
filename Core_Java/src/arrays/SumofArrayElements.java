package arrays;

public class SumofArrayElements {

	public static void main(String[] args) {
//		int[] a = {1,2,3,4};
//		double sum = 0;
//		double avg = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum = sum+a[i];
//			avg = (sum/a.length);
//		}
//		System.out.println(sum);
//		System.out.println(avg);

		String[] names = { "jashu", "is", "at" };
		String[] place = { "home", "town" };
		String[] full = new String[names.length + place.length];
		for (int i = 0; i < names.length; i++)
			full[i] = names[i];
		
		for (int i = 0; i < place.length; i++)
			full[names.length + i] = place[i];

		for (int i = 0; i < full.length; i++)
			System.out.print(full[i] + " ");

	}

}
