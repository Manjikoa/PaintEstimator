package edu.orangecoastcollege.cs273.arasmussen1.paintestimator;

/**
 * Created by Arasmussen1 on 9/19/2017.
 */

public class InteriorRoom {
    public static final float DOOR_AREA = 21f;
    public static final float WINDOW_AREA = 16f;
    public static final float SQ_FEET_PER_GALLON = 100f;

    private int mDoors;
    private int mWindows;

    private float mLength;
    private float mWidth;
    private float mHeight;

    public int getWindows() {
        return mWindows;
    }

    public void setWindows(int mWindows) {
        this.mWindows = mWindows;
    }

    public float getLength() {
        return mLength;
    }

    public void setLength(float mLength) {
        this.mLength = mLength;
    }

    public float getWidth() {
        return mWidth;
    }

    public void setWidth(float mWidth) {
        this.mWidth = mWidth;
    }

    public float getHeight() {
        return mHeight;
    }

    public void setHeight(float mHeight) {
        this.mHeight = mHeight;
    }



    public int getDoors() {
        return mDoors;
    }

    public void setDoors(int mDoors) {
        this.mDoors = mDoors;
    }

    public float DoorandWindowArea(){
        return mDoors*DOOR_AREA+mWindows+WINDOW_AREA;
    }
    public float wallSurfaceArea(){

        return (2*mLength * mHeight +2* mLength * mHeight * mWidth);
    }

    public float gallonsOFPaintRequired(){
        return totalSurfaceArea()/SQ_FEET_PER_GALLON;
    }
}
