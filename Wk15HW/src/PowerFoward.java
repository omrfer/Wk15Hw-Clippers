//Author @ Omar Fernandez
public class PowerFoward implements BasketballPlayer {
	private String m_playername;

	public PowerFoward(String name) {
		m_playername = name;
	}

	@Override
	public void Shoot() {
		String print = "PowerFoward named " + m_playername + " dunks.";
		System.out.println(print);
	}
}
