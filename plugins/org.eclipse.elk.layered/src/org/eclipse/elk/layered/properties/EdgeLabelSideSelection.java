/*******************************************************************************
 * Copyright (c) 2012, 2015 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.layered.properties;

/**
 * Definition of edge label placement strategies. The chosen strategy determines on which side
 * of an edge labels are placed.
 *
 * @author jjc
 * @kieler.design proposed by cds
 * @kieler.rating proposed yellow by cds
 */
public enum EdgeLabelSideSelection {
    
    /** Labels are always placed above their edges. */
    ALWAYS_UP,
    /** Labels are always placed below their edges. */
    ALWAYS_DOWN,
    /** Labels are always placed above their edges, with respect to the edge's direction. */
    DIRECTION_UP,
    /** Labels are always placed below their edges, with respect to the edge's direction. */
    DIRECTION_DOWN,
    /** A heuristic is used to determine the side. */
    SMART;
    
}
