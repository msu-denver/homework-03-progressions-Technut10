/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Homework 03 - The GeometricProgression class
 */
/**
 *
 * Geometric Progression
 * <p>This class inherits the Progression class.</p>
 *  <p>It sets the value to the Geometric Progression to the <strong>DEFAULT_VALUE</strong> and <strong>DEFAULT_RATIO</strong> provided. Which are the values 1 and 2 respectively. </p> <br>
 *  <p>A geometric progression computes the next value by multiplying parameter ratio to its current value. For example, to create the geometric progression 1, 2, 4, 8, ... the initial value is 1 and the ratio is 2. GeometricProgression defines 2 constructors: one that takes both the initial value and the ratio, and another that takes no value at all, setting the initial value to 1 and the ratio to 2.</p>
 * @author Anthony Putman Date: 06/12/24
 * @version 1.0.0
 *
 **/
public class GeometricProgression extends Progression {

    protected double ratio;
    protected static final double DEFAULT_VALUE = 1;
    protected static final double DEFAULT_RATIO = 2;


    /**
     * Class constructors: One default and one initialized
     **/
    public GeometricProgression(double initValue, double ratio) {
        super(initValue);
        this.ratio = ratio;
    }

    public GeometricProgression(){
        super(DEFAULT_VALUE);
        this.ratio = DEFAULT_RATIO;
    }


    /**
     * Implements the value multiplied by ratio operation
     * @author Anthony Putman
     * */
    @Override
    void next() {
        this.value *= this.ratio;
    }

}
