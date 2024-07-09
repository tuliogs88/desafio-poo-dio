package Dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;
    private String area;

    public Curso(){}

    public double conclusaoCursoXP(){
        return XP_Padrao * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Curso { " + "Curso: " + getNomeCurso() + ", Descricao: " + getDescricao() + ", Carga Horaria: " + cargaHoraria + ", Area: " + area + '}';
    }
}
