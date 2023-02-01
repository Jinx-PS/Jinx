// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerWorldSceneInfo.proto

package emu.grasscutter.net.proto;

public final class PlayerWorldSceneInfoOuterClass {
  private PlayerWorldSceneInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerWorldSceneInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerWorldSceneInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 sceneTagIdList = 13;</code>
     * @return A list containing the sceneTagIdList.
     */
    java.util.List<java.lang.Integer> getSceneTagIdListList();
    /**
     * <code>repeated uint32 sceneTagIdList = 13;</code>
     * @return The count of sceneTagIdList.
     */
    int getSceneTagIdListCount();
    /**
     * <code>repeated uint32 sceneTagIdList = 13;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    int getSceneTagIdList(int index);

    /**
     * <code>bool isLocked = 5;</code>
     * @return The isLocked.
     */
    boolean getIsLocked();

    /**
     * <code>uint32 sceneId = 11;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * Protobuf type {@code PlayerWorldSceneInfo}
   */
  public static final class PlayerWorldSceneInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerWorldSceneInfo)
      PlayerWorldSceneInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerWorldSceneInfo.newBuilder() to construct.
    private PlayerWorldSceneInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerWorldSceneInfo() {
      sceneTagIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerWorldSceneInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.class, emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder.class);
    }

    public static final int SCENETAGIDLIST_FIELD_NUMBER = 13;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList sceneTagIdList_;
    /**
     * <code>repeated uint32 sceneTagIdList = 13;</code>
     * @return A list containing the sceneTagIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSceneTagIdListList() {
      return sceneTagIdList_;
    }
    /**
     * <code>repeated uint32 sceneTagIdList = 13;</code>
     * @return The count of sceneTagIdList.
     */
    public int getSceneTagIdListCount() {
      return sceneTagIdList_.size();
    }
    /**
     * <code>repeated uint32 sceneTagIdList = 13;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    public int getSceneTagIdList(int index) {
      return sceneTagIdList_.getInt(index);
    }
    private int sceneTagIdListMemoizedSerializedSize = -1;

    public static final int ISLOCKED_FIELD_NUMBER = 5;
    private boolean isLocked_ = false;
    /**
     * <code>bool isLocked = 5;</code>
     * @return The isLocked.
     */
    @java.lang.Override
    public boolean getIsLocked() {
      return isLocked_;
    }

    public static final int SCENEID_FIELD_NUMBER = 11;
    private int sceneId_ = 0;
    /**
     * <code>uint32 sceneId = 11;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      getSerializedSize();
      if (isLocked_ != false) {
        output.writeBool(5, isLocked_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(11, sceneId_);
      }
      if (getSceneTagIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(sceneTagIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < sceneTagIdList_.size(); i++) {
        output.writeUInt32NoTag(sceneTagIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isLocked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isLocked_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, sceneId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < sceneTagIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(sceneTagIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSceneTagIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        sceneTagIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo other = (emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo) obj;

      if (!getSceneTagIdListList()
          .equals(other.getSceneTagIdListList())) return false;
      if (getIsLocked()
          != other.getIsLocked()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      if (getSceneTagIdListCount() > 0) {
        hash = (37 * hash) + SCENETAGIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getSceneTagIdListList().hashCode();
      }
      hash = (37 * hash) + ISLOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLocked());
      hash = (37 * hash) + SCENEID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo prototype) {
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
     * Protobuf type {@code PlayerWorldSceneInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerWorldSceneInfo)
        emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.class, emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.newBuilder()
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
        sceneTagIdList_ = emptyIntList();
        isLocked_ = false;
        sceneId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.internal_static_PlayerWorldSceneInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo build() {
        emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo buildPartial() {
        emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo result = new emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sceneTagIdList_ = sceneTagIdList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isLocked_ = isLocked_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.sceneId_ = sceneId_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo other) {
        if (other == emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo.getDefaultInstance()) return this;
        if (!other.sceneTagIdList_.isEmpty()) {
          if (sceneTagIdList_.isEmpty()) {
            sceneTagIdList_ = other.sceneTagIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSceneTagIdListIsMutable();
            sceneTagIdList_.addAll(other.sceneTagIdList_);
          }
          onChanged();
        }
        if (other.getIsLocked() != false) {
          setIsLocked(other.getIsLocked());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
                isLocked_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 88: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
              case 104: {
                int v = input.readUInt32();
                ensureSceneTagIdListIsMutable();
                sceneTagIdList_.addInt(v);
                break;
              } // case 104
              case 106: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureSceneTagIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  sceneTagIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 106
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

      private com.google.protobuf.Internal.IntList sceneTagIdList_ = emptyIntList();
      private void ensureSceneTagIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_ = mutableCopy(sceneTagIdList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 13;</code>
       * @return A list containing the sceneTagIdList.
       */
      public java.util.List<java.lang.Integer>
          getSceneTagIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(sceneTagIdList_) : sceneTagIdList_;
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 13;</code>
       * @return The count of sceneTagIdList.
       */
      public int getSceneTagIdListCount() {
        return sceneTagIdList_.size();
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 13;</code>
       * @param index The index of the element to return.
       * @return The sceneTagIdList at the given index.
       */
      public int getSceneTagIdList(int index) {
        return sceneTagIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 13;</code>
       * @param index The index to set the value at.
       * @param value The sceneTagIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTagIdList(
          int index, int value) {
        
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 13;</code>
       * @param value The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSceneTagIdList(int value) {
        
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 13;</code>
       * @param values The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSceneTagIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSceneTagIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sceneTagIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTagIdList() {
        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isLocked_ ;
      /**
       * <code>bool isLocked = 5;</code>
       * @return The isLocked.
       */
      @java.lang.Override
      public boolean getIsLocked() {
        return isLocked_;
      }
      /**
       * <code>bool isLocked = 5;</code>
       * @param value The isLocked to set.
       * @return This builder for chaining.
       */
      public Builder setIsLocked(boolean value) {
        
        isLocked_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool isLocked = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLocked() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isLocked_ = false;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 sceneId = 11;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 sceneId = 11;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sceneId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerWorldSceneInfo)
    }

    // @@protoc_insertion_point(class_scope:PlayerWorldSceneInfo)
    private static final emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo();
    }

    public static emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerWorldSceneInfo>
        PARSER = new com.google.protobuf.AbstractParser<PlayerWorldSceneInfo>() {
      @java.lang.Override
      public PlayerWorldSceneInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerWorldSceneInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerWorldSceneInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerWorldSceneInfoOuterClass.PlayerWorldSceneInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerWorldSceneInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerWorldSceneInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032PlayerWorldSceneInfo.proto\"Q\n\024PlayerWo" +
      "rldSceneInfo\022\026\n\016sceneTagIdList\030\r \003(\r\022\020\n\010" +
      "isLocked\030\005 \001(\010\022\017\n\007sceneId\030\013 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerWorldSceneInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerWorldSceneInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerWorldSceneInfo_descriptor,
        new java.lang.String[] { "SceneTagIdList", "IsLocked", "SceneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
