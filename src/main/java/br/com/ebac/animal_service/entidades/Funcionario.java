package br.com.ebac.animal_service.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Animal> animaisResgatados;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Animal> getAnimaisResgatados() {
        return animaisResgatados;
    }

    public void setAnimaisResgatados(List<Animal> animaisResgatados) {
        this.animaisResgatados = animaisResgatados;
    }
}
