// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekPlayerBattleInfo.proto

package emu.grasscutter.net.proto;

public final class HideAndSeekPlayerBattleInfoOuterClass {
  private HideAndSeekPlayerBattleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HideAndSeekPlayerBattleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HideAndSeekPlayerBattleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 costumeId = 5;</code>
     * @return The costumeId.
     */
    int getCostumeId();

    /**
     * <code>bool isReady = 13;</code>
     * @return The isReady.
     */
    boolean getIsReady();

    /**
     * <code>repeated uint32 skillList = 3;</code>
     * @return A list containing the skillList.
     */
    java.util.List<java.lang.Integer> getSkillListList();
    /**
     * <code>repeated uint32 skillList = 3;</code>
     * @return The count of skillList.
     */
    int getSkillListCount();
    /**
     * <code>repeated uint32 skillList = 3;</code>
     * @param index The index of the element to return.
     * @return The skillList at the given index.
     */
    int getSkillList(int index);

    /**
     * <code>uint32 avatarId = 11;</code>
     * @return The avatarId.
     */
    int getAvatarId();
  }
  /**
   * Protobuf type {@code HideAndSeekPlayerBattleInfo}
   */
  public static final class HideAndSeekPlayerBattleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HideAndSeekPlayerBattleInfo)
      HideAndSeekPlayerBattleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HideAndSeekPlayerBattleInfo.newBuilder() to construct.
    private HideAndSeekPlayerBattleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HideAndSeekPlayerBattleInfo() {
      skillList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HideAndSeekPlayerBattleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HideAndSeekPlayerBattleInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                skillList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              skillList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                skillList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                skillList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 40: {

              costumeId_ = input.readUInt32();
              break;
            }
            case 88: {

              avatarId_ = input.readUInt32();
              break;
            }
            case 104: {

              isReady_ = input.readBool();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          skillList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.internal_static_HideAndSeekPlayerBattleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.internal_static_HideAndSeekPlayerBattleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.class, emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.Builder.class);
    }

    public static final int COSTUMEID_FIELD_NUMBER = 5;
    private int costumeId_;
    /**
     * <code>uint32 costumeId = 5;</code>
     * @return The costumeId.
     */
    @java.lang.Override
    public int getCostumeId() {
      return costumeId_;
    }

    public static final int ISREADY_FIELD_NUMBER = 13;
    private boolean isReady_;
    /**
     * <code>bool isReady = 13;</code>
     * @return The isReady.
     */
    @java.lang.Override
    public boolean getIsReady() {
      return isReady_;
    }

    public static final int SKILLLIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList skillList_;
    /**
     * <code>repeated uint32 skillList = 3;</code>
     * @return A list containing the skillList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSkillListList() {
      return skillList_;
    }
    /**
     * <code>repeated uint32 skillList = 3;</code>
     * @return The count of skillList.
     */
    public int getSkillListCount() {
      return skillList_.size();
    }
    /**
     * <code>repeated uint32 skillList = 3;</code>
     * @param index The index of the element to return.
     * @return The skillList at the given index.
     */
    public int getSkillList(int index) {
      return skillList_.getInt(index);
    }
    private int skillListMemoizedSerializedSize = -1;

    public static final int AVATARID_FIELD_NUMBER = 11;
    private int avatarId_;
    /**
     * <code>uint32 avatarId = 11;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
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
      if (getSkillListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(skillListMemoizedSerializedSize);
      }
      for (int i = 0; i < skillList_.size(); i++) {
        output.writeUInt32NoTag(skillList_.getInt(i));
      }
      if (costumeId_ != 0) {
        output.writeUInt32(5, costumeId_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(11, avatarId_);
      }
      if (isReady_ != false) {
        output.writeBool(13, isReady_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < skillList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(skillList_.getInt(i));
        }
        size += dataSize;
        if (!getSkillListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        skillListMemoizedSerializedSize = dataSize;
      }
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, costumeId_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, avatarId_);
      }
      if (isReady_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isReady_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo other = (emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo) obj;

      if (getCostumeId()
          != other.getCostumeId()) return false;
      if (getIsReady()
          != other.getIsReady()) return false;
      if (!getSkillListList()
          .equals(other.getSkillListList())) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + COSTUMEID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      hash = (37 * hash) + ISREADY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsReady());
      if (getSkillListCount() > 0) {
        hash = (37 * hash) + SKILLLIST_FIELD_NUMBER;
        hash = (53 * hash) + getSkillListList().hashCode();
      }
      hash = (37 * hash) + AVATARID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo prototype) {
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
     * Protobuf type {@code HideAndSeekPlayerBattleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HideAndSeekPlayerBattleInfo)
        emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.internal_static_HideAndSeekPlayerBattleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.internal_static_HideAndSeekPlayerBattleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.class, emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.newBuilder()
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
        costumeId_ = 0;

        isReady_ = false;

        skillList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.internal_static_HideAndSeekPlayerBattleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo build() {
        emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo buildPartial() {
        emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo result = new emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo(this);
        int from_bitField0_ = bitField0_;
        result.costumeId_ = costumeId_;
        result.isReady_ = isReady_;
        if (((bitField0_ & 0x00000001) != 0)) {
          skillList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.skillList_ = skillList_;
        result.avatarId_ = avatarId_;
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
        if (other instanceof emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo other) {
        if (other == emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.getDefaultInstance()) return this;
        if (other.getCostumeId() != 0) {
          setCostumeId(other.getCostumeId());
        }
        if (other.getIsReady() != false) {
          setIsReady(other.getIsReady());
        }
        if (!other.skillList_.isEmpty()) {
          if (skillList_.isEmpty()) {
            skillList_ = other.skillList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSkillListIsMutable();
            skillList_.addAll(other.skillList_);
          }
          onChanged();
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
        emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int costumeId_ ;
      /**
       * <code>uint32 costumeId = 5;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costumeId = 5;</code>
       * @param value The costumeId to set.
       * @return This builder for chaining.
       */
      public Builder setCostumeId(int value) {
        
        costumeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costumeId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostumeId() {
        
        costumeId_ = 0;
        onChanged();
        return this;
      }

      private boolean isReady_ ;
      /**
       * <code>bool isReady = 13;</code>
       * @return The isReady.
       */
      @java.lang.Override
      public boolean getIsReady() {
        return isReady_;
      }
      /**
       * <code>bool isReady = 13;</code>
       * @param value The isReady to set.
       * @return This builder for chaining.
       */
      public Builder setIsReady(boolean value) {
        
        isReady_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isReady = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsReady() {
        
        isReady_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList skillList_ = emptyIntList();
      private void ensureSkillListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          skillList_ = mutableCopy(skillList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 skillList = 3;</code>
       * @return A list containing the skillList.
       */
      public java.util.List<java.lang.Integer>
          getSkillListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(skillList_) : skillList_;
      }
      /**
       * <code>repeated uint32 skillList = 3;</code>
       * @return The count of skillList.
       */
      public int getSkillListCount() {
        return skillList_.size();
      }
      /**
       * <code>repeated uint32 skillList = 3;</code>
       * @param index The index of the element to return.
       * @return The skillList at the given index.
       */
      public int getSkillList(int index) {
        return skillList_.getInt(index);
      }
      /**
       * <code>repeated uint32 skillList = 3;</code>
       * @param index The index to set the value at.
       * @param value The skillList to set.
       * @return This builder for chaining.
       */
      public Builder setSkillList(
          int index, int value) {
        ensureSkillListIsMutable();
        skillList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skillList = 3;</code>
       * @param value The skillList to add.
       * @return This builder for chaining.
       */
      public Builder addSkillList(int value) {
        ensureSkillListIsMutable();
        skillList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skillList = 3;</code>
       * @param values The skillList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSkillList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSkillListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skillList = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillList() {
        skillList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatarId = 11;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatarId = 11;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatarId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HideAndSeekPlayerBattleInfo)
    }

    // @@protoc_insertion_point(class_scope:HideAndSeekPlayerBattleInfo)
    private static final emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo();
    }

    public static emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HideAndSeekPlayerBattleInfo>
        PARSER = new com.google.protobuf.AbstractParser<HideAndSeekPlayerBattleInfo>() {
      @java.lang.Override
      public HideAndSeekPlayerBattleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HideAndSeekPlayerBattleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HideAndSeekPlayerBattleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HideAndSeekPlayerBattleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HideAndSeekPlayerBattleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HideAndSeekPlayerBattleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!HideAndSeekPlayerBattleInfo.proto\"f\n\033H" +
      "ideAndSeekPlayerBattleInfo\022\021\n\tcostumeId\030" +
      "\005 \001(\r\022\017\n\007isReady\030\r \001(\010\022\021\n\tskillList\030\003 \003(" +
      "\r\022\020\n\010avatarId\030\013 \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HideAndSeekPlayerBattleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HideAndSeekPlayerBattleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HideAndSeekPlayerBattleInfo_descriptor,
        new java.lang.String[] { "CostumeId", "IsReady", "SkillList", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
