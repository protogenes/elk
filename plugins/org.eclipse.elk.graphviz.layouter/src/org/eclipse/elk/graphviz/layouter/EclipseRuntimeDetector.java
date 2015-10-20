/*******************************************************************************
 * Copyright (c) 2015 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.graphviz.layouter;

import org.eclipse.core.runtime.Platform;

/**
 * Provides a way to check if the Eclipse platform is running or not.
 * 
 * <p>The single static method of this class might find a more suitable home in
 * {@link GraphvizLayouterPlugin}. However, at this point we are not sure if that class can be loaded if
 * the platform is not running.</p>
 * 
 * @author Jan Koehnlein
 */
final class EclipseRuntimeDetector {
    
    /**
     * Private constructor to prevent instantiation.
     */
    private EclipseRuntimeDetector() {
        // Not intended to be instantiated
    }
    
    /**
     * Checks if the Eclipse platform is running or not. This is basically equivalent to calling
     * {@code Platform.isRunning()}, but doesn't depend on the 
     * 
     * @return {@code true} if Eclipse is running, {@code false} otherwise.
     */
    static boolean isEclipseRunning() {
        try {
            return Platform.isRunning();
        } catch (Throwable exc) {
            // assume Eclipse is not running
            return false;
        }
    }
    
}
