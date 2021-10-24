
public class M_trapezow extends Thread{
	double x, y, dx, calka;
    int n;

    M_trapezow(double x, double y, int n){
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public double getCalka() {
        return calka;
    }
    @Override
    public void run() {
        dx = (y - x) / (double)n;

        calka = 0;
        for (int i=1; i<n; i++) {
            calka += func(x + i * dx);
        }
        calka += (func(x) + func(y)) / 2;
        calka *= dx;
    }

    public double func(double x) {
        return x * x;
    }
}
