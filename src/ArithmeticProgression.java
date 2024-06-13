/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Homework 03 - The ArithmeticProgression class
 */

/**
 * <h1>Arithmetic Progression</h1>
 * <p>This class inherits the Progression class.</p>
 *  <p>It sets the value to the Arithmetic Progression to the <strong>DEFAULT_VALUE</strong> to 0 and <strong>DEFAULT_DIFFERENCE to 1</strong>.</p> <br>
 *  <p>An arithmetic progression computes the next value by adding parameter difference to its current value. For example, to create the arithmetic progression 0, 2, 4, 6, ... the initial value is 0 and the difference is 2. ArithmeticProgression defines 2 constructors: one that takes both the initial value and the difference, and another one that takes no value at all, setting the initial value to 0 and the difference to 1.</p>
 * @author Anthony Putman Date: 06/12/24
 * @version 1.0.0
 **/
public class
ArithmeticProgression extends Progression {

    protected double difference;
    protected static final double DEFAULT_VALUE      = 0;
    protected static final double DEFAULT_DIFFERENCE = 1;

    public ArithmeticProgression(double initValue, double difference) {
        super(initValue);
        this.difference =  difference;
    }

    public ArithmeticProgression() {
        super(DEFAULT_VALUE);
        this.difference = DEFAULT_DIFFERENCE;
    }
    public double getValue(){
        return value;
    }

    /**
     *  Implements the add difference to value operation.
     * @author Anthony Putman
     * */
    @Override
    void next() {
            this.value += difference;
    }
}