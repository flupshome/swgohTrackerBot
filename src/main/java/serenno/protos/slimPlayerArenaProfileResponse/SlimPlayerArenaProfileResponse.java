// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlimPlayerArenaProfileResponse.proto

package serenno.protos.slimPlayerArenaProfileResponse;

/**
 * Protobuf type {@code serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaProfileResponse}
 */
public final class SlimPlayerArenaProfileResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaProfileResponse)
    SlimPlayerArenaProfileResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SlimPlayerArenaProfileResponse.newBuilder() to construct.
  private SlimPlayerArenaProfileResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SlimPlayerArenaProfileResponse() {
    name_ = "";
    playerId_ = "";
    arenas_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new SlimPlayerArenaProfileResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SlimPlayerArenaProfileResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            name_ = s;
            break;
          }
          case 16: {

            level_ = input.readInt32();
            break;
          }
          case 24: {

            allyCode_ = input.readInt64();
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            playerId_ = s;
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              arenas_ = new java.util.ArrayList<SlimPlayerArenaStatus>();
              mutable_bitField0_ |= 0x00000001;
            }
            arenas_.add(
                input.readMessage(SlimPlayerArenaStatus.parser(), extensionRegistry));
            break;
          }
          case 48: {

            pvpOffset_ = input.readSInt32();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        arenas_ = java.util.Collections.unmodifiableList(arenas_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return SlimPlayerArenaProfileResponseOuterClass.internal_static_serenno_protos_slimPlayerArenaProfileResponse_SlimPlayerArenaProfileResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SlimPlayerArenaProfileResponseOuterClass.internal_static_serenno_protos_slimPlayerArenaProfileResponse_SlimPlayerArenaProfileResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SlimPlayerArenaProfileResponse.class, Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @Override
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEVEL_FIELD_NUMBER = 2;
  private int level_;
  /**
   * <code>int32 level = 2;</code>
   * @return The level.
   */
  @Override
  public int getLevel() {
    return level_;
  }

  public static final int ALLYCODE_FIELD_NUMBER = 3;
  private long allyCode_;
  /**
   * <code>int64 allyCode = 3;</code>
   * @return The allyCode.
   */
  @Override
  public long getAllyCode() {
    return allyCode_;
  }

  public static final int PLAYERID_FIELD_NUMBER = 4;
  private volatile Object playerId_;
  /**
   * <code>string playerId = 4;</code>
   * @return The playerId.
   */
  @Override
  public String getPlayerId() {
    Object ref = playerId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      playerId_ = s;
      return s;
    }
  }
  /**
   * <code>string playerId = 4;</code>
   * @return The bytes for playerId.
   */
  @Override
  public com.google.protobuf.ByteString
      getPlayerIdBytes() {
    Object ref = playerId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      playerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARENAS_FIELD_NUMBER = 5;
  private java.util.List<SlimPlayerArenaStatus> arenas_;
  /**
   * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
   */
  @Override
  public java.util.List<SlimPlayerArenaStatus> getArenasList() {
    return arenas_;
  }
  /**
   * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
   */
  @Override
  public java.util.List<? extends SlimPlayerArenaStatusOrBuilder>
      getArenasOrBuilderList() {
    return arenas_;
  }
  /**
   * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
   */
  @Override
  public int getArenasCount() {
    return arenas_.size();
  }
  /**
   * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
   */
  @Override
  public SlimPlayerArenaStatus getArenas(int index) {
    return arenas_.get(index);
  }
  /**
   * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
   */
  @Override
  public SlimPlayerArenaStatusOrBuilder getArenasOrBuilder(
      int index) {
    return arenas_.get(index);
  }

  public static final int PVPOFFSET_FIELD_NUMBER = 6;
  private int pvpOffset_;
  /**
   * <code>sint32 pvpOffset = 6;</code>
   * @return The pvpOffset.
   */
  @Override
  public int getPvpOffset() {
    return pvpOffset_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (level_ != 0) {
      output.writeInt32(2, level_);
    }
    if (allyCode_ != 0L) {
      output.writeInt64(3, allyCode_);
    }
    if (!getPlayerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, playerId_);
    }
    for (int i = 0; i < arenas_.size(); i++) {
      output.writeMessage(5, arenas_.get(i));
    }
    if (pvpOffset_ != 0) {
      output.writeSInt32(6, pvpOffset_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (level_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, level_);
    }
    if (allyCode_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, allyCode_);
    }
    if (!getPlayerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, playerId_);
    }
    for (int i = 0; i < arenas_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, arenas_.get(i));
    }
    if (pvpOffset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(6, pvpOffset_);
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
    if (!(obj instanceof SlimPlayerArenaProfileResponse)) {
      return super.equals(obj);
    }
    SlimPlayerArenaProfileResponse other = (SlimPlayerArenaProfileResponse) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getLevel()
        != other.getLevel()) return false;
    if (getAllyCode()
        != other.getAllyCode()) return false;
    if (!getPlayerId()
        .equals(other.getPlayerId())) return false;
    if (!getArenasList()
        .equals(other.getArenasList())) return false;
    if (getPvpOffset()
        != other.getPvpOffset()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getLevel();
    hash = (37 * hash) + ALLYCODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAllyCode());
    hash = (37 * hash) + PLAYERID_FIELD_NUMBER;
    hash = (53 * hash) + getPlayerId().hashCode();
    if (getArenasCount() > 0) {
      hash = (37 * hash) + ARENAS_FIELD_NUMBER;
      hash = (53 * hash) + getArenasList().hashCode();
    }
    hash = (37 * hash) + PVPOFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getPvpOffset();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SlimPlayerArenaProfileResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SlimPlayerArenaProfileResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SlimPlayerArenaProfileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SlimPlayerArenaProfileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SlimPlayerArenaProfileResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SlimPlayerArenaProfileResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SlimPlayerArenaProfileResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SlimPlayerArenaProfileResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SlimPlayerArenaProfileResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SlimPlayerArenaProfileResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SlimPlayerArenaProfileResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SlimPlayerArenaProfileResponse parseFrom(
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
  public static Builder newBuilder(SlimPlayerArenaProfileResponse prototype) {
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
   * Protobuf type {@code serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaProfileResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaProfileResponse)
      SlimPlayerArenaProfileResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SlimPlayerArenaProfileResponseOuterClass.internal_static_serenno_protos_slimPlayerArenaProfileResponse_SlimPlayerArenaProfileResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SlimPlayerArenaProfileResponseOuterClass.internal_static_serenno_protos_slimPlayerArenaProfileResponse_SlimPlayerArenaProfileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SlimPlayerArenaProfileResponse.class, Builder.class);
    }

    // Construct using serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaProfileResponse.newBuilder()
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
        getArenasFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      name_ = "";

      level_ = 0;

      allyCode_ = 0L;

      playerId_ = "";

      if (arenasBuilder_ == null) {
        arenas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        arenasBuilder_.clear();
      }
      pvpOffset_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SlimPlayerArenaProfileResponseOuterClass.internal_static_serenno_protos_slimPlayerArenaProfileResponse_SlimPlayerArenaProfileResponse_descriptor;
    }

    @Override
    public SlimPlayerArenaProfileResponse getDefaultInstanceForType() {
      return SlimPlayerArenaProfileResponse.getDefaultInstance();
    }

    @Override
    public SlimPlayerArenaProfileResponse build() {
      SlimPlayerArenaProfileResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public SlimPlayerArenaProfileResponse buildPartial() {
      SlimPlayerArenaProfileResponse result = new SlimPlayerArenaProfileResponse(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.level_ = level_;
      result.allyCode_ = allyCode_;
      result.playerId_ = playerId_;
      if (arenasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          arenas_ = java.util.Collections.unmodifiableList(arenas_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.arenas_ = arenas_;
      } else {
        result.arenas_ = arenasBuilder_.build();
      }
      result.pvpOffset_ = pvpOffset_;
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
      if (other instanceof SlimPlayerArenaProfileResponse) {
        return mergeFrom((SlimPlayerArenaProfileResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SlimPlayerArenaProfileResponse other) {
      if (other == SlimPlayerArenaProfileResponse.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getLevel() != 0) {
        setLevel(other.getLevel());
      }
      if (other.getAllyCode() != 0L) {
        setAllyCode(other.getAllyCode());
      }
      if (!other.getPlayerId().isEmpty()) {
        playerId_ = other.playerId_;
        onChanged();
      }
      if (arenasBuilder_ == null) {
        if (!other.arenas_.isEmpty()) {
          if (arenas_.isEmpty()) {
            arenas_ = other.arenas_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureArenasIsMutable();
            arenas_.addAll(other.arenas_);
          }
          onChanged();
        }
      } else {
        if (!other.arenas_.isEmpty()) {
          if (arenasBuilder_.isEmpty()) {
            arenasBuilder_.dispose();
            arenasBuilder_ = null;
            arenas_ = other.arenas_;
            bitField0_ = (bitField0_ & ~0x00000001);
            arenasBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getArenasFieldBuilder() : null;
          } else {
            arenasBuilder_.addAllMessages(other.arenas_);
          }
        }
      }
      if (other.getPvpOffset() != 0) {
        setPvpOffset(other.getPvpOffset());
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
      SlimPlayerArenaProfileResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SlimPlayerArenaProfileResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int level_ ;
    /**
     * <code>int32 level = 2;</code>
     * @return The level.
     */
    @Override
    public int getLevel() {
      return level_;
    }
    /**
     * <code>int32 level = 2;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(int value) {
      
      level_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 level = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      
      level_ = 0;
      onChanged();
      return this;
    }

    private long allyCode_ ;
    /**
     * <code>int64 allyCode = 3;</code>
     * @return The allyCode.
     */
    @Override
    public long getAllyCode() {
      return allyCode_;
    }
    /**
     * <code>int64 allyCode = 3;</code>
     * @param value The allyCode to set.
     * @return This builder for chaining.
     */
    public Builder setAllyCode(long value) {
      
      allyCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 allyCode = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllyCode() {
      
      allyCode_ = 0L;
      onChanged();
      return this;
    }

    private Object playerId_ = "";
    /**
     * <code>string playerId = 4;</code>
     * @return The playerId.
     */
    public String getPlayerId() {
      Object ref = playerId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        playerId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string playerId = 4;</code>
     * @return The bytes for playerId.
     */
    public com.google.protobuf.ByteString
        getPlayerIdBytes() {
      Object ref = playerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        playerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string playerId = 4;</code>
     * @param value The playerId to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      playerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string playerId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerId() {
      
      playerId_ = getDefaultInstance().getPlayerId();
      onChanged();
      return this;
    }
    /**
     * <code>string playerId = 4;</code>
     * @param value The bytes for playerId to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      playerId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<SlimPlayerArenaStatus> arenas_ =
      java.util.Collections.emptyList();
    private void ensureArenasIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        arenas_ = new java.util.ArrayList<SlimPlayerArenaStatus>(arenas_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        SlimPlayerArenaStatus, SlimPlayerArenaStatus.Builder, SlimPlayerArenaStatusOrBuilder> arenasBuilder_;

    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public java.util.List<SlimPlayerArenaStatus> getArenasList() {
      if (arenasBuilder_ == null) {
        return java.util.Collections.unmodifiableList(arenas_);
      } else {
        return arenasBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public int getArenasCount() {
      if (arenasBuilder_ == null) {
        return arenas_.size();
      } else {
        return arenasBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public SlimPlayerArenaStatus getArenas(int index) {
      if (arenasBuilder_ == null) {
        return arenas_.get(index);
      } else {
        return arenasBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public Builder setArenas(
        int index, SlimPlayerArenaStatus value) {
      if (arenasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArenasIsMutable();
        arenas_.set(index, value);
        onChanged();
      } else {
        arenasBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public Builder setArenas(
        int index, SlimPlayerArenaStatus.Builder builderForValue) {
      if (arenasBuilder_ == null) {
        ensureArenasIsMutable();
        arenas_.set(index, builderForValue.build());
        onChanged();
      } else {
        arenasBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public Builder addArenas(SlimPlayerArenaStatus value) {
      if (arenasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArenasIsMutable();
        arenas_.add(value);
        onChanged();
      } else {
        arenasBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public Builder addArenas(
        int index, SlimPlayerArenaStatus value) {
      if (arenasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArenasIsMutable();
        arenas_.add(index, value);
        onChanged();
      } else {
        arenasBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public Builder addArenas(
        SlimPlayerArenaStatus.Builder builderForValue) {
      if (arenasBuilder_ == null) {
        ensureArenasIsMutable();
        arenas_.add(builderForValue.build());
        onChanged();
      } else {
        arenasBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public Builder addArenas(
        int index, SlimPlayerArenaStatus.Builder builderForValue) {
      if (arenasBuilder_ == null) {
        ensureArenasIsMutable();
        arenas_.add(index, builderForValue.build());
        onChanged();
      } else {
        arenasBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public Builder addAllArenas(
        Iterable<? extends SlimPlayerArenaStatus> values) {
      if (arenasBuilder_ == null) {
        ensureArenasIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, arenas_);
        onChanged();
      } else {
        arenasBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public Builder clearArenas() {
      if (arenasBuilder_ == null) {
        arenas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        arenasBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public Builder removeArenas(int index) {
      if (arenasBuilder_ == null) {
        ensureArenasIsMutable();
        arenas_.remove(index);
        onChanged();
      } else {
        arenasBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public SlimPlayerArenaStatus.Builder getArenasBuilder(
        int index) {
      return getArenasFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public SlimPlayerArenaStatusOrBuilder getArenasOrBuilder(
        int index) {
      if (arenasBuilder_ == null) {
        return arenas_.get(index);  } else {
        return arenasBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public java.util.List<? extends SlimPlayerArenaStatusOrBuilder>
         getArenasOrBuilderList() {
      if (arenasBuilder_ != null) {
        return arenasBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(arenas_);
      }
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public SlimPlayerArenaStatus.Builder addArenasBuilder() {
      return getArenasFieldBuilder().addBuilder(
          SlimPlayerArenaStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public SlimPlayerArenaStatus.Builder addArenasBuilder(
        int index) {
      return getArenasFieldBuilder().addBuilder(
          index, SlimPlayerArenaStatus.getDefaultInstance());
    }
    /**
     * <code>repeated .serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus arenas = 5;</code>
     */
    public java.util.List<SlimPlayerArenaStatus.Builder>
         getArenasBuilderList() {
      return getArenasFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        SlimPlayerArenaStatus, SlimPlayerArenaStatus.Builder, SlimPlayerArenaStatusOrBuilder>
        getArenasFieldBuilder() {
      if (arenasBuilder_ == null) {
        arenasBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            SlimPlayerArenaStatus, SlimPlayerArenaStatus.Builder, SlimPlayerArenaStatusOrBuilder>(
                arenas_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        arenas_ = null;
      }
      return arenasBuilder_;
    }

    private int pvpOffset_ ;
    /**
     * <code>sint32 pvpOffset = 6;</code>
     * @return The pvpOffset.
     */
    @Override
    public int getPvpOffset() {
      return pvpOffset_;
    }
    /**
     * <code>sint32 pvpOffset = 6;</code>
     * @param value The pvpOffset to set.
     * @return This builder for chaining.
     */
    public Builder setPvpOffset(int value) {
      
      pvpOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 pvpOffset = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPvpOffset() {
      
      pvpOffset_ = 0;
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


    // @@protoc_insertion_point(builder_scope:serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaProfileResponse)
  }

  // @@protoc_insertion_point(class_scope:serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaProfileResponse)
  private static final SlimPlayerArenaProfileResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SlimPlayerArenaProfileResponse();
  }

  public static SlimPlayerArenaProfileResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SlimPlayerArenaProfileResponse>
      PARSER = new com.google.protobuf.AbstractParser<SlimPlayerArenaProfileResponse>() {
    @Override
    public SlimPlayerArenaProfileResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SlimPlayerArenaProfileResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SlimPlayerArenaProfileResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SlimPlayerArenaProfileResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public SlimPlayerArenaProfileResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
