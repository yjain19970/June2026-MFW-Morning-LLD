package org.yourcompany.mfwmorningjune26.solid;

import java.util.ArrayList;
import java.util.List;

import org.yourcompany.mfwmorningjune26.solid.interfaces.CommonFlyBehaviour;
import org.yourcompany.mfwmorningjune26.solid.interfaces.Dancer;
import org.yourcompany.mfwmorningjune26.solid.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable, Dancer {

    public CommonFlyBehaviour behaviour;

    @Override
    public List<String> fly() {
       return behaviour.commonFly();
    }

    @Override
    public void dance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dance'");
    }

    
}


/**
 * 
 * Dependency Inversion
 * 
 * whenever two classes: A,B
 * and A depends on B
 * 
 * then, never depend on B directly...
 * 
 * 
 * 
 * Create an Interface -> implement that interface in B.
 * use that Interface in A.
 * 
 * 
 *          X
 *    B          C
 * 
 * 
 * 
 * A:
 *  (x)
 * 
 * 
 */