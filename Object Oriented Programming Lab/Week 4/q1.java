class Complex {
    int x;
    int y;

    Complex() {
        x = 0;
        y = 0;
    }

    Complex(int a, int b) {
        x = a;
        y = b;
    }

    void disp() {
        System.out.println("The Complex Number is " + x + " + " + y + "i");
    }

    void compdisp() {
        System.out.println(+x + " + " + y + "i");
    }

    Complex add(Complex c1, Complex c2) {
        Complex sum = new Complex();

        sum.x = c1.x + c2.x;
        sum.y = c1.y + c2.y;

        return sum;
    }

    Complex sub(Complex c1, Complex c2) {
        Complex diff = new Complex();

        diff.y = c1.y - c2.y;
        if (diff.y > 0)
            diff.x = c1.x - c2.x;
        else {
            diff.x = c2.x - c1.x;
            diff.y *= -1;
        }

        return diff;
    }
}

class ComplexDemo {
    public static void main(String[] args) {

        Complex c1 = new Complex(4, 2);
        Complex c2 = new Complex();
        Complex s = new Complex();
        Complex d = new Complex();

        c1.disp();
        c2.disp();

        s = s.add(c1, c2);
        System.out.print("Complex Number after Addition : ");
        s.compdisp();

        d = d.sub(c1, c2);
        System.out.print("Complex Number after Subtraction : ");
        d.compdisp();

    }
}