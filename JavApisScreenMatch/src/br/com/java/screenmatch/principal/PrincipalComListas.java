package br.com.java.screenmatch.principal;

import br.com.java.screenmatch.modelos.Filme;
import br.com.java.screenmatch.modelos.Serie;
import br.com.java.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        // Criação de objetos Filme e definição de avaliações
        Filme meuFilme = new Filme("O poderoso chefão", 1970);  // Filme "O Poderoso Chefão"
        meuFilme.avalia(9);  // Avaliação do filme
        Filme outroFilme = new Filme("Avatar", 2023);  // Filme "Avatar"
        outroFilme.avalia(6);  // Avaliação do filme
        var filmeDoPaulo = new Filme("Dogville", 2003);  // Filme "Dogville"
        filmeDoPaulo.avalia(10);  // Avaliação do filme
        Serie lost = new Serie("Lost", 2000);  // Série "Lost"

        // Atribuindo um filme à variável do tipo Filme
        Filme f1 = filmeDoPaulo;

        // Criando uma lista de Titulo (pode armazenar tanto Filme quanto Serie)
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);  // Adicionando filme à lista
        lista.add(meuFilme);  // Adicionando filme à lista
        lista.add(outroFilme);  // Adicionando filme à lista
        lista.add(lost);  // Adicionando série à lista

        // Iterando sobre a lista de títulos e exibindo o nome
        for (Titulo item : lista) {
            System.out.println(item.getNome());  // Imprime o nome do título
            // Verifica se o título é do tipo Filme e se a classificação é maior que 2
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());  // Imprime a classificação do filme
            }
        }

        // Criando uma lista de busca por artista (LinkedList)
        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");  // Adicionando artistas à lista
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);  // Exibindo a lista de artistas

        // Ordenando a lista de artistas alfabeticamente
        Collections.sort(buscaPorArtista);  // Ordenação em ordem alfabética
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);  // Exibindo a lista ordenada

        // Exibindo a lista de títulos antes da ordenação
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);  // Ordenando a lista de títulos de acordo com a ordem natural de Titulo (pelo nome)
        System.out.println(lista);  // Exibindo a lista ordenada

        // Ordenando a lista de títulos por ano de lançamento
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));  // Ordenando pela data de lançamento
        System.out.println("Ordenando por ano");
        System.out.println(lista);  // Exibindo a lista ordenada por ano de lançamento
    }
}
