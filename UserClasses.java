public class UserClasses {
    public static void main(String[] args) {
        Pessoas p;
        p = new Pessoas();
        Pessoas p1 = new Pessoas ();
        
        Animal a;
        a = new Animal();
        Animal a1 = new Animal ();

        Objeto o;
        o = new Objeto();
        Objeto o1 = new Objeto ();

        p.nome = "Leandro";
        p.idade = 41;
        p.renda = 2000;
        p.ocupação = "empreendedor";
        p.cpf = 446830005;
        p.telefone = 988188520;
        p.nomeDaEsposa = "Dayane Saldanha";
        p.nomeDaFilha = "Bruna Saldanha";
        p.raça = "pardo";
        
        a.nome = "Mel";
        a.idade = 10;
        a.pelagem = "Laranja";
        a.raça = "Raça indefinida";
        a.tipoDePelagem = "Enrolado";
        a.tamanhoDoBigode = "Grande";
        a.sachêFavorito = "Kitkat";
        a.passaTempo = "Tomar banho de sol";
        a.personalidade = "Carinhoso e dorminhoco";

        o.nome = "Monitor";
        o.função = "fornecer retorno instantâneo, ao exibirem as informações em formato de textos ou gráficos";
        o.anoQueFoiCriado = 1952;
        o.quantosModelosExistem = 2;
        o.comoÉFeito = "Display LCD";
        o.oCriadorFoi = "George Heilmeier";
        o.paraFuncionarPrecisaDe = "Uma placa de vídeo";
        o.importanteNoMonitor = "Tamanho da tela, frequência de atualização, resolução e até recursos extras como TV";


        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Renda: " + p.renda);
        System.out.println("Ocupação: " + p.ocupação);
        System.out.println("Cpf: " + p.cpf);
        System.out.println("Telefone: " + p.telefone);
        System.out.println("nome Da Esposa: " + p.nomeDaEsposa);
        System.out.println("Nome Da Filha: " + p.nomeDaFilha);
        System.out.println("Raça: " + p.raça);

        System.out.println("Nome: " + a.nome);
        System.out.println("Idade: " + a.idade);
        System.out.println("Pelagem: " + a.pelagem);
        System.out.println("Raça: " + a.raça);
        System.out.println("Tipo De Pelagem: " + a.tipoDePelagem);
        System.out.println("Tamanho Do Bigode: " + a.tamanhoDoBigode);
        System.out.println("Sachê Favorito: " + a.sachêFavorito);
        System.out.println("Passa Tempo: " + a.passaTempo);
        System.out.println("Personalidade: " + a.personalidade);

        System.out.println("Nome: " + o.nome);
        System.out.println("Função: " + o.função);
        System.out.println("Ano Que Foi Criado: " + o.anoQueFoiCriado);
        System.out.println("Quantos Modelos Existem: " + o.quantosModelosExistem);
        System.out.println("Como é feito: " + o.comoÉFeito);
        System.out.println("O criador foi:");
        System.out.println("Para funcionar precisa de: " + o.paraFuncionarPrecisaDe);
        System.out.println("O que é importante em um monitor: " + o.importanteNoMonitor);
    }
}
