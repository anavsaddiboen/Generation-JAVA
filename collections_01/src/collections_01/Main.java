package collections_01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("JAVA | COLLECTIONS | ATV 01\n");
		
		ArrayList <String> cores = new ArrayList<>();
		
		for (int i = 0; i<5; i++) {
			System.out.print("Digite a "+(i+1)+"ª cor:\n");		
			cores.add(leia.next());	
		}

		System.out.print("Listar todas as cores:\n\n");
		for (int i = 0; i<5; i++) {
			System.out.print(cores.get(i)+"\n");
		}

        Collections.sort(cores);

        System.out.println("\nOrdenar as cores:\n");
        for (String cor : cores) {
            System.out.println(cor);
        }
	}
}