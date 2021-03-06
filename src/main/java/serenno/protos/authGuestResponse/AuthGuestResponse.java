// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AuthGuestResponse.proto

package serenno.protos.authGuestResponse;

/**
 * Protobuf type {@code serenno.protos.authGuestResponse.AuthGuestResponse}
 */
public final class AuthGuestResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:serenno.protos.authGuestResponse.AuthGuestResponse)
    AuthGuestResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthGuestResponse.newBuilder() to construct.
  private AuthGuestResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthGuestResponse() {
    authId_ = "";
    authToken_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthGuestResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuthGuestResponse(
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

            authId_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            authToken_ = s;
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
    return AuthGuestResponseOuterClass.internal_static_serenno_authGuestResponse_AuthGuestResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return AuthGuestResponseOuterClass.internal_static_serenno_authGuestResponse_AuthGuestResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AuthGuestResponse.class, Builder.class);
  }

  public static final int AUTH_ID_FIELD_NUMBER = 1;
  private volatile Object authId_;
  /**
   * <code>string auth_id = 1;</code>
   * @return The authId.
   */
  @Override
  public String getAuthId() {
    Object ref = authId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      authId_ = s;
      return s;
    }
  }
  /**
   * <code>string auth_id = 1;</code>
   * @return The bytes for authId.
   */
  @Override
  public com.google.protobuf.ByteString
      getAuthIdBytes() {
    Object ref = authId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      authId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTH_TOKEN_FIELD_NUMBER = 2;
  private volatile Object authToken_;
  /**
   * <code>string auth_token = 2;</code>
   * @return The authToken.
   */
  @Override
  public String getAuthToken() {
    Object ref = authToken_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      authToken_ = s;
      return s;
    }
  }
  /**
   * <code>string auth_token = 2;</code>
   * @return The bytes for authToken.
   */
  @Override
  public com.google.protobuf.ByteString
      getAuthTokenBytes() {
    Object ref = authToken_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      authToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getAuthIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, authId_);
    }
    if (!getAuthTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, authToken_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAuthIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, authId_);
    }
    if (!getAuthTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, authToken_);
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
    if (!(obj instanceof AuthGuestResponse)) {
      return super.equals(obj);
    }
    AuthGuestResponse other = (AuthGuestResponse) obj;

    if (!getAuthId()
        .equals(other.getAuthId())) return false;
    if (!getAuthToken()
        .equals(other.getAuthToken())) return false;
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
    hash = (37 * hash) + AUTH_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAuthId().hashCode();
    hash = (37 * hash) + AUTH_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAuthToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AuthGuestResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuthGuestResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuthGuestResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuthGuestResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuthGuestResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuthGuestResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuthGuestResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AuthGuestResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AuthGuestResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AuthGuestResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AuthGuestResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AuthGuestResponse parseFrom(
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
  public static Builder newBuilder(AuthGuestResponse prototype) {
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
   * Protobuf type {@code serenno.protos.authGuestResponse.AuthGuestResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:serenno.protos.authGuestResponse.AuthGuestResponse)
      AuthGuestResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AuthGuestResponseOuterClass.internal_static_serenno_authGuestResponse_AuthGuestResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AuthGuestResponseOuterClass.internal_static_serenno_authGuestResponse_AuthGuestResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AuthGuestResponse.class, Builder.class);
    }

    // Construct using serenno.protos.authGuestResponse.AuthGuestResponse.newBuilder()
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
      authId_ = "";

      authToken_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return AuthGuestResponseOuterClass.internal_static_serenno_authGuestResponse_AuthGuestResponse_descriptor;
    }

    @Override
    public AuthGuestResponse getDefaultInstanceForType() {
      return AuthGuestResponse.getDefaultInstance();
    }

    @Override
    public AuthGuestResponse build() {
      AuthGuestResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public AuthGuestResponse buildPartial() {
      AuthGuestResponse result = new AuthGuestResponse(this);
      result.authId_ = authId_;
      result.authToken_ = authToken_;
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
      if (other instanceof AuthGuestResponse) {
        return mergeFrom((AuthGuestResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AuthGuestResponse other) {
      if (other == AuthGuestResponse.getDefaultInstance()) return this;
      if (!other.getAuthId().isEmpty()) {
        authId_ = other.authId_;
        onChanged();
      }
      if (!other.getAuthToken().isEmpty()) {
        authToken_ = other.authToken_;
        onChanged();
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
      AuthGuestResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AuthGuestResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object authId_ = "";
    /**
     * <code>string auth_id = 1;</code>
     * @return The authId.
     */
    public String getAuthId() {
      Object ref = authId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        authId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string auth_id = 1;</code>
     * @return The bytes for authId.
     */
    public com.google.protobuf.ByteString
        getAuthIdBytes() {
      Object ref = authId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        authId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string auth_id = 1;</code>
     * @param value The authId to set.
     * @return This builder for chaining.
     */
    public Builder setAuthId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      authId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string auth_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthId() {
      
      authId_ = getDefaultInstance().getAuthId();
      onChanged();
      return this;
    }
    /**
     * <code>string auth_id = 1;</code>
     * @param value The bytes for authId to set.
     * @return This builder for chaining.
     */
    public Builder setAuthIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      authId_ = value;
      onChanged();
      return this;
    }

    private Object authToken_ = "";
    /**
     * <code>string auth_token = 2;</code>
     * @return The authToken.
     */
    public String getAuthToken() {
      Object ref = authToken_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        authToken_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string auth_token = 2;</code>
     * @return The bytes for authToken.
     */
    public com.google.protobuf.ByteString
        getAuthTokenBytes() {
      Object ref = authToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        authToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string auth_token = 2;</code>
     * @param value The authToken to set.
     * @return This builder for chaining.
     */
    public Builder setAuthToken(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      authToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string auth_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthToken() {
      
      authToken_ = getDefaultInstance().getAuthToken();
      onChanged();
      return this;
    }
    /**
     * <code>string auth_token = 2;</code>
     * @param value The bytes for authToken to set.
     * @return This builder for chaining.
     */
    public Builder setAuthTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      authToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:serenno.protos.authGuestResponse.AuthGuestResponse)
  }

  // @@protoc_insertion_point(class_scope:serenno.protos.authGuestResponse.AuthGuestResponse)
  private static final AuthGuestResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AuthGuestResponse();
  }

  public static AuthGuestResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthGuestResponse>
      PARSER = new com.google.protobuf.AbstractParser<AuthGuestResponse>() {
    @Override
    public AuthGuestResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuthGuestResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthGuestResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AuthGuestResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public AuthGuestResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

