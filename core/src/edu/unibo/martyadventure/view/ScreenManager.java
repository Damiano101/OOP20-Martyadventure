package edu.unibo.martyadventure.view;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

public class ScreenManager {

    public static class VIEWPORT {
        public static int X_VIEWPORT = 20;
        public static int Y_VIEWPORT = 15;
    }

    private static MovementGameScreen movementScreen;

    private ScreenManager() {

    }

    public static void changeMap(MapManager.Maps map) {
        movementScreen = new MovementGameScreen(map);
    }

    public static void loadMovementScreen() {
        loadScreen(movementScreen);
    }

    public static void loadCombatScreen(CombatGameScreen screen) {
        loadScreen(screen);
    }

    private static void loadScreen(Screen s) {
        Game game = (Game) Gdx.app.getApplicationListener();
        game.setScreen(s);
    }

}
