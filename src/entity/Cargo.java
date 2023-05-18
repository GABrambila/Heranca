package entity;


import java.util.List;

public class Cargo {

    private Integer id;
    private String descricao;
    private List<Funcao> funcao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Funcao> getFuncao() {
        return funcao;
    }

    public void setFuncao(List<Funcao> funcao) {
        this.funcao = funcao;
    }
}
