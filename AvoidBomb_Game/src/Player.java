import processing.core.PApplet;

public class Player extends RenderObject {

    public static final int WALK_LEFT = 1;
    public static final int WALK_RIGHT = 2;
    public static final int STOP_LEFT = 11;
    public static final int STOP_RIGHT = 12;
    public static final int STOP_CURRENT = 13;
    public static final int PLAYER_KILL = 4;

    private float velocity = 0;
    private float accel = 1.12f;

    Player(PApplet p) {
        super(p);
        allocMode(WALK_LEFT, "move", new int[]{15, 16, 17, 18, 19});
        allocMode(WALK_RIGHT, "move", new int[]{5, 6, 7, 8, 9});
        allocMode(STOP_LEFT, "stay", new int[]{9, 10, 11});
        allocMode(STOP_RIGHT, "stay", new int[]{3, 4, 5});
        allocMode(STOP_CURRENT, "stay", new int[]{0, 1, 2});
        allocMode(PLAYER_KILL, "effect", new int[]{3});
        setMode(STOP_CURRENT);
        y = 555;
    }

    @Override
    public void setMode(int mode) {
        super.setMode(mode);
    }

    @Override
    public void update() {
        if (x > 780) {
            x = 780;
        } else if (x < 0) {
            x = 0;
        }
        if (this.mode == WALK_RIGHT) {
            this.velocity += this.accel;
        } else if (this.mode == WALK_LEFT) {
            this.velocity -= this.accel;
        } else {
            if (this.velocity > this.accel) this.velocity -= this.accel;
            else if (this.velocity < -this.accel) this.velocity += this.accel;
            else this.velocity = 0;
        }
        if (Math.abs(this.velocity) > 8) {
            if (this.velocity > 0) {
                this.velocity = 8;
            } else this.velocity = -8;
        }

        this.x += velocity;
    }

}
