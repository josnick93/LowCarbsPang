package com.josnick.lowcarbs.DataEnum;

import com.josnick.lowcarbs.Screen.AbstractScreen;
import com.josnick.lowcarbs.Screen.GameScreen;
import com.josnick.lowcarbs.Screen.LevelSelectScreen;
import com.josnick.lowcarbs.Screen.MainMenuScreen;

public enum ScreenEnum {

    MAIN_MENU {
        public AbstractScreen getScreen(Object... params) {
            return new MainMenuScreen();
        }
    },
    LEVEL_SELECT {
        public AbstractScreen getScreen(Object... params) {
            return new LevelSelectScreen();
        }
    },
    GAME {
        public AbstractScreen getScreen(Object... params) {
            return new GameScreen((Integer) params[0]);
        }
    };

    public abstract AbstractScreen getScreen(Object... params);
}
