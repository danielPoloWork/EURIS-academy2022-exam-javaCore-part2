package services.impls.arithmeticOperations;

import DTOs.ExpressionDto;
import exceptions.OperationNotSupportedException;
import prints.ArithmeticOperationPrint;
import services.ArithmeticOperationService;
import services.DivisionMultiplicationService;
import services.SubtractionSumService;
import utils.RegExUtil;

/** @author Daniel Polo 2022 **/
public class ArithmeticOperationServiceImpl implements ArithmeticOperationService {

    private final ArithmeticOperationPrint arithmeticOperationPrint;
    private final DivisionMultiplicationService divisionService;
    private final DivisionMultiplicationService multiplicationService;
    private final SubtractionSumService subtractionService;
    private final SubtractionSumService sumService;
    private final RegExUtil regExUtil;

    public ArithmeticOperationServiceImpl() {
        this.arithmeticOperationPrint = new ArithmeticOperationPrint();
        this.divisionService = new DivisionServiceImpl();
        this.multiplicationService = new MultiplicationServiceImpl();
        this.subtractionService = new SubtractionServiceImpl();
        this.sumService = new SumServiceImpl();
        this.regExUtil = new RegExUtil();
    }

    @Override
    public void calculate(String args) throws OperationNotSupportedException {
        retrieveOperation(regExUtil.parseToDto(args));
    }

    private void retrieveOperation(ExpressionDto expressionDto) throws OperationNotSupportedException {
        switch (expressionDto.getOperator()) {
            case '+':
                arithmeticOperationPrint.printSubtractionSumResult(expressionDto, this.sumService.calculate(expressionDto));
                break;
            case '-':
                arithmeticOperationPrint.printSubtractionSumResult(expressionDto, this.subtractionService.calculate(expressionDto));
                break;
            case '*':
                arithmeticOperationPrint.printDivisionMultiplicationResult(expressionDto, this.multiplicationService.calculate(expressionDto));
                break;
            case '/':
                arithmeticOperationPrint.printDivisionMultiplicationResult(expressionDto, this.divisionService.calculate(expressionDto));
                break;
            default:
                throw new OperationNotSupportedException();
                //throw new RuntimeException("Operation not supported.");
        }
    }
}
