
import java.util.Scanner;

public class Student implements java.io.Serializable {
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", retake=" + retake + ", resit=" + resit + "]";
	}

	private String name;
	

	private String id;
	private int retake = 0;
	private int resit = 0;
	
	/**public Student(String name, String id, int retake, int resit) {
		this.name=name;
		this.id=id;
		this.retake=retake;
		this.resit=resit;
	}*/
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public int resitIncrease() {
		resit++;
		return resit;
	}
	
	public int retakeIncrease() {
		retake++;
		return retake;
	}

	public int getRetake() {
		return retake;
	}

	public int getResit() {
		return resit;
	}

	public void setRetake(int retake) {
		this.retake = retake;
	}

	public void setResit(int resit) {
		this.resit = resit;
	}

	public void enterName(String name, String id) {
		this.name=name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

}
