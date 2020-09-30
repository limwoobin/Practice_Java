package java8.lambda.ex1;

public class Product {
    private String mName;
    private int mPrice;
    private boolean mIsFood;
    private String mMadeBy;
    private String mStore;

    public Product(String mName, int mPrice, boolean mIsFood, String mMadeBy, String mStore) {
        this.mName = mName;
        this.mPrice = mPrice;
        this.mIsFood = mIsFood;
        this.mMadeBy = mMadeBy;
        this.mStore = mStore;
    }

    public String getmName() {
        return mName;
    }

    public int getmPrice() {
        return mPrice;
    }

    public boolean ismIsFood() {
        return mIsFood;
    }

    public String getmMadeBy() {
        return mMadeBy;
    }

    public String getmStore() {
        return mStore;
    }
}
