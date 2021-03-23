
public class ProjectTest {
	public static void main(String[] args) {
		Project nada = new Project();
		String empty = nada.elevatorPitch();
		System.out.println(empty);
		
		Project eP = new Project("Java Project 1");
		String project = eP.elevatorPitch();
		System.out.println(project);
		
		Project getSetTest = new Project("Java Project 2", "There won't be a colon with this test");
		String name = getSetTest.getName();
		String desc = getSetTest.getDesc();
		System.out.println(name + " " + desc);
		
		getSetTest.setName("Python was Easier");
		getSetTest.setDesc("This should be a different description now");
		System.out.println(getSetTest.elevatorPitch());
	}
}
