package Dominio;

public abstract class Conteudo {
    protected static final double XP_Padrao = 10d;
    
    private String nomeCurso;
    private String descricao;

    public abstract double conclusaoCursoXP();

    public String getNomeCurso(){
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}
