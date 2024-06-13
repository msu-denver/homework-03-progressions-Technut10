/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Homework 03 - The FibonacciProgression class
 */

/**
 * @author Anthony Putman Date: 06/12/24
 * <h1>Fibonacci Progression</h1>
 * <p>This class inherits the Progression class.</p>
 *  <p>It sets the value to the Fibonacci Progression to the <strong>DEFAULT_VALUE</strong>.</p> <br>
 *  <p>It also sets the previous value to zero.</p>
 */
public class FibonacciProgression extends Progression {

    protected double previous;
    protected static final double DEFAULT_VALUE = 1;

    public FibonacciProgression() {
        super(DEFAULT_VALUE);
        this.previous = 0;
    }

    public double getValue(){
        return this.value;
    }
    @Override
    void next() {
            double temp =0;
            this.value += this.previous;
            temp = this.value;
            this.previous = temp - this.previous;
    }
}