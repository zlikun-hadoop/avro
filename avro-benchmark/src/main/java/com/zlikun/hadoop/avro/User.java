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
/** A user info model. */
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4639275632422155701L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.zlikun.hadoop.avro\",\"doc\":\"A user info model.\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"active\",\"type\":\"boolean\"},{\"name\":\"remark\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<User> ENCODER =
      new BinaryMessageEncoder<User>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<User> DECODER =
      new BinaryMessageDecoder<User>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<User> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<User> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<User>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this User to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a User from a ByteBuffer. */
  public static User fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public boolean active;
  @Deprecated public java.lang.CharSequence remark;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param active The new value for active
   * @param remark The new value for remark
   */
  public User(java.lang.Long id, java.lang.CharSequence name, java.lang.Boolean active, java.lang.CharSequence remark) {
    this.id = id;
    this.name = name;
    this.active = active;
    this.remark = remark;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return active;
    case 3: return remark;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: active = (java.lang.Boolean)value$; break;
    case 3: remark = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'active' field.
   * @return The value of the 'active' field.
   */
  public java.lang.Boolean getActive() {
    return active;
  }

  /**
   * Sets the value of the 'active' field.
   * @param value the value to set.
   */
  public void setActive(java.lang.Boolean value) {
    this.active = value;
  }

  /**
   * Gets the value of the 'remark' field.
   * @return The value of the 'remark' field.
   */
  public java.lang.CharSequence getRemark() {
    return remark;
  }

  /**
   * Sets the value of the 'remark' field.
   * @param value the value to set.
   */
  public void setRemark(java.lang.CharSequence value) {
    this.remark = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static com.zlikun.hadoop.avro.User.Builder newBuilder() {
    return new com.zlikun.hadoop.avro.User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static com.zlikun.hadoop.avro.User.Builder newBuilder(com.zlikun.hadoop.avro.User.Builder other) {
    return new com.zlikun.hadoop.avro.User.Builder(other);
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static com.zlikun.hadoop.avro.User.Builder newBuilder(com.zlikun.hadoop.avro.User other) {
    return new com.zlikun.hadoop.avro.User.Builder(other);
  }

  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private long id;
    private java.lang.CharSequence name;
    private boolean active;
    private java.lang.CharSequence remark;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.zlikun.hadoop.avro.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.active)) {
        this.active = data().deepCopy(fields()[2].schema(), other.active);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.remark)) {
        this.remark = data().deepCopy(fields()[3].schema(), other.remark);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(com.zlikun.hadoop.avro.User other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.active)) {
        this.active = data().deepCopy(fields()[2].schema(), other.active);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.remark)) {
        this.remark = data().deepCopy(fields()[3].schema(), other.remark);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Long getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.User.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.User.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.User.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.User.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'active' field.
      * @return The value.
      */
    public java.lang.Boolean getActive() {
      return active;
    }

    /**
      * Sets the value of the 'active' field.
      * @param value The value of 'active'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.User.Builder setActive(boolean value) {
      validate(fields()[2], value);
      this.active = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'active' field has been set.
      * @return True if the 'active' field has been set, false otherwise.
      */
    public boolean hasActive() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'active' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.User.Builder clearActive() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'remark' field.
      * @return The value.
      */
    public java.lang.CharSequence getRemark() {
      return remark;
    }

    /**
      * Sets the value of the 'remark' field.
      * @param value The value of 'remark'.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.User.Builder setRemark(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.remark = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'remark' field has been set.
      * @return True if the 'remark' field has been set, false otherwise.
      */
    public boolean hasRemark() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'remark' field.
      * @return This builder.
      */
    public com.zlikun.hadoop.avro.User.Builder clearRemark() {
      remark = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User build() {
      try {
        User record = new User();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.active = fieldSetFlags()[2] ? this.active : (java.lang.Boolean) defaultValue(fields()[2]);
        record.remark = fieldSetFlags()[3] ? this.remark : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<User>
    WRITER$ = (org.apache.avro.io.DatumWriter<User>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<User>
    READER$ = (org.apache.avro.io.DatumReader<User>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}