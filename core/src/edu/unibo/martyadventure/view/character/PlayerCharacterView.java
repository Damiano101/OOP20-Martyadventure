package edu.unibo.martyadventure.view.character;

import java.util.concurrent.ExecutionException;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import edu.unibo.martyadventure.model.character.PlayerCharacter;
import edu.unibo.martyadventure.model.character.Shoes;
import edu.unibo.martyadventure.model.weapon.Weapon;
import edu.unibo.martyadventure.model.weapon.WeaponFactory;
import edu.unibo.martyadventure.view.weapon.WeaponView;
import edu.unibo.martyadventure.view.weapon.WeaponViewFactory;

/**
 * A player character's base providing basic movement, interaction with given
 * the map and visual representation.
 */
public class PlayerCharacterView extends CharacterView {
    
    private static WeaponView playerWeapon = WeaponViewFactory.createPlayerWeaponView();
    private static PlayerCharacter player = new PlayerCharacter(Shoes.SLOW, "Marty", 9300, playerWeapon.getWeapon());
    private static final String PLAYER_PATH = "Characters/Marty/MartyMove (1).png";
    public static final int FRAME_WIDTH = 141;
    public static final int FRAME_HEIGHT = 148;

    public PlayerCharacterView(Vector2 initialPosition) throws InterruptedException, ExecutionException {
        super(initialPosition, 20f, 10f, 100f, loadTexture(), FRAME_WIDTH, FRAME_HEIGHT, playerWeapon);
    }

    private static TextureRegion loadTexture() throws InterruptedException, ExecutionException {
        Texture texture = new Texture(PLAYER_PATH);
        TextureRegion textureFrames = new TextureRegion(texture);
        return textureFrames;
    }

    public PlayerCharacter getPlayer() {
        return player;
    }

}
