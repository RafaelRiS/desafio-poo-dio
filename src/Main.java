import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de js");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaDaConsulta = horaAtual.format(formatter);

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rafael:" + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();

        System.out.println("-");

        System.out.println("Conteúdos Concluidos Rafael:" + devRafael.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Rafael:" + devRafael.getConteudosInscritos());
        System.out.println("XP:" + devRafael.calcularTotalXp());

        System.out.println("-------");

        Dev devDenis = new Dev();
        devDenis.setNome("Denis");
        devDenis.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Denis:" + devDenis.getConteudosInscritos());
        devDenis.progredir();
        devDenis.progredir();
        devDenis.progredir();

        System.out.println("-");

        System.out.println("Conteúdos Concluidos Denis:" + devDenis.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Denis:" + devDenis.getConteudosInscritos());
        System.out.println("XP:" + devDenis.calcularTotalXp());
        System.out.println("\nHora da consulta: " + horaDaConsulta);
    }
}
