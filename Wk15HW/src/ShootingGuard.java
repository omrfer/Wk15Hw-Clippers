//Author @ Omar Fernandez
public class ShootingGuard implements BasketballPlayer {
	private String m_playername;

	ShootingGuard(String name) {
		m_playername = name;
	}

	@Override
	public void Shoot() {
		String print = "ShootingGuard named " + m_playername + " 3point.";
		System.out.println(print);
	}
}
