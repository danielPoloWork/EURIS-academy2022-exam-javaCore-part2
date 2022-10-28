package utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/** @author Daniel Polo 2022 **/
@AllArgsConstructor
@Getter
public enum ShillingConversionRate {
    POUND(20);
    private final Integer rate;
}