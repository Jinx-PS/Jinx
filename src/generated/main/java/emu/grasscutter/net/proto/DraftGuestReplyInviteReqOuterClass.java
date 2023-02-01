// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DraftGuestReplyInviteReq.proto

package emu.grasscutter.net.proto;

public final class DraftGuestReplyInviteReqOuterClass {
  private DraftGuestReplyInviteReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DraftGuestReplyInviteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DraftGuestReplyInviteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isAgree = 13;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();

    /**
     * <code>uint32 draftId = 10;</code>
     * @return The draftId.
     */
    int getDraftId();
  }
  /**
   * <pre>
   *enum PBDFCHILMPK {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 5474;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code DraftGuestReplyInviteReq}
   */
  public static final class DraftGuestReplyInviteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DraftGuestReplyInviteReq)
      DraftGuestReplyInviteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DraftGuestReplyInviteReq.newBuilder() to construct.
    private DraftGuestReplyInviteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DraftGuestReplyInviteReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DraftGuestReplyInviteReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DraftGuestReplyInviteReq(
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
            case 80: {

              draftId_ = input.readUInt32();
              break;
            }
            case 104: {

              isAgree_ = input.readBool();
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
      return emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.internal_static_DraftGuestReplyInviteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.internal_static_DraftGuestReplyInviteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq.class, emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq.Builder.class);
    }

    public static final int ISAGREE_FIELD_NUMBER = 13;
    private boolean isAgree_;
    /**
     * <code>bool isAgree = 13;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
    }

    public static final int DRAFTID_FIELD_NUMBER = 10;
    private int draftId_;
    /**
     * <code>uint32 draftId = 10;</code>
     * @return The draftId.
     */
    @java.lang.Override
    public int getDraftId() {
      return draftId_;
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
      if (draftId_ != 0) {
        output.writeUInt32(10, draftId_);
      }
      if (isAgree_ != false) {
        output.writeBool(13, isAgree_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (draftId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, draftId_);
      }
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isAgree_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq other = (emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq) obj;

      if (getIsAgree()
          != other.getIsAgree()) return false;
      if (getDraftId()
          != other.getDraftId()) return false;
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
      hash = (37 * hash) + ISAGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (37 * hash) + DRAFTID_FIELD_NUMBER;
      hash = (53 * hash) + getDraftId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq prototype) {
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
     *enum PBDFCHILMPK {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 5474;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code DraftGuestReplyInviteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DraftGuestReplyInviteReq)
        emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.internal_static_DraftGuestReplyInviteReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.internal_static_DraftGuestReplyInviteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq.class, emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq.newBuilder()
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
        isAgree_ = false;

        draftId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.internal_static_DraftGuestReplyInviteReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq build() {
        emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq buildPartial() {
        emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq result = new emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq(this);
        result.isAgree_ = isAgree_;
        result.draftId_ = draftId_;
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
        if (other instanceof emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq) {
          return mergeFrom((emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq other) {
        if (other == emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq.getDefaultInstance()) return this;
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
        }
        if (other.getDraftId() != 0) {
          setDraftId(other.getDraftId());
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
        emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isAgree_ ;
      /**
       * <code>bool isAgree = 13;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool isAgree = 13;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isAgree = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        
        isAgree_ = false;
        onChanged();
        return this;
      }

      private int draftId_ ;
      /**
       * <code>uint32 draftId = 10;</code>
       * @return The draftId.
       */
      @java.lang.Override
      public int getDraftId() {
        return draftId_;
      }
      /**
       * <code>uint32 draftId = 10;</code>
       * @param value The draftId to set.
       * @return This builder for chaining.
       */
      public Builder setDraftId(int value) {
        
        draftId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 draftId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDraftId() {
        
        draftId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DraftGuestReplyInviteReq)
    }

    // @@protoc_insertion_point(class_scope:DraftGuestReplyInviteReq)
    private static final emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq();
    }

    public static emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DraftGuestReplyInviteReq>
        PARSER = new com.google.protobuf.AbstractParser<DraftGuestReplyInviteReq>() {
      @java.lang.Override
      public DraftGuestReplyInviteReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DraftGuestReplyInviteReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DraftGuestReplyInviteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DraftGuestReplyInviteReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DraftGuestReplyInviteReqOuterClass.DraftGuestReplyInviteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DraftGuestReplyInviteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DraftGuestReplyInviteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036DraftGuestReplyInviteReq.proto\"<\n\030Draf" +
      "tGuestReplyInviteReq\022\017\n\007isAgree\030\r \001(\010\022\017\n" +
      "\007draftId\030\n \001(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DraftGuestReplyInviteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DraftGuestReplyInviteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DraftGuestReplyInviteReq_descriptor,
        new java.lang.String[] { "IsAgree", "DraftId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
