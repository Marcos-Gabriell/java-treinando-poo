package cursoanlista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Cadastro de Pacote de Viagem -----");

        System.out.print("Informe o tipo de transporte: ");
        String tipoTransporte = scanner.nextLine();
        System.out.print("Informe o valor do transporte em dólar: ");
        double valorTransporte = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);

        System.out.print("Informe a descrição da hospedagem: ");
        String descricaoHospedagem = scanner.nextLine();
        System.out.print("Informe o valor da diária da hospedagem em dólar: ");
        double valorDiaria = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        Hospedagem hospedagem = new Hospedagem(descricaoHospedagem, valorDiaria);

        System.out.print("Informe o destino do pacote de viagem: ");
        String destino = scanner.nextLine();
        System.out.print("Informe a quantidade de dias: ");
        int quantidadeDias = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Informe a margem de lucro (em %): ");
        double margemLucro = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        PacoteViagem pacoteViagem = new PacoteViagem(transporte, hospedagem, destino, quantidadeDias);
        pacoteViagem.setMargemLucro(margemLucro);

        System.out.println("\n----- Informações do Pacote de Viagem -----");
        System.out.println("Transporte: " + transporte.getTipo());
        System.out.println("Valor do Transporte em Dólar: $" + transporte.getValor());
        System.out.println("Hospedagem: " + hospedagem.getDescricao());
        System.out.println("Valor da Diária em Dólar: $" + hospedagem.getValorDiaria());
        System.out.println("Destino: " + destino);
        System.out.println("Quantidade de Dias: " + quantidadeDias);
        System.out.println("Valor Total do Pacote em Dólar: $" + pacoteViagem.calcularValorPacote(1.0));

        System.out.println("\n----- Cadastro de Venda -----");

        scanner.nextLine(); // Limpar o buffer
        System.out.print("Informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Informe a forma de pagamento: ");
        String formaPagamento = scanner.nextLine();
        System.out.print("Informe a cotação do dólar no dia: ");
        double cotacaoDolar = scanner.nextDouble();

        Venda venda = new Venda(nomeCliente, formaPagamento, pacoteViagem);

        System.out.println("\n----- Informações da Venda -----");
        System.out.println("Cliente: " + venda.getNomeCliente());
        System.out.println("Forma de Pagamento: " + venda.getFormaPagamento());
        System.out.println("Pacote de Viagem: " + venda.getPacoteViagem().getDestino());
        System.out.println("Valor Total em Dólar: $" + pacoteViagem.calcularValorPacote(1.0));
        System.out.println("Valor Total em Reais: R$" + venda.converterParaReais(pacoteViagem.calcularValorPacote(1.0), cotacaoDolar));

        scanner.close();
    }
}
