package listas;
public abstract class Organiza {
    
    private String Descricao;
    private Boolean status;
    private String categoria;
    private int id;
    
    public Organiza(String descricao, Boolean status, String categoria, int id) {
        Descricao = descricao;
        this.status = status;
        this.categoria = categoria;
        this.id = id;
    }

    public Organiza(String descricao, Boolean status, String categoria) {
        Descricao = descricao;
        this.status = status;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
