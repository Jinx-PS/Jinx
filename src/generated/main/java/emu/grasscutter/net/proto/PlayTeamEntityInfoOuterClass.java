// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayTeamEntityInfo.proto

package emu.grasscutter.net.proto;

public final class PlayTeamEntityInfoOuterClass {
  private PlayTeamEntityInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayTeamEntityInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayTeamEntityInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entityId = 1;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 playerUid = 2;</code>
     * @return The playerUid.
     */
    int getPlayerUid();

    /**
     * <code>uint32 authorityPeerId = 3;</code>
     * @return The authorityPeerId.
     */
    int getAuthorityPeerId();

    /**
     * <code>uint32 gadgetConfigId = 5;</code>
     * @return The gadgetConfigId.
     */
    int getGadgetConfigId();

    /**
     * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
     * @return Whether the abilityInfo field is set.
     */
    boolean hasAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
     * @return The abilityInfo.
     */
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
     */
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder();
  }
  /**
   * Protobuf type {@code PlayTeamEntityInfo}
   */
  public static final class PlayTeamEntityInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayTeamEntityInfo)
      PlayTeamEntityInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayTeamEntityInfo.newBuilder() to construct.
    private PlayTeamEntityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayTeamEntityInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayTeamEntityInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.internal_static_PlayTeamEntityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.internal_static_PlayTeamEntityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.class, emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder.class);
    }

    public static final int ENTITYID_FIELD_NUMBER = 1;
    private int entityId_ = 0;
    /**
     * <code>uint32 entityId = 1;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int PLAYERUID_FIELD_NUMBER = 2;
    private int playerUid_ = 0;
    /**
     * <code>uint32 playerUid = 2;</code>
     * @return The playerUid.
     */
    @java.lang.Override
    public int getPlayerUid() {
      return playerUid_;
    }

    public static final int AUTHORITYPEERID_FIELD_NUMBER = 3;
    private int authorityPeerId_ = 0;
    /**
     * <code>uint32 authorityPeerId = 3;</code>
     * @return The authorityPeerId.
     */
    @java.lang.Override
    public int getAuthorityPeerId() {
      return authorityPeerId_;
    }

    public static final int GADGETCONFIGID_FIELD_NUMBER = 5;
    private int gadgetConfigId_ = 0;
    /**
     * <code>uint32 gadgetConfigId = 5;</code>
     * @return The gadgetConfigId.
     */
    @java.lang.Override
    public int getGadgetConfigId() {
      return gadgetConfigId_;
    }

    public static final int ABILITYINFO_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
    /**
     * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
     * @return Whether the abilityInfo field is set.
     */
    @java.lang.Override
    public boolean hasAbilityInfo() {
      return abilityInfo_ != null;
    }
    /**
     * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
     * @return The abilityInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
      return abilityInfo_ == null ? emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
    }
    /**
     * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
      return abilityInfo_ == null ? emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
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
      if (entityId_ != 0) {
        output.writeUInt32(1, entityId_);
      }
      if (playerUid_ != 0) {
        output.writeUInt32(2, playerUid_);
      }
      if (authorityPeerId_ != 0) {
        output.writeUInt32(3, authorityPeerId_);
      }
      if (gadgetConfigId_ != 0) {
        output.writeUInt32(5, gadgetConfigId_);
      }
      if (abilityInfo_ != null) {
        output.writeMessage(6, getAbilityInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, entityId_);
      }
      if (playerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, playerUid_);
      }
      if (authorityPeerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, authorityPeerId_);
      }
      if (gadgetConfigId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, gadgetConfigId_);
      }
      if (abilityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getAbilityInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo other = (emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getPlayerUid()
          != other.getPlayerUid()) return false;
      if (getAuthorityPeerId()
          != other.getAuthorityPeerId()) return false;
      if (getGadgetConfigId()
          != other.getGadgetConfigId()) return false;
      if (hasAbilityInfo() != other.hasAbilityInfo()) return false;
      if (hasAbilityInfo()) {
        if (!getAbilityInfo()
            .equals(other.getAbilityInfo())) return false;
      }
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
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + PLAYERUID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerUid();
      hash = (37 * hash) + AUTHORITYPEERID_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorityPeerId();
      hash = (37 * hash) + GADGETCONFIGID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetConfigId();
      if (hasAbilityInfo()) {
        hash = (37 * hash) + ABILITYINFO_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo prototype) {
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
     * Protobuf type {@code PlayTeamEntityInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayTeamEntityInfo)
        emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.internal_static_PlayTeamEntityInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.internal_static_PlayTeamEntityInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.class, emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.newBuilder()
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
        entityId_ = 0;
        playerUid_ = 0;
        authorityPeerId_ = 0;
        gadgetConfigId_ = 0;
        abilityInfo_ = null;
        if (abilityInfoBuilder_ != null) {
          abilityInfoBuilder_.dispose();
          abilityInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.internal_static_PlayTeamEntityInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo build() {
        emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo buildPartial() {
        emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo result = new emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.playerUid_ = playerUid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.authorityPeerId_ = authorityPeerId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.gadgetConfigId_ = gadgetConfigId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.abilityInfo_ = abilityInfoBuilder_ == null
              ? abilityInfo_
              : abilityInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo) {
          return mergeFrom((emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo other) {
        if (other == emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getPlayerUid() != 0) {
          setPlayerUid(other.getPlayerUid());
        }
        if (other.getAuthorityPeerId() != 0) {
          setAuthorityPeerId(other.getAuthorityPeerId());
        }
        if (other.getGadgetConfigId() != 0) {
          setGadgetConfigId(other.getGadgetConfigId());
        }
        if (other.hasAbilityInfo()) {
          mergeAbilityInfo(other.getAbilityInfo());
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
              case 8: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                playerUid_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                authorityPeerId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 40: {
                gadgetConfigId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 40
              case 50: {
                input.readMessage(
                    getAbilityInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000010;
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

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 1;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 1;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int playerUid_ ;
      /**
       * <code>uint32 playerUid = 2;</code>
       * @return The playerUid.
       */
      @java.lang.Override
      public int getPlayerUid() {
        return playerUid_;
      }
      /**
       * <code>uint32 playerUid = 2;</code>
       * @param value The playerUid to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerUid(int value) {
        
        playerUid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 playerUid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerUid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        playerUid_ = 0;
        onChanged();
        return this;
      }

      private int authorityPeerId_ ;
      /**
       * <code>uint32 authorityPeerId = 3;</code>
       * @return The authorityPeerId.
       */
      @java.lang.Override
      public int getAuthorityPeerId() {
        return authorityPeerId_;
      }
      /**
       * <code>uint32 authorityPeerId = 3;</code>
       * @param value The authorityPeerId to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorityPeerId(int value) {
        
        authorityPeerId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 authorityPeerId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthorityPeerId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        authorityPeerId_ = 0;
        onChanged();
        return this;
      }

      private int gadgetConfigId_ ;
      /**
       * <code>uint32 gadgetConfigId = 5;</code>
       * @return The gadgetConfigId.
       */
      @java.lang.Override
      public int getGadgetConfigId() {
        return gadgetConfigId_;
      }
      /**
       * <code>uint32 gadgetConfigId = 5;</code>
       * @param value The gadgetConfigId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetConfigId(int value) {
        
        gadgetConfigId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadgetConfigId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetConfigId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        gadgetConfigId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> abilityInfoBuilder_;
      /**
       * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
       * @return Whether the abilityInfo field is set.
       */
      public boolean hasAbilityInfo() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
       * @return The abilityInfo.
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
        if (abilityInfoBuilder_ == null) {
          return abilityInfo_ == null ? emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
        } else {
          return abilityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
       */
      public Builder setAbilityInfo(emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (abilityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityInfo_ = value;
        } else {
          abilityInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
       */
      public Builder setAbilityInfo(
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
        if (abilityInfoBuilder_ == null) {
          abilityInfo_ = builderForValue.build();
        } else {
          abilityInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
       */
      public Builder mergeAbilityInfo(emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (abilityInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0) &&
            abilityInfo_ != null &&
            abilityInfo_ != emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance()) {
            getAbilityInfoBuilder().mergeFrom(value);
          } else {
            abilityInfo_ = value;
          }
        } else {
          abilityInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
       */
      public Builder clearAbilityInfo() {
        bitField0_ = (bitField0_ & ~0x00000010);
        abilityInfo_ = null;
        if (abilityInfoBuilder_ != null) {
          abilityInfoBuilder_.dispose();
          abilityInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getAbilityInfoBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getAbilityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
        if (abilityInfoBuilder_ != null) {
          return abilityInfoBuilder_.getMessageOrBuilder();
        } else {
          return abilityInfo_ == null ?
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
        }
      }
      /**
       * <code>.AbilitySyncStateInfo abilityInfo = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> 
          getAbilityInfoFieldBuilder() {
        if (abilityInfoBuilder_ == null) {
          abilityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(
                  getAbilityInfo(),
                  getParentForChildren(),
                  isClean());
          abilityInfo_ = null;
        }
        return abilityInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayTeamEntityInfo)
    }

    // @@protoc_insertion_point(class_scope:PlayTeamEntityInfo)
    private static final emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo();
    }

    public static emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayTeamEntityInfo>
        PARSER = new com.google.protobuf.AbstractParser<PlayTeamEntityInfo>() {
      @java.lang.Override
      public PlayTeamEntityInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayTeamEntityInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayTeamEntityInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayTeamEntityInfoOuterClass.PlayTeamEntityInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayTeamEntityInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayTeamEntityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030PlayTeamEntityInfo.proto\032\032AbilitySyncS" +
      "tateInfo.proto\"\226\001\n\022PlayTeamEntityInfo\022\020\n" +
      "\010entityId\030\001 \001(\r\022\021\n\tplayerUid\030\002 \001(\r\022\027\n\017au" +
      "thorityPeerId\030\003 \001(\r\022\026\n\016gadgetConfigId\030\005 " +
      "\001(\r\022*\n\013abilityInfo\030\006 \001(\0132\025.AbilitySyncSt" +
      "ateInfoB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayTeamEntityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayTeamEntityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayTeamEntityInfo_descriptor,
        new java.lang.String[] { "EntityId", "PlayerUid", "AuthorityPeerId", "GadgetConfigId", "AbilityInfo", });
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}