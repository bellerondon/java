package gastos;
public abstract class Conta {
    private String motivo;
    private String tipo;
    private String data;
    private double saque;
    private int casa;
    private int alimentacao;
    private int transporte;
    private int lazer;
    
    public Conta(String motivo, String tipo, String data, double saque, int casa, int alimentacao,
            int transporte, int lazer) {
        this.motivo = motivo;
        this.tipo = tipo;
        this.data = data;
        this.saque = saque;
        this.casa = casa;
        this.alimentacao = alimentacao;
        this.transporte = transporte;
        this.lazer = lazer;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public int getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(int alimentacao) {
        this.alimentacao = alimentacao;
    }

    public int getTransporte() {
        return transporte;
    }

    public void setTransporte(int transporte) {
        this.transporte = transporte;
    }

    public int getLazer() {
        return lazer;
    }

    public void setLazer(int lazer) {
        this.lazer = lazer;
    }
    
    public abstract void Saque(double valor);

    public abstract String toString();
}
