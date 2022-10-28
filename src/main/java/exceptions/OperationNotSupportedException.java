package exceptions;

/** @author Daniel Polo 2022 **/
public class OperationNotSupportedException extends Exception{
    public OperationNotSupportedException() {
        super("Operation not supported.");
    }
}
