// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddNoGachaAvatarCardTransferItem.proto

package emu.grasscutter.net.proto;

public final class AddNoGachaAvatarCardTransferItemOuterClass {
  private AddNoGachaAvatarCardTransferItemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AddNoGachaAvatarCardTransferItemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AddNoGachaAvatarCardTransferItem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 count = 10;</code>
     * @return The count.
     */
    int getCount();

    /**
     * <code>bool isNew = 11;</code>
     * @return The isNew.
     */
    boolean getIsNew();

    /**
     * <code>uint32 itemId = 12;</code>
     * @return The itemId.
     */
    int getItemId();
  }
  /**
   * Protobuf type {@code AddNoGachaAvatarCardTransferItem}
   */
  public static final class AddNoGachaAvatarCardTransferItem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AddNoGachaAvatarCardTransferItem)
      AddNoGachaAvatarCardTransferItemOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AddNoGachaAvatarCardTransferItem.newBuilder() to construct.
    private AddNoGachaAvatarCardTransferItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddNoGachaAvatarCardTransferItem() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AddNoGachaAvatarCardTransferItem();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.internal_static_AddNoGachaAvatarCardTransferItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.internal_static_AddNoGachaAvatarCardTransferItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem.class, emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem.Builder.class);
    }

    public static final int COUNT_FIELD_NUMBER = 10;
    private int count_ = 0;
    /**
     * <code>uint32 count = 10;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }

    public static final int ISNEW_FIELD_NUMBER = 11;
    private boolean isNew_ = false;
    /**
     * <code>bool isNew = 11;</code>
     * @return The isNew.
     */
    @java.lang.Override
    public boolean getIsNew() {
      return isNew_;
    }

    public static final int ITEMID_FIELD_NUMBER = 12;
    private int itemId_ = 0;
    /**
     * <code>uint32 itemId = 12;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
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
      if (count_ != 0) {
        output.writeUInt32(10, count_);
      }
      if (isNew_ != false) {
        output.writeBool(11, isNew_);
      }
      if (itemId_ != 0) {
        output.writeUInt32(12, itemId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, count_);
      }
      if (isNew_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isNew_);
      }
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, itemId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem other = (emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem) obj;

      if (getCount()
          != other.getCount()) return false;
      if (getIsNew()
          != other.getIsNew()) return false;
      if (getItemId()
          != other.getItemId()) return false;
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
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (37 * hash) + ISNEW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNew());
      hash = (37 * hash) + ITEMID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem prototype) {
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
     * Protobuf type {@code AddNoGachaAvatarCardTransferItem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AddNoGachaAvatarCardTransferItem)
        emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.internal_static_AddNoGachaAvatarCardTransferItem_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.internal_static_AddNoGachaAvatarCardTransferItem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem.class, emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem.newBuilder()
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
        count_ = 0;
        isNew_ = false;
        itemId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.internal_static_AddNoGachaAvatarCardTransferItem_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem build() {
        emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem buildPartial() {
        emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem result = new emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.count_ = count_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isNew_ = isNew_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.itemId_ = itemId_;
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
        if (other instanceof emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem) {
          return mergeFrom((emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem other) {
        if (other == emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem.getDefaultInstance()) return this;
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        if (other.getIsNew() != false) {
          setIsNew(other.getIsNew());
        }
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
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
              case 80: {
                count_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
              case 88: {
                isNew_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 96: {
                itemId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 96
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

      private int count_ ;
      /**
       * <code>uint32 count = 10;</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 10;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {
        
        count_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        count_ = 0;
        onChanged();
        return this;
      }

      private boolean isNew_ ;
      /**
       * <code>bool isNew = 11;</code>
       * @return The isNew.
       */
      @java.lang.Override
      public boolean getIsNew() {
        return isNew_;
      }
      /**
       * <code>bool isNew = 11;</code>
       * @param value The isNew to set.
       * @return This builder for chaining.
       */
      public Builder setIsNew(boolean value) {
        
        isNew_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool isNew = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNew() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isNew_ = false;
        onChanged();
        return this;
      }

      private int itemId_ ;
      /**
       * <code>uint32 itemId = 12;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 itemId = 12;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 itemId = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        itemId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AddNoGachaAvatarCardTransferItem)
    }

    // @@protoc_insertion_point(class_scope:AddNoGachaAvatarCardTransferItem)
    private static final emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem();
    }

    public static emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AddNoGachaAvatarCardTransferItem>
        PARSER = new com.google.protobuf.AbstractParser<AddNoGachaAvatarCardTransferItem>() {
      @java.lang.Override
      public AddNoGachaAvatarCardTransferItem parsePartialFrom(
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

    public static com.google.protobuf.Parser<AddNoGachaAvatarCardTransferItem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AddNoGachaAvatarCardTransferItem> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AddNoGachaAvatarCardTransferItemOuterClass.AddNoGachaAvatarCardTransferItem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddNoGachaAvatarCardTransferItem_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddNoGachaAvatarCardTransferItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&AddNoGachaAvatarCardTransferItem.proto" +
      "\"P\n AddNoGachaAvatarCardTransferItem\022\r\n\005" +
      "count\030\n \001(\r\022\r\n\005isNew\030\013 \001(\010\022\016\n\006itemId\030\014 \001" +
      "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AddNoGachaAvatarCardTransferItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AddNoGachaAvatarCardTransferItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddNoGachaAvatarCardTransferItem_descriptor,
        new java.lang.String[] { "Count", "IsNew", "ItemId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
