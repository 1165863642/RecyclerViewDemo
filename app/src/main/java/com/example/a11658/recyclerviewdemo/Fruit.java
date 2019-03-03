package com.example.a11658.recyclerviewdemo;

/**
 * @author Qiang
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
class Fruit {
    /**
     */
    private int mImageId;
    private String mName;

    public Fruit(int mImageId, String mName) {
        this.mImageId = mImageId;
        this.mName = mName;
    }

    public int getImageId() {
        return mImageId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }
}
