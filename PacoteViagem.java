package cursoanlista;

public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;
    private double margemLucro;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias, double margemLucro) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
        this.margemLucro = margemLucro;
    }

    public PacoteViagem() {
		// TODO Auto-generated constructor stub
	}

	public String getDestino() {
        return destino;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    // Métodos getters e setters...

    public double calcularValorPacote(double taxaDolar) {
        double valorTransporte = transporte.getValor();
        double valorHospedagem = hospedagem.calcularTotalHospedagem(quantidadeDias);
        double valorLucro = (valorTransporte + valorHospedagem) * (margemLucro / 100.0);

        double valorTotal = valorTransporte + valorHospedagem + valorLucro;
        return valorTotal * taxaDolar;
    }

	public String getQuantidadeDias() {
		// TODO Auto-generated method stub
		return null;
	}

	public Hospedagem getHospedagem() {
		// TODO Auto-generated method stub
		return null;
	}

	public Transporte getTransporte() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setQuantidadeDias(int quantidadeDias2) {
		// TODO Auto-generated method stub
		
	}

	public void setHospedagem(Hospedagem hospedagem2) {
		// TODO Auto-generated method stub
		
	}

	public void setTransporte(Transporte transporte2) {
		// TODO Auto-generated method stub
		
	}

	public void setDestino(String destino2) {
		// TODO Auto-generated method stub
		
	}
}
