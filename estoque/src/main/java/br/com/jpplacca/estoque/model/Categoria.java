package br.com.jpplacca.estoque.model;


import jakarta.persistence.*;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String nomecategoria;

    @OneToMany(mappedBy = "categoria")
    private List<Produto> Produtoslist = new ArrayList<>();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomecategoria() {
        return nomecategoria;
    }

    public void setNomecategoria(String nomecategoria) {
        this.nomecategoria = nomecategoria;
    }

    public List<Produto> getProdutoslist() {
        return Produtoslist;
    }

    public void setProdutoslist(List<Produto> produtoslist) {
        Produtoslist = produtoslist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return id == categoria.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
