/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.model.api;

import java.util.Collections;
import java.util.List;

import org.eclipse.birt.report.model.api.activity.SemanticException;
import org.eclipse.birt.report.model.core.DesignElement;
import org.eclipse.birt.report.model.core.Module;
import org.eclipse.birt.report.model.elements.interfaces.IDynamicFilterParameterModel;

/**
 * 
 * Represents the dynamic filter parameter types.
 * 
 * @see org.eclipse.birt.report.model.elements.DynamicFilterParameter
 */

public class DynamicFilterParameterHandle extends AbstractScalarParameterHandle
		implements
			IDynamicFilterParameterModel
{

	/**
	 * Constructs a handle for the DynamicFilterParameter with the given design
	 * and the parameter.
	 * 
	 * @param module
	 *            the module
	 * @param element
	 *            the model representation of the element
	 */

	public DynamicFilterParameterHandle( Module module, DesignElement element )
	{
		super( module, element );
	}

	/**
	 * Sets the display type for this parameter. The display type controls
	 * whether it is a simple filter or advanced filter. Types are defined in
	 * <code>DesignChoiceConstants</code> can be one of the followings:
	 * <ul>
	 * <li><code>DYNAMIC_FILTER_SIMPLE</code>
	 * <li><code>DYNAMIC_FILTER_ADVANCED</code>
	 * <li>
	 * </ul>
	 * 
	 * @param displayType
	 * @throws SemanticException
	 */
	public void setDisplayType( String displayType ) throws SemanticException
	{
		setStringProperty( DSIPLAY_TYPE_PROP, displayType );
	}

	/**
	 * Gets the display type for this parameter. The display type controls
	 * whether it is a simple filter or advanced filter. Types are defined in
	 * <code>DesignChoiceConstants</code> can be one of the followings:
	 * <ul>
	 * <li><code>DYNAMIC_FILTER_SIMPLE</code>
	 * <li><code>DYNAMIC_FILTER_ADVANCED</code>
	 * <li>
	 * </ul>
	 * 
	 * @return the display value.
	 */
	public String getDisplayType( )
	{
		return getStringProperty( DSIPLAY_TYPE_PROP );
	}

	/**
	 * Sets the column value.
	 * 
	 * @param column
	 *            the column value.
	 * @throws SemanticException
	 */
	public void setColumn( String column ) throws SemanticException
	{
		setStringProperty( COLUMN_PROP, column );
	}

	/**
	 * Gets the column value.
	 * 
	 * @return the column value.
	 */
	public String getColumn( )
	{
		return getStringProperty( COLUMN_PROP );
	}

	/**
	 * Returns the list containing filter operator.
	 * 
	 * @return the list containing filter operator.
	 */

	public List<String> getFilterOperatorList( )
	{
		List<String> value = getListProperty( FILTER_OPERATOR_PROP );
		if ( value == null || value.isEmpty( ) )
			return Collections.emptyList( );

		return value;
	}

	/**
	 * Sets the filter operator.
	 * 
	 * @param list
	 *            the filter operator list.
	 * @throws SemanticException
	 */
	public void setFilterOperator( List<String> filterOperatorList )
			throws SemanticException
	{
		setProperty( FILTER_OPERATOR_PROP, filterOperatorList );
	}

	/**
	 * Gets the native data type of the dynamic parameter.
	 * 
	 * @return the native data type of the dynamic parameter.
	 */
	public int getNativeDataType( )
	{
		return getIntProperty( NATIVE_DATA_TYPE_PROP );
	}

	/**
	 * Sets the native data type of the dynamic parameter.
	 * 
	 * @param nativeDataType
	 *            the native data type to set
	 * @throws SemanticException
	 */
	public void setNativeDataType( int nativeDataType )
			throws SemanticException
	{
		setIntProperty( NATIVE_DATA_TYPE_PROP, nativeDataType );
	}

	/**
	 * Gets the default operator property of the dynamic parameter.
	 * 
	 * @return the default operator property of the dynamic parameter.
	 */
	public String getDefaultOperator( )
	{
		return getStringProperty( DEFAULT_OPERATOR_PROP );
	}

	/**
	 * Sets the default operator property of the dynamic parameter.
	 * 
	 * @param operator
	 *            the default operator property of the dynamic parameter.
	 * @throws SemanticException
	 */
	public void setDefaultOperator( String operator ) throws SemanticException
	{
		setStringProperty( DEFAULT_OPERATOR_PROP, operator );
	}

}
