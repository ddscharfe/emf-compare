/*******************************************************************************
 * Copyright (c) 2014, 2018 Obeo and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *     Philip Langer - bug 514079
 *******************************************************************************/
package org.eclipse.emf.compare.ide.ui.internal.contentmergeviewer.label;

import org.eclipse.emf.compare.ide.ui.internal.EMFCompareIDEUIMessages;
import org.eclipse.emf.compare.ide.ui.internal.configuration.EMFCompareConfiguration;
import org.eclipse.swt.widgets.Composite;

/**
 * A {@link LabelContentViewer} in case of a comparison with no visible item.
 * 
 * @author <a href="mailto:axel.richard@obeo.fr">Axel Richard</a>
 */
public class NoVisibleItemContentViewer extends LabelContentViewer {

	/**
	 * Creates a new viewer and its controls.
	 * 
	 * @param parent
	 *            the parent of the control of this viewer.
	 */
	public NoVisibleItemContentViewer(Composite parent, EMFCompareConfiguration configuration) {
		super(parent, EMFCompareIDEUIMessages.getString("no.visible.item.viewer.title"), //$NON-NLS-1$
				EMFCompareIDEUIMessages.getString("no.visible.item.viewer.desc"), configuration); //$NON-NLS-1$
	}
}
