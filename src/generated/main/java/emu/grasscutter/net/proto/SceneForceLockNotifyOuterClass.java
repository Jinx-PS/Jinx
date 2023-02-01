// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneForceLockNotify.proto

package emu.grasscutter.net.proto;

public final class SceneForceLockNotifyOuterClass {
  private SceneForceLockNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneForceLockNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneForceLockNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 forceIdList = 6;</code>
     * @return A list containing the forceIdList.
     */
    java.util.List<java.lang.Integer> getForceIdListList();
    /**
     * <code>repeated uint32 forceIdList = 6;</code>
     * @return The count of forceIdList.
     */
    int getForceIdListCount();
    /**
     * <code>repeated uint32 forceIdList = 6;</code>
     * @param index The index of the element to return.
     * @return The forceIdList at the given index.
     */
    int getForceIdList(int index);
  }
  /**
   * Protobuf type {@code SceneForceLockNotify}
   */
  public static final class SceneForceLockNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneForceLockNotify)
      SceneForceLockNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneForceLockNotify.newBuilder() to construct.
    private SceneForceLockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneForceLockNotify() {
      forceIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneForceLockNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.internal_static_SceneForceLockNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.internal_static_SceneForceLockNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.class, emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code SceneForceLockNotify.KFGBLLFKPFJ}
     */
    public enum KFGBLLFKPFJ
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 251;</code>
       */
      PEPPOHPHJOJ(1, 251),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final KFGBLLFKPFJ DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 251;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 251;
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
      public static KFGBLLFKPFJ valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static KFGBLLFKPFJ forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 251: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<KFGBLLFKPFJ>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          KFGBLLFKPFJ> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<KFGBLLFKPFJ>() {
              public KFGBLLFKPFJ findValueByNumber(int number) {
                return KFGBLLFKPFJ.forNumber(number);
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
        return emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final KFGBLLFKPFJ[] VALUES = getStaticValuesArray();
      private static KFGBLLFKPFJ[] getStaticValuesArray() {
        return new KFGBLLFKPFJ[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static KFGBLLFKPFJ valueOf(
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

      private KFGBLLFKPFJ(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SceneForceLockNotify.KFGBLLFKPFJ)
    }

    public static final int FORCEIDLIST_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList forceIdList_;
    /**
     * <code>repeated uint32 forceIdList = 6;</code>
     * @return A list containing the forceIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getForceIdListList() {
      return forceIdList_;
    }
    /**
     * <code>repeated uint32 forceIdList = 6;</code>
     * @return The count of forceIdList.
     */
    public int getForceIdListCount() {
      return forceIdList_.size();
    }
    /**
     * <code>repeated uint32 forceIdList = 6;</code>
     * @param index The index of the element to return.
     * @return The forceIdList at the given index.
     */
    public int getForceIdList(int index) {
      return forceIdList_.getInt(index);
    }
    private int forceIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getForceIdListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(forceIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < forceIdList_.size(); i++) {
        output.writeUInt32NoTag(forceIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < forceIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(forceIdList_.getInt(i));
        }
        size += dataSize;
        if (!getForceIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        forceIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify other = (emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify) obj;

      if (!getForceIdListList()
          .equals(other.getForceIdListList())) return false;
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
      if (getForceIdListCount() > 0) {
        hash = (37 * hash) + FORCEIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getForceIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify prototype) {
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
     * Protobuf type {@code SceneForceLockNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneForceLockNotify)
        emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.internal_static_SceneForceLockNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.internal_static_SceneForceLockNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.class, emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.newBuilder()
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
        forceIdList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.internal_static_SceneForceLockNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify build() {
        emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify buildPartial() {
        emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify result = new emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          forceIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.forceIdList_ = forceIdList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify other) {
        if (other == emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.getDefaultInstance()) return this;
        if (!other.forceIdList_.isEmpty()) {
          if (forceIdList_.isEmpty()) {
            forceIdList_ = other.forceIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureForceIdListIsMutable();
            forceIdList_.addAll(other.forceIdList_);
          }
          onChanged();
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
              case 48: {
                int v = input.readUInt32();
                ensureForceIdListIsMutable();
                forceIdList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureForceIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  forceIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
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

      private com.google.protobuf.Internal.IntList forceIdList_ = emptyIntList();
      private void ensureForceIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          forceIdList_ = mutableCopy(forceIdList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 forceIdList = 6;</code>
       * @return A list containing the forceIdList.
       */
      public java.util.List<java.lang.Integer>
          getForceIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(forceIdList_) : forceIdList_;
      }
      /**
       * <code>repeated uint32 forceIdList = 6;</code>
       * @return The count of forceIdList.
       */
      public int getForceIdListCount() {
        return forceIdList_.size();
      }
      /**
       * <code>repeated uint32 forceIdList = 6;</code>
       * @param index The index of the element to return.
       * @return The forceIdList at the given index.
       */
      public int getForceIdList(int index) {
        return forceIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 forceIdList = 6;</code>
       * @param index The index to set the value at.
       * @param value The forceIdList to set.
       * @return This builder for chaining.
       */
      public Builder setForceIdList(
          int index, int value) {
        
        ensureForceIdListIsMutable();
        forceIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forceIdList = 6;</code>
       * @param value The forceIdList to add.
       * @return This builder for chaining.
       */
      public Builder addForceIdList(int value) {
        
        ensureForceIdListIsMutable();
        forceIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forceIdList = 6;</code>
       * @param values The forceIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllForceIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureForceIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, forceIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forceIdList = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearForceIdList() {
        forceIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:SceneForceLockNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneForceLockNotify)
    private static final emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify();
    }

    public static emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneForceLockNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneForceLockNotify>() {
      @java.lang.Override
      public SceneForceLockNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneForceLockNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneForceLockNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneForceLockNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneForceLockNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SceneForceLockNotify.proto\"|\n\024SceneFor" +
      "ceLockNotify\022\023\n\013forceIdList\030\006 \003(\r\"O\n\013KFG" +
      "BLLFKPFJ\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\373\001\022\017\n\013" +
      "DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneForceLockNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneForceLockNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneForceLockNotify_descriptor,
        new java.lang.String[] { "ForceIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
