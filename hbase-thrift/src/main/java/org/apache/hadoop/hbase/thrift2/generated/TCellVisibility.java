/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-25")
public class TCellVisibility implements org.apache.thrift.TBase<TCellVisibility, TCellVisibility._Fields>, java.io.Serializable, Cloneable, Comparable<TCellVisibility> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCellVisibility");

  private static final org.apache.thrift.protocol.TField EXPRESSION_FIELD_DESC = new org.apache.thrift.protocol.TField("expression", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCellVisibilityStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCellVisibilityTupleSchemeFactory());
  }

  public String expression; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPRESSION((short)1, "expression");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXPRESSION
          return EXPRESSION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.EXPRESSION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXPRESSION, new org.apache.thrift.meta_data.FieldMetaData("expression", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCellVisibility.class, metaDataMap);
  }

  public TCellVisibility() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCellVisibility(TCellVisibility other) {
    if (other.isSetExpression()) {
      this.expression = other.expression;
    }
  }

  public TCellVisibility deepCopy() {
    return new TCellVisibility(this);
  }

  @Override
  public void clear() {
    this.expression = null;
  }

  public String getExpression() {
    return this.expression;
  }

  public TCellVisibility setExpression(String expression) {
    this.expression = expression;
    return this;
  }

  public void unsetExpression() {
    this.expression = null;
  }

  /** Returns true if field expression is set (has been assigned a value) and false otherwise */
  public boolean isSetExpression() {
    return this.expression != null;
  }

  public void setExpressionIsSet(boolean value) {
    if (!value) {
      this.expression = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXPRESSION:
      if (value == null) {
        unsetExpression();
      } else {
        setExpression((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPRESSION:
      return getExpression();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXPRESSION:
      return isSetExpression();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCellVisibility)
      return this.equals((TCellVisibility)that);
    return false;
  }

  public boolean equals(TCellVisibility that) {
    if (that == null)
      return false;

    boolean this_present_expression = true && this.isSetExpression();
    boolean that_present_expression = true && that.isSetExpression();
    if (this_present_expression || that_present_expression) {
      if (!(this_present_expression && that_present_expression))
        return false;
      if (!this.expression.equals(that.expression))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_expression = true && (isSetExpression());
    list.add(present_expression);
    if (present_expression)
      list.add(expression);

    return list.hashCode();
  }

  @Override
  public int compareTo(TCellVisibility other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExpression()).compareTo(other.isSetExpression());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpression()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expression, other.expression);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TCellVisibility(");
    boolean first = true;

    if (isSetExpression()) {
      sb.append("expression:");
      if (this.expression == null) {
        sb.append("null");
      } else {
        sb.append(this.expression);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TCellVisibilityStandardSchemeFactory implements SchemeFactory {
    public TCellVisibilityStandardScheme getScheme() {
      return new TCellVisibilityStandardScheme();
    }
  }

  private static class TCellVisibilityStandardScheme extends StandardScheme<TCellVisibility> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCellVisibility struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPRESSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.expression = iprot.readString();
              struct.setExpressionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCellVisibility struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.expression != null) {
        if (struct.isSetExpression()) {
          oprot.writeFieldBegin(EXPRESSION_FIELD_DESC);
          oprot.writeString(struct.expression);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCellVisibilityTupleSchemeFactory implements SchemeFactory {
    public TCellVisibilityTupleScheme getScheme() {
      return new TCellVisibilityTupleScheme();
    }
  }

  private static class TCellVisibilityTupleScheme extends TupleScheme<TCellVisibility> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCellVisibility struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExpression()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetExpression()) {
        oprot.writeString(struct.expression);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCellVisibility struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.expression = iprot.readString();
        struct.setExpressionIsSet(true);
      }
    }
  }

}

