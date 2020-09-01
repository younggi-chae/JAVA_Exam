import processing.core.PApplet;

public class Bomb extends RenderObject {

    public static final int BOMB = 1;

    private float vellocity = 0;
    private float accel = 0.3f;

    Bomb(PApplet p) {
        super(p);
        this.allocMode(BOMB, "effect", new int[]{0, 1, 2}); 
        this.setMode(BOMB);
        x = (int) (Math.random() * 800);
    }

    @Override
    public void update() {
        if (this.mode == BOMB) {
            this.vellocity += this.accel;
        }
        if (Math.abs(this.vellocity) > 10) {
            if (this.vellocity > 50) this.vellocity+=this.accel;
        }
        this.y += vellocity;
    }
}
