package com.daonguyen.learningoop_02;

public class Student {
    private String name;
    private int code;
    private float math;
    private float physic;
    private float chemistry;

    public Student() {

    }

    public Student(String name, int code, float math, float physic, float chemistry) {
        this.name = name;
        this.code = code;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getMath() {
        return math;
    }

    public void setPhysic(float physic) {
        this.physic = physic;
    }

    public float getPhysic() {
        return physic;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    public float getChemistry() {
        return chemistry;
    }

    public float getAverage() {
        return (this.math + this.physic + this.chemistry) / 3;
    }
}
