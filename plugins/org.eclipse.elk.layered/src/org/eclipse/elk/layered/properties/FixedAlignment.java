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
 * Layout option for the choice of candidates in the Brandes & Köpf node placement.
 *
 * @author jjc
 * @kieler.design proposed by cds
 * @kieler.rating proposed yellow by cds
 */
public enum FixedAlignment {
    
    /** Chooses the smallest layout from the four possible candidates. */
    NONE,
    /** Chooses the left-up candidate from the four possible candidates. */
    LEFTUP,
    /** Chooses the right-up candidate from the four possible candidates. */
    RIGHTUP,
    /** Chooses the left-down candidate from the four possible candidates. */
    LEFTDOWN,
    /** Chooses the right-down candidate from the four possible candidates. */
    RIGHTDOWN,
    /** Creates a balanced layout from the four possible candidates. */
    BALANCED;

}
