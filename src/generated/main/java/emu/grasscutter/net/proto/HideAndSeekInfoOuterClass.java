// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekInfo.proto

package emu.grasscutter.net.proto;

public final class HideAndSeekInfoOuterClass {
  private HideAndSeekInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HideAndSeekInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HideAndSeekInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 visibleUidList = 5;</code>
     * @return A list containing the visibleUidList.
     */
    java.util.List<java.lang.Integer> getVisibleUidListList();
    /**
     * <code>repeated uint32 visibleUidList = 5;</code>
     * @return The count of visibleUidList.
     */
    int getVisibleUidListCount();
    /**
     * <code>repeated uint32 visibleUidList = 5;</code>
     * @param index The index of the element to return.
     * @return The visibleUidList at the given index.
     */
    int getVisibleUidList(int index);

    /**
     * <code>repeated uint32 caughtUidList = 7;</code>
     * @return A list containing the caughtUidList.
     */
    java.util.List<java.lang.Integer> getCaughtUidListList();
    /**
     * <code>repeated uint32 caughtUidList = 7;</code>
     * @return The count of caughtUidList.
     */
    int getCaughtUidListCount();
    /**
     * <code>repeated uint32 caughtUidList = 7;</code>
     * @param index The index of the element to return.
     * @return The caughtUidList at the given index.
     */
    int getCaughtUidList(int index);
  }
  /**
   * Protobuf type {@code HideAndSeekInfo}
   */
  public static final class HideAndSeekInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HideAndSeekInfo)
      HideAndSeekInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HideAndSeekInfo.newBuilder() to construct.
    private HideAndSeekInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HideAndSeekInfo() {
      visibleUidList_ = emptyIntList();
      caughtUidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HideAndSeekInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.internal_static_HideAndSeekInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.internal_static_HideAndSeekInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo.class, emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo.Builder.class);
    }

    public static final int VISIBLEUIDLIST_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList visibleUidList_;
    /**
     * <code>repeated uint32 visibleUidList = 5;</code>
     * @return A list containing the visibleUidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getVisibleUidListList() {
      return visibleUidList_;
    }
    /**
     * <code>repeated uint32 visibleUidList = 5;</code>
     * @return The count of visibleUidList.
     */
    public int getVisibleUidListCount() {
      return visibleUidList_.size();
    }
    /**
     * <code>repeated uint32 visibleUidList = 5;</code>
     * @param index The index of the element to return.
     * @return The visibleUidList at the given index.
     */
    public int getVisibleUidList(int index) {
      return visibleUidList_.getInt(index);
    }
    private int visibleUidListMemoizedSerializedSize = -1;

    public static final int CAUGHTUIDLIST_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList caughtUidList_;
    /**
     * <code>repeated uint32 caughtUidList = 7;</code>
     * @return A list containing the caughtUidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCaughtUidListList() {
      return caughtUidList_;
    }
    /**
     * <code>repeated uint32 caughtUidList = 7;</code>
     * @return The count of caughtUidList.
     */
    public int getCaughtUidListCount() {
      return caughtUidList_.size();
    }
    /**
     * <code>repeated uint32 caughtUidList = 7;</code>
     * @param index The index of the element to return.
     * @return The caughtUidList at the given index.
     */
    public int getCaughtUidList(int index) {
      return caughtUidList_.getInt(index);
    }
    private int caughtUidListMemoizedSerializedSize = -1;

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
      if (getVisibleUidListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(visibleUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < visibleUidList_.size(); i++) {
        output.writeUInt32NoTag(visibleUidList_.getInt(i));
      }
      if (getCaughtUidListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(caughtUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < caughtUidList_.size(); i++) {
        output.writeUInt32NoTag(caughtUidList_.getInt(i));
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
        for (int i = 0; i < visibleUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(visibleUidList_.getInt(i));
        }
        size += dataSize;
        if (!getVisibleUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        visibleUidListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < caughtUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(caughtUidList_.getInt(i));
        }
        size += dataSize;
        if (!getCaughtUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        caughtUidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo other = (emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo) obj;

      if (!getVisibleUidListList()
          .equals(other.getVisibleUidListList())) return false;
      if (!getCaughtUidListList()
          .equals(other.getCaughtUidListList())) return false;
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
      if (getVisibleUidListCount() > 0) {
        hash = (37 * hash) + VISIBLEUIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getVisibleUidListList().hashCode();
      }
      if (getCaughtUidListCount() > 0) {
        hash = (37 * hash) + CAUGHTUIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getCaughtUidListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo prototype) {
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
     * Protobuf type {@code HideAndSeekInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HideAndSeekInfo)
        emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.internal_static_HideAndSeekInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.internal_static_HideAndSeekInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo.class, emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo.newBuilder()
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
        visibleUidList_ = emptyIntList();
        caughtUidList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.internal_static_HideAndSeekInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo build() {
        emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo buildPartial() {
        emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo result = new emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          visibleUidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.visibleUidList_ = visibleUidList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          caughtUidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.caughtUidList_ = caughtUidList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo result) {
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
        if (other instanceof emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo) {
          return mergeFrom((emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo other) {
        if (other == emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo.getDefaultInstance()) return this;
        if (!other.visibleUidList_.isEmpty()) {
          if (visibleUidList_.isEmpty()) {
            visibleUidList_ = other.visibleUidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVisibleUidListIsMutable();
            visibleUidList_.addAll(other.visibleUidList_);
          }
          onChanged();
        }
        if (!other.caughtUidList_.isEmpty()) {
          if (caughtUidList_.isEmpty()) {
            caughtUidList_ = other.caughtUidList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCaughtUidListIsMutable();
            caughtUidList_.addAll(other.caughtUidList_);
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
              case 40: {
                int v = input.readUInt32();
                ensureVisibleUidListIsMutable();
                visibleUidList_.addInt(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureVisibleUidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  visibleUidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 56: {
                int v = input.readUInt32();
                ensureCaughtUidListIsMutable();
                caughtUidList_.addInt(v);
                break;
              } // case 56
              case 58: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCaughtUidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  caughtUidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 58
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

      private com.google.protobuf.Internal.IntList visibleUidList_ = emptyIntList();
      private void ensureVisibleUidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          visibleUidList_ = mutableCopy(visibleUidList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 visibleUidList = 5;</code>
       * @return A list containing the visibleUidList.
       */
      public java.util.List<java.lang.Integer>
          getVisibleUidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(visibleUidList_) : visibleUidList_;
      }
      /**
       * <code>repeated uint32 visibleUidList = 5;</code>
       * @return The count of visibleUidList.
       */
      public int getVisibleUidListCount() {
        return visibleUidList_.size();
      }
      /**
       * <code>repeated uint32 visibleUidList = 5;</code>
       * @param index The index of the element to return.
       * @return The visibleUidList at the given index.
       */
      public int getVisibleUidList(int index) {
        return visibleUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 visibleUidList = 5;</code>
       * @param index The index to set the value at.
       * @param value The visibleUidList to set.
       * @return This builder for chaining.
       */
      public Builder setVisibleUidList(
          int index, int value) {
        
        ensureVisibleUidListIsMutable();
        visibleUidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 visibleUidList = 5;</code>
       * @param value The visibleUidList to add.
       * @return This builder for chaining.
       */
      public Builder addVisibleUidList(int value) {
        
        ensureVisibleUidListIsMutable();
        visibleUidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 visibleUidList = 5;</code>
       * @param values The visibleUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllVisibleUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureVisibleUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, visibleUidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 visibleUidList = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearVisibleUidList() {
        visibleUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList caughtUidList_ = emptyIntList();
      private void ensureCaughtUidListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          caughtUidList_ = mutableCopy(caughtUidList_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint32 caughtUidList = 7;</code>
       * @return A list containing the caughtUidList.
       */
      public java.util.List<java.lang.Integer>
          getCaughtUidListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(caughtUidList_) : caughtUidList_;
      }
      /**
       * <code>repeated uint32 caughtUidList = 7;</code>
       * @return The count of caughtUidList.
       */
      public int getCaughtUidListCount() {
        return caughtUidList_.size();
      }
      /**
       * <code>repeated uint32 caughtUidList = 7;</code>
       * @param index The index of the element to return.
       * @return The caughtUidList at the given index.
       */
      public int getCaughtUidList(int index) {
        return caughtUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 caughtUidList = 7;</code>
       * @param index The index to set the value at.
       * @param value The caughtUidList to set.
       * @return This builder for chaining.
       */
      public Builder setCaughtUidList(
          int index, int value) {
        
        ensureCaughtUidListIsMutable();
        caughtUidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 caughtUidList = 7;</code>
       * @param value The caughtUidList to add.
       * @return This builder for chaining.
       */
      public Builder addCaughtUidList(int value) {
        
        ensureCaughtUidListIsMutable();
        caughtUidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 caughtUidList = 7;</code>
       * @param values The caughtUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCaughtUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCaughtUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, caughtUidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 caughtUidList = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCaughtUidList() {
        caughtUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:HideAndSeekInfo)
    }

    // @@protoc_insertion_point(class_scope:HideAndSeekInfo)
    private static final emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo();
    }

    public static emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HideAndSeekInfo>
        PARSER = new com.google.protobuf.AbstractParser<HideAndSeekInfo>() {
      @java.lang.Override
      public HideAndSeekInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<HideAndSeekInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HideAndSeekInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HideAndSeekInfoOuterClass.HideAndSeekInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HideAndSeekInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HideAndSeekInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025HideAndSeekInfo.proto\"@\n\017HideAndSeekIn" +
      "fo\022\026\n\016visibleUidList\030\005 \003(\r\022\025\n\rcaughtUidL" +
      "ist\030\007 \003(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HideAndSeekInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HideAndSeekInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HideAndSeekInfo_descriptor,
        new java.lang.String[] { "VisibleUidList", "CaughtUidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}