package functions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex {

	public static void states() {
		LinkedHashMap<String, String> capitais = new LinkedHashMap<>();
		capitais.put("SP", "São Paulo");
		capitais.put("RJ", "Rio de Janeiro");
		capitais.put("MG", "Belo Horizonte");

		System.out.println("\nOrdem de inserção:");

		for (Map.Entry<String, String> entry : capitais.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		System.out.println("\nUsando entrySet()");
		for (Map.Entry<String, String> entry : capitais.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		System.out.println("\nUsando keySet()");
		for (String chave : capitais.keySet()) {
			System.out.println("Chave: " + chave);
		}

		System.out.println("\nUsando values()");
		for (String valor : capitais.values()) {
			System.out.println("Valor: " + valor);
		}
	}

	public static void fruits() {
		LinkedHashMap<Integer, String> mapa = new LinkedHashMap<>();

		mapa.put(3, "Três");
		mapa.put(1, "Um");
		mapa.put(4, "Quatro");
		mapa.put(2, "Dois");

		System.out.println("Ordem de inserção:");
		for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static void update() {
		LinkedHashMap<String, Integer> estoque = new LinkedHashMap<>();

		estoque.put("Maçã", 10);
		estoque.put("Banana", 5);
		estoque.put("Laranja", 7);

		estoque.put("Banana", estoque.get("Banana") + 3);

		System.out.println("Estoque atualizado:");
		estoque.forEach((fruta, qtd) -> System.out.println(fruta + ": " + qtd));
	}

	public static void remove() {
		LinkedHashMap<String, String> usuarios = new LinkedHashMap<>();
		usuarios.put("ana", "Ana Paula");
		usuarios.put("joao", "João Silva");
		usuarios.put("maria", "Maria Souza");

		usuarios.remove("joao");

		for (String user : usuarios.keySet()) {
			System.out.println(user + " => " + usuarios.get(user));
		}
	}

	public static void containsKeyValue() {
		LinkedHashMap<String, String> mapa = new LinkedHashMap<>();
		mapa.put("BR", "Brasil");
		mapa.put("AR", "Argentina");

		System.out.println("Contém chave 'BR'? " + mapa.containsKey("BR"));
		System.out.println("Contém valor 'Chile'? " + mapa.containsValue("Chile"));

	}
}
