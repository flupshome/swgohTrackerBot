// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerProfileResponse.proto

package serenno.protos.playerProfileResponse;

/**
 * Protobuf type {@code serenno.protos.playerProfileResponse.EquipmentSlot}
 */
public final class EquipmentSlot extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:serenno.protos.playerProfileResponse.EquipmentSlot)
    EquipmentSlotOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EquipmentSlot.newBuilder() to construct.
  private EquipmentSlot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EquipmentSlot() {
    equipmentId_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new EquipmentSlot();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EquipmentSlot(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            String s = input.readStringRequireUtf8();

            equipmentId_ = s;
            break;
          }
          case 16: {

            slot_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return PlayerProfileResponseOuterClass.internal_static_serenno_protos_playerProfileResponse_EquipmentSlot_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return PlayerProfileResponseOuterClass.internal_static_serenno_protos_playerProfileResponse_EquipmentSlot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            EquipmentSlot.class, Builder.class);
  }

  public static final int EQUIPMENT_ID_FIELD_NUMBER = 1;
  private volatile Object equipmentId_;
  /**
   * <code>string equipment_id = 1;</code>
   * @return The equipmentId.
   */
  @Override
  public String getEquipmentId() {
    Object ref = equipmentId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      equipmentId_ = s;
      return s;
    }
  }
  /**
   * <code>string equipment_id = 1;</code>
   * @return The bytes for equipmentId.
   */
  @Override
  public com.google.protobuf.ByteString
      getEquipmentIdBytes() {
    Object ref = equipmentId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      equipmentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SLOT_FIELD_NUMBER = 2;
  private int slot_;
  /**
   * <code>int32 slot = 2;</code>
   * @return The slot.
   */
  @Override
  public int getSlot() {
    return slot_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getEquipmentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, equipmentId_);
    }
    if (slot_ != 0) {
      output.writeInt32(2, slot_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEquipmentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, equipmentId_);
    }
    if (slot_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, slot_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof EquipmentSlot)) {
      return super.equals(obj);
    }
    EquipmentSlot other = (EquipmentSlot) obj;

    if (!getEquipmentId()
        .equals(other.getEquipmentId())) return false;
    if (getSlot()
        != other.getSlot()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EQUIPMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEquipmentId().hashCode();
    hash = (37 * hash) + SLOT_FIELD_NUMBER;
    hash = (53 * hash) + getSlot();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static EquipmentSlot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static EquipmentSlot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static EquipmentSlot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static EquipmentSlot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static EquipmentSlot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static EquipmentSlot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static EquipmentSlot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static EquipmentSlot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static EquipmentSlot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static EquipmentSlot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static EquipmentSlot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static EquipmentSlot parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(EquipmentSlot prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code serenno.protos.playerProfileResponse.EquipmentSlot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:serenno.protos.playerProfileResponse.EquipmentSlot)
      EquipmentSlotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PlayerProfileResponseOuterClass.internal_static_serenno_protos_playerProfileResponse_EquipmentSlot_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PlayerProfileResponseOuterClass.internal_static_serenno_protos_playerProfileResponse_EquipmentSlot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EquipmentSlot.class, Builder.class);
    }

    // Construct using serenno.protos.playerProfileResponse.EquipmentSlot.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      equipmentId_ = "";

      slot_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return PlayerProfileResponseOuterClass.internal_static_serenno_protos_playerProfileResponse_EquipmentSlot_descriptor;
    }

    @Override
    public EquipmentSlot getDefaultInstanceForType() {
      return EquipmentSlot.getDefaultInstance();
    }

    @Override
    public EquipmentSlot build() {
      EquipmentSlot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public EquipmentSlot buildPartial() {
      EquipmentSlot result = new EquipmentSlot(this);
      result.equipmentId_ = equipmentId_;
      result.slot_ = slot_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof EquipmentSlot) {
        return mergeFrom((EquipmentSlot)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(EquipmentSlot other) {
      if (other == EquipmentSlot.getDefaultInstance()) return this;
      if (!other.getEquipmentId().isEmpty()) {
        equipmentId_ = other.equipmentId_;
        onChanged();
      }
      if (other.getSlot() != 0) {
        setSlot(other.getSlot());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      EquipmentSlot parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (EquipmentSlot) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object equipmentId_ = "";
    /**
     * <code>string equipment_id = 1;</code>
     * @return The equipmentId.
     */
    public String getEquipmentId() {
      Object ref = equipmentId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        equipmentId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string equipment_id = 1;</code>
     * @return The bytes for equipmentId.
     */
    public com.google.protobuf.ByteString
        getEquipmentIdBytes() {
      Object ref = equipmentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        equipmentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string equipment_id = 1;</code>
     * @param value The equipmentId to set.
     * @return This builder for chaining.
     */
    public Builder setEquipmentId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      equipmentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string equipment_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEquipmentId() {
      
      equipmentId_ = getDefaultInstance().getEquipmentId();
      onChanged();
      return this;
    }
    /**
     * <code>string equipment_id = 1;</code>
     * @param value The bytes for equipmentId to set.
     * @return This builder for chaining.
     */
    public Builder setEquipmentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      equipmentId_ = value;
      onChanged();
      return this;
    }

    private int slot_ ;
    /**
     * <code>int32 slot = 2;</code>
     * @return The slot.
     */
    @Override
    public int getSlot() {
      return slot_;
    }
    /**
     * <code>int32 slot = 2;</code>
     * @param value The slot to set.
     * @return This builder for chaining.
     */
    public Builder setSlot(int value) {
      
      slot_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 slot = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSlot() {
      
      slot_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:serenno.protos.playerProfileResponse.EquipmentSlot)
  }

  // @@protoc_insertion_point(class_scope:serenno.protos.playerProfileResponse.EquipmentSlot)
  private static final EquipmentSlot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new EquipmentSlot();
  }

  public static EquipmentSlot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EquipmentSlot>
      PARSER = new com.google.protobuf.AbstractParser<EquipmentSlot>() {
    @Override
    public EquipmentSlot parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EquipmentSlot(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EquipmentSlot> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<EquipmentSlot> getParserForType() {
    return PARSER;
  }

  @Override
  public EquipmentSlot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

