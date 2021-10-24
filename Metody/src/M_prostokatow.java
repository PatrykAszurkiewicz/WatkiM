
public class M_prostokatow extends Thread{
	 double x, y, dx, calka;
	 int n;
	    M_prostokatow(double x, double y, int n){
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
	        for (int i=1; i<=n; i++) {
	            calka += func(x + i * dx);
	        }
	        calka *= dx;
	    }

	    public double func(double x) {
	        return x * x;
	    }
}
