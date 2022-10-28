package services.impls.currencies;

import DTOs.CurrencyDto;
import services.CurrencyService;
import utils.enums.PennyConversionRate;

/** @author Daniel Polo 2022 **/
public class PoundServiceImpl implements CurrencyService {
    @Override
    public Integer conversion(CurrencyDto currencyDto) {
        return currencyDto.getPound();
    }

    public static Integer convertPennyIntoPound(Integer penny) {
        return penny / PennyConversionRate.POUND.getRate();
    }

    public static Integer subtractConvertedPound(Integer penny) {
        return (penny / PennyConversionRate.POUND.getRate()) * PennyConversionRate.POUND.getRate();
    }
}
