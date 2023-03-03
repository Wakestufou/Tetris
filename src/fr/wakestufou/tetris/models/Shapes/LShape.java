package fr.wakestufou.tetris.models.Shapes;

import java.awt.Color;

public class LShape extends Shape {

    public LShape(Integer x, Integer y) {
        super(Color.ORANGE, x, y, new Boolean[][][] {
            {
                {false, false, false, false},
                {false, true, true, true},
                {false, true, false, false},
                {false, false, false, false}
            },
            {
                {false, true, true, false},
                {false, false, true, false},
                {false, false, true, false},
                {false, false, false, false}
            },
            {
                {false, false, false, false},
                {false, false, false, true},
                {false, true, true, true},
                {false, false, false, false}
            },
            {
                {false, false, false, false},
                {false, false, true, false},
                {false, false, true, false},
                {false, false, true, true}
            }
        });
    }
    
}
