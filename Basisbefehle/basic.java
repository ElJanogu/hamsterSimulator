/*

- vor()      - void
- linksUm()  - void
- nimm()     - void
- gib()      - void
- vornFrei() - boolean
- kornDa()   - boolean
- maulLeer() - boolean

*/

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class basic extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main()
{
	vor();
	vor();
	nimm();
	vor();
	vor();
	vor();
	linksUm();
	vor();
	vor();
	nimm();
	linksUm();
	linksUm();
	linksUm();
	vor();
	vor();
	gib();
	gib();
	linksUm();
	vor();
	vor();
}


}