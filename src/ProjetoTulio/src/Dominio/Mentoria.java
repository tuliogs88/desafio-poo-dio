package Dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria() {
    }
    
    @Override
    public double conclusaoCursoXP() {
        return XP_Padrao + 20d;
    }

    public double perderCurso(){
        System.out.println("Você não conseguiu terminar no prazo determinado");
        return XP_Padrao - 20d;
    }
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{ " + "Curso: " + getNomeCurso() + ", Descricao: " + getDescricao() + ", Data: " + data + '}';
    }
}
