package services;

import exceptions.OperationNotSupportedException;

/** @author Daniel Polo 2022 **/
public interface ArithmeticOperationService {
    void calculate(String args) throws OperationNotSupportedException;
}
