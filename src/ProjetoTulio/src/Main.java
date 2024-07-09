import java.time.LocalDate;

import Dominio.Bootcamp;
import Dominio.Curso;
import Dominio.Mentoria;
import Dominio.Clientes;

public class Main {
    public static void main(String[] args) throws Exception {
        // Estanciando uma classe
        Curso curso1 = new Curso();
        
        // Colocando dados na variavel
        curso1.setNomeCurso("Curso 1");
        curso1.setDescricao("Descricao do curso 1");
        curso1.setCargaHoraria(10);
        curso1.setArea("Area do curso 1");
        
        // Estanciando uma classe
        Curso curso2 = new Curso();
        
        // Colocando dados na variavel
        curso2.setNomeCurso("Curso 2");
        curso2.setDescricao("Descricao do curso 2");
        curso2.setCargaHoraria(5);
        curso2.setArea("Area do curso 2");
        
        // Estanciando uma classe
        Mentoria mentoria1 = new Mentoria();
        
        // Colocando dados na variavel
        mentoria1.setNomeCurso("Mentoria 1");
        mentoria1.setDescricao("Descricao mentoria 1");
        mentoria1.setData(LocalDate.now());

        // Estanciando uma classe
        Mentoria mentoria2 = new Mentoria();
        
        // Colocando dados na variavel
        mentoria2.setNomeCurso("Mentoria 2");
        mentoria2.setDescricao("Descricao mentoria 2");
        mentoria2.setData(LocalDate.now());
                
        /* 
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2); */
        
         
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp 1"); 
        bootcamp.setDescricao("Descricao bootcamp 1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);
        
        Clientes dev1 = new Clientes();
        dev1.setNome("Fernando");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + dev1.getNome() + ": "   + dev1.getConteudoInscritos());
        System.out.println("XP Atual: " + dev1.getNome() + ": "   + dev1.conclusaoCursoXP());
        dev1.perderCurso();
        System.out.println(" ");
        System.out.println("Conteudos Inscritos " + dev1.getNome() + ": "   + dev1.getConteudoInscritos());
        System.out.println("Conteudos Perdidos " + dev1.getNome() + ": "   + dev1.getConteudoPerdido());
        System.out.println("Conteudos Concluidos " + dev1.getNome() + ": "   + dev1.getConteudoConcluidos());
        System.out.println("XP " + dev1.getNome() + ": "   + dev1.conclusaoCursoXP());
        
        System.out.println(" ");
        
        Clientes dev2 = new Clientes();
        dev2.setNome("Bianca");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + dev2.getNome() + ": "  + dev2.getConteudoInscritos());
        System.out.println("XP Atual: " + dev2.getNome() + ": "   + dev2.conclusaoCursoXP());
        dev2.progredir();
        System.out.println(" ");
        System.out.println("Conteudos Inscritos " + dev2.getNome() + ": "  + dev2.getConteudoInscritos());
        System.out.println("Conteudos Concluidos " + dev2.getNome() + ": "   + dev2.getConteudoConcluidos());
        System.out.println("XP " + dev2.getNome() + ": "   + dev2.conclusaoCursoXP()); 
    }
}
