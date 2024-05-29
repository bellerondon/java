package gastos;
public class Debito extends Conta {
    
    private double deposito;
    private double rendimento;
    private double valorRendimento;

    public Debito(String motivo, String tipo, String data, double saque, int casa, int alimentacao, int transporte,
            int lazer,double deposito,double rendimento) {
        super(motivo, tipo, data, saque, casa, alimentacao, transporte, lazer);
        this.deposito=deposito;
        this.rendimento=rendimento;
        this.valorRendimento = valorRendimento;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    } 
    public double getValorRendimento() {
        return valorRendimento;
    }

    public void setValorRendimento(double valorRendimento) {
        this.rendimento = rendimento;
    } 

    @Override
    
    public void Saque(double valor) {
     if(deposito >= valor ){
        deposito -= valor;
        setSaque(getSaque()+valor);
     }
     else {
        System.out.println("Limite indisponivel :(");
     }
        
    }

    public String toString() {
        return "Motivo: " + getMotivo() + "\n" +
                "Tipo: " + getTipo() + "\n" +
                "Data: " + getData() + "\n" +
                "Saque: " + getSaque() + "\n";
    }

    public void Rendimento(double deposito){
        setValorRendimento(deposito * 0.2);
    }

    public void novoSaldo(double deposito){
        setDeposito(getDeposito() + getDeposito());
    }
}
