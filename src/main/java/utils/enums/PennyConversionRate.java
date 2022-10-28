package utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PennyConversionRate {
    POUND(240),
    SHILLING(12);
    private final Integer rate;
}