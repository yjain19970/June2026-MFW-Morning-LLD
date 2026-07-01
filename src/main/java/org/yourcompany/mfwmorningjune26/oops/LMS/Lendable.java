package org.yourcompany.mfwmorningjune26.oops.LMS;

// all the items which can be loaned, needs
// to implement this interface.
// currently only done for Books. 
interface Lendable {
    public boolean lend(User user);
    public void returnItem(User user);
    
    public boolean isAvailable();
}
