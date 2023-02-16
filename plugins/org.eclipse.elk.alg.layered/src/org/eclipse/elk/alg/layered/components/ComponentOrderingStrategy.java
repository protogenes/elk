/*******************************************************************************
 * Copyright (c) 2022 Kiel University and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0 
 *******************************************************************************/
package org.eclipse.elk.alg.layered.components;

/**
 * Strategy to order components by model order.
 */
public enum ComponentOrderingStrategy {
    /**
     * Components are ordered by priority or size.
     */
    NONE,
    /**
     * Components are ordered only inside their port groups by their minimal node model order
     * to prevent ONO alignment cases.
     */
    INSIDE_PORT_SIDE_GROUPS,
    /**
     * Components are ordered by their minimal node model order. Compaction destroys the ordering.
     */
    GROUP_MODEL_ORDER,
    /**
     * Does not use component groups but just places components to create rows of components without subrows.
     */
    MODEL_ORDER;

}
