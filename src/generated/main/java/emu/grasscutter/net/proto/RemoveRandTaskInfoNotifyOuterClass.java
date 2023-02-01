// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RemoveRandTaskInfoNotify.proto

package emu.grasscutter.net.proto;

public final class RemoveRandTaskInfoNotifyOuterClass {
  private RemoveRandTaskInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RemoveRandTaskInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RemoveRandTaskInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 randTaskId = 9;</code>
     * @return The randTaskId.
     */
    int getRandTaskId();

    /**
     * <code>bool isSucc = 7;</code>
     * @return The isSucc.
     */
    boolean getIsSucc();

    /**
     * <code>.FinishReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.FinishReason reason = 2;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason getReason();
  }
  /**
   * <pre>
   *enum DJBDIIHBLKC {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 115;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code RemoveRandTaskInfoNotify}
   */
  public static final class RemoveRandTaskInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RemoveRandTaskInfoNotify)
      RemoveRandTaskInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveRandTaskInfoNotify.newBuilder() to construct.
    private RemoveRandTaskInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveRandTaskInfoNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RemoveRandTaskInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveRandTaskInfoNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
            case 16: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 56: {

              isSucc_ = input.readBool();
              break;
            }
            case 72: {

              randTaskId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.internal_static_RemoveRandTaskInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.internal_static_RemoveRandTaskInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.class, emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.Builder.class);
    }

    public static final int RANDTASKID_FIELD_NUMBER = 9;
    private int randTaskId_;
    /**
     * <code>uint32 randTaskId = 9;</code>
     * @return The randTaskId.
     */
    @java.lang.Override
    public int getRandTaskId() {
      return randTaskId_;
    }

    public static final int ISSUCC_FIELD_NUMBER = 7;
    private boolean isSucc_;
    /**
     * <code>bool isSucc = 7;</code>
     * @return The isSucc.
     */
    @java.lang.Override
    public boolean getIsSucc() {
      return isSucc_;
    }

    public static final int REASON_FIELD_NUMBER = 2;
    private int reason_;
    /**
     * <code>.FinishReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.FinishReason reason = 2;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason result = emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (reason_ != emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason.FINISH_REASON_DEFAULT.getNumber()) {
        output.writeEnum(2, reason_);
      }
      if (isSucc_ != false) {
        output.writeBool(7, isSucc_);
      }
      if (randTaskId_ != 0) {
        output.writeUInt32(9, randTaskId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason.FINISH_REASON_DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, reason_);
      }
      if (isSucc_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isSucc_);
      }
      if (randTaskId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, randTaskId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify other = (emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify) obj;

      if (getRandTaskId()
          != other.getRandTaskId()) return false;
      if (getIsSucc()
          != other.getIsSucc()) return false;
      if (reason_ != other.reason_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RANDTASKID_FIELD_NUMBER;
      hash = (53 * hash) + getRandTaskId();
      hash = (37 * hash) + ISSUCC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSucc());
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *enum DJBDIIHBLKC {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 115;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code RemoveRandTaskInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RemoveRandTaskInfoNotify)
        emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.internal_static_RemoveRandTaskInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.internal_static_RemoveRandTaskInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.class, emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        randTaskId_ = 0;

        isSucc_ = false;

        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.internal_static_RemoveRandTaskInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify build() {
        emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify buildPartial() {
        emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify result = new emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify(this);
        result.randTaskId_ = randTaskId_;
        result.isSucc_ = isSucc_;
        result.reason_ = reason_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify other) {
        if (other == emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.getDefaultInstance()) return this;
        if (other.getRandTaskId() != 0) {
          setRandTaskId(other.getRandTaskId());
        }
        if (other.getIsSucc() != false) {
          setIsSucc(other.getIsSucc());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int randTaskId_ ;
      /**
       * <code>uint32 randTaskId = 9;</code>
       * @return The randTaskId.
       */
      @java.lang.Override
      public int getRandTaskId() {
        return randTaskId_;
      }
      /**
       * <code>uint32 randTaskId = 9;</code>
       * @param value The randTaskId to set.
       * @return This builder for chaining.
       */
      public Builder setRandTaskId(int value) {
        
        randTaskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 randTaskId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRandTaskId() {
        
        randTaskId_ = 0;
        onChanged();
        return this;
      }

      private boolean isSucc_ ;
      /**
       * <code>bool isSucc = 7;</code>
       * @return The isSucc.
       */
      @java.lang.Override
      public boolean getIsSucc() {
        return isSucc_;
      }
      /**
       * <code>bool isSucc = 7;</code>
       * @param value The isSucc to set.
       * @return This builder for chaining.
       */
      public Builder setIsSucc(boolean value) {
        
        isSucc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isSucc = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSucc() {
        
        isSucc_ = false;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.FinishReason reason = 2;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.FinishReason reason = 2;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.FinishReason reason = 2;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason result = emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.FinishReason reason = 2;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.FinishReasonOuterClass.FinishReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.FinishReason reason = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RemoveRandTaskInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:RemoveRandTaskInfoNotify)
    private static final emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify();
    }

    public static emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RemoveRandTaskInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<RemoveRandTaskInfoNotify>() {
      @java.lang.Override
      public RemoveRandTaskInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RemoveRandTaskInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RemoveRandTaskInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RemoveRandTaskInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RemoveRandTaskInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RemoveRandTaskInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036RemoveRandTaskInfoNotify.proto\032\022Finish" +
      "Reason.proto\"]\n\030RemoveRandTaskInfoNotify" +
      "\022\022\n\nrandTaskId\030\t \001(\r\022\016\n\006isSucc\030\007 \001(\010\022\035\n\006" +
      "reason\030\002 \001(\0162\r.FinishReasonB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FinishReasonOuterClass.getDescriptor(),
        });
    internal_static_RemoveRandTaskInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RemoveRandTaskInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RemoveRandTaskInfoNotify_descriptor,
        new java.lang.String[] { "RandTaskId", "IsSucc", "Reason", });
    emu.grasscutter.net.proto.FinishReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
