package services.impls.currencies;

import DTOs.CurrencyDto;
import services.CurrencyService;
import utils.enums.PennyConversionRate;
import utils.enums.ShillingConversionRate;

public class ShillingServiceImpl implements CurrencyService {
    @Override
    public Integer conversion(CurrencyDto currencyDto) {
        return (currencyDto.getPound() * ShillingConversionRate.POUND.getRate())
                + currencyDto.getShilling();
    }

    public static Integer convertPennyIntoShilling(Integer penny) {
        return penny / PennyConversionRate.SHILLING.getRate();
    }

    public static Integer subtractConvertedShilling(Integer penny) {
        return (penny / PennyConversionRate.SHILLING.getRate()) * PennyConversionRate.SHILLING.getRate();
    }
}