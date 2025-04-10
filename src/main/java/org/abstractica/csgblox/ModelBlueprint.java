package org.abstractica.csgblox;

import org.abstractica.javacsg.Geometry3D;

import java.util.List;

public interface ModelBlueprint
{
    String getName();
    List<String> getColorGroups();
    Geometry3D getViewGeometry();
    Assembly getAssembly();
}
