import java.util.Scanner;

public class Level {
	
	private int ModICT1;
	private int ModICT2;
	private int ModICT3;
	private int ModCred;
	private int condoneAttempt = 0;
	
	public int getCondoneAttempt() {
		return condoneAttempt;
	}
	
	public int getModICT1() {
		return ModICT1;
	}

	public int getModICT2() {
		return ModICT2;
	}

	public int getModICT3() {
		return ModICT3;
	}

	public int getModCred() {
		return ModCred;
	}
	
	public int condoneAttemptIncr() {
		condoneAttempt++;
		return condoneAttempt;
	}
	
	
	public void condoneValidate(int ICT1 , int ICT2 , int ICT3, int ModCred){
		this.ModICT1=ICT1;
		this.ModICT2=ICT2;
		this.ModICT3=ICT3;
		this.ModCred=ModCred;
		
		Scanner x = new Scanner(System.in);
		
		if ((ICT1 + ICT2 + ICT3 < 90
				&& ICT1 + ICT2 + ICT3 <= 300
				&& ICT1 + ICT2 + ICT3 >= 0) || ModCred == 20) {
			
			System.out.println("Ineligible for Condoned Credits");
		} else if (ICT1 + ICT2 + ICT3 >= 90
				&& ICT1 + ICT2 + ICT3 <= 300
				&& ICT1 + ICT2 + ICT3 >= 0) {
			System.out.println("ELIGIBLE for Condoned Credits");
			if (condoneAttempt<2) {
				
				System.out.print("Add condone credits for module? (Press 9 for YES, 0 for NO):");
				
				//a variable to validate the user input
				int condone = x.nextInt();	
				
				if (condone==9) {
					System.out.println("Module CONDONED");
					condoneAttemptIncr();
				} else if (condone==0){
					System.out.println("Module NOT CONDONED");
				} else {
					System.out.println("ERROR RESTART PROGRAM");
				}
					
			
			} else {
				System.out.println("Condone credit opportunities EXAUSTED");
			}
		}
		
	}

	
}
