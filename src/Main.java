//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Criar um objeto -> Instanciar um objeto

        Editora rocco = new Editora();
        rocco.nome = "rocco";
        rocco.email = "adm@rocco.com";
        rocco.site = "rocco.com";

        Livro meuLivro = new Livro();
        meuLivro.titulo = "Titulo: Harry Potter";
        System.out.println(meuLivro.titulo);

        meuLivro.autor = "Autora: J. K. Rowling";
        System.out.println(meuLivro.autor);

        meuLivro.valor = 38.87;
        System.out.println("Valor: " + meuLivro.valor);

        meuLivro.editora = rocco;
        System.out.println(meuLivro.editora.nome);

        meuLivro.paginas = 208;
        System.out.println("Páginas: " + meuLivro.paginas);

        meuLivro.resumo = "Resumo: Harry Potter é um garoto cujos pais, feiticeiros, foram assassinados por um poderosíssimo bruxo quando ele ainda era um bebê. " +
                "Ele foi levado, então, para a casa dos tios que nada tinham a ver com o sobrenatural. Pelo contrário. " +
                "Até os 10 anos, Harry foi uma espécie de gata borralheira: maltratado pelos tios, herdava roupas velhas do primo gorducho, " +
                "tinha óculos remendados e era tratado como um estorvo. No dia de seu aniversário de 11 anos, entretanto, ele parece deslizar por um buraco sem fundo, " +
                "como o de Alice no país das maravilhas, que o conduz a um mundo mágico. Descobre sua verdadeira história e seu destino: ser um aprendiz de feiticeiro " +
                "até o dia em que terá que enfrentar a pior força do mal, o homem que assassinou seus pais. O menino de olhos verde, magricela e desengonçado, " +
                "tão habituado à rejeição, descobre, também, que é um herói no universo dos magos. Potter fica sabendo que é a única pessoa a ter sobrevivido a um " +
                "ataque do tal bruxo do mal e essa é a causa da marca em forma de raio que ele carrega na testa. Ele não é um garoto qualquer, ele sequer é um " +
                "feiticeiro qualquer ele é Harry Potter, símbolo de poder, resistência e um líder natural entre os sobrenaturais. A fábula, recheada de fantasmas, " +
                "paredes que falam, caldeirões, sapos, unicórnios, dragões e gigantes, não é, entretanto, apenas um passatempo.";
        System.out.println(meuLivro.resumo);

        meuLivro.tipoCapa = "Tipo de capa: Capa dura";
        System.out.println(meuLivro.tipoCapa);

        /*
        Filme meuFilme = new Filme();

        meuFilme.titulo = "Título: Bastardos Inglórios";
        System.out.println(meuFilme.titulo);

        meuFilme.autor = "Criador: Quentin Tarantino";
        System.out.println(meuFilme.autor);

        meuFilme.anoLancamento = 2009;
        System.out.println("Ano de lançamento: " + meuFilme.anoLancamento);

        meuFilme.sinopse = "Sinopse: Em Bastardos Inglórios, na Segunda Guerra Mundial, a França está ocupada pelos nazistas." +
                " O tenente Aldo Raine (Brad Pitt) é o encarregado de reunir um pelotão de soldados de origem judaica, " +
                "com o objetivo de realizar uma missão suicida contra os alemães. O objetivo é matar o maior número possível de nazistas, " +
                "da forma mais cruel possível. Paralelamente Shosanna Dreyfuss (Mélanie Laurent) assiste a execução de sua família pelas mãos do coronel Hans Landa (Christoph Waltz), " +
                "o que faz com que fuja para Paris. Lá ela se disfarça como operadora e dona de um cinema local, enquanto planeja um meio de se vingar.";
        System.out.println(meuFilme.sinopse);

        meuFilme.orcamento = 70;
        System.out.println(meuFilme.orcamento + " milhões de dólares");

        meuFilme.bilheteria = 321.5;
        System.out.println(meuFilme.bilheteria + " milhões de dólares");
        */


    }
}