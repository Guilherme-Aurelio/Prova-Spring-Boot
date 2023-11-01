package prova.prova.domain.usuario;

import java.time.LocalDateTime;
import java.util.List;

//import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import prova.prova.domain.emprestimo.Emprestimo;

@Entity(name = "usuario")
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  @Column(name = "data_registro")
  private LocalDateTime dataregistro;
  @OneToMany
  @JoinColumn(name = "lista_emprestimos")
  private List<Emprestimo> emprestimos;
}