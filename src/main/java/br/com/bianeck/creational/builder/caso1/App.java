package br.com.bianeck.creational.builder.caso1;

import java.math.BigDecimal;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        // estratégia 1
        Livro livro1 = new Livro();

        livro1.setId(1L);
        livro1.setTitulo("OCA Java SE 8");
        livro1.setSubTitulo("Guia de Estudos para o exame 1Z0-808");
        livro1.setEditora("Bookman");
        livro1.setIsbn("978-85-8260-476-2");
        livro1.setAutores(Arrays.asList("Edward Finegan", "Robert Liguori"));
        livro1.setAnoLancamento(2018);
        livro1.setNumeroDePaginas(524);
        livro1.setResumo("Livro completo de preparação para o exame OCA 1Z0-808");
        livro1.setValor( new BigDecimal(99.99));

//        System.out.println(livro1.toString());

        // estratégia 2
        Livro livro2 = new Livro(
                2L,
                "Microsserviços prontos para a produção",
                "Construindo sistemas padronizados em uma organização de engenharia de software",
                "Novatec",
                Arrays.asList("Susan J. Fowler"),
                "Livro sobre arquitetura de microsserviços",
                "978-85-7522-621-6",
                2017,
                218,
                 new BigDecimal(50)
        );

//        System.out.println(livro2.toString());

        // estratégia 3
        Livro livro3 =
                new Livro.LivroBuilder(3)
                        .comTitulo("Arquitetura Limpa")
                        .comSubTitulo("O Guia do Artesão para estrutura e Design de Software")
                        .comEditora("Alta Books")
                        .comAutores("Robert C. Martin")
                        .comResumo("Um pouco sobre as regras universais da arquitetura de software")
                        .comIsbn("978-85-508-0460-6")
                        .comAnoDeLancamento(2018)
                        .comNumeroDePaginas(432)
                        .comValor(77.75)
                        .build();

//        System.out.println(livro3.toString());

        Livro livro4 =
                new Livro.LivroBuilder(4)
                        .livroPadrao()
                        .comEditora("Alta Books")
                        .comAutores("Thiago Bianeck")
                        .build();

        System.out.println(livro4.toString());
    }
}
