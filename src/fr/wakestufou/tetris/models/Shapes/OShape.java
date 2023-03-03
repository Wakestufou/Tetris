package fr.wakestufou.tetris.models.Shapes;

import java.awt.Color;

public class OShape extends Shape {

    public OShape(Integer x, Integer y) {
        super(Color.YELLOW,x ,y, new Boolean[][][] {
            {
                {false, false, false, false},
                {false, true, true, false},
                {false, true, true, false},
                {false, false, false, false}
            },
            {
                {false, false, false, false},
                {false, true, true, false},
                {false, true, true, false},
                {false, false, false, false}
            },
            {
                {false, false, false, false},
                {false, true, true, false},
                {false, true, true, false},
                {false, false, false, false}
            },
            {
                {false, false, false, false},
                {false, true, true, false},
                {false, true, true, false},
                {false, false, false, false}
            }
        });
    }    
}
