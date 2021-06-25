package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

import bai_4_lop_va_doi_tuong_trong_java.thuc_hanh.Rectangle;

import java.util.Scanner;

public class QuadraticEquation {
    float a;
    float b;
    float c;
    float delta;
    float x1;
    float x2;

    public QuadraticEquation() {
    }

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA(float a) {
        return this.a = a;
    }

    public float getB(float b) {
        return this.b = b;
    }

    public float getC(float c) {
        return this.c = c;
    }

    public float getDiscriminant() {
        return this.delta = b * b - 4 * a * c;
    }

    public float getRoot1() {
        return this.x1 = (float) ((-this.b + Math.pow(this.delta, 0.5)) / 2 * this.a);
    }

    public float getRoot2() {
        return this.x2 = (float) ((-this.b - Math.pow(this.delta, 0.5)) / 2 * this.a);
    }
    public float getRoot3() {
        return this.x1 = this.x2 = (-this.b/ 2 * this.a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a = input.nextFloat();
        System.out.println("Enter b: ");
        float b = input.nextFloat();
        System.out.println("Enter c: ");
        float c = input.nextFloat();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phuong trinh co 2 nghiem phan biet: " + quadraticEquation.getRoot1() + ", " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co 1 nghiem kep: " + quadraticEquation.getRoot3());
        } else System.out.println("The equation has no roots");
    }
}
