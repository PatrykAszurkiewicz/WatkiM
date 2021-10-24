
public class Main {

	public static void main(String[] args) {
		M_trapezow M_Trapezow = new M_trapezow(3, 7, 6);
	    M_prostokatow M_prostokatow = new M_prostokatow(3, 7, 6);
	    M_Simpsona M_Simpsona = new M_Simpsona(3, 7, 6);

	    M_Trapezow.start();
	    M_prostokatow.start();
	    M_Simpsona.start();

	    while (M_prostokatow.isAlive() && M_Simpsona.isAlive() && M_Trapezow.isAlive()){
	          try
	          {
	              Thread.sleep(10);
	          } 
	          catch (InterruptedException e) 
	          {
	            e.printStackTrace();
	          }
	        }
	        double m_trapezow = M_Trapezow.getCalka();
	        double m_simpsona = M_Simpsona.getCalka();
	        double m_prostokatow = M_prostokatow.getCalka();

	        System.out.println(m_trapezow + m_simpsona + m_prostokatow);
	}

}
