/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.zlikun.hadoop.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.FixedSize(16)
@org.apache.avro.specific.AvroGenerated
public class DataMD5 extends org.apache.avro.specific.SpecificFixed {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"fixed\",\"name\":\"DataMD5\",\"namespace\":\"com.zlikun.hadoop.avro\",\"size\":16}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  
  /** Creates a new DataMD5 */
  public DataMD5() {
    super();
  }
  
  /** Creates a new DataMD5 with the given bytes */
  public DataMD5(byte[] bytes) {
    super(bytes);
  }
}
