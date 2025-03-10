
public class Main {
	
	/*
	 * Lógica: Vamos usar grafos para adicionar cada cidade a um vértice, e distancia entre os dois vértices. Depois, podemos escolher qual
	 * a menor distancia, simulando um GPS 
	 * Mas nessa aula é pra fazer só a criação dos vértices e das arestas
	 * 
	 * TAREFA: Encontrar o trajeto mais curto para todas cidades saindo de P e voltando pra P e mandar por email e exibir o valor do trajeto
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grafos grafo = new Grafos();
		
		grafo.adicionarCidade('P');
		grafo.adicionarCidade('A');
		grafo.adicionarCidade('B');
		grafo.adicionarCidade('C');
		grafo.adicionarCidade('D');
		
		

	}

}
