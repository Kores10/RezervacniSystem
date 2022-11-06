import java.time.LocalDate;


    public class Guests {
        private String firstName;
        private String lastName;
        private LocalDate dateOfBorn;

        ///region Access methods

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public LocalDate getDateOfBorn() {

            return dateOfBorn;
        }

        public void setDateOfBorn(LocalDate dateOfBorn) {
            this.dateOfBorn = dateOfBorn;
        }
        ///endregion

        ///region Construktor

        public Guests(String firstName, String lastName, LocalDate dateOfBorn) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateOfBorn = dateOfBorn;
        }
        ///endregion
    }
