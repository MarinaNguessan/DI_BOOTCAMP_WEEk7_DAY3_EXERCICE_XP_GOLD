package atos;

import java.util.List;
import java.util.stream.Collectors;

public class Exercice1 {
	
  public List<String> search(List<String> list) {
    // Convertir la liste en un flux de chaînes de caractères
    return list.stream()
            // Filtrer les chaînes de caractères selon leur longueur (3)
            .filter(s -> s.length() == 3)
            // Filtrer les chaînes de caractères selon leur première lettre (a)
            .filter(s -> s.startsWith("a"))
            // Collecter les chaînes filtrées dans une liste
            .collect(Collectors.toList());
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
