import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("mentoria de java");
        mentoria1.setData(LocalDate.now());
        
        Bootcamp bootcamp =new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Carlos:" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Carlos:" + devCarlos.getConteudosInscritos());
        System.out.println("Conteudos concluidos Carlos:" + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());
        
        System.out.println("-------------");

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ana:" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Ana:" + devAna.getConteudosInscritos());
        System.out.println("Conteudos concluidos Ana:" + devAna.getConteudosConcluidos());
        System.out.println("XP: " + devAna.calcularTotalXp());
        
    }
}
