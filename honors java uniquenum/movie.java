public class movie {

    public static void seeMovie(double ticketCost, int rating) {
        if (ticketCost < 5.00) {
            System.out.println("very interested");
        } else if (ticketCost >= 12.00) {
            if (rating == 5) {
                System.out.println("sort-of interested");
            } else {
                System.out.println("not interested");
            }
        } else if (rating == 5) {
            System.out.println("very interested");
        } else if (rating >= 2 && rating <= 4) {
            System.out.println("sort-of interested");
        } else {
            System.out.println("not interested");
        }
    }
    public static void main(String[] args) {
        seeMovie(4.99, 3); 
        seeMovie(12.00, 5); 
        seeMovie(10.00, 4);
        seeMovie(8.00, 1); 
        seeMovie(13.00, 3);
    }
}