package ma.fs.hospital.entities;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;

import java.time.LocalDate;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le nom est obligatoire")
    private String name;

    @NotNull(message = "La date de naissance est obligatoire")
    @PastOrPresent(message = "La date doit être dans le passé ou aujourd'hui")
    private LocalDate dateNaissance;

    @NotNull(message = "Le nom de la maladie est obligatoire")
    private Boolean maladie;

    @PositiveOrZero(message = "Le score doit être positif ou nul")
    private int score;
}
