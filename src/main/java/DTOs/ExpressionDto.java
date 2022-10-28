package DTOs;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ExpressionDto {
    private CurrencyDto currencyA;
    private CurrencyDto currencyB;
    private Character operator;
    private Integer value;
}
