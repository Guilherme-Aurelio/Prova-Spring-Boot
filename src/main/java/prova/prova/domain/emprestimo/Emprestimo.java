package prova.prova.domain.emprestimo;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import prova.prova.domain.usuario.Usuario;

@Table(name = "emprestimo")
@Entity(name = "emprestimo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataemprestimo;
    private LocalDateTime datadevolucao;
    private String livroemprestado;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}