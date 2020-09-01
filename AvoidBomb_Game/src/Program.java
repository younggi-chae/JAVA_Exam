
import processing.core.PApplet;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Program extends PApplet {


    public static void main(String[] args) {
        PApplet.main("Program");
    }

    private ArrayList<RenderObject> playRenderObject;
    private ArrayList<RenderObject> bombRenderObject;
    private Player player;


    @Override
    public void settings() {
        this.size(800, 600);
    }

    @Override
    public void setup() {
        ResourceManager.init(this);
        ResourceManager.allocImages("move", "src/images/bomberman-movement.png", 5, 4, 20, 32);
        ResourceManager.allocImages("stay", "src/images/bomberman-stay.png", 3, 4, 20, 32);
        ResourceManager.allocImages("effect", "src/images/bomberman-effect.png", 9, 5, 24, 24);
        playRenderObject = new ArrayList<>();
        bombRenderObject = new ArrayList<>();
        player = new Player(this);
        playRenderObject.add(player);
    }

    @Override
    public void keyPressed() {
        System.out.println(keyCode);
        switch (keyCode) {
            case 37:
                player.setMode(Player.WALK_LEFT);
                player.update();
                break;
            case 39:
                player.setMode(Player.WALK_RIGHT);
                player.update();
                break;
        }
    }


    @Override
    public void keyReleased() {
        switch (keyCode) {
            case 37:
                player.setMode(Player.STOP_CURRENT);
                player.update();
                break;
            case 39:
                player.setMode(Player.STOP_CURRENT);
                player.update();
                break;
        }
    }

    public void checkCollision(Player player,ArrayList<RenderObject> bombObjects ){
        for(int i=0;i<bombObjects.size();i++){
            Bomb b = (Bomb) bombObjects.get(i);
            if(((player.x)<=(b.x + 24)&&(player.x+20)>=(b.x)&&((player.y )<=(b.y+24)))){
                this.player.setMode(Player.PLAYER_KILL);
                JOptionPane.showMessageDialog(null, "게임종료");
				dispose();
                Waiting w = new Waiting();
				
            }
            if(b.y>600){
                bombObjects.remove(b);
            }
        }
    }

    int cnt=0;
    @Override
    public void draw() {
        background(00, 99, 66);

        cnt ++;
        if(cnt % 5 == 0) {
            Bomb bomb = new Bomb(this);
            bombRenderObject.add(bomb);
            checkCollision(player,bombRenderObject);
        }
        for(RenderObject r : playRenderObject)r.update();
        for(RenderObject r : playRenderObject)r.render();
        for(RenderObject b : bombRenderObject)b.update();
        for(RenderObject b : bombRenderObject)b.render();


    }
}
