package gastos;
public class Credito extends Conta {
    
    private double limiteCredito;
    private double parcelas;
    private double valorParcela;

    public Credito(String motivo, String tipo, String data, double saque, int casa, int alimentacao, int transporte,
            int lazer, double limiteCredito,double parcelas ) {
        super(motivo, tipo, data, saque, casa, alimentacao, transporte, lazer);
        this.limiteCredito = limiteCredito;
        this.parcelas=parcelas;
        this.valorParcela = valorParcela;
    }

    public double getLimiteCredito() {
        return limiteCredito = 2000;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getParcelas() {
        return parcelas;
    }

    public void setParcelas(double parcelas) {
        this.parcelas = parcelas;
    }

    public double getValorParcela(){
        return valorParcela;
    }

    public void setValorParcela(double valorParcela){
        this.valorParcela = valorParcela;
    }

    @Override
    public void Saque(double valor) {
     if(limiteCredito >= valor ){
        limiteCredito -= valor;
        setSaque(getSaque()+valor);
     }
     else {
        System.out.println("Limite indisponivel :(");
     }
        
    }

    public void Parcela(double valor){
        setValorParcela(getSaque()/parcelas);
        System.out.println("voce parcelou em"+parcelas+"vezes");
    }

    @Override
    public String toString() {
        return "Motivo: " + getMotivo() + "\n" +
                "Tipo: " + getTipo() + "\n" +
                "Data: " + getData() + "\n" +
                "Saque: " + getSaque() + "\n" +
                "Limite de Crédito: " + getLimiteCredito() + "\n" +
                "Parcelas: " + getParcelas();
    }
}
