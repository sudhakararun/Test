
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<>();
		for (int i = 1; i < 10; i++)
			ar.add(i);

		Consumer<Integer> cons = (i) -> {
			System.out.println(i);
			System.out.println("test");
		};
		
		//ar.forEach(cons);

	}

}
