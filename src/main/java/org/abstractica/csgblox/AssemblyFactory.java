package org.abstractica.csgblox;

import org.abstractica.javacsg.Color;

public interface AssemblyFactory
{
    AssemblyPart createPart(Color color, Part part);
    AssemblyNodeBuilder getNodeBuilder();
}
