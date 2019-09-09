import model.Aviao;
import service.AviaoService;

import java.util.Scanner;

public class ControleAviao {
    public static void main(String[] args) {

        Aviao aviao = new Aviao();

        AviaoService aviaoService = new AviaoService();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu aviao \n" +
                    "1 - Ligar Avião \n" +
                    "2 - Desligar Avião \n" +
                    "3 - Aumentar Velocidade \n" +
                    "4 - Diminuir Velocidade \n" +
                    "5 - Levantar Vôo \n" +
                    "6 - Pousar \n" +
                    "7 - Cadastrar Passageiro \n" +
                    "8 - Total Passageiros");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    aviaoService.ligarAviao(aviao);
                    break;
                case 2:
                    aviaoService.desligarAviao(aviao);
                    break;
                default:
                    System.out.println("Opcao nao existe");
            }

        }
    }
}
