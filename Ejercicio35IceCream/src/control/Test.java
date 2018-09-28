package control;

import beans.IceCream;
import beans.ScoopEnumeration;
import beans.Topping;

public class Test {
	public static void startTest(){
		IceCream iceCream1 = new IceCream("Magnum", Topping.CHOCOLATE, ScoopEnumeration.MEGA);
		System.out.println(iceCream1.getName() + " con topping de " + iceCream1.getTopping() +  " y de tamano igual a " + iceCream1.getSize().getNumOfScoops() +" bolas creado");
	}	
}
