package DTOs;

import lombok.*;

/** @author Daniel Polo 2022 **/
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
