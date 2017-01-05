
import java.util.Scanner;

public class Module implements java.io.Serializable{
	
	private int ICT1;
	private int ICT2;
	private int ICT3;
	private int ModCred;
	private int condoneAttempt = 0;
	public double avg;
	
	
	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getCondoneAttempt() {
		return condoneAttempt;
	}

	public Module (int ICT1, int ICT2, int ICT3) {
		this.ICT1=ICT1;
		this.ICT2=ICT2;
		this.ICT3=ICT3;
	}

	public int getICT1() {
		return ICT1;
	}

	public int getICT2() {
		return ICT2;
	}

	public int getICT3() {
		return ICT3;
	}

	
	
	public int getModCred() {
		return ModCred;
	}
	
	
	
	
	
//	public int getRetake() {
//		return retake;
//	}
//
//	public int getResit() {
//		return resit;
//	}


	
	
	public void setICT1(int iCT1) {
		ICT1 = iCT1;
	}

	public void setICT2(int iCT2) {
		ICT2 = iCT2;
	}

	public void setICT3(int iCT3) {
		ICT3 = iCT3;
	}
	
	
	
	public void setModCred(int modCred) {
		ModCred = modCred;
	}
	
	
	
//	public void setRetake(int retake) {
//		this.retake = retake;
//	}
//
//	public void setResit(int resit) {
//		this.resit = resit;
//	}
//
//	
//	public void retakeIncrease(){
//		retake++;
//	}
//	
//	public void resitIncrease(){
//		resit++;
//	}
	
	//method used to calculate averages of modules in levels 5 & 6
	public double avg(int ICT1 , int ICT2 , int ICT3) {
		this.ICT1=ICT1;
		this.ICT2=ICT2;
		this.ICT3=ICT3;
		
		int total = ICT1+ICT2+ICT3;
		//System.out.println("Total marks= "+total);
		double avg = total/3.0;
		
		return avg;
		
	}
	
	public double getAvg() {
		return avg;
	}
	
	
	
	

	//method that checks conditions to award 20 credits per module in all levels
	public void creditValidate(int ICT1 , int ICT2 , int ICT3){
		this.ICT1=ICT1;
		this.ICT2=ICT2;
		this.ICT3=ICT3;
		
		
		if (ICT1 >= 40 && ICT2 >= 40 && ICT3 >= 40 && ICT1 <= 100
				&& ICT2 <= 100 && ICT3 <= 100 && ICT1 >= 0 && ICT2 >= 0
				&& ICT3 >= 0) {
			System.out.println("Has Achieved 20 Credits for Module");
		} else {
			System.out.println("0 Credits Achieved for Module");
		}
	}
	
	
	/**
	public void condoneValidate(int ICT1 , int ICT2 , int ICT3, int ModCred){
		this.ICT1=ICT1;
		this.ICT2=ICT2;
		this.ICT3=ICT3;
		
		Scanner x = new Scanner(System.in);
		
		if ((ICT1 + ICT2 + ICT3 < 90
				&& ICT1 + ICT2 + ICT3 <= 300
				&& ICT1 + ICT2 + ICT3 >= 0) || ModCred == 20) {
			
			System.out.println("Ineligible for Condoned Credits");
		} else if (ICT1 + ICT2 + ICT3 >= 90
				&& ICT1 + ICT2 + ICT3 <= 300
				&& ICT1 + ICT2 + ICT3 >= 0) {
			System.out.println("ELIGIBLE for Condoned Credits");
			if (condoneAttempt<=2) {
				
				System.out.print("Add condone credits for module? :");
				String condone = x.nextLine();	
					if (condone=="yes" || condone=="YES" || condone=="Y" || condone=="y") {
						System.out.println("Module CONDONED");
						condoneAttempt++;
					} else if (condone=="no" || condone=="NO" || condone=="n" || condone=="N") {
						System.out.println("Module NOT CONDONED");
					}
			} else {
				System.out.print("Condone credit opportunities EXAUSTED");
			}
		}
		//return condoneAttempt;
	}*/
}

