package br.com.bianeck.creational.builder.caso1;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Livro {

    private Long id;
    private String titulo;
    private String subTitulo;
    private String editora;
    private List<String> autores;
    private String resumo;
    private String isbn;
    private Integer anoLancamento;
    private Integer numeroDePaginas;
    private BigDecimal valor;

    public Livro() {
    }

    public Livro(Long id, String titulo, String subTitulo, String editora, List<String> autores, String resumo, String isbn, Integer anoLancamento, Integer numeroDePaginas, BigDecimal valor) {
        this.id = id;
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.editora = editora;
        this.autores = autores;
        this.resumo = resumo;
        this.isbn = isbn;
        this.anoLancamento = anoLancamento;
        this.numeroDePaginas = numeroDePaginas;
        this.valor = valor;
    }

    public Livro(LivroBuilder builder) {
        this.id = builder.id;
        this.titulo = builder.titulo;
        this.subTitulo = builder.subTitulo;
        this.editora = builder.editora;
        this.autores = builder.autores;
        this.resumo = builder.resumo;
        this.isbn = builder.isbn;
        this.anoLancamento = builder.anoLancamento;
        this.numeroDePaginas = builder.numeroDePaginas;
        this.valor = builder.valor;
    }

    public static class LivroBuilder {
        private Long id;
        private String titulo;
        private String subTitulo;
        private String editora;
        private List<String> autores;
        private String resumo;
        private String isbn;
        private Integer anoLancamento;
        private Integer numeroDePaginas;
        private BigDecimal valor;

        public LivroBuilder(Long id) {
            this.id = id;
        }

        public LivroBuilder(Integer id) {
            this.id = id.longValue();
        }

        public LivroBuilder livroPadrao() {
            this.autores = new ArrayList<>();
            this.id = this.id != null ? this.id : 1L;
            this.titulo = this.titulo != null ? this.titulo : "OCA Java SE 8";
            this.subTitulo = "Guia de Estudos para o exame 1Z0-808";
            this.editora = "Bookman";
            this.isbn = "978-85-8260-476-2";
            this.autores.addAll(Arrays.asList("Edward Finegan", "Robert Liguori"));
            this.anoLancamento = 2018;
            this.numeroDePaginas = 524;
            this.resumo = "Livro completo de preparação para o exame OCA 1Z0-808";
            this.valor = new BigDecimal(199.99);
            return this;
        }

        public LivroBuilder comTitulo(String titulo){
            this.titulo = titulo;
            return this;
        }

        public LivroBuilder comSubTitulo(String subTitulo){
            this.subTitulo = subTitulo;
            return this;
        }

        public LivroBuilder comEditora(String editora){
            this.editora = editora;
            return this;
        }

        public LivroBuilder comAutores(String ...autores){
            List<String> listaDeAutores = Arrays.asList(autores);
            if(naoContemAutores()) this.autores = new ArrayList<>();
            this.autores.addAll(listaDeAutores);
            return this;
        }

        public LivroBuilder comResumo(String resumo) {
            this.resumo = resumo;
            return this;
        }

        public LivroBuilder comIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public LivroBuilder comAnoDeLancamento(Integer anoLancamento) {
            this.anoLancamento = anoLancamento;
            return this;
        }

        public LivroBuilder comNumeroDePaginas(Integer numeroDePaginas) {
            this.numeroDePaginas = numeroDePaginas;
            return this;
        }

        public LivroBuilder comValor(BigDecimal valor) {
            this.valor = valor;
            return this;
        }

        public LivroBuilder comValor(String valor) {
            this.valor = new BigDecimal(valor);
            return this;
        }

        public LivroBuilder comValor(Double valor) {
            this.valor = new BigDecimal(valor);
            return this;
        }

        public LivroBuilder comValor(Long valor) {
            this.valor = new BigDecimal(valor);
            return this;
        }

        public LivroBuilder comValor(Integer valor) {
            this.valor = new BigDecimal(valor);
            return this;
        }

        public Livro build() {
            return new Livro(this);
        }

        private boolean naoContemAutores() {
            return this.autores == null || this.autores.isEmpty();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if(this.id != null) sb.append("Código: ").append(this.id);

        if(this.titulo != null) sb.append("\nLivro: ").append(this.titulo);
        if(this.titulo != null && this.subTitulo != null) sb.append(" - ").append(this.subTitulo);

        if(this.editora != null) sb.append("\nEditora: ").append(this.editora);

        if(this.autores != null && !this.autores.isEmpty()) {
            if(this.autores.size() > 1) {
                sb.append("\nAutores: ");
                sb.append(String.join(", ", this.autores));
            } else {
                sb.append("\nAutor: ").append(this.autores.get(0));
            }
        }

        if(this.resumo != null) sb.append("\nResumo: ").append(this.resumo);
        if(this.isbn != null) sb.append("\nIsbn: ").append(this.isbn);
        if(this.anoLancamento != null) sb.append("\nAno de Lançamento: ").append(this.anoLancamento);
        if(this.numeroDePaginas != null) sb.append("\nNúmero de Páginas: ").append(this.numeroDePaginas);
        if(this.valor != null) sb.append("\nPreço: ").append(NumberFormat.getCurrencyInstance().format(this.valor));

        return sb.toString();
    }
}
