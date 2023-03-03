package fr.wakestufou.tetris.models.Shapes;

import java.awt.Color;

public class TShape extends Shape {

    public TShape(Integer x, Integer y) {
        super(Color.RED, x, y, new Boolean[][][] {
            {
                {false, false, false, false},
                {false, true, true, true},
                {false, false, true, false},
                {false, false, false, false}
            },
            {
                {false, false, true, false},
                {false, false, true, true},
                {false, false, true, false},
                {false, false, false, false}
            },
            {
                {false, false, false, false},
                {false, false, true, false},
                {false, true, true, true},
                {false, false, false, false}
            },
            {
                {false, false, false, false},
                {false, false, true, false},
                {false, true, true, false},
                {false, false, true, false}
            }
        });
    }
    
}
