import exceptions.OperationNotSupportedException;
import services.ArithmeticOperationService;
import services.impls.arithmeticOperations.ArithmeticOperationServiceImpl;

/*
  Edit Run configuration and add:
      "5p 17s 8d [+] 3p 4s 10d"
      "5p 17s 8d [-] 3p 4s 10d"
      "5p 17s 8d [-] 5p 18s 8d"
      "5p 17s 8d [*] 2"
      "5p 17s 8d [/] 3"
      "18p 16s 1d [/] 15"
 */
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