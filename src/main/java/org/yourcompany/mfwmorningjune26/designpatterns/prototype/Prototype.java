package org.yourcompany.mfwmorningjune26.designpatterns.prototype;

public interface Prototype<T> {
    /**
     * 
     * method responsible for creating copy objects.
     * @return
     */
    T createCopy();
}
