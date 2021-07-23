package br.com.zupedu.dojo.ot4dojo.cadastroturma;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "turma")
public class TurmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "iniciadaEm", nullable = false)
    private LocalDate iniciadaEm;

    @Column(name = "terminaEm", nullable = false)
    private LocalDate terminaEm;

    public TurmaEntity(){}

    public TurmaEntity(String nome, LocalDate iniciadaEm, LocalDate terminaEm) {
        this.nome = nome;
        this.iniciadaEm = iniciadaEm;
        this.terminaEm = terminaEm;
    }

    @Override
    public String toString() {
        return "TurmaEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", iniciadaEm=" + iniciadaEm +
                ", terminaEm=" + terminaEm +
                '}';
    }

    public Object getId() {
        return null;
    }
}
