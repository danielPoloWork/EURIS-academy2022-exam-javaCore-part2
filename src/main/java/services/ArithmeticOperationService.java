package services;

import exceptions.OperationNotSupportedException;

public interface ArithmeticOperationService {
    void calculate(String args) throws OperationNotSupportedException;
}
