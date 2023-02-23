package View;

/**
 * Interface contains get-methods from the console/
 * Интерфайс включает гетер из консоли
 */
public interface MenuGet {
    /**
     * Method get String value from input
     *
     * @return String
     */
    String getInputValue();

    /**
     * Method get two values from input for expression
     *
     * @return arry of two number
     */
    Number[] getValuesForExpression();
}