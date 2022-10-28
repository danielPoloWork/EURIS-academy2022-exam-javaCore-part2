package utils;

/** @author Daniel Polo 2022 **/
public interface RegExConstant {
    String EXPRESSION = "(\\d+p\\s*\\d+s\\s*\\d+d)";
    String OPERATOR = "(\\[(\\+||\\-||\\*||\\/)\\])";
    String VALUE = "(\\d+)";
    String REGEX = "^" + EXPRESSION + "\\s*" + OPERATOR + "\\s*(" + EXPRESSION + "||" + VALUE + ")*";
    String CURRENCY = "(\\d+)p\\s*(\\d+)s\\s*(\\d+)d";
}
