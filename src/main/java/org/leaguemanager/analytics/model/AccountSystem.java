package org.leaguemanager.analytics.model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.INDENTITY)
    private Long id; 
    private String firstName;
    private String lastName;

    @Column (unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;
    
    private String passwordHash;
    private LocalDateTime createdAt;
}
