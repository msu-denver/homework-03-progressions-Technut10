# Instructions

Consider the abstract class **Progression** that sets an initial value and defines a way to compute its next value. Based on that class, define 3 specializations: **ArithmeticProgression**, **GeometricProgression**, and **FibonacciProgression**. 

# Arithmetic Progression

An arithmetic progression computes the next value by adding parameter **difference** to its current value. For example, to create the arithmetic progression 0, 2, 4, 6, ... the initial value is 0 and the difference is 2. **ArithmeticProgression** defines 2 constructors: one that takes both the initial value and the difference, and another one that takes no value at all, setting the initial value to 0 and the difference to 1. 

# Geometric Progression

A geometric progression computes the next value by multiplying parameter **ratio** to its current value. For example, to create the geometric progression 1, 2, 4, 8, ... the initial value is 1 and the ratio is 2. **GeometricProgression** defines 2 constructors: one that takes both the initial value and the ratio, and another that takes no value at all, setting the initial value to 1 and the ratio to 2. 

# Fibonacci Progression

A fibonacci progression computes the next value by adding both previous numbers. For example, to create the fibonacci progression 1, 1, 2, 3, 5, 8, 13, ... the previous value is initially set to 0 and the value to 1. This should be done automatically by the fibonacci's default constructor (parameterless constructor).

# JavaDoc

You are also required to write JavaDoc comments for this project, which should be saved in a folder named "doc". 

# Rubric 

```
+1 ArithmeticProgression
+1 GeometricProgression
+2 FibonacciProgression
+1 JavaDoc
```