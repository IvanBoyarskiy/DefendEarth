package ru.samsung.gamestudio.components;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ProgressBarView extends View{
    Texture background;
    Texture progress;
    float width;
    float width_per_progress;
    float height;
    int progressCount;

    public ProgressBarView(int x, int y, float width, float height, int progressCount, String backgroundSrc, String progressSrc){
        super(x, y);
        background = new Texture(backgroundSrc);
        progress = new Texture(progressSrc);
        this.width = width;
        this.height = height;
        this.progressCount = progressCount;
        this.width_per_progress = width / 10;
    }

    public void plusProgress(){
        progressCount++;
    }
    public void nullProgress(){
        progressCount = 0;
    }
    public boolean isFull(){
        return progressCount == 10;
    }



    @Override
    public void draw(SpriteBatch batch) {
        batch.draw(background, x, y, width, height);
        batch.draw(progress, x, y, width_per_progress * progressCount, height);
    }

    @Override
    public void dispose() {
        background.dispose();
        progress.dispose();
    }

}
