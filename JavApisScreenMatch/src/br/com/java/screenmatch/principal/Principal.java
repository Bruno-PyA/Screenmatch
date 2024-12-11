package br.com.java.screenmatch.principal;

import br.com.java.screenmatch.calculos.CalculadoraDeTempo;
import br.com.java.screenmatch.calculos.FiltroRecomendacao;
import br.com.java.screenmatch.modelos.Episodio;
import br.com.java.screenmatch.modelos.Filme;
import br.com.java.screenmatch.modelos.Serie;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Filme> listaDeFilmes = criarFilmesESeries();

        exibirDetalhesDeFilmes(listaDeFilmes);

        calcularTempoTotal(listaDeFilmes);

        aplicarFiltroDeRecomendacao(listaDeFilmes);

        System.out.println("O programa finalizou corretamente!");
    }

    private static @NotNull List<Filme> criarFilmesESeries() {
        List<Filme> filmes = new ArrayList<>();

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        filmes.add(meuFilme);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);
        filmes.add(outroFilme);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);
        filmes.add(filmeDoPaulo);

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        return filmes;
    }

    private static void exibirDetalhesDeFilmes(@NotNull List<Filme> filmes) {
        System.out.println("Exibindo detalhes dos filmes:");
        for (Filme filme : filmes) {
            filme.exibeFichaTecnica();
            System.out.println("Média de avaliações: " + filme.pegaMedia());
        }
    }

    private static void calcularTempoTotal(@org.jetbrains.annotations.NotNull List<Filme> filmes) {
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        filmes.forEach(calculadora::inclui);

        System.out.println("Tempo total de reprodução: " + calculadora.getTempoTotal() + " minutos");
    }

    private static void aplicarFiltroDeRecomendacao(@NotNull List<Filme> filmes) {
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        System.out.println("Aplicando filtros de recomendação:");
        for (Filme filme : filmes) {
            filtro.filtra(filme);
        }
    }
}
