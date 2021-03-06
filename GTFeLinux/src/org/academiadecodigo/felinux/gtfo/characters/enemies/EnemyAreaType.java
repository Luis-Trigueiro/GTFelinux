package org.academiadecodigo.felinux.gtfo.characters.enemies;

import org.academiadecodigo.felinux.gtfo.field.Area;

public enum EnemyAreaType {

    //Limites de algures
    COW_BOSS(141,155,1243,270),

    //Limites da estrada
    COP_CAR(0,0,0,0);

    private Area area;

    EnemyAreaType(int xMin, int yMin, int xMax, int yMax){
        area = new Area(xMin,yMin,xMax,yMax);
    }

    public Area getArea() {
        return area;
    }
}
