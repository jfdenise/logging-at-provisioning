package org.jboss.logging.tools.provisioning.descriptor;

/**
 * Decoded @Pos annotation on a parameter.
 */
public class PosDescriptor {

    /** @Pos.value() — 1-based format argument positions. */
    public final int[] positions;

    /** @Pos.transform() — parallel array of optional transforms per position. May be empty. */
    public final TransformDescriptor[] transforms;

    public PosDescriptor(int[] positions, TransformDescriptor[] transforms) {
        this.positions = positions.clone();
        this.transforms = transforms.clone();
    }

    @Override
    public String toString() {
        return "PosDescriptor{positions=" + java.util.Arrays.toString(positions) + '}';
    }
}
