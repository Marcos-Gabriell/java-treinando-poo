package cursoanlista;

public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public PacoteViagem getPacoteViagem() {
        return pacoteViagem;
    }

    public double converterParaReais(double valorDolar, double cotacaoDolar) {
        return valorDolar * cotacaoDolar;
    }
}
