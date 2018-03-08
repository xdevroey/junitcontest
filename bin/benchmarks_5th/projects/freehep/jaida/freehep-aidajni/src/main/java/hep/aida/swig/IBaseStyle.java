/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package hep.aida.swig;
 
import hep.aida.jni.AIDAJNIUtil;

public class IBaseStyle implements hep.aida.IBaseStyle {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public IBaseStyle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(hep.aida.IBaseStyle obj) {
    if (obj instanceof IBaseStyle) {
      return (obj == null) ? 0 : ((IBaseStyle)obj).swigCPtr;
    } else {
      long cPtr = AIDAJNI.new_IBaseStyle();
      // FIXME, memory leak if Java class gets finalized, since C++ director is not freed.
      AIDAJNI.IBaseStyle_director_connect(obj, cPtr, true, true);
      return cPtr;
    }
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AIDAJNI.delete_IBaseStyle(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    AIDAJNI.IBaseStyle_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    AIDAJNI.IBaseStyle_change_ownership(this, swigCPtr, true);
  }

  public void reset() {
    AIDAJNI.IBaseStyle_reset(swigCPtr, this);
  }

  public boolean setParameter(String paramName, String options) {
    return AIDAJNI.IBaseStyle_setParameter__SWIG_0(swigCPtr, this, paramName, options);
  }

  public boolean setParameter(String paramName) {
    return AIDAJNI.IBaseStyle_setParameter__SWIG_1(swigCPtr, this, paramName);
  }

  public String parameterValue(String parameter) {
    return AIDAJNI.IBaseStyle_parameterValue(swigCPtr, this, parameter);
  }

  public String[] availableParameters() {
    return AIDAJNIUtil.toStringArray(AIDAJNI.IBaseStyle_availableParameters(swigCPtr, this));
  }

  public String[] availableParameterOptions(String paramName) {
    return AIDAJNIUtil.toStringArray(AIDAJNI.IBaseStyle_availableParameterOptions(swigCPtr, this, paramName));
  }

  public IBaseStyle() {
    this(AIDAJNI.new_IBaseStyle(), true);
    AIDAJNI.IBaseStyle_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}