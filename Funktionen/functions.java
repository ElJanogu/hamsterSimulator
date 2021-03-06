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

- if(){}else if(){}else{}
- while(){}
- for(){}

*/

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class functions extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main()
{
	/* TEST A */
	//sucheLuecke();
	
	/* TEST B */
	//int steps = 0;
	//steps = countStepsToCorn();
	//turn();
	//vorX(steps);
	//turn();
	
	/* TEST C */
	int steps = 0;
	steps = countStepsToWall();
	turn();
	vorX(steps);
	turn();
}

void rechtsUm()
{
	linksUm();
	linksUm();
	linksUm();
}

void vorX(int number)
{
	for(int i = 0; i < number; i++)
	{
		if(vornFrei())	vor();
	}
}

void vorBisWand()
{
	while(vornFrei()) vor();
}

void turn()
{
	linksUm();
	linksUm();
}

int countStepsToWall()
{
	int count = 0;
	while(vornFrei())
	{
		vor();
		count++;
	}
	
	return count;
}

int countStepsToCorn()
{
	int count = 0;
	while(!kornDa())
	{
		vor();
		count++;
	}
	
	return count;
}

boolean linksFrei()
{
	boolean b = false;
	
	linksUm();
	b = vornFrei();
	rechtsUm();
	
	return b;
}

void sucheLuecke()
{
	while(vornFrei()){
		if(linksFrei())
		{
			linksUm();
			vor();
			break;
		}
		else
		{
			vor();
		}
	}
	
}



}