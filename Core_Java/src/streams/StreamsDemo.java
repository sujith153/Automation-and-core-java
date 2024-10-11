package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie","Apple","Alpha");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);  

	}

}
