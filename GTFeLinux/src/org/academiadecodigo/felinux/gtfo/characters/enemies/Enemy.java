package org.academiadecodigo.felinux.gtfo.characters.enemies;

import org.academiadecodigo.felinux.gtfo.characters.Moveable;
import org.academiadecodigo.felinux.gtfo.field.Field;
import org.academiadecodigo.simplegraphics.pictures.Picture;



public abstract class Enemy implements Moveable {

    private int speed;
    private Field enemyField;
    private boolean isDead;
    private Picture enemyPosition;

    public Enemy(Field enemyField){
        this.enemyField = enemyField;
    }

    public boolean isKill() {
        return this.isDead;
    }

    public Picture getPosition() {
        return this.enemyPosition;
    }

    public Field getEnemyField() {
        return enemyField;
    }

    public void move(){
    }

    @Override
    public void moveLeft() {
        if(this.enemyField.getPadding()  >= enemyPosition.getX()){
            return;
        }
        enemyPosition.translate(-enemyField.getCellSize(),0);
    }

    @Override
    public void moveRight() {
        if(this.enemyField.getSizeCol() <= enemyPosition.getMaxX() - this.enemyField.getPadding()){
            return;
        }
        enemyPosition.translate(enemyField.getCellSize(),0);
    }

    @Override
    public void moveUp() {
        if(this.enemyField.getPadding() >= enemyPosition.getY()){
            return;
        }
        enemyPosition.translate(0,-enemyField.getCellSize());
    }

    @Override
    public void moveDown() {
        if(this.enemyField.getSizeRow() <= enemyPosition.getMaxY() - this.enemyField.getPadding()){
            return;
        }
        enemyPosition.translate(0,enemyField.getCellSize());
    }
}