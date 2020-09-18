

/*
 * a) The value of a local variable named i has no direct relationship with that of a
variable named i in its caller. True
b) The value of a parameter named x has no direct relationship with that of a variable
named x in its caller. True
 */

import acm.program.*;

public class traceing extends ConsoleProgram{
	public void run() {
		/* You fill this in */
		 bludger(2001);
		 }
		 private void bludger(int y) // y = 2001
		 {
		 int x = y / 1000; //x = 2
		 int z = (x + y); // z = 2003
		 x = quaffle(z, y); // x  = 1
		 println("bludger: x = " + x + ", y = " + y + ", z = " + z); // output is "bludger: x = 1, y = 2001, z = 2003"
		 }
		 private int quaffle(int x, int y) // x = 2003 y = 2001
		 {
		 int z = snitch(x + y, y); // z = 1001
		 y /= z; // 1 
		 println("quaffle: x = " + x + ", y = " + y + ", z = " + z);// output is "quaffle x = 2003, y = 1, z = 1001"
		 return z; // 1
		 }
		 private int snitch(int x, int y) // x = 4004 y = 2001
		 {
		 y = x / (x % 10); // 4004/4 y = 1001
		 println("snitch: x = " + x + ", y = " + y); // print is "snitch: x = 4004, y = 1001
		 return y; // 1001
		 }
		

}
