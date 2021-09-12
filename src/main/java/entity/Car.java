package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {

    @Id
    @GeneratedValue

    private Long id;
    private String brand, model, countryOfOrigin;
    private Integer maxSpeed;

}
