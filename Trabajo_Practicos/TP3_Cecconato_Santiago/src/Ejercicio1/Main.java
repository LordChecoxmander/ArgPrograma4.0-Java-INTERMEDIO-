package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		/*
		 EJERCICIO 1
			Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
			lista con los strings en mayúscula.
		 */
		
		
		List<String> lisOrigin = new ArrayList<String>();
		lisOrigin.add("aaa");
		lisOrigin.add("bbb");
		lisOrigin.add("ccc");
		lisOrigin.add("ddd");
		
		Mayuscula may = (lisOrig) -> lisOrig.stream().
				map(l -> l.toUpperCase()).
				collect(Collectors.toList());
		
		System.out.println("lista en mayusculas: " + may.change(lisOrigin));
		
		/*
		 EJERCICIO 2
			Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
			método debe devolver un String que concatene separando por coma y espacio todas las
			palabras, en la lista, que tengan más de "n" caracteres.
		 */
		
		
		
		List<String> lisOriginNumer = new ArrayList<String>();
		lisOriginNumer.add("aaaa");
		lisOriginNumer.add("bbbb");
		lisOriginNumer.add("ccc");
		lisOriginNumer.add("dddd");
		
		MayusculaNumero mayNum = (lisOri, num) -> lisOri.stream().
				filter(l -> l.length() > num).
				collect(Collectors.joining(", "));
		
		System.out.println("lista ejercicio2: " + mayNum.changeN(lisOriginNumer, 3));
	}

}
