package atos;

import java.util.List;
import java.util.stream.Collectors;


public class Exercice2 {
	
	 public static String getString(List<Integer> list) {
	        // Convertir la liste en un flux d'entiers
	        return list.stream()
           // Transformer chaque entier en une chaîne de caractères précédée par "e" ou "o"
           .map(n -> (n % 2 == 0 ? "e" : "o") + n)
           // Collecter les chaînes de caractères transformées en une seule chaîne séparée par des virgules
           .collect(Collectors.joining(","));
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
