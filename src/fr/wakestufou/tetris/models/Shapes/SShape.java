package fr.wakestufou.tetris.models.Shapes;

import java.awt.Color;

public class SShape extends Shape {

    public SShape(Integer x, Integer y) {
        super(Color.GREEN, x, y, new Boolean[][][] {
            {
                {false, false, false, false},
                {false, false, true, true},
                {false, true, true, false},
                {false, false, false, false}
            },
            {
                {false, false, false, false},
                {false, false, true, false},
                {false, false, true, true},
                {false, false, false, true}
            },
            {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, true, true},
                {false, true, true, false}
            },
            {
                {false, true, false, false},
                {false, true, true, false},
                {false, false, true, false},
                {false, false, false, false}
            }
        });
    }
    
}
