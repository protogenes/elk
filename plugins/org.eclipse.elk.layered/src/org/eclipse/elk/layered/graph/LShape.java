/*******************************************************************************
 * Copyright (c) 2011, 2015 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.layered.graph;

import org.eclipse.elk.core.math.KVector;

/**
 * Abstract superclass for {@link LGraphElement}s that can have a position and a size.
 * 
 * @author cds
 * @kieler.design proposed by msp
 * @kieler.rating yellow 2013-03-22 review KI-35 by chsch, grh
 */
public abstract class LShape extends LGraphElement {
    
    /** the serial version UID. */
    private static final long serialVersionUID = 5111245934175354687L;
    
    /** the current position of the element. */
    private final KVector pos = new KVector();
    /** the size of the element. */
    private final KVector size = new KVector();
    

    /**
     * Returns the element's current position. This is the coordinate of the element's upper
     * left corner. May be modified.
     * 
     * @return the position
     */
    public KVector getPosition() {
        return pos;
    }

    /**
     * Returns the element's current size. May be modified.
     * 
     * @return the size
     */
    public KVector getSize() {
        return size;
    }
    
}
