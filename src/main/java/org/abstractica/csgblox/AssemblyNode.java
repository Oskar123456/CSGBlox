package org.abstractica.csgblox;

import java.util.List;

public interface AssemblyNode extends Assembly
{
    List<Assembly> getChildren();
}
