import java.util.*;

public class Grafos {
	private Map<Character, List<Arestas>> caminhos;
	
	public Grafos() {
		// TODO Auto-generated constructor stub
		HashMap caminhos = new HashMap<>();
	}
	
	//Primeiro vamos criar a lista de cidades de origem e a lista de cidades de destino, assim como as arestas entre as 2 que vao ser
	//a distancia
	
	public void adicionarCidade (char nomeCidade) {
		caminhos.putIfAbsent(nomeCidade, new ArrayList<>());
	}
	
	public void adicionarTrajetos(char cidadeOrigem, char cidadeDestino) {
		caminhos.putIfAbsent(cidadeOrigem, new ArrayList<>());
		caminhos.putIfAbsent(cidadeDestino, new ArrayList<>());
		caminhos.get(cidadeOrigem).add(new Arestas(cidadeDestino)); //Distância Não pode ser inicializada no construtor
	}
}
