// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DoRoguelikeDungeonCardGachaReq.proto

package emu.grasscutter.net.proto;

public final class DoRoguelikeDungeonCardGachaReqOuterClass {
  private DoRoguelikeDungeonCardGachaReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DoRoguelikeDungeonCardGachaReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DoRoguelikeDungeonCardGachaReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cellId = 13;</code>
     * @return The cellId.
     */
    int getCellId();

    /**
     * <code>uint32 dungeonId = 6;</code>
     * @return The dungeonId.
     */
    int getDungeonId();
  }
  /**
   * <pre>
   *enum GGEHBAGNIOK {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 8752;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code DoRoguelikeDungeonCardGachaReq}
   */
  public static final class DoRoguelikeDungeonCardGachaReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DoRoguelikeDungeonCardGachaReq)
      DoRoguelikeDungeonCardGachaReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DoRoguelikeDungeonCardGachaReq.newBuilder() to construct.
    private DoRoguelikeDungeonCardGachaReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DoRoguelikeDungeonCardGachaReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DoRoguelikeDungeonCardGachaReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DoRoguelikeDungeonCardGachaReq(
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
            case 48: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 104: {

              cellId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.internal_static_DoRoguelikeDungeonCardGachaReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.internal_static_DoRoguelikeDungeonCardGachaReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq.class, emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq.Builder.class);
    }

    public static final int CELLID_FIELD_NUMBER = 13;
    private int cellId_;
    /**
     * <code>uint32 cellId = 13;</code>
     * @return The cellId.
     */
    @java.lang.Override
    public int getCellId() {
      return cellId_;
    }

    public static final int DUNGEONID_FIELD_NUMBER = 6;
    private int dungeonId_;
    /**
     * <code>uint32 dungeonId = 6;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
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
      if (dungeonId_ != 0) {
        output.writeUInt32(6, dungeonId_);
      }
      if (cellId_ != 0) {
        output.writeUInt32(13, cellId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, dungeonId_);
      }
      if (cellId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, cellId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq other = (emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq) obj;

      if (getCellId()
          != other.getCellId()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
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
      hash = (37 * hash) + CELLID_FIELD_NUMBER;
      hash = (53 * hash) + getCellId();
      hash = (37 * hash) + DUNGEONID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq prototype) {
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
     *enum GGEHBAGNIOK {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 8752;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code DoRoguelikeDungeonCardGachaReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DoRoguelikeDungeonCardGachaReq)
        emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.internal_static_DoRoguelikeDungeonCardGachaReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.internal_static_DoRoguelikeDungeonCardGachaReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq.class, emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq.newBuilder()
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
        cellId_ = 0;

        dungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.internal_static_DoRoguelikeDungeonCardGachaReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq build() {
        emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq buildPartial() {
        emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq result = new emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq(this);
        result.cellId_ = cellId_;
        result.dungeonId_ = dungeonId_;
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
        if (other instanceof emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq) {
          return mergeFrom((emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq other) {
        if (other == emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq.getDefaultInstance()) return this;
        if (other.getCellId() != 0) {
          setCellId(other.getCellId());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
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
        emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cellId_ ;
      /**
       * <code>uint32 cellId = 13;</code>
       * @return The cellId.
       */
      @java.lang.Override
      public int getCellId() {
        return cellId_;
      }
      /**
       * <code>uint32 cellId = 13;</code>
       * @param value The cellId to set.
       * @return This builder for chaining.
       */
      public Builder setCellId(int value) {
        
        cellId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cellId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellId() {
        
        cellId_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeonId = 6;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeonId = 6;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeonId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DoRoguelikeDungeonCardGachaReq)
    }

    // @@protoc_insertion_point(class_scope:DoRoguelikeDungeonCardGachaReq)
    private static final emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq();
    }

    public static emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DoRoguelikeDungeonCardGachaReq>
        PARSER = new com.google.protobuf.AbstractParser<DoRoguelikeDungeonCardGachaReq>() {
      @java.lang.Override
      public DoRoguelikeDungeonCardGachaReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DoRoguelikeDungeonCardGachaReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DoRoguelikeDungeonCardGachaReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DoRoguelikeDungeonCardGachaReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DoRoguelikeDungeonCardGachaReqOuterClass.DoRoguelikeDungeonCardGachaReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DoRoguelikeDungeonCardGachaReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DoRoguelikeDungeonCardGachaReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$DoRoguelikeDungeonCardGachaReq.proto\"C" +
      "\n\036DoRoguelikeDungeonCardGachaReq\022\016\n\006cell" +
      "Id\030\r \001(\r\022\021\n\tdungeonId\030\006 \001(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DoRoguelikeDungeonCardGachaReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DoRoguelikeDungeonCardGachaReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DoRoguelikeDungeonCardGachaReq_descriptor,
        new java.lang.String[] { "CellId", "DungeonId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}