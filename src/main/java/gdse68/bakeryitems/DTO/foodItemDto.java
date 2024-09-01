package gdse68.bakeryitems.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class foodItemDto {
    @Id
    private Long id;
    private String name;
    private String category;
}
