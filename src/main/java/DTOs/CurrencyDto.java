package DTOs;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CurrencyDto {

    // 1 pound = 20 shillings, 240 pence
    private Integer pound;

    // 1 shilling = 0.05 pounds, 12 pence
    private Integer shilling;

    // 1 penny = 0,0041666 pounds, 0,0833333 shillings
    private Integer penny;

    private Integer rest;
}
