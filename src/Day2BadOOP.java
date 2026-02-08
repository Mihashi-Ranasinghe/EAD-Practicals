public class Day2BadOOP {private String name;
        private String email;

        public Day2BadOOP(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public void saveToDatabase() {
            // Code to save customer data to the database
        }

        public void sendEmailNotification() {
            // Code to send email notification to the customer
        }
    }


    //This is a "Bad Code" because two things cannot exist in the same class.