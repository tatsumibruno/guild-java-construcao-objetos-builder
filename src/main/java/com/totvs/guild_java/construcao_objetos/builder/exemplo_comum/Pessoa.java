package com.totvs.guild_java.construcao_objetos.builder.exemplo_comum;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String documento;
    private String nomeDaMae;
    private String nomeDoPai;

    private Pessoa() {
    }

    public static PessoaBuilder builder() {
        return new PessoaBuilder();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public static final class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private LocalDate dataNascimento;
        private String documento;
        private String nomeDaMae;
        private String nomeDoPai;

        private PessoaBuilder() {
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public PessoaBuilder documento(String documento) {
            this.documento = documento;
            return this;
        }

        public PessoaBuilder nomeDaMae(String nomeDaMae) {
            this.nomeDaMae = nomeDaMae;
            return this;
        }

        public PessoaBuilder nomeDoPai(String nomeDoPai) {
            this.nomeDoPai = nomeDoPai;
            return this;
        }

        public Pessoa build() {
            Pessoa pessoa = new Pessoa();
            pessoa.nomeDoPai = this.nomeDoPai;
            pessoa.sobrenome = this.sobrenome;
            pessoa.nomeDaMae = this.nomeDaMae;
            pessoa.documento = this.documento;
            pessoa.nome = this.nome;
            pessoa.dataNascimento = this.dataNascimento;
            return pessoa;
        }
    }
}
