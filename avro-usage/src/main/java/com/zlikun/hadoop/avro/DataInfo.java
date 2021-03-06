/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.zlikun.hadoop.avro;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DataInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9137831192677602918L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataInfo\",\"namespace\":\"com.zlikun.hadoop.avro\",\"fields\":[{\"name\":\"stringVar\",\"type\":\"string\"},{\"name\":\"bytesVar\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"booleanVar\",\"type\":\"boolean\"},{\"name\":\"intVar\",\"type\":\"int\",\"order\":\"descending\"},{\"name\":\"longVar\",\"type\":[\"long\",\"null\"]},{\"name\":\"floatVar\",\"type\":\"float\"},{\"name\":\"doubleVar\",\"type\":\"double\"},{\"name\":\"enumVar\",\"type\":{\"type\":\"enum\",\"name\":\"DataSuit\",\"symbols\":[\"SPADES\",\"HEARTS\",\"DIAMONDS\",\"CLUBS\"]}},{\"name\":\"strArrayVar\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"intArrayVar\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"mapVar\",\"type\":{\"type\":\"map\",\"values\":\"long\"}},{\"name\":\"fixedVar\",\"type\":{\"type\":\"fixed\",\"name\":\"DataMD5\",\"size\":16}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DataInfo> ENCODER =
      new BinaryMessageEncoder<DataInfo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DataInfo> DECODER =
      new BinaryMessageDecoder<DataInfo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<DataInfo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<DataInfo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DataInfo>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this DataInfo to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a DataInfo from a ByteBuffer. */
  public static DataInfo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence stringVar;
  @Deprecated public java.nio.ByteBuffer bytesVar;
  @Deprecated public boolean booleanVar;
  @Deprecated public int intVar;
  @Deprecated public java.lang.Long longVar;
  @Deprecated public float floatVar;
  @Deprecated public double doubleVar;
  @Deprecated public com.zlikun.hadoop.avro.DataSuit enumVar;
  @Deprecated public java.util.List<java.lang.CharSequence> strArrayVar;
  @Deprecated public java.util.List<java.lang.Integer> intArrayVar;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Long> mapVar;
  @Deprecated public com.zlikun.hadoop.avro.DataMD5 fixedVar;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DataInfo() {}

  /**
   * All-args constructor.
   * @param stringVar The new value for stringVar
   * @param bytesVar The new value for bytesVar
   * @param booleanVar The new value for booleanVar
   * @param intVar The new value for intVar
   * @param longVar The new value for longVar
   * @param floatVar The new value for floatVar
   * @param doubleVar The new value for doubleVar
   * @param enumVar The new value for enumVar
   * @param strArrayVar The new value for strArrayVar
   * @param intArrayVar The new value for intArrayVar
   * @param mapVar The new value for mapVar
   * @param fixedVar The new value for fixedVar
   */
  public DataInfo(java.lang.CharSequence stringVar, java.nio.ByteBuffer bytesVar, java.lang.Boolean booleanVar, java.lang.Integer intVar, java.lang.Long longVar, java.lang.Float floatVar, java.lang.Double doubleVar, com.zlikun.hadoop.avro.DataSuit enumVar, java.util.List<java.lang.CharSequence> strArrayVar, java.util.List<java.lang.Integer> intArrayVar, java.util.Map<java.lang.CharSequence,java.lang.Long> mapVar, com.zlikun.hadoop.avro.DataMD5 fixedVar) {
    this.stringVar = stringVar;
    this.bytesVar = bytesVar;
    this.booleanVar = booleanVar;
    this.intVar = intVar;
    this.longVar = longVar;
    this.floatVar = floatVar;
    this.doubleVar = doubleVar;
    this.enumVar = enumVar;
    this.strArrayVar = strArrayVar;
    this.intArrayVar = intArrayVar;
    this.mapVar = mapVar;
    this.fixedVar = fixedVar;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return stringVar;
    case 1: return bytesVar;
    case 2: return booleanVar;
    case 3: return intVar;
    case 4: return longVar;
    case 5: return floatVar;
    case 6: return doubleVar;
    case 7: return enumVar;
    case 8: return strArrayVar;
    case 9: return intArrayVar;
    case 10: return mapVar;
    case 11: return fixedVar;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: stringVar = (java.lang.CharSequence)value$; break;
    case 1: bytesVar = (java.nio.ByteBuffer)value$; break;
    case 2: booleanVar = (java.lang.Boolean)value$; break;
    case 3: intVar = (java.lang.Integer)value$; break;
    case 4: longVar = (java.lang.Long)value$; break;
    case 5: floatVar = (java.lang.Float)value$; break;
    case 6: doubleVar = (java.lang.Double)value$; break;
    case 7: enumVar = (com.zlikun.hadoop.avro.DataSuit)value$; break;
    case 8: strArrayVar = (java.util.List<java.lang.CharSequence>)value$; break;
    case 9: intArrayVar = (java.util.List<java.lang.Integer>)value$; break;
    case 10: mapVar = (java.util.Map<java.lang.CharSequence,java.lang.Long>)value$; break;
    case 11: fixedVar = (com.zlikun.hadoop.avro.DataMD5)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'stringVar' field.
   * @return The value of the 'stringVar' field.
   */
  public java.lang.CharSequence getStringVar() {
    return stringVar;
  }

  /**
   * Sets the value of the 'stringVar' field.
   * @param value the value to set.
   */
  public void setStringVar(java.lang.CharSequence value) {
    this.stringVar = value;
  }

  /**
   * Gets the value of the 'bytesVar' field.
   * @return The value of the 'bytesVar' field.
   */
  public java.nio.ByteBuffer getBytesVar() {
    return bytesVar;
  }

  /**
   * Sets the value of the 'bytesVar' field.
   * @param value the value to set.
   */
  public void setBytesVar(java.nio.ByteBuffer value) {
    this.bytesVar = value;
  }

  /**
   * Gets the value of the 'booleanVar' field.
   * @return The value of the 'booleanVar' field.
   */
  public java.lang.Boolean getBooleanVar() {
    return booleanVar;
  }

  /**
   * Sets the value of the 'booleanVar' field.
   * @param value the value to set.
   */
  public void setBooleanVar(java.lang.Boolean value) {
    this.booleanVar = value;
  }

  /**
   * Gets the value of the 'intVar' field.
   * @return The value of the 'intVar' field.
   */
  public java.lang.Integer getIntVar() {
    return intVar;
  }

  /**
   * Sets the value of the 'intVar' field.
   * @param value the value to set.
   */
  public void setIntVar(java.lang.Integer value) {
    this.intVar = value;
  }

  /**
   * Gets the value of the 'longVar' field.
   * @return The value of the 'longVar' field.
   */
  public java.lang.Long getLongVar() {
    return longVar;
  }

  /**
   * Sets the value of the 'longVar' field.
   * @param value the value to set.
   */
  public void setLongVar(java.lang.Long value) {
    this.longVar = value;
  }

  /**
   * Gets the value of the 'floatVar' field.
   * @return The value of the 'floatVar' field.
   */
  public java.lang.Float getFloatVar() {
    return floatVar;
  }

  /**
   * Sets the value of the 'floatVar' field.
   * @param value the value to set.
   */
  public void setFloatVar(java.lang.Float value) {
    this.floatVar = value;
  }

  /**
   * Gets the value of the 'doubleVar' field.
   * @return The value of the 'doubleVar' field.
   */
  public java.lang.Double getDoubleVar() {
    return doubleVar;
  }

  /**
   * Sets the value of the 'doubleVar' field.
   * @param value the value to set.
   */
  public void setDoubleVar(java.lang.Double value) {
    this.doubleVar = value;
  }

  /**
   * Gets the value of the 'enumVar' field.
   * @return The value of the 'enumVar' field.
   */
  public com.zlikun.hadoop.avro.DataSuit getEnumVar() {
    return enumVar;
  }

  /**
   * Sets the value of the 'enumVar' field.
   * @param value the value to set.
   */
  public void setEnumVar(com.zlikun.hadoop.avro.DataSuit value) {
    this.enumVar = value;
  }

  /**
   * Gets the value of the 'strArrayVar' field.
   * @return The value of the 'strArrayVar' field.
   */
  public java.util.List<java.lang.CharSequence> getStrArrayVar() {
    return strArrayVar;
  }

  /**
   * Sets the value of the 'strArrayVar' field.
   * @param value the value to set.
   */
  public void setStrArrayVar(java.util.List<java.lang.CharSequence> value) {
    this.strArrayVar = value;
  }

  /**
   * Gets the value of the 'intArrayVar' field.
   * @return The value of the 'intArrayVar' field.
   */
  public java.util.List<java.lang.Integer> getIntArrayVar() {
    return intArrayVar;
  }

  /**
   * Sets the value of the 'intArrayVar' field.
   * @param value the value to set.
   */
  public void setIntArrayVar(java.util.List<java.lang.Integer> value) {
    this.intArrayVar = value;
  }

  /**
   * Gets the value of the 'mapVar' field.
   * @return The value of the 'mapVar' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Long> getMapVar() {
    return mapVar;
  }

  /**
   * Sets the value of the 'mapVar' field.
   * @param value the value to set.
   */
  public void setMapVar(java.util.Map<java.lang.CharSequence,java.lang.Long> value) {
    this.mapVar = value;
  }

  /**
   * Gets the value of the 'fixedVar' field.
   * @return The value of the 'fixedVar' field.
   */
  public com.zlikun.hadoop.avro.DataMD5 getFixedVar() {
    return fixedVar;
  }

  /**
   * Sets the value of the 'fixedVar' field.
   * @param value the value to set.
   */
  public void setFixedVar(com.zlikun.hadoop.avro.DataMD5 value) {
    this.fixedVar = value;
  }

  /**
   * Creates a new DataInfo RecordBuilder.
   * @return A new DataInfo RecordBuilder
   */
  public static com.zlikun.hadoop.avro.DataInfo.Builder newBuilder() {
    return new com.zlikun.hadoop.avro.DataInfo.Builder();
  }

  /**
   * Creates a new DataInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DataInfo RecordBuilder
   */
  public static com.zlikun.hadoop.avro.DataInfo.Builder newBuilder(com.zlikun.hadoop.avro.DataInfo.Builder other) {
    return new com.zlikun.hadoop.avro.DataInfo.Builder(other);
  }

  /**
   * Creates a new DataInfo RecordBuilder by copying an existing DataInfo instance.
   * @param other The existing instance to copy.
   * @return A new DataInfo RecordBuilder
   */
  public static com.zlikun.hadoop.avro.DataInfo.Builder newBuilder(com.zlikun.hadoop.avro.DataInfo other) {
    return new com.zlikun.hadoop.avro.DataInfo.Builder(other);
  }

  /**
   * RecordBuilder for DataInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataInfo>
    implements org.apache.avro.data.RecordBuilder<DataInfo> {

    private java.lang.CharSequence stringVar;
    private java.nio.ByteBuffer bytesVar;
    private boolean booleanVar;
    private int intVar;
    private java.lang.Long longVar;
    private float floatVar;
    private double doubleVar;
    private com.zlikun.hadoop.avro.DataSuit enumVar;
    private java.util.List<java.lang.CharSequence> strArrayVar;
    private java.util.List<java.lang.Integer> intArrayVar;
    private java.util.Map<java.lang.CharSequence,java.lang.Long> mapVar;
    private com.zlikun.hadoop.avro.DataMD5 fixedVar;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.zlikun.hadoop.avro.DataInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.stringVar)) {
        this.stringVar = data().deepCopy(fields()[0].schema(), other.stringVar);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bytesVar)) {
        this.bytesVar = data().deepCopy(fields()[1].schema(), other.bytesVar);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.booleanVar)) {
        this.booleanVar = data().deepCopy(fields()[2].schema(), other.booleanVar);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.intVar)) {
        this.intVar = data().deepCopy(fields()[3].schema(), other.intVar);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.longVar)) {
        this.longVar = data().deepCopy(fields()[4].schema(), other.longVar);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.floatVar)) {
        this.floatVar = data().deepCopy(fields()[5].schema(), other.floatVar);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.doubleVar)) {
        this.doubleVar = data().deepCopy(fields()[6].schema(), other.doubleVar);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.enumVar)) {
        this.enumVar = data().deepCopy(fields()[7].schema(), other.enumVar);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.strArrayVar)) {
        this.strArrayVar = data().deepCopy(fields()[8].schema(), other.strArrayVar);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.intArrayVar)) {
        this.intArrayVar = data().deepCopy(fields()[9].schema(), other.intArrayVar);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.mapVar)) {
        this.mapVar = data().deepCopy(fields()[10].schema(), other.mapVar);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.fixedVar)) {
        this.fixedVar = data().deepCopy(fields()[11].schema(), other.fixedVar);
        fieldSetFlags()[11] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DataInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.zlikun.hadoop.avro.DataInfo other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.stringVar)) {
        this.stringVar = data().deepCopy(fields()[0].schema(), other.stringVar);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bytesVar)) {
        this.bytesVar = data().deepCopy(fields()[1].schema(), other.bytesVar);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.booleanVar)) {
        this.booleanVar = data().deepCopy(fields()[2].schema(), other.booleanVar);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.intVar)) {
        this.intVar = data().deepCopy(fields()[3].schema(), other.intVar);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.longVar)) {
        this.longVar = data().deepCopy(fields()[4].schema(), other.longVar);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.floatVar)) {
        this.floatVar = data().deepCopy(fields()[5].schema(), other.floatVar);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.doubleVar)) {
        this.doubleVar = data().deepCopy(fields()[6].schema(), other.doubleVar);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.enumVar)) {
        this.enumVar = data().deepCopy(fields()[7].schema(), other.enumVar);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.strArrayVar)) {
        this.strArrayVar = data().deepCopy(fields()[8].schema(), other.strArrayVar);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.intArrayVar)) {
        this.intArrayVar = data().deepCopy(fields()[9].schema(), other.intArrayVar);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.mapVar)) {
        this.mapVar = data().deepCopy(fields()[10].schema(), other.mapVar);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.fixedVar)) {
        this.fixedVar = data().deepCopy(fields()[11].schema(), other.fixedVar);
        fieldSetFlags()[11] = true;
      }
    }

    /**
      * Gets the value of the 'stringVar' field.
      * @return The value.
      */
    public java.lang.CharSequence getStringVar() {
      return stringVar;
    }

    /**
      * Sets the value of the 'stringVar' field.
      * @param value The value of 'stringVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setStringVar(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.stringVar = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'stringVar' field has been set.
      * @return True if the 'stringVar' field has been set, false otherwise.
      */
    public boolean hasStringVar() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'stringVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearStringVar() {
      stringVar = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'bytesVar' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getBytesVar() {
      return bytesVar;
    }

    /**
      * Sets the value of the 'bytesVar' field.
      * @param value The value of 'bytesVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setBytesVar(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.bytesVar = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'bytesVar' field has been set.
      * @return True if the 'bytesVar' field has been set, false otherwise.
      */
    public boolean hasBytesVar() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'bytesVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearBytesVar() {
      bytesVar = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'booleanVar' field.
      * @return The value.
      */
    public java.lang.Boolean getBooleanVar() {
      return booleanVar;
    }

    /**
      * Sets the value of the 'booleanVar' field.
      * @param value The value of 'booleanVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setBooleanVar(boolean value) {
      validate(fields()[2], value);
      this.booleanVar = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'booleanVar' field has been set.
      * @return True if the 'booleanVar' field has been set, false otherwise.
      */
    public boolean hasBooleanVar() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'booleanVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearBooleanVar() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'intVar' field.
      * @return The value.
      */
    public java.lang.Integer getIntVar() {
      return intVar;
    }

    /**
      * Sets the value of the 'intVar' field.
      * @param value The value of 'intVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setIntVar(int value) {
      validate(fields()[3], value);
      this.intVar = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'intVar' field has been set.
      * @return True if the 'intVar' field has been set, false otherwise.
      */
    public boolean hasIntVar() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'intVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearIntVar() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'longVar' field.
      * @return The value.
      */
    public java.lang.Long getLongVar() {
      return longVar;
    }

    /**
      * Sets the value of the 'longVar' field.
      * @param value The value of 'longVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setLongVar(java.lang.Long value) {
      validate(fields()[4], value);
      this.longVar = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'longVar' field has been set.
      * @return True if the 'longVar' field has been set, false otherwise.
      */
    public boolean hasLongVar() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'longVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearLongVar() {
      longVar = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'floatVar' field.
      * @return The value.
      */
    public java.lang.Float getFloatVar() {
      return floatVar;
    }

    /**
      * Sets the value of the 'floatVar' field.
      * @param value The value of 'floatVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setFloatVar(float value) {
      validate(fields()[5], value);
      this.floatVar = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'floatVar' field has been set.
      * @return True if the 'floatVar' field has been set, false otherwise.
      */
    public boolean hasFloatVar() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'floatVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearFloatVar() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'doubleVar' field.
      * @return The value.
      */
    public java.lang.Double getDoubleVar() {
      return doubleVar;
    }

    /**
      * Sets the value of the 'doubleVar' field.
      * @param value The value of 'doubleVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setDoubleVar(double value) {
      validate(fields()[6], value);
      this.doubleVar = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'doubleVar' field has been set.
      * @return True if the 'doubleVar' field has been set, false otherwise.
      */
    public boolean hasDoubleVar() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'doubleVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearDoubleVar() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'enumVar' field.
      * @return The value.
      */
    public com.zlikun.hadoop.avro.DataSuit getEnumVar() {
      return enumVar;
    }

    /**
      * Sets the value of the 'enumVar' field.
      * @param value The value of 'enumVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setEnumVar(com.zlikun.hadoop.avro.DataSuit value) {
      validate(fields()[7], value);
      this.enumVar = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'enumVar' field has been set.
      * @return True if the 'enumVar' field has been set, false otherwise.
      */
    public boolean hasEnumVar() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'enumVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearEnumVar() {
      enumVar = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'strArrayVar' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getStrArrayVar() {
      return strArrayVar;
    }

    /**
      * Sets the value of the 'strArrayVar' field.
      * @param value The value of 'strArrayVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setStrArrayVar(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[8], value);
      this.strArrayVar = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'strArrayVar' field has been set.
      * @return True if the 'strArrayVar' field has been set, false otherwise.
      */
    public boolean hasStrArrayVar() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'strArrayVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearStrArrayVar() {
      strArrayVar = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'intArrayVar' field.
      * @return The value.
      */
    public java.util.List<java.lang.Integer> getIntArrayVar() {
      return intArrayVar;
    }

    /**
      * Sets the value of the 'intArrayVar' field.
      * @param value The value of 'intArrayVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setIntArrayVar(java.util.List<java.lang.Integer> value) {
      validate(fields()[9], value);
      this.intArrayVar = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'intArrayVar' field has been set.
      * @return True if the 'intArrayVar' field has been set, false otherwise.
      */
    public boolean hasIntArrayVar() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'intArrayVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearIntArrayVar() {
      intArrayVar = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'mapVar' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.Long> getMapVar() {
      return mapVar;
    }

    /**
      * Sets the value of the 'mapVar' field.
      * @param value The value of 'mapVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setMapVar(java.util.Map<java.lang.CharSequence,java.lang.Long> value) {
      validate(fields()[10], value);
      this.mapVar = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'mapVar' field has been set.
      * @return True if the 'mapVar' field has been set, false otherwise.
      */
    public boolean hasMapVar() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'mapVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearMapVar() {
      mapVar = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'fixedVar' field.
      * @return The value.
      */
    public com.zlikun.hadoop.avro.DataMD5 getFixedVar() {
      return fixedVar;
    }

    /**
      * Sets the value of the 'fixedVar' field.
      * @param value The value of 'fixedVar'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder setFixedVar(com.zlikun.hadoop.avro.DataMD5 value) {
      validate(fields()[11], value);
      this.fixedVar = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'fixedVar' field has been set.
      * @return True if the 'fixedVar' field has been set, false otherwise.
      */
    public boolean hasFixedVar() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'fixedVar' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.DataInfo.Builder clearFixedVar() {
      fixedVar = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DataInfo build() {
      try {
        DataInfo record = new DataInfo();
        record.stringVar = fieldSetFlags()[0] ? this.stringVar : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.bytesVar = fieldSetFlags()[1] ? this.bytesVar : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        record.booleanVar = fieldSetFlags()[2] ? this.booleanVar : (java.lang.Boolean) defaultValue(fields()[2]);
        record.intVar = fieldSetFlags()[3] ? this.intVar : (java.lang.Integer) defaultValue(fields()[3]);
        record.longVar = fieldSetFlags()[4] ? this.longVar : (java.lang.Long) defaultValue(fields()[4]);
        record.floatVar = fieldSetFlags()[5] ? this.floatVar : (java.lang.Float) defaultValue(fields()[5]);
        record.doubleVar = fieldSetFlags()[6] ? this.doubleVar : (java.lang.Double) defaultValue(fields()[6]);
        record.enumVar = fieldSetFlags()[7] ? this.enumVar : (com.zlikun.hadoop.avro.DataSuit) defaultValue(fields()[7]);
        record.strArrayVar = fieldSetFlags()[8] ? this.strArrayVar : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[8]);
        record.intArrayVar = fieldSetFlags()[9] ? this.intArrayVar : (java.util.List<java.lang.Integer>) defaultValue(fields()[9]);
        record.mapVar = fieldSetFlags()[10] ? this.mapVar : (java.util.Map<java.lang.CharSequence,java.lang.Long>) defaultValue(fields()[10]);
        record.fixedVar = fieldSetFlags()[11] ? this.fixedVar : (com.zlikun.hadoop.avro.DataMD5) defaultValue(fields()[11]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DataInfo>
    WRITER$ = (org.apache.avro.io.DatumWriter<DataInfo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DataInfo>
    READER$ = (org.apache.avro.io.DatumReader<DataInfo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
