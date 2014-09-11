import java.math.BigDecimal;
import java.util.Scanner;

public class _2_TriangleArea {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BigDecimal Ax = scan.nextBigDecimal();
		BigDecimal Ay = scan.nextBigDecimal(); 
		BigDecimal Bx = scan.nextBigDecimal();
		BigDecimal By = scan.nextBigDecimal();
		BigDecimal Cx = scan.nextBigDecimal();
		BigDecimal Cy = scan.nextBigDecimal();
		
		BigDecimal BySubCy = By.subtract(Cy);
		BigDecimal CySubAy = Cy.subtract(Ay);
		BigDecimal AySubBy = Ay.subtract(By);
				
		BigDecimal AA = Ax.multiply(BySubCy);    //(Ax*(By - Cy) + Bx*(Cy - Ay) + Cx*(Ay - By))/2;
		BigDecimal BB = Bx.multiply(CySubAy);
		BigDecimal CC = Cx.multiply(AySubBy);
		
		BigDecimal area = AA.add(BB.add(CC));
		area = area.abs();
		
		System.out.println(area);
	}
}
