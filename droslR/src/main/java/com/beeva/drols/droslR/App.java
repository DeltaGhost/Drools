package com.beeva.drols.droslR;

import java.util.Scanner;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.beeva.drols.drolsR.modelo.Cuenta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rule");
			
			Cuenta cu = new Cuenta();
			System.out.println("Ingresa deposito");
			cu.setDeposito(sc.nextDouble());
			System.out.println("Ingresa tu balance");
			cu.setBalance(sc.nextDouble());
			System.out.println("que tipo de cuenta es 1)ahorro 2)cheques ");
			cu.setTipo(sc.next());
			
			FactHandle fact1;
			
			fact1 = kSession.insert(cu);
			kSession.fireAllRules();
			
			
			System.out.println(""+cu.getMensaje());
			/*System.out.println("the discount for the jewellery prduct "
					+product.getType()+" is "+product.getDiscount());
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
