package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class CurrencyDto {
    private String name;
    private String lastName;

    @Override
    public String toString() {
        return "CurrencyDto{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
