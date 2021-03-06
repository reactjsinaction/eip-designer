/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.EIPModel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Route;

import com.github.lbroudoux.dsl.eip.ServiceRef;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EIP Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.EIPModelImpl#getOwnedRoutes <em>Owned Routes</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.EIPModelImpl#getOwnedServiceRefs <em>Owned Service Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EIPModelImpl extends MinimalEObjectImpl.Container implements EIPModel {
	/**
    * The cached value of the '{@link #getOwnedRoutes() <em>Owned Routes</em>}' containment reference list.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getOwnedRoutes()
    * @generated
    * @ordered
    */
	protected EList<Route> ownedRoutes;

	/**
    * The cached value of the '{@link #getOwnedServiceRefs() <em>Owned Service Refs</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOwnedServiceRefs()
    * @generated
    * @ordered
    */
   protected EList<ServiceRef> ownedServiceRefs;

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected EIPModelImpl() {
      super();
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	protected EClass eStaticClass() {
      return EipPackage.Literals.EIP_MODEL;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EList<Route> getOwnedRoutes() {
      if (ownedRoutes == null) {
         ownedRoutes = new EObjectContainmentEList<Route>(Route.class, this, EipPackage.EIP_MODEL__OWNED_ROUTES);
      }
      return ownedRoutes;
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ServiceRef> getOwnedServiceRefs() {
      if (ownedServiceRefs == null) {
         ownedServiceRefs = new EObjectContainmentEList<ServiceRef>(ServiceRef.class, this, EipPackage.EIP_MODEL__OWNED_SERVICE_REFS);
      }
      return ownedServiceRefs;
   }

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case EipPackage.EIP_MODEL__OWNED_ROUTES:
            return ((InternalEList<?>)getOwnedRoutes()).basicRemove(otherEnd, msgs);
         case EipPackage.EIP_MODEL__OWNED_SERVICE_REFS:
            return ((InternalEList<?>)getOwnedServiceRefs()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case EipPackage.EIP_MODEL__OWNED_ROUTES:
            return getOwnedRoutes();
         case EipPackage.EIP_MODEL__OWNED_SERVICE_REFS:
            return getOwnedServiceRefs();
      }
      return super.eGet(featureID, resolve, coreType);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case EipPackage.EIP_MODEL__OWNED_ROUTES:
            getOwnedRoutes().clear();
            getOwnedRoutes().addAll((Collection<? extends Route>)newValue);
            return;
         case EipPackage.EIP_MODEL__OWNED_SERVICE_REFS:
            getOwnedServiceRefs().clear();
            getOwnedServiceRefs().addAll((Collection<? extends ServiceRef>)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public void eUnset(int featureID) {
      switch (featureID) {
         case EipPackage.EIP_MODEL__OWNED_ROUTES:
            getOwnedRoutes().clear();
            return;
         case EipPackage.EIP_MODEL__OWNED_SERVICE_REFS:
            getOwnedServiceRefs().clear();
            return;
      }
      super.eUnset(featureID);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public boolean eIsSet(int featureID) {
      switch (featureID) {
         case EipPackage.EIP_MODEL__OWNED_ROUTES:
            return ownedRoutes != null && !ownedRoutes.isEmpty();
         case EipPackage.EIP_MODEL__OWNED_SERVICE_REFS:
            return ownedServiceRefs != null && !ownedServiceRefs.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //EIPModelImpl
