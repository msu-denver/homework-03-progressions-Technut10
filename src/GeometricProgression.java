/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Homework 03 - The GeometricProgression class
 */
/**
 * @author Anthony Putman Date: 06/12/24
 * <h1>Geometric Progression</h1>
 * <p>This class inherits the Progression class.</p>
 *  <p>It sets the value to the Fibonacci Progression to the <strong>DEFAULT_VALUE</strong>.</p> <br>
 *  <p>It also sets the previous value to zero.</p>
 */
public class GeometricProgression extends Progression {

    protected double ratio;
    protected static final double DEFAULT_VALUE = 1;
    protected static final double DEFAULT_RATIO = 2;

    public GeometricProgression(double initValue, double ratio) {
        super(initValue);
        this.ratio = ratio;
    }

    public GeometricProgression(){
        super(DEFAULT_VALUE);
        this.ratio = DEFAULT_RATIO;
    }

    @Override
    void next() {
        this.value *= this.ratio;
    }

}
