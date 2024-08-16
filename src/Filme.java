public class Filme {
    public String titulo;
    public String criador;
    public int anoLancamento;
    public String sinopse;
    public double orcamento;
    public double bilheteria;

    public void exibirDadosFilme() {
        System.out.println("================");
        System.out.println("Titulo: " + titulo);
        System.out.println("Criador " + criador);
        System.out.println("Lançamento: " + anoLancamento);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Orçamento: " + orcamento);
        System.out.println("Bilheteria: " + bilheteria);
    }
}
