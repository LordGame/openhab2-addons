/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.russound.internal.rio.source;

/**
 * Configuration class for the {@link RioSourceHandler}
 *
 * @author Tim Roberts
 */
public class RioSourceConfig {
    /**
     * Constant defined for the "source" configuration field
     */
    public static final String Source = "source";

    /**
     * ID of the source
     */
    private int source;

    /**
     * Gets the source identifier
     *
     * @return the source identifier
     */
    public int getSource() {
        return source;
    }

    /**
     * Sets the source identifier
     *
     * @param source the source identifier
     */
    public void setSource(int source) {
        this.source = source;
    }
}
