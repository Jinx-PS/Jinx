// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrickBreakerSetChangingReq.proto

package emu.grasscutter.net.proto;

public final class BrickBreakerSetChangingReqOuterClass {
  private BrickBreakerSetChangingReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BrickBreakerSetChangingReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BrickBreakerSetChangingReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isChanging = 13;</code>
     * @return The isChanging.
     */
    boolean getIsChanging();
  }
  /**
   * <pre>
   *enum GCOKFLLGHPD {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 5371;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code BrickBreakerSetChangingReq}
   */
  public static final class BrickBreakerSetChangingReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BrickBreakerSetChangingReq)
      BrickBreakerSetChangingReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BrickBreakerSetChangingReq.newBuilder() to construct.
    private BrickBreakerSetChangingReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BrickBreakerSetChangingReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BrickBreakerSetChangingReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BrickBreakerSetChangingReq(
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
            case 104: {

              isChanging_ = input.readBool();
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
      return emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.internal_static_BrickBreakerSetChangingReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.internal_static_BrickBreakerSetChangingReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.class, emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.Builder.class);
    }

    public static final int ISCHANGING_FIELD_NUMBER = 13;
    private boolean isChanging_;
    /**
     * <code>bool isChanging = 13;</code>
     * @return The isChanging.
     */
    @java.lang.Override
    public boolean getIsChanging() {
      return isChanging_;
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
      if (isChanging_ != false) {
        output.writeBool(13, isChanging_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isChanging_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isChanging_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq other = (emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq) obj;

      if (getIsChanging()
          != other.getIsChanging()) return false;
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
      hash = (37 * hash) + ISCHANGING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsChanging());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq prototype) {
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
     *enum GCOKFLLGHPD {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 5371;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code BrickBreakerSetChangingReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BrickBreakerSetChangingReq)
        emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.internal_static_BrickBreakerSetChangingReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.internal_static_BrickBreakerSetChangingReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.class, emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.newBuilder()
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
        isChanging_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.internal_static_BrickBreakerSetChangingReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq build() {
        emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq buildPartial() {
        emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq result = new emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq(this);
        result.isChanging_ = isChanging_;
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
        if (other instanceof emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq) {
          return mergeFrom((emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq other) {
        if (other == emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.getDefaultInstance()) return this;
        if (other.getIsChanging() != false) {
          setIsChanging(other.getIsChanging());
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
        emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isChanging_ ;
      /**
       * <code>bool isChanging = 13;</code>
       * @return The isChanging.
       */
      @java.lang.Override
      public boolean getIsChanging() {
        return isChanging_;
      }
      /**
       * <code>bool isChanging = 13;</code>
       * @param value The isChanging to set.
       * @return This builder for chaining.
       */
      public Builder setIsChanging(boolean value) {
        
        isChanging_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isChanging = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsChanging() {
        
        isChanging_ = false;
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


      // @@protoc_insertion_point(builder_scope:BrickBreakerSetChangingReq)
    }

    // @@protoc_insertion_point(class_scope:BrickBreakerSetChangingReq)
    private static final emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq();
    }

    public static emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BrickBreakerSetChangingReq>
        PARSER = new com.google.protobuf.AbstractParser<BrickBreakerSetChangingReq>() {
      @java.lang.Override
      public BrickBreakerSetChangingReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BrickBreakerSetChangingReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BrickBreakerSetChangingReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BrickBreakerSetChangingReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BrickBreakerSetChangingReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BrickBreakerSetChangingReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n BrickBreakerSetChangingReq.proto\"0\n\032Br" +
      "ickBreakerSetChangingReq\022\022\n\nisChanging\030\r" +
      " \001(\010B\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BrickBreakerSetChangingReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BrickBreakerSetChangingReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BrickBreakerSetChangingReq_descriptor,
        new java.lang.String[] { "IsChanging", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
