/**
 * (C) Copyright IBM Corp. 2006, 2009
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE 
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE 
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Eclipse Public License from
 * http://www.opensource.org/licenses/eclipse-1.0.php
 *
 * @author : Endre Bak, ebak@de.ibm.com  
 * 
 * Flag       Date        Prog         Description
 * -------------------------------------------------------------------------------
 * 1565892    2006-12-04  ebak         Make SBLIM client JSR48 compliant
 * 1660756    2007-02-22  ebak         Embedded object support
 * 2003590    2008-06-30  blaschke-oss Change licensing from CPL to EPL
 * 2524131    2009-01-21  raman_arora  Upgrade client to JDK 1.5 (Phase 1)
 */

package org.sblim.cimclient.internal.cimxml.sax.node;

import javax.cim.CIMObjectPath;

/**
 * Class AbstractObjectNode is the superclass of ClassNode and InstanceNode
 * classes.
 */
public abstract class AbstractObjectNode extends Node implements ValueIf {

	protected CIMObjectPath iLocalPath;

	/**
	 * Ctor.
	 * 
	 * @param pNameEnum
	 */
	public AbstractObjectNode(String pNameEnum) {
		super(pNameEnum);
	}

}
