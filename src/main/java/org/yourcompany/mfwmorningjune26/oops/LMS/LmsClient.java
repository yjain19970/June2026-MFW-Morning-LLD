package org.yourcompany.mfwmorningjune26.oops.LMS;

public class LmsClient {
    public static void main(String[] args) {
        Member asha     = new Member("Asha", "asha@email.com");
        Librarian ravi  = new Librarian("Ravi", 
            "ravi@email.com", "EMP-007");
        


        
        asha.displayDashboard();
        ravi.displayDashboard(); // librarian.

        System.out.println("Member ID:    " + asha.getUserId());
        System.out.println("Librarian ID: " + ravi.getUserId());
        System.out.println("Total users:  " + User.getTotalUsers());
    
        System.out.println("\n Milestone-2 \n");
        Book novel  = new NovelBook("N-1", "Dune", "Frank Herbert", "Sci-Fi");

        novel.displayBookDetails();

        System.out.println("Available? " + novel.isAvailable());    // true
        System.out.println("Lend:      " + novel.lend(asha));       // true
        System.out.println("Available? " + novel.isAvailable());    // false
        System.out.println("Lend again:" + novel.lend(asha));       // false    
    }
}
