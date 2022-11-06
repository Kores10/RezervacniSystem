import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Guests prvniHost = new Guests("Josef","Novak", LocalDate.of(1964,02,15));
        Guests druhyHost = new Guests("Adéla","Malíková",LocalDate.of(1993,3,13));
        Guests tretiHost = new Guests("Jana","Dvořáčková",LocalDate.of(1995,5,5));

        Rooms prvniPokoj = new Rooms(123,2,true,false, BigDecimal.valueOf(2000));
        Rooms druhyPokoj = new Rooms(1,1,true,true,BigDecimal.valueOf(1000));
        Rooms tretiPokoj = new Rooms(2,1,true,true,BigDecimal.valueOf(1000));
        Rooms ctvrtyPokoj = new Rooms(3,3,false,true,BigDecimal.valueOf(2400));

        Booking prvniRezervace = new Booking(LocalDate.of(2022,10,31),LocalDate.of(2022,11,11),prvniPokoj,prvniHost);
        Booking druhaRezervace = new Booking(LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),druhyPokoj,druhyHost);
        Booking tretiRezervace = new Booking(LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),ctvrtyPokoj,druhyHost);
        Booking ctvrtaRezervace = new Booking(LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),ctvrtyPokoj,tretiHost);


        ArrayList<Booking>SeznamRezervaci = new ArrayList<>();

        SeznamRezervaci.add(prvniRezervace);
        SeznamRezervaci.add(druhaRezervace);
        SeznamRezervaci.add(tretiRezervace);
        SeznamRezervaci.add(ctvrtaRezervace);

        for (Booking rezervace : SeznamRezervaci){
            System.out.println(rezervace.getHost().getFirstName() +
                    " " +rezervace.getHost().getLastName() +
                    ", datum narození :" +rezervace.getHost().getDateOfBorn() +
                    " Rezervace Pokoj číslo: " +rezervace.getPokoj().getRoomNumber() +
                    " v termínu od :" +rezervace.getStartDate() +
                    " do: " +rezervace.getEndDate()
            );
        }


    }
}
