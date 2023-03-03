package fr.wakestufou.tetris.models.Shapes;

import java.awt.Color;

public class IShape extends Shape {

    public IShape(Integer x, Integer y) {
        super(Color.CYAN, x, y, new Boolean[][][] {
            {
                {true, true, true, true},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
            },
            {
                {false, false, true, false},
                {false, false, true, false},
                {false, false, true, false},
                {false, false, true, false}
            },
            {
                {false, false, false, false},
                {false, false, false, false},
                {true, true, true, true},
                {false, false, false, false}
            },
            {
                {false, true, false, false},
                {false, true, false, false},
                {false, true, false, false},
                {false, true, false, false}
            }
        });
    }    
}
