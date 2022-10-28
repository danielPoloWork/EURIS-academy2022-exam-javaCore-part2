package services;

import DTOs.CurrencyDto;

/** @author Daniel Polo 2022 **/
public interface CurrencyService {

    Integer conversion(CurrencyDto currencyDto);
}
