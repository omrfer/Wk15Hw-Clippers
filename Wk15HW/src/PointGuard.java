//Author @ Omar Fernandez
public class PointGuard implements BasketballPlayer {
	private String m_playername;

	public PointGuard(String name) {
		m_playername = name;
	}

	@Override
	public void Shoot() {
		String print = "PointGuard named " + m_playername + " passes.";
		System.out.println(print);
	}
}
