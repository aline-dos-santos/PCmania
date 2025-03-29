import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Computador promocao1 = new Computador();
        Computador promocao2 = new Computador();
        Computador promocao3 = new Computador();

        promocao1.marca = "Apple";
        promocao2.marca = "Samsung";
        promocao3.marca = "Dell";

        promocao1.preco = 2085;
        promocao2.preco = 2085+1234;
        promocao3.preco = 2085+5678;

        promocao1.hardware[0].nome = "Pentium Core i3";
        promocao1.hardware[0].capacidade = 2200 ;

        promocao1.hardware[1].nome = "Memória RAM";
        promocao1.hardware[1].capacidade = 8 ;//Giga

        promocao1.hardware[2].nome = "HD";
        promocao1.hardware[2].capacidade = 500;

        promocao2.hardware[0].nome = "Pentium Core i5";
        promocao2.hardware[0].capacidade = 3370;

        promocao2.hardware[1].nome = "Memória RAM";
        promocao2.hardware[1].capacidade = 16;

        promocao2.hardware[2].nome = "HD";
        promocao2.hardware[2].capacidade = 1000;

        promocao3.hardware[0].nome = "Pentium Core i7";
        promocao3.hardware[0].capacidade = 4500;

        promocao3.hardware[1].nome = "Memória RAM";
        promocao3.hardware[1].capacidade = 32;

        promocao3.hardware[2].nome = "HD";
        promocao3.hardware[2].capacidade = 2000;

        promocao1.sistema.nome = "Sistema Operacional Linux Ubuntu";
        promocao1.sistema.tipo = 32;

        promocao2.sistema.nome = "Sistema Operacional Windows 8";
        promocao2.sistema.tipo = 64;

        promocao3.sistema.nome = "Sistema Operacional Windows 10";
        promocao3.sistema.tipo = 64;

        MemoriaUSB p1 = new MemoriaUSB();
        MemoriaUSB p2 = new MemoriaUSB();
        MemoriaUSB p3 = new MemoriaUSB();

        promocao1.memoriaUSB = p1;
        p1.nome = "Pen-drive";
        p1.capacidade = 16;

        promocao2.memoriaUSB = p2;
        p2.nome = "Pen-drive";
        p2.capacidade = 32;

        promocao3.memoriaUSB = p3;
        p3.nome = "HD Externo";
        p3.capacidade = 1000;


        promocao1.addMemoriaUSB(p1);
        promocao2.addMemoriaUSB(p2);
        promocao3.addMemoriaUSB(p3);


        System.out.println("\nA loja PC mania está em promoção!! Não perca essas oportunidades: ");
        System.out.println("\nPromoção 1: (Código = 1) "); promocao1.mostraPCConfigs();
        System.out.println("\nPromoção 2: (Código = 2) "); promocao2.mostraPCConfigs();
        System.out.println("\nPromoção 3: (Código = 3) "); promocao3.mostraPCConfigs();

        Scanner entrada = new Scanner(System.in);
        int i = 0;
        int codigo;

        do {
            System.out.println("\nDigite o código da promoção que deseja adquirir (0 para sair): ");
            codigo = entrada.nextInt();

            if (codigo == 0) {
                break;
            }

            if (i >= cliente.computador.length) {
                System.out.println("Número máximo de computadores atingido!");
                break;
            }

            if (codigo == 1) {
                cliente.computador[i] = promocao1;
            } else if (codigo == 2) {
                cliente.computador[i] = promocao2;
            } else if (codigo == 3) {
                cliente.computador[i] = promocao3;
            }else {
                System.out.println("Código inválido! Tente novamente.");
                continue;
            }

            i++;
        } while (codigo != 0);

        entrada.close();


        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());
    }
}