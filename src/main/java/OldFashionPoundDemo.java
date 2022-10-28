import exceptions.OperationNotSupportedException;
import services.ArithmeticOperationService;
import services.impls.arithmeticOperations.ArithmeticOperationServiceImpl;

/** @author Daniel Polo 2022 **/
public class OldFashionPoundDemo {

    private static final ArithmeticOperationService arithmeticOperationService = new ArithmeticOperationServiceImpl();

    public static void main(String[] args) throws OperationNotSupportedException {
        arithmeticOperationService.calculate(args[0]);
        arithmeticOperationService.calculate(args[1]);
        arithmeticOperationService.calculate(args[2]);
        arithmeticOperationService.calculate(args[3]);
        arithmeticOperationService.calculate(args[4]);
        arithmeticOperationService.calculate(args[5]);
    }
}