package utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ShillingConversionRate {
    POUND(20);
    private final Integer rate;
}