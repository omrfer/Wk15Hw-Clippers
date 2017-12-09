//Author @ Omar Fernandez
public class SmallFoward implements BasketballPlayer {
	private String m_playername;

	public SmallFoward(String name) {
		m_playername = name;
	}

	@Override
	public void Shoot() {
		String print = "SmallFoward named " + m_playername + " glides.";
		System.out.println(print);
	}
}