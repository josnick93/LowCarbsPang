package com.josnick.lowcarbs;

import com.badlogic.gdx.Game;
import com.josnick.lowcarbs.DataEnum.ScreenEnum;
import com.josnick.lowcarbs.managers.ScreenManager;


/*
public class MyGdxGame extends ApplicationAdapter {


	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}

*/

public class MyGdxGame extends Game {

	@Override
	public void create () {
		ScreenManager.getInstance().initialize(this);
		ScreenManager.getInstance().showScreen( ScreenEnum.MAIN_MENU );
	}
}
