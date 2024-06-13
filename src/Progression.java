/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Homework 03 - The Progression class
 */

/**
 * This is an abstract class that each class in the src default package will inherit default fields and methods.
 * @author Anthony Putman
 * @version 1.0.0
 *
 **/
public abstract class Progression {

    protected double value;

    Progression(double value) {
        this.value = value;
    }

    double getValue() {
        return value;
    }

    abstract void next();
}
