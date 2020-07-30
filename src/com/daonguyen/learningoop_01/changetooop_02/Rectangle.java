package com.daonguyen.learningoop_01.changetooop_02;

// generalization from object to object class
public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // way 2: transfer 1 common function to object class to use when handle with this object class
    // => should not use because model need to be pure object, do not put logic function here
    protected float calculatePerimeter(float length, float width) {
        return (this.length + this.width) * 2;
    }
}
