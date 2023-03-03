package fr.wakestufou.tetris.models.Shapes;

import java.awt.Color;

public abstract class Shape {
    private Integer _rotation;
    private Integer _x;
    private Integer _y;
    private final Color _color;
    private Boolean[][][] _shape;

    public Shape(Color color, Integer x, Integer y, Boolean[][][] shapes) {
        this._rotation = 0;
        this._x = 0;
        this._y = 0;
        this._color = color;

        if (shapes.length == 4)
            for (int i = 0; i < 4; i++)
                if (shapes[i].length != 4)
                    throw new IllegalArgumentException("Shape must be 4x4");
                else
                    for (int j = 0; j < 4; j++)
                        if (shapes[i][j].length != 4)
                            throw new IllegalArgumentException("Shape must be 4x4");

        this._shape = shapes;
    }

    public Color getColor() {
        return this._color;
    }

    public void left() {
        if (this._rotation > 0)
            this._rotation--;
        else
            this._rotation = 3;
    }

    public void right() {
        if (this._rotation < 3)
            this._rotation++;
        else
            this._rotation = 0;
    }

    public Boolean[][][] getShape() {
        return this._shape;
    }

    public Integer getRotation() {
        return this._rotation;
    }

    public void moveRight() {
        this._x++;
    }

    public void moveLeft() {
        this._x--;
    }

    public Integer getX() {
        return this._x;
    }

    public Integer getY() {
        return this._y;
    }

    public Boolean[][] getShapeAccordingToRotation() {
        return this._shape[this._rotation];
    }

}
