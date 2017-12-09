//Author @ Omar Fernandez
public class Center implements BasketballPlayer {
	private String m_playername;

	public Center(String name) {
		m_playername = name;
	}

	@Override
	public void Shoot() {
		String print = "Center named " + m_playername + " hooks.";
		System.out.println(print);
	}
}
