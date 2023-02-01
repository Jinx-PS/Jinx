// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ItemGivingRsp.proto

package emu.grasscutter.net.proto;

public final class ItemGivingRspOuterClass {
  private ItemGivingRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ItemGivingRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ItemGivingRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 givingId = 2;</code>
     * @return The givingId.
     */
    int getGivingId();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 givingGroupId = 8;</code>
     * @return The givingGroupId.
     */
    int getGivingGroupId();
  }
  /**
   * Protobuf type {@code ItemGivingRsp}
   */
  public static final class ItemGivingRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ItemGivingRsp)
      ItemGivingRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ItemGivingRsp.newBuilder() to construct.
    private ItemGivingRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ItemGivingRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ItemGivingRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ItemGivingRspOuterClass.internal_static_ItemGivingRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ItemGivingRspOuterClass.internal_static_ItemGivingRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.class, emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code ItemGivingRsp.DPOCBOEGOPF}
     */
    public enum DPOCBOEGOPF
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 137;</code>
       */
      PEPPOHPHJOJ(1, 137),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final DPOCBOEGOPF DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 137;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 137;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


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
      public static DPOCBOEGOPF valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DPOCBOEGOPF forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 137: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DPOCBOEGOPF>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DPOCBOEGOPF> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DPOCBOEGOPF>() {
              public DPOCBOEGOPF findValueByNumber(int number) {
                return DPOCBOEGOPF.forNumber(number);
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
        return emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final DPOCBOEGOPF[] VALUES = getStaticValuesArray();
      private static DPOCBOEGOPF[] getStaticValuesArray() {
        return new DPOCBOEGOPF[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static DPOCBOEGOPF valueOf(
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

      private DPOCBOEGOPF(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ItemGivingRsp.DPOCBOEGOPF)
    }

    public static final int GIVINGID_FIELD_NUMBER = 2;
    private int givingId_ = 0;
    /**
     * <code>uint32 givingId = 2;</code>
     * @return The givingId.
     */
    @java.lang.Override
    public int getGivingId() {
      return givingId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int GIVINGGROUPID_FIELD_NUMBER = 8;
    private int givingGroupId_ = 0;
    /**
     * <code>uint32 givingGroupId = 8;</code>
     * @return The givingGroupId.
     */
    @java.lang.Override
    public int getGivingGroupId() {
      return givingGroupId_;
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
      if (givingId_ != 0) {
        output.writeUInt32(2, givingId_);
      }
      if (givingGroupId_ != 0) {
        output.writeUInt32(8, givingGroupId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (givingId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, givingId_);
      }
      if (givingGroupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, givingGroupId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp other = (emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp) obj;

      if (getGivingId()
          != other.getGivingId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getGivingGroupId()
          != other.getGivingGroupId()) return false;
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
      hash = (37 * hash) + GIVINGID_FIELD_NUMBER;
      hash = (53 * hash) + getGivingId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + GIVINGGROUPID_FIELD_NUMBER;
      hash = (53 * hash) + getGivingGroupId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp prototype) {
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
     * Protobuf type {@code ItemGivingRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ItemGivingRsp)
        emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ItemGivingRspOuterClass.internal_static_ItemGivingRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ItemGivingRspOuterClass.internal_static_ItemGivingRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.class, emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.newBuilder()
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
        givingId_ = 0;
        retcode_ = 0;
        givingGroupId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ItemGivingRspOuterClass.internal_static_ItemGivingRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp build() {
        emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp buildPartial() {
        emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp result = new emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.givingId_ = givingId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.givingGroupId_ = givingGroupId_;
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
        if (other instanceof emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp other) {
        if (other == emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp.getDefaultInstance()) return this;
        if (other.getGivingId() != 0) {
          setGivingId(other.getGivingId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getGivingGroupId() != 0) {
          setGivingGroupId(other.getGivingGroupId());
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
              case 16: {
                givingId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 64: {
                givingGroupId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 104: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
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

      private int givingId_ ;
      /**
       * <code>uint32 givingId = 2;</code>
       * @return The givingId.
       */
      @java.lang.Override
      public int getGivingId() {
        return givingId_;
      }
      /**
       * <code>uint32 givingId = 2;</code>
       * @param value The givingId to set.
       * @return This builder for chaining.
       */
      public Builder setGivingId(int value) {
        
        givingId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 givingId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGivingId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        givingId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int givingGroupId_ ;
      /**
       * <code>uint32 givingGroupId = 8;</code>
       * @return The givingGroupId.
       */
      @java.lang.Override
      public int getGivingGroupId() {
        return givingGroupId_;
      }
      /**
       * <code>uint32 givingGroupId = 8;</code>
       * @param value The givingGroupId to set.
       * @return This builder for chaining.
       */
      public Builder setGivingGroupId(int value) {
        
        givingGroupId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 givingGroupId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearGivingGroupId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        givingGroupId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ItemGivingRsp)
    }

    // @@protoc_insertion_point(class_scope:ItemGivingRsp)
    private static final emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp();
    }

    public static emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ItemGivingRsp>
        PARSER = new com.google.protobuf.AbstractParser<ItemGivingRsp>() {
      @java.lang.Override
      public ItemGivingRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ItemGivingRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ItemGivingRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ItemGivingRspOuterClass.ItemGivingRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ItemGivingRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ItemGivingRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ItemGivingRsp.proto\"\232\001\n\rItemGivingRsp\022" +
      "\020\n\010givingId\030\002 \001(\r\022\017\n\007retcode\030\r \001(\005\022\025\n\rgi" +
      "vingGroupId\030\010 \001(\r\"O\n\013DPOCBOEGOPF\022\010\n\004NONE" +
      "\020\000\022\020\n\013PEPPOHPHJOJ\020\211\001\022\017\n\013DCDNILFDFLB\020\000\022\017\n" +
      "\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ItemGivingRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ItemGivingRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ItemGivingRsp_descriptor,
        new java.lang.String[] { "GivingId", "Retcode", "GivingGroupId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}