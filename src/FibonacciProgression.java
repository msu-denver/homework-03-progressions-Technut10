/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Homework 03 - The FibonacciProgression class
 */

/**
 *
 *
 * Fibonacci Progression
 * <p>This class inherits the Progression class.</p>
 *  <p>It sets the value to the Fibonacci Progression to the <strong>DEFAULT_VALUE</strong>.
 *    This class also sets the previous value to zero.</p><br>
 *    <p>A fibonacci progression computes the next value by adding both previous numbers.
 *      0 + 1, 1, 1+1, 2, 2 + 1, 3, etc...  </p>
 *
 * @author Anthony Putman Date: 06/12/24
 * @version 1.0.1
 **/
public class FibonacciProgression extends Progression {

    protected double previous;
    protected static final double DEFAULT_VALUE = 1;

    public FibonacciProgression() {
        super(DEFAULT_VALUE);
        this.previous = 0;
    }


    /**
     * <p>void next():</p>
     * <p>This method progresses the count to the next value. The previous value is calculated by subtracting the value referenced by temp from itself. </p>
     * Pre-condition : valid real numbers, and temp variable to hold value for next pass.
     * @author Anthony Putman
     */
    @Override
    void next() {
        double temp;
        this.value += this.previous;
        temp = this.value;
        this.previous = temp - this.previous;
    }

    /**
     * Implements the get current value operation.
     * @return  value
     * @author Anthony Putman
     */
    public double getValue(){
        return this.value;
    }
}