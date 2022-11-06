import java.math.BigDecimal;

public class Rooms {
    private int roomNumber;
    private int numberOfBeds;
    private Boolean isBalcony;
    private Boolean isSeaView;
    private BigDecimal pricePerNight;

    ///region Access methods

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Boolean getBalcony() {
        return isBalcony;
    }

    public void setBalcony(Boolean balcony) {
        isBalcony = balcony;
    }

    public Boolean getSeaView() {
        return isSeaView;
    }

    public void setSeaView(Boolean seaView) {
        isSeaView = seaView;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
    ///endregion

    ///region Constructor

    public Rooms(int roomNumber, int numberOfBeds, Boolean isBalcony, Boolean isSeaView, BigDecimal pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isSeaView = isSeaView;
        this.pricePerNight = pricePerNight;
    }
    ///endregion
}
