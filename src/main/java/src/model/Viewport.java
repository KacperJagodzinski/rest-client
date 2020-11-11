
package src.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import src.model.Southwest;

public class Viewport {

    @SerializedName("northeast")
    @Expose
    private com.example.Northeast northeast;
    @SerializedName("southwest")
    @Expose
    private Southwest southwest;

    public com.example.Northeast getNortheast() {
        return northeast;
    }

    public void setNortheast(com.example.Northeast northeast) {
        this.northeast = northeast;
    }

    public Southwest getSouthwest() {
        return southwest;
    }

    public void setSouthwest(Southwest southwest) {
        this.southwest = southwest;
    }

    @Override
    public String toString() {
        return "Viewport{" +
                "northeast=" + northeast +
                ", southwest=" + southwest +
                '}';
    }
}
