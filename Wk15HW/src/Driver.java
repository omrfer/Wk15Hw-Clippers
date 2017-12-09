//Author @ Omar Fernandez
public class Driver {
	public static void main(String[] args) {
		BasketballPlayer[] clip = new BasketballPlayer[5];
	BasketballPlayer center = new Center("DeAndre Jordan");
	BasketballPlayer powerfoward = new PowerFoward("Blake Griffin");
	BasketballPlayer smallfoward = new SmallFoward("Danilo Gallinari");
	BasketballPlayer pointguard = new PointGuard("Patrick Beverley");
	BasketballPlayer shootingguard = new ShootingGuard("Austin Rivers");
	clip[0] = center;
	clip[1] = powerfoward;
	clip[2] = smallfoward;
	clip[3] = pointguard;
	clip[4] = shootingguard;
	for (int i =0;i<clip.length;i++) {
		clip[i].Shoot();
	}
	}
}
