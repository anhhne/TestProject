package object;

import javax.imageio.ImageIO;

public class OBJ_Chest extends SuperObject{

	public OBJ_Chest() {
		name = "chest";
		try {
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/chest (OLD).png"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
