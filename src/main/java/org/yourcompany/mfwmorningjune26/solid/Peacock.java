package org.yourcompany.mfwmorningjune26.solid;

import java.util.ArrayList;
import java.util.List;

import org.yourcompany.mfwmorningjune26.solid.common.SparrowPigeonFlyBehaviour;
import org.yourcompany.mfwmorningjune26.solid.common.SpecialFlyBehaviour;
import org.yourcompany.mfwmorningjune26.solid.interfaces.CommonFlyBehaviour;
import org.yourcompany.mfwmorningjune26.solid.interfaces.Dancer;
import org.yourcompany.mfwmorningjune26.solid.interfaces.Flyable;

public class Peacock extends Bird implements Flyable, Dancer {

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
