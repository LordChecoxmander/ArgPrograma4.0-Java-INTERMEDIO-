import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	Implemente un método que reciba como parámetro una lista de strings y una interfaz
			funcional que transforme cada String de la lista en mayúsculas. El método debe devolver un
			nuevo listado de String transformados.	
		 */
		List <String> lis1 = new ArrayList<String>();
		lis1.add("aaa");
		lis1.add("bbbB");
		lis1.add("ccc");
		lis1.add("ddd");
		
		//implemento la interfaz funcional
		Transformador tr = (li) -> li.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());
		
		//imprimo ambas listas (minusculas y mayusculas)
		System.out.println("Lista de str minusculas: " + lis1);
		System.out.println("LISTA DE STR MAYUSCULAS: "+ tr.transforma(lis1));
	}

}
