/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package swig.direct.CPLDirect;

public class cpl_relation_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected cpl_relation_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(cpl_relation_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CPLDirectJNI.delete_cpl_relation_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setId(java.math.BigInteger value) {
    CPLDirectJNI.cpl_relation_t_id_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getId() {
    return CPLDirectJNI.cpl_relation_t_id_get(swigCPtr, this);
  }

  public void setQuery_object_id(java.math.BigInteger value) {
    CPLDirectJNI.cpl_relation_t_query_object_id_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getQuery_object_id() {
    return CPLDirectJNI.cpl_relation_t_query_object_id_get(swigCPtr, this);
  }

  public void setOther_object_id(java.math.BigInteger value) {
    CPLDirectJNI.cpl_relation_t_other_object_id_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getOther_object_id() {
    return CPLDirectJNI.cpl_relation_t_other_object_id_get(swigCPtr, this);
  }

  public void setType(int value) {
    CPLDirectJNI.cpl_relation_t_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return CPLDirectJNI.cpl_relation_t_type_get(swigCPtr, this);
  }

  public void setContainer_id(java.math.BigInteger value) {
    CPLDirectJNI.cpl_relation_t_container_id_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getContainer_id() {
    return CPLDirectJNI.cpl_relation_t_container_id_get(swigCPtr, this);
  }

  public cpl_relation_t() {
    this(CPLDirectJNI.new_cpl_relation_t(), true);
  }

}
