/**
 * Copyright (c) 2010, 2011 Technical University of Denmark.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors:
 *    Patrick Koenemann, DTU Informatics - initial API and implementation
 *
 * $Id: MPatchItemProviderAdapterFactory.java,v 1.1 2010/09/10 15:28:06 cbrun Exp $
 */
package org.eclipse.emf.compare.mpatch.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.compare.mpatch.util.MPatchAdapterFactory;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MPatchItemProviderAdapterFactory extends MPatchAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010, 2011 Technical University of Denmark.\r\nAll rights reserved. This program and the accompanying materials \r\nare made available under the terms of the Eclipse Public License v1.0 \r\nwhich accompanies this distribution, and is available at \r\nhttp://www.eclipse.org/legal/epl-v10.html \r\n\r\nContributors:\r\n   Patrick Koenemann, DTU Informatics - initial API and implementation";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPatchItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.MPatchModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPatchModelItemProvider mPatchModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.MPatchModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMPatchModelAdapter() {
		if (mPatchModelItemProvider == null) {
			mPatchModelItemProvider = new MPatchModelItemProvider(this);
		}

		return mPatchModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.ChangeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeGroupItemProvider changeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.ChangeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChangeGroupAdapter() {
		if (changeGroupItemProvider == null) {
			changeGroupItemProvider = new ChangeGroupItemProvider(this);
		}

		return changeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.IndepAddElementChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndepAddElementChangeItemProvider indepAddElementChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.IndepAddElementChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndepAddElementChangeAdapter() {
		if (indepAddElementChangeItemProvider == null) {
			indepAddElementChangeItemProvider = new IndepAddElementChangeItemProvider(this);
		}

		return indepAddElementChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.IndepRemoveElementChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndepRemoveElementChangeItemProvider indepRemoveElementChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.IndepRemoveElementChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndepRemoveElementChangeAdapter() {
		if (indepRemoveElementChangeItemProvider == null) {
			indepRemoveElementChangeItemProvider = new IndepRemoveElementChangeItemProvider(this);
		}

		return indepRemoveElementChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.IndepMoveElementChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndepMoveElementChangeItemProvider indepMoveElementChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.IndepMoveElementChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndepMoveElementChangeAdapter() {
		if (indepMoveElementChangeItemProvider == null) {
			indepMoveElementChangeItemProvider = new IndepMoveElementChangeItemProvider(this);
		}

		return indepMoveElementChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.IndepAddAttributeChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndepAddAttributeChangeItemProvider indepAddAttributeChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.IndepAddAttributeChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndepAddAttributeChangeAdapter() {
		if (indepAddAttributeChangeItemProvider == null) {
			indepAddAttributeChangeItemProvider = new IndepAddAttributeChangeItemProvider(this);
		}

		return indepAddAttributeChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.IndepRemoveAttributeChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndepRemoveAttributeChangeItemProvider indepRemoveAttributeChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.IndepRemoveAttributeChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndepRemoveAttributeChangeAdapter() {
		if (indepRemoveAttributeChangeItemProvider == null) {
			indepRemoveAttributeChangeItemProvider = new IndepRemoveAttributeChangeItemProvider(this);
		}

		return indepRemoveAttributeChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.IndepUpdateAttributeChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndepUpdateAttributeChangeItemProvider indepUpdateAttributeChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.IndepUpdateAttributeChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndepUpdateAttributeChangeAdapter() {
		if (indepUpdateAttributeChangeItemProvider == null) {
			indepUpdateAttributeChangeItemProvider = new IndepUpdateAttributeChangeItemProvider(this);
		}

		return indepUpdateAttributeChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.IndepAddReferenceChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndepAddReferenceChangeItemProvider indepAddReferenceChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.IndepAddReferenceChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndepAddReferenceChangeAdapter() {
		if (indepAddReferenceChangeItemProvider == null) {
			indepAddReferenceChangeItemProvider = new IndepAddReferenceChangeItemProvider(this);
		}

		return indepAddReferenceChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.IndepRemoveReferenceChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndepRemoveReferenceChangeItemProvider indepRemoveReferenceChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.IndepRemoveReferenceChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndepRemoveReferenceChangeAdapter() {
		if (indepRemoveReferenceChangeItemProvider == null) {
			indepRemoveReferenceChangeItemProvider = new IndepRemoveReferenceChangeItemProvider(this);
		}

		return indepRemoveReferenceChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.IndepUpdateReferenceChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndepUpdateReferenceChangeItemProvider indepUpdateReferenceChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.IndepUpdateReferenceChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndepUpdateReferenceChangeAdapter() {
		if (indepUpdateReferenceChangeItemProvider == null) {
			indepUpdateReferenceChangeItemProvider = new IndepUpdateReferenceChangeItemProvider(this);
		}

		return indepUpdateReferenceChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementReferenceToEObjectMapItemProvider elementReferenceToEObjectMapItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementReferenceToEObjectMapAdapter() {
		if (elementReferenceToEObjectMapItemProvider == null) {
			elementReferenceToEObjectMapItemProvider = new ElementReferenceToEObjectMapItemProvider(this);
		}

		return elementReferenceToEObjectMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectToIModelDescriptorMapItemProvider eObjectToIModelDescriptorMapItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEObjectToIModelDescriptorMapAdapter() {
		if (eObjectToIModelDescriptorMapItemProvider == null) {
			eObjectToIModelDescriptorMapItemProvider = new EObjectToIModelDescriptorMapItemProvider(this);
		}

		return eObjectToIModelDescriptorMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.UnknownChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnknownChangeItemProvider unknownChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.UnknownChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnknownChangeAdapter() {
		if (unknownChangeItemProvider == null) {
			unknownChangeItemProvider = new UnknownChangeItemProvider(this);
		}

		return unknownChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.compare.mpatch.ModelDescriptorReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelDescriptorReferenceItemProvider modelDescriptorReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.compare.mpatch.ModelDescriptorReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelDescriptorReferenceAdapter() {
		if (modelDescriptorReferenceItemProvider == null) {
			modelDescriptorReferenceItemProvider = new ModelDescriptorReferenceItemProvider(this);
		}

		return modelDescriptorReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (mPatchModelItemProvider != null) mPatchModelItemProvider.dispose();
		if (changeGroupItemProvider != null) changeGroupItemProvider.dispose();
		if (indepAddElementChangeItemProvider != null) indepAddElementChangeItemProvider.dispose();
		if (indepRemoveElementChangeItemProvider != null) indepRemoveElementChangeItemProvider.dispose();
		if (indepMoveElementChangeItemProvider != null) indepMoveElementChangeItemProvider.dispose();
		if (indepAddAttributeChangeItemProvider != null) indepAddAttributeChangeItemProvider.dispose();
		if (indepRemoveAttributeChangeItemProvider != null) indepRemoveAttributeChangeItemProvider.dispose();
		if (indepUpdateAttributeChangeItemProvider != null) indepUpdateAttributeChangeItemProvider.dispose();
		if (indepAddReferenceChangeItemProvider != null) indepAddReferenceChangeItemProvider.dispose();
		if (indepRemoveReferenceChangeItemProvider != null) indepRemoveReferenceChangeItemProvider.dispose();
		if (indepUpdateReferenceChangeItemProvider != null) indepUpdateReferenceChangeItemProvider.dispose();
		if (elementReferenceToEObjectMapItemProvider != null) elementReferenceToEObjectMapItemProvider.dispose();
		if (eObjectToIModelDescriptorMapItemProvider != null) eObjectToIModelDescriptorMapItemProvider.dispose();
		if (unknownChangeItemProvider != null) unknownChangeItemProvider.dispose();
		if (modelDescriptorReferenceItemProvider != null) modelDescriptorReferenceItemProvider.dispose();
	}

}
