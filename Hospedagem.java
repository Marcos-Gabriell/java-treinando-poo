package cursoanlista;

public class Hospedagem {
    private String descricao;
    private double valorDiaria;
    
    public Hospedagem(String descricao, double valorDiaria) {
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }
    
    public double calcularTotalHospedagem(int quantidadeDias) {
        return valorDiaria * quantidadeDias;
    }
    
    public double getValorDiaria() {
        return valorDiaria;
    }

	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}
}
