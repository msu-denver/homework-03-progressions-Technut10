/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Homework 03 - The ArithmeticProgression class
 */
/**
 * @author Anthony Putman Date: 06/12/24
 * <h1>Arithmetic Progression</h1>
 * <p>This class inherits the Progression class.</p>
 *  <p>It sets the value to the Fibonacci Progression to the <strong>DEFAULT_VALUE</strong>.</p> <br>
 *  <p>It also sets the previous value to zero.</p>
 */
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
    @Override
    void next() {
            this.value += difference;
    }
}