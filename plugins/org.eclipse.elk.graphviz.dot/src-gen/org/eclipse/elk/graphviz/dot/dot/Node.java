/**
 */
package org.eclipse.elk.graphviz.dot.dot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.elk.graphviz.dot.dot.Node#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.elk.graphviz.dot.dot.Node#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.elk.graphviz.dot.dot.DotPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.elk.graphviz.dot.dot.DotPackage#getNode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.elk.graphviz.dot.dot.Node#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(Port)
   * @see org.eclipse.elk.graphviz.dot.dot.DotPackage#getNode_Port()
   * @model containment="true"
   * @generated
   */
  Port getPort();

  /**
   * Sets the value of the '{@link org.eclipse.elk.graphviz.dot.dot.Node#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(Port value);

} // Node
