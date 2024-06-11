/*
 * CS2050 - Computer Science II
 * Instructor: Thyago Mota
 * Description: Homework 03 - The Progression class
 */

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
