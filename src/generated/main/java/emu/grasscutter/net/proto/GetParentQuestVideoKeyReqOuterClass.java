// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetParentQuestVideoKeyReq.proto

package emu.grasscutter.net.proto;

public final class GetParentQuestVideoKeyReqOuterClass {
  private GetParentQuestVideoKeyReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetParentQuestVideoKeyReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetParentQuestVideoKeyReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 parentQuestId = 14;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();
  }
  /**
   * Protobuf type {@code GetParentQuestVideoKeyReq}
   */
  public static final class GetParentQuestVideoKeyReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetParentQuestVideoKeyReq)
      GetParentQuestVideoKeyReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetParentQuestVideoKeyReq.newBuilder() to construct.
    private GetParentQuestVideoKeyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetParentQuestVideoKeyReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetParentQuestVideoKeyReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.internal_static_GetParentQuestVideoKeyReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.internal_static_GetParentQuestVideoKeyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq.class, emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq.Builder.class);
    }

    /**
     * Protobuf enum {@code GetParentQuestVideoKeyReq.OOGDEGOABBN}
     */
    public enum OOGDEGOABBN
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 479;</code>
       */
      PEPPOHPHJOJ(1, 479),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final OOGDEGOABBN DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final OOGDEGOABBN EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 479;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 479;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static OOGDEGOABBN valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OOGDEGOABBN forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 479: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OOGDEGOABBN>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          OOGDEGOABBN> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OOGDEGOABBN>() {
              public OOGDEGOABBN findValueByNumber(int number) {
                return OOGDEGOABBN.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final OOGDEGOABBN[] VALUES = getStaticValuesArray();
      private static OOGDEGOABBN[] getStaticValuesArray() {
        return new OOGDEGOABBN[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static OOGDEGOABBN valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private OOGDEGOABBN(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:GetParentQuestVideoKeyReq.OOGDEGOABBN)
    }

    public static final int PARENTQUESTID_FIELD_NUMBER = 14;
    private int parentQuestId_ = 0;
    /**
     * <code>uint32 parentQuestId = 14;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
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
      if (parentQuestId_ != 0) {
        output.writeUInt32(14, parentQuestId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, parentQuestId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq other = (emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq) obj;

      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + PARENTQUESTID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq prototype) {
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
     * Protobuf type {@code GetParentQuestVideoKeyReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetParentQuestVideoKeyReq)
        emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.internal_static_GetParentQuestVideoKeyReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.internal_static_GetParentQuestVideoKeyReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq.class, emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        parentQuestId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.internal_static_GetParentQuestVideoKeyReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq build() {
        emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq buildPartial() {
        emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq result = new emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.parentQuestId_ = parentQuestId_;
        }
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
        if (other instanceof emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq other) {
        if (other == emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq.getDefaultInstance()) return this;
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 112: {
                parentQuestId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int parentQuestId_ ;
      /**
       * <code>uint32 parentQuestId = 14;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parentQuestId = 14;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parentQuestId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        parentQuestId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetParentQuestVideoKeyReq)
    }

    // @@protoc_insertion_point(class_scope:GetParentQuestVideoKeyReq)
    private static final emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq();
    }

    public static emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetParentQuestVideoKeyReq>
        PARSER = new com.google.protobuf.AbstractParser<GetParentQuestVideoKeyReq>() {
      @java.lang.Override
      public GetParentQuestVideoKeyReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<GetParentQuestVideoKeyReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetParentQuestVideoKeyReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetParentQuestVideoKeyReqOuterClass.GetParentQuestVideoKeyReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetParentQuestVideoKeyReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetParentQuestVideoKeyReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GetParentQuestVideoKeyReq.proto\"\224\001\n\031Ge" +
      "tParentQuestVideoKeyReq\022\025\n\rparentQuestId" +
      "\030\016 \001(\r\"`\n\013OOGDEGOABBN\022\010\n\004NONE\020\000\022\020\n\013PEPPO" +
      "HPHJOJ\020\337\003\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOE" +
      "A\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetParentQuestVideoKeyReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetParentQuestVideoKeyReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetParentQuestVideoKeyReq_descriptor,
        new java.lang.String[] { "ParentQuestId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
