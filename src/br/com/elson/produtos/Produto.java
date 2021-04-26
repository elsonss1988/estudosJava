package br.com.elson.produtos;

import java.util.Objects;

public class Produto {
    private String sku;
    private String nome;

    public Produto(String sku, String nome) {
        this.sku = sku;
        this.nome = nome;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "sku='" + sku + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(sku, produto.sku) || Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(sku, nome);
        return this.sku.charAt(0);
    }
}

