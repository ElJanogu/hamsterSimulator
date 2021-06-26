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
- System.out.println("...");

- if(){}else if(){}else{}
- while(){}
- for(){}

*/

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class structures extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main()
{
	vor();
	if(kornDa()) nimm();
	
	vor();
	if(kornDa())	{ nimm(); }
	else {
		linksUm();
		linksUm();
		linksUm();
	}
	
	vor();
	if(kornDa())
	{
		nimm();
	}
	else
	{
		linksUm();
		linksUm();
		linksUm();
		linksUm();
	}

	/*
	if (BEDINGUNG[EN])
	{
		ANWEISUNG[EN];
	} 
	else if (BEDINGUNG[EN])
	{
		ANWEISUNG[EN];
	}
	else 
	{
		ANWEISUNG[EN];
	}
	*/
	
	vor();
	while(kornDa()) nimm();
	
	vor();
	while(kornDa()) 
	{
		nimm();
	}
	
	/*
	while (BEDINGUNG[EN])
	{
		ANWEISUNG[EN];
	}
	
	do
	{
		ANWEISUNG[EN];
	}
	while (BEDINGUNG[EN]);
	
	*/
	
	vor();
	for(int i = 0; i < 3; i++)
	{
		nimm();
	}
	
	vor();
	int a;
	for(a = 0; a < 2;)
	{
		nimm();
		a++;
	}
	
	vor();
	int b = 0;
	for(; b <= 3; b++)
	{
		nimm();
	}
}




}