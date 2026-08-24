package org.jboss.logging.tools.provisioning.descriptor;

import java.util.List;

/**
 * Decoded @Transform annotation on a parameter.
 * {@code types} maps to @Transform.value().
 */
public class TransformDescriptor {

    /** Raw transform-type names as strings (e.g. "GET_CLASS", "HASH_CODE"). */
    public final List<String> types;

    public TransformDescriptor(List<String> types) {
        this.types = List.copyOf(types);
    }

    @Override
    public String toString() {
        return "TransformDescriptor{types=" + types + '}';
    }
}
