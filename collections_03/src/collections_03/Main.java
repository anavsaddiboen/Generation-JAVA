package collections_03;

import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("JAVA | COLLECTIONS | ATV 03\n");

		System.out.println("Digite 10 valores inteiros:");

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			set.add(leia.nextInt());
		}

		System.out.println("\nListar dados do Set:\n");

		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}