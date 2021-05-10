// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerProfileResponse.proto

package serenno.protos.playerProfileResponse;

/**
 * Protobuf type {@code serenno.protos.playerProfileResponse.PlayerProfileStat}
 */
public final class PlayerProfileStat extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:serenno.protos.playerProfileResponse.PlayerProfileStat)
    PlayerProfileStatOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayerProfileStat.newBuilder() to construct.
  private PlayerProfileStat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayerProfileStat() {
    nameKey_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayerProfileStat();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlayerProfileStat(
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

            nameKey_ = s;
            break;
          }
          case 24: {

            value_ = input.readInt64();
            break;
          }
          case 32: {

            index_ = input.readInt32();
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
    return PlayerProfileResponseOuterClass.internal_static_serenno_protos_playerProfileResponse_PlayerProfileStat_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return PlayerProfileResponseOuterClass.internal_static_serenno_protos_playerProfileResponse_PlayerProfileStat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            PlayerProfileStat.class, Builder.class);
  }

  public static final int NAME_KEY_FIELD_NUMBER = 1;
  private volatile Object nameKey_;
  /**
   * <code>string name_key = 1;</code>
   * @return The nameKey.
   */
  @Override
  public String getNameKey() {
    Object ref = nameKey_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      nameKey_ = s;
      return s;
    }
  }
  /**
   * <code>string name_key = 1;</code>
   * @return The bytes for nameKey.
   */
  @Override
  public com.google.protobuf.ByteString
      getNameKeyBytes() {
    Object ref = nameKey_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      nameKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private long value_;
  /**
   * <pre>
   *string version_key = 2; // TODO
   * </pre>
   *
   * <code>int64 value = 3;</code>
   * @return The value.
   */
  @Override
  public long getValue() {
    return value_;
  }

  public static final int INDEX_FIELD_NUMBER = 4;
  private int index_;
  /**
   * <code>int32 index = 4;</code>
   * @return The index.
   */
  @Override
  public int getIndex() {
    return index_;
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
    if (!getNameKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nameKey_);
    }
    if (value_ != 0L) {
      output.writeInt64(3, value_);
    }
    if (index_ != 0) {
      output.writeInt32(4, index_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nameKey_);
    }
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, value_);
    }
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, index_);
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
    if (!(obj instanceof PlayerProfileStat)) {
      return super.equals(obj);
    }
    PlayerProfileStat other = (PlayerProfileStat) obj;

    if (!getNameKey()
        .equals(other.getNameKey())) return false;
    if (getValue()
        != other.getValue()) return false;
    if (getIndex()
        != other.getIndex()) return false;
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
    hash = (37 * hash) + NAME_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getNameKey().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static PlayerProfileStat parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PlayerProfileStat parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PlayerProfileStat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PlayerProfileStat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PlayerProfileStat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PlayerProfileStat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PlayerProfileStat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PlayerProfileStat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static PlayerProfileStat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static PlayerProfileStat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static PlayerProfileStat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PlayerProfileStat parseFrom(
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
  public static Builder newBuilder(PlayerProfileStat prototype) {
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
   * Protobuf type {@code serenno.protos.playerProfileResponse.PlayerProfileStat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:serenno.protos.playerProfileResponse.PlayerProfileStat)
      PlayerProfileStatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PlayerProfileResponseOuterClass.internal_static_serenno_protos_playerProfileResponse_PlayerProfileStat_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PlayerProfileResponseOuterClass.internal_static_serenno_protos_playerProfileResponse_PlayerProfileStat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PlayerProfileStat.class, Builder.class);
    }

    // Construct using serenno.protos.playerProfileResponse.PlayerProfileStat.newBuilder()
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
      nameKey_ = "";

      value_ = 0L;

      index_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return PlayerProfileResponseOuterClass.internal_static_serenno_protos_playerProfileResponse_PlayerProfileStat_descriptor;
    }

    @Override
    public PlayerProfileStat getDefaultInstanceForType() {
      return PlayerProfileStat.getDefaultInstance();
    }

    @Override
    public PlayerProfileStat build() {
      PlayerProfileStat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public PlayerProfileStat buildPartial() {
      PlayerProfileStat result = new PlayerProfileStat(this);
      result.nameKey_ = nameKey_;
      result.value_ = value_;
      result.index_ = index_;
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
      if (other instanceof PlayerProfileStat) {
        return mergeFrom((PlayerProfileStat)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(PlayerProfileStat other) {
      if (other == PlayerProfileStat.getDefaultInstance()) return this;
      if (!other.getNameKey().isEmpty()) {
        nameKey_ = other.nameKey_;
        onChanged();
      }
      if (other.getValue() != 0L) {
        setValue(other.getValue());
      }
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
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
      PlayerProfileStat parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (PlayerProfileStat) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object nameKey_ = "";
    /**
     * <code>string name_key = 1;</code>
     * @return The nameKey.
     */
    public String getNameKey() {
      Object ref = nameKey_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        nameKey_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string name_key = 1;</code>
     * @return The bytes for nameKey.
     */
    public com.google.protobuf.ByteString
        getNameKeyBytes() {
      Object ref = nameKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        nameKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name_key = 1;</code>
     * @param value The nameKey to set.
     * @return This builder for chaining.
     */
    public Builder setNameKey(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nameKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name_key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNameKey() {
      
      nameKey_ = getDefaultInstance().getNameKey();
      onChanged();
      return this;
    }
    /**
     * <code>string name_key = 1;</code>
     * @param value The bytes for nameKey to set.
     * @return This builder for chaining.
     */
    public Builder setNameKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nameKey_ = value;
      onChanged();
      return this;
    }

    private long value_ ;
    /**
     * <pre>
     *string version_key = 2; // TODO
     * </pre>
     *
     * <code>int64 value = 3;</code>
     * @return The value.
     */
    @Override
    public long getValue() {
      return value_;
    }
    /**
     * <pre>
     *string version_key = 2; // TODO
     * </pre>
     *
     * <code>int64 value = 3;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *string version_key = 2; // TODO
     * </pre>
     *
     * <code>int64 value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = 0L;
      onChanged();
      return this;
    }

    private int index_ ;
    /**
     * <code>int32 index = 4;</code>
     * @return The index.
     */
    @Override
    public int getIndex() {
      return index_;
    }
    /**
     * <code>int32 index = 4;</code>
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(int value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 index = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      
      index_ = 0;
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


    // @@protoc_insertion_point(builder_scope:serenno.protos.playerProfileResponse.PlayerProfileStat)
  }

  // @@protoc_insertion_point(class_scope:serenno.protos.playerProfileResponse.PlayerProfileStat)
  private static final PlayerProfileStat DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PlayerProfileStat();
  }

  public static PlayerProfileStat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayerProfileStat>
      PARSER = new com.google.protobuf.AbstractParser<PlayerProfileStat>() {
    @Override
    public PlayerProfileStat parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlayerProfileStat(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlayerProfileStat> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<PlayerProfileStat> getParserForType() {
    return PARSER;
  }

  @Override
  public PlayerProfileStat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

