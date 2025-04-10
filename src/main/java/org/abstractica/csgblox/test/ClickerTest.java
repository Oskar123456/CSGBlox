package org.abstractica.csgblox.test;

import org.abstractica.clicksystem.ClickSystem;
import org.abstractica.clicksystem.ClickSystemFactory;
import org.abstractica.csgblox.Part;
import org.abstractica.csgblox.PartFactory;
import org.abstractica.csgblox.impl.PartFactoryImpl;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class ClickerTest
{
    public static void main(String[] args)
    {
        JavaCSG csg = JavaCSGFactory.createDefault();
        ClickSystem cs = ClickSystemFactory.system_12_8_6_medium(csg);
        PartFactory factory = new PartFactoryImpl(cs);
        Part clicker = factory.getDoubleClicker(0.5, 0.5);
        csg.view(clicker.getViewGeometry());
    }
}
