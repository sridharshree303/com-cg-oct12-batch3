package cg.oct12.batch3.day5;

public class EncapsulationDemo {

	
	public static void main(String[] args) {
		
		Employee ee = new Employee();
		ee.setSalary(1000);
		System.out.println(ee.getSalary());
    //    ee.salary = 1000;
		ee.setSalary(2000);
		System.out.println(ee.getSalary());
        ee.setEid(101);
        System.out.println(getEid());
	}

	private static char[] getEid() {
		// TODO Auto-generated method stub
		return null;
	}

}

// we