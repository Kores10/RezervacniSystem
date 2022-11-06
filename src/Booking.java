import java.time.LocalDate;

public class Booking {
    private LocalDate startDate;
    private LocalDate endDate;
    private Rooms Pokoj;
    private Guests host;

    ///region Construktor
    public Booking(LocalDate startDate, LocalDate endDate, Rooms pokoj, Guests host) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.Pokoj = pokoj;
        this.host = host;
    }
    ///endregion

    ///region Access methods

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Rooms getPokoj() {
        return Pokoj;
    }

    public void setPokoj(Rooms pokoj) {
        Pokoj = pokoj;
    }

    public Guests getHost() {
        return host;
    }

    public void setHost(Guests host) {
        this.host = host;
    }


    ///endregion

}
