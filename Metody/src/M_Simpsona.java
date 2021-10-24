
public class M_Simpsona extends Thread{
		double a, b, dx, calka, s, x;
		int n;

	    M_Simpsona(double a, double b, int n){
	        this.a = a;
	        this.b = b;
	        this.n = n;
	    }

	    public double getCalka() {
	        return calka;
	    }

	    @Override
	    public void run() {
	        dx = (b - a) / (double)n;

	        calka = 0;
	        s = 0;
	        for (int i=1; i<n; i++) {
	            x = a + i*dx;
	            s += func(x - dx / 2);
	            calka += func(x);
	        }
	        s += func(b - dx / 2);
	        calka = (dx/6) * (func(a) + func(b) + 2*calka + 4*s);
	    }

	    public double func(double x) {
	        return x * x;
	    }
	
}
