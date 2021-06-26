/*

- vor()      - void
- linksUm()  - void
- nimm()     - void
- gib()      - void
- vornFrei() - boolean
- kornDa()   - boolean
- maulLeer() - boolean

- boolean
- byte, short, int, long
- float, double
- char, String

*/

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class datatypes extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main()
{
	boolean b = false; // 0 / 1 ..... false / true ..... falsch / wahr
	
	byte by = 0;   // -128 ... 127
	short sh = 12; // -32.768 ... 32.767
	int i = 200; // -2.147.483.648 ... 2.147.483.647
	long l = 3000; // ...
	
	float fl = 2.5f; // ...
	double dou = 3.76d; // ...
	
	char c = 'A';  // 0 ... 65.535 ..... A == 65
	String str = "this is a text";
	
	System.out.println("THIS IS A TEST");
	
}


}