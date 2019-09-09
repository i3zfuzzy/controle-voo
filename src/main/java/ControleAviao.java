import model.Aviao;                   //
import model.Pessoa;
import service.AviaoService;
import service.PessoaService;

import java.util.Scanner;               //importa Scanner

public class ControleAviao {
    public static void main(String[] args) {

        Aviao aviao = new Aviao();                           //inicializa o objeto aviao
        PessoaService pessoaService = new PessoaService();    //instancia objeto Pessoa

        AviaoService aviaoService = new AviaoService();       // instancia obejto AviaoService
        while (true) {                                          //laço de repetição
            Scanner scanner = new Scanner(System.in);              //inicialisa a entrada de dados
            System.out.println("Menu aviao \n" +
                    "1 - Ligar Avião \n" +
                    "2 - Desligar Avião \n" +
                    "3 - Aumentar Velocidade \n" +
                    "4 - Diminuir Velocidade \n" +
                    "5 - Levantar Vôo \n" +
                    "6 - Pousar \n" +
                    "7 - Cadastrar Passageiro \n" +
                    "8 - Total Passageiros \n" +
                    "9 - Status do Avião");

            int opcao = scanner.nextInt();                            //variavel para controle de entrada de dados
            switch (opcao) {
                case 1:
                    aviaoService.ligarAviao(aviao);                    //chama o metodo ligar aviao da classe Aviao
                    break;
                case 2:
                    aviaoService.desligarAviao(aviao);                  //chama o metodo desligar aviao da classe Aviao
                    break;
                case 3:
                    System.out.println("Digite a nova velocidade do avião");
                    double novaVelocidade = scanner.nextDouble();               //recebe valor da nova velocidade
                    aviaoService.aumentarVelocidade(aviao, novaVelocidade);     // chama o metodo aumentar velocidade da classe aviao
                    break;
                case 4:
                    System.out.println("Digite quanto deve ser diminuida a velocidade");
                    double velocidadeDiminuida = scanner.nextDouble();                  //recebe valor da nova velocidade
                    aviaoService.diminuirVelocidade(aviao, velocidadeDiminuida);        //chama o metodo deminuir velocidade da classe aviao
                    break;
                case 5:
                    aviaoService.levantarVoo(aviao);                                    //chama o metodo levantar voo da classe aviao
                    break;
                case 6:
                    aviaoService.pousar(aviao);                                         //chama o metodo pousar da classe aviao
                    break;
                case 7:
                    System.out.println("Digite o nome do passageiro");
                    String nome = scanner.next();                                       //recebe o nome
                    System.out.println("Digite o RG do passageiro");
                    String rg = scanner.next();                                          //recebe o scanner
                    Pessoa novapessoa = new Pessoa(nome, rg);                            //instanciando obejto pessoa em um novo objeto
                    pessoaService.cadastro(novapessoa, aviao);                              //chama o metodo cadastro passageiro
                    aviao.getPassageiros().forEach(p -> System.out.println(p.toString()));
                    break;
                case 8:
                    System.out.println("quantidade de passageiros: "+ aviao.getPassageiros().size());           //imprime a quantidade de passageiros cadastrados
                    break;
                case 9:
                    System.out.println(aviao.toString());                                           //mostra valor das Strings Privadas
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        }
    }
}
