package utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/** @author Daniel Polo 2022 **/
@AllArgsConstructor
@Getter
public enum PennyConversionRate {
    POUND(240),
    SHILLING(12);
    private final Integer rate;
}