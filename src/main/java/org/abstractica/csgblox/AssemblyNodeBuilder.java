package org.abstractica.csgblox;

import org.abstractica.javacsg.Transform3D;

public interface AssemblyNodeBuilder
{
    AssemblyNodeBuilder addChild(Transform3D transform, Assembly child);
    AssemblyNode build();
}
