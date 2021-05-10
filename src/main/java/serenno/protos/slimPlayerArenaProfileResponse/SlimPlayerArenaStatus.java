// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlimPlayerArenaProfileResponse.proto

package serenno.protos.slimPlayerArenaProfileResponse;

/**
 * Protobuf type {@code serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus}
 */
public final class SlimPlayerArenaStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus)
    SlimPlayerArenaStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SlimPlayerArenaStatus.newBuilder() to construct.
  private SlimPlayerArenaStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SlimPlayerArenaStatus() {
    arenaType_ = 0;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new SlimPlayerArenaStatus();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SlimPlayerArenaStatus(
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
          case 8: {
            int rawValue = input.readEnum();

            arenaType_ = rawValue;
            break;
          }
          case 16: {

            place_ = input.readInt32();
            break;
          }
          case 26: {
            SlimArenaTeam.Builder subBuilder = null;
            if (arenaTeam_ != null) {
              subBuilder = arenaTeam_.toBuilder();
            }
            arenaTeam_ = input.readMessage(SlimArenaTeam.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(arenaTeam_);
              arenaTeam_ = subBuilder.buildPartial();
            }

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
    return SlimPlayerArenaProfileResponseOuterClass.internal_static_serenno_protos_slimPlayerArenaProfileResponse_SlimPlayerArenaStatus_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SlimPlayerArenaProfileResponseOuterClass.internal_static_serenno_protos_slimPlayerArenaProfileResponse_SlimPlayerArenaStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SlimPlayerArenaStatus.class, Builder.class);
  }

  public static final int ARENA_TYPE_FIELD_NUMBER = 1;
  private int arenaType_;
  /**
   * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaType arena_type = 1;</code>
   * @return The enum numeric value on the wire for arenaType.
   */
  @Override public int getArenaTypeValue() {
    return arenaType_;
  }
  /**
   * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaType arena_type = 1;</code>
   * @return The arenaType.
   */
  @Override public SlimPlayerArenaType getArenaType() {
    @SuppressWarnings("deprecation")
    SlimPlayerArenaType result = SlimPlayerArenaType.valueOf(arenaType_);
    return result == null ? SlimPlayerArenaType.UNRECOGNIZED : result;
  }

  public static final int PLACE_FIELD_NUMBER = 2;
  private int place_;
  /**
   * <code>int32 place = 2;</code>
   * @return The place.
   */
  @Override
  public int getPlace() {
    return place_;
  }

  public static final int ARENATEAM_FIELD_NUMBER = 3;
  private SlimArenaTeam arenaTeam_;
  /**
   * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
   * @return Whether the arenaTeam field is set.
   */
  @Override
  public boolean hasArenaTeam() {
    return arenaTeam_ != null;
  }
  /**
   * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
   * @return The arenaTeam.
   */
  @Override
  public SlimArenaTeam getArenaTeam() {
    return arenaTeam_ == null ? SlimArenaTeam.getDefaultInstance() : arenaTeam_;
  }
  /**
   * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
   */
  @Override
  public SlimArenaTeamOrBuilder getArenaTeamOrBuilder() {
    return getArenaTeam();
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
    if (arenaType_ != SlimPlayerArenaType.PlayerArena_None.getNumber()) {
      output.writeEnum(1, arenaType_);
    }
    if (place_ != 0) {
      output.writeInt32(2, place_);
    }
    if (arenaTeam_ != null) {
      output.writeMessage(3, getArenaTeam());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (arenaType_ != SlimPlayerArenaType.PlayerArena_None.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, arenaType_);
    }
    if (place_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, place_);
    }
    if (arenaTeam_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getArenaTeam());
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
    if (!(obj instanceof SlimPlayerArenaStatus)) {
      return super.equals(obj);
    }
    SlimPlayerArenaStatus other = (SlimPlayerArenaStatus) obj;

    if (arenaType_ != other.arenaType_) return false;
    if (getPlace()
        != other.getPlace()) return false;
    if (hasArenaTeam() != other.hasArenaTeam()) return false;
    if (hasArenaTeam()) {
      if (!getArenaTeam()
          .equals(other.getArenaTeam())) return false;
    }
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
    hash = (37 * hash) + ARENA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + arenaType_;
    hash = (37 * hash) + PLACE_FIELD_NUMBER;
    hash = (53 * hash) + getPlace();
    if (hasArenaTeam()) {
      hash = (37 * hash) + ARENATEAM_FIELD_NUMBER;
      hash = (53 * hash) + getArenaTeam().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SlimPlayerArenaStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SlimPlayerArenaStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SlimPlayerArenaStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SlimPlayerArenaStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SlimPlayerArenaStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SlimPlayerArenaStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SlimPlayerArenaStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SlimPlayerArenaStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SlimPlayerArenaStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SlimPlayerArenaStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SlimPlayerArenaStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SlimPlayerArenaStatus parseFrom(
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
  public static Builder newBuilder(SlimPlayerArenaStatus prototype) {
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
   * Protobuf type {@code serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus)
      SlimPlayerArenaStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SlimPlayerArenaProfileResponseOuterClass.internal_static_serenno_protos_slimPlayerArenaProfileResponse_SlimPlayerArenaStatus_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SlimPlayerArenaProfileResponseOuterClass.internal_static_serenno_protos_slimPlayerArenaProfileResponse_SlimPlayerArenaStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SlimPlayerArenaStatus.class, Builder.class);
    }

    // Construct using serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus.newBuilder()
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
      arenaType_ = 0;

      place_ = 0;

      if (arenaTeamBuilder_ == null) {
        arenaTeam_ = null;
      } else {
        arenaTeam_ = null;
        arenaTeamBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SlimPlayerArenaProfileResponseOuterClass.internal_static_serenno_protos_slimPlayerArenaProfileResponse_SlimPlayerArenaStatus_descriptor;
    }

    @Override
    public SlimPlayerArenaStatus getDefaultInstanceForType() {
      return SlimPlayerArenaStatus.getDefaultInstance();
    }

    @Override
    public SlimPlayerArenaStatus build() {
      SlimPlayerArenaStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public SlimPlayerArenaStatus buildPartial() {
      SlimPlayerArenaStatus result = new SlimPlayerArenaStatus(this);
      result.arenaType_ = arenaType_;
      result.place_ = place_;
      if (arenaTeamBuilder_ == null) {
        result.arenaTeam_ = arenaTeam_;
      } else {
        result.arenaTeam_ = arenaTeamBuilder_.build();
      }
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
      if (other instanceof SlimPlayerArenaStatus) {
        return mergeFrom((SlimPlayerArenaStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SlimPlayerArenaStatus other) {
      if (other == SlimPlayerArenaStatus.getDefaultInstance()) return this;
      if (other.arenaType_ != 0) {
        setArenaTypeValue(other.getArenaTypeValue());
      }
      if (other.getPlace() != 0) {
        setPlace(other.getPlace());
      }
      if (other.hasArenaTeam()) {
        mergeArenaTeam(other.getArenaTeam());
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
      SlimPlayerArenaStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SlimPlayerArenaStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int arenaType_ = 0;
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaType arena_type = 1;</code>
     * @return The enum numeric value on the wire for arenaType.
     */
    @Override public int getArenaTypeValue() {
      return arenaType_;
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaType arena_type = 1;</code>
     * @param value The enum numeric value on the wire for arenaType to set.
     * @return This builder for chaining.
     */
    public Builder setArenaTypeValue(int value) {
      
      arenaType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaType arena_type = 1;</code>
     * @return The arenaType.
     */
    @Override
    public SlimPlayerArenaType getArenaType() {
      @SuppressWarnings("deprecation")
      SlimPlayerArenaType result = SlimPlayerArenaType.valueOf(arenaType_);
      return result == null ? SlimPlayerArenaType.UNRECOGNIZED : result;
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaType arena_type = 1;</code>
     * @param value The arenaType to set.
     * @return This builder for chaining.
     */
    public Builder setArenaType(SlimPlayerArenaType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      arenaType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaType arena_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearArenaType() {
      
      arenaType_ = 0;
      onChanged();
      return this;
    }

    private int place_ ;
    /**
     * <code>int32 place = 2;</code>
     * @return The place.
     */
    @Override
    public int getPlace() {
      return place_;
    }
    /**
     * <code>int32 place = 2;</code>
     * @param value The place to set.
     * @return This builder for chaining.
     */
    public Builder setPlace(int value) {
      
      place_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 place = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlace() {
      
      place_ = 0;
      onChanged();
      return this;
    }

    private SlimArenaTeam arenaTeam_;
    private com.google.protobuf.SingleFieldBuilderV3<
        SlimArenaTeam, SlimArenaTeam.Builder, SlimArenaTeamOrBuilder> arenaTeamBuilder_;
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
     * @return Whether the arenaTeam field is set.
     */
    public boolean hasArenaTeam() {
      return arenaTeamBuilder_ != null || arenaTeam_ != null;
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
     * @return The arenaTeam.
     */
    public SlimArenaTeam getArenaTeam() {
      if (arenaTeamBuilder_ == null) {
        return arenaTeam_ == null ? SlimArenaTeam.getDefaultInstance() : arenaTeam_;
      } else {
        return arenaTeamBuilder_.getMessage();
      }
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
     */
    public Builder setArenaTeam(SlimArenaTeam value) {
      if (arenaTeamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        arenaTeam_ = value;
        onChanged();
      } else {
        arenaTeamBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
     */
    public Builder setArenaTeam(
        SlimArenaTeam.Builder builderForValue) {
      if (arenaTeamBuilder_ == null) {
        arenaTeam_ = builderForValue.build();
        onChanged();
      } else {
        arenaTeamBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
     */
    public Builder mergeArenaTeam(SlimArenaTeam value) {
      if (arenaTeamBuilder_ == null) {
        if (arenaTeam_ != null) {
          arenaTeam_ =
            SlimArenaTeam.newBuilder(arenaTeam_).mergeFrom(value).buildPartial();
        } else {
          arenaTeam_ = value;
        }
        onChanged();
      } else {
        arenaTeamBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
     */
    public Builder clearArenaTeam() {
      if (arenaTeamBuilder_ == null) {
        arenaTeam_ = null;
        onChanged();
      } else {
        arenaTeam_ = null;
        arenaTeamBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
     */
    public SlimArenaTeam.Builder getArenaTeamBuilder() {
      
      onChanged();
      return getArenaTeamFieldBuilder().getBuilder();
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
     */
    public SlimArenaTeamOrBuilder getArenaTeamOrBuilder() {
      if (arenaTeamBuilder_ != null) {
        return arenaTeamBuilder_.getMessageOrBuilder();
      } else {
        return arenaTeam_ == null ?
            SlimArenaTeam.getDefaultInstance() : arenaTeam_;
      }
    }
    /**
     * <code>.serenno.protos.slimPlayerArenaProfileResponse.SlimArenaTeam arenaTeam = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        SlimArenaTeam, SlimArenaTeam.Builder, SlimArenaTeamOrBuilder>
        getArenaTeamFieldBuilder() {
      if (arenaTeamBuilder_ == null) {
        arenaTeamBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            SlimArenaTeam, SlimArenaTeam.Builder, SlimArenaTeamOrBuilder>(
                getArenaTeam(),
                getParentForChildren(),
                isClean());
        arenaTeam_ = null;
      }
      return arenaTeamBuilder_;
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


    // @@protoc_insertion_point(builder_scope:serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus)
  }

  // @@protoc_insertion_point(class_scope:serenno.protos.slimPlayerArenaProfileResponse.SlimPlayerArenaStatus)
  private static final SlimPlayerArenaStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SlimPlayerArenaStatus();
  }

  public static SlimPlayerArenaStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SlimPlayerArenaStatus>
      PARSER = new com.google.protobuf.AbstractParser<SlimPlayerArenaStatus>() {
    @Override
    public SlimPlayerArenaStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SlimPlayerArenaStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SlimPlayerArenaStatus> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SlimPlayerArenaStatus> getParserForType() {
    return PARSER;
  }

  @Override
  public SlimPlayerArenaStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
