// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetGeneralRewardInfoNotify.proto

package emu.grasscutter.net.proto;

public final class GadgetGeneralRewardInfoNotifyOuterClass {
  private GadgetGeneralRewardInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetGeneralRewardInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetGeneralRewardInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entityId = 5;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.GeneralReward generalRewardInfo = 15;</code>
     * @return Whether the generalRewardInfo field is set.
     */
    boolean hasGeneralRewardInfo();
    /**
     * <code>.GeneralReward generalRewardInfo = 15;</code>
     * @return The generalRewardInfo.
     */
    emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward getGeneralRewardInfo();
    /**
     * <code>.GeneralReward generalRewardInfo = 15;</code>
     */
    emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralRewardOrBuilder getGeneralRewardInfoOrBuilder();
  }
  /**
   * <pre>
   *enum GFBABMFFJOP {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 878;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code GadgetGeneralRewardInfoNotify}
   */
  public static final class GadgetGeneralRewardInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetGeneralRewardInfoNotify)
      GadgetGeneralRewardInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetGeneralRewardInfoNotify.newBuilder() to construct.
    private GadgetGeneralRewardInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetGeneralRewardInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetGeneralRewardInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GadgetGeneralRewardInfoNotify(
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
            case 40: {

              entityId_ = input.readUInt32();
              break;
            }
            case 122: {
              emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward.Builder subBuilder = null;
              if (generalRewardInfo_ != null) {
                subBuilder = generalRewardInfo_.toBuilder();
              }
              generalRewardInfo_ = input.readMessage(emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(generalRewardInfo_);
                generalRewardInfo_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.internal_static_GadgetGeneralRewardInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.internal_static_GadgetGeneralRewardInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify.class, emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify.Builder.class);
    }

    public static final int ENTITYID_FIELD_NUMBER = 5;
    private int entityId_;
    /**
     * <code>uint32 entityId = 5;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int GENERALREWARDINFO_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward generalRewardInfo_;
    /**
     * <code>.GeneralReward generalRewardInfo = 15;</code>
     * @return Whether the generalRewardInfo field is set.
     */
    @java.lang.Override
    public boolean hasGeneralRewardInfo() {
      return generalRewardInfo_ != null;
    }
    /**
     * <code>.GeneralReward generalRewardInfo = 15;</code>
     * @return The generalRewardInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward getGeneralRewardInfo() {
      return generalRewardInfo_ == null ? emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward.getDefaultInstance() : generalRewardInfo_;
    }
    /**
     * <code>.GeneralReward generalRewardInfo = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralRewardOrBuilder getGeneralRewardInfoOrBuilder() {
      return getGeneralRewardInfo();
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
        output.writeUInt32(5, entityId_);
      }
      if (generalRewardInfo_ != null) {
        output.writeMessage(15, getGeneralRewardInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, entityId_);
      }
      if (generalRewardInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getGeneralRewardInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify other = (emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasGeneralRewardInfo() != other.hasGeneralRewardInfo()) return false;
      if (hasGeneralRewardInfo()) {
        if (!getGeneralRewardInfo()
            .equals(other.getGeneralRewardInfo())) return false;
      }
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
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasGeneralRewardInfo()) {
        hash = (37 * hash) + GENERALREWARDINFO_FIELD_NUMBER;
        hash = (53 * hash) + getGeneralRewardInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify prototype) {
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
     *enum GFBABMFFJOP {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 878;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code GadgetGeneralRewardInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetGeneralRewardInfoNotify)
        emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.internal_static_GadgetGeneralRewardInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.internal_static_GadgetGeneralRewardInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify.class, emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify.newBuilder()
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
        entityId_ = 0;

        if (generalRewardInfoBuilder_ == null) {
          generalRewardInfo_ = null;
        } else {
          generalRewardInfo_ = null;
          generalRewardInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.internal_static_GadgetGeneralRewardInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify build() {
        emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify buildPartial() {
        emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify result = new emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify(this);
        result.entityId_ = entityId_;
        if (generalRewardInfoBuilder_ == null) {
          result.generalRewardInfo_ = generalRewardInfo_;
        } else {
          result.generalRewardInfo_ = generalRewardInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify other) {
        if (other == emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasGeneralRewardInfo()) {
          mergeGeneralRewardInfo(other.getGeneralRewardInfo());
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
        emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 5;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 5;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward generalRewardInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward, emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward.Builder, emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralRewardOrBuilder> generalRewardInfoBuilder_;
      /**
       * <code>.GeneralReward generalRewardInfo = 15;</code>
       * @return Whether the generalRewardInfo field is set.
       */
      public boolean hasGeneralRewardInfo() {
        return generalRewardInfoBuilder_ != null || generalRewardInfo_ != null;
      }
      /**
       * <code>.GeneralReward generalRewardInfo = 15;</code>
       * @return The generalRewardInfo.
       */
      public emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward getGeneralRewardInfo() {
        if (generalRewardInfoBuilder_ == null) {
          return generalRewardInfo_ == null ? emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward.getDefaultInstance() : generalRewardInfo_;
        } else {
          return generalRewardInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.GeneralReward generalRewardInfo = 15;</code>
       */
      public Builder setGeneralRewardInfo(emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward value) {
        if (generalRewardInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          generalRewardInfo_ = value;
          onChanged();
        } else {
          generalRewardInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GeneralReward generalRewardInfo = 15;</code>
       */
      public Builder setGeneralRewardInfo(
          emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward.Builder builderForValue) {
        if (generalRewardInfoBuilder_ == null) {
          generalRewardInfo_ = builderForValue.build();
          onChanged();
        } else {
          generalRewardInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GeneralReward generalRewardInfo = 15;</code>
       */
      public Builder mergeGeneralRewardInfo(emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward value) {
        if (generalRewardInfoBuilder_ == null) {
          if (generalRewardInfo_ != null) {
            generalRewardInfo_ =
              emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward.newBuilder(generalRewardInfo_).mergeFrom(value).buildPartial();
          } else {
            generalRewardInfo_ = value;
          }
          onChanged();
        } else {
          generalRewardInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GeneralReward generalRewardInfo = 15;</code>
       */
      public Builder clearGeneralRewardInfo() {
        if (generalRewardInfoBuilder_ == null) {
          generalRewardInfo_ = null;
          onChanged();
        } else {
          generalRewardInfo_ = null;
          generalRewardInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GeneralReward generalRewardInfo = 15;</code>
       */
      public emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward.Builder getGeneralRewardInfoBuilder() {
        
        onChanged();
        return getGeneralRewardInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.GeneralReward generalRewardInfo = 15;</code>
       */
      public emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralRewardOrBuilder getGeneralRewardInfoOrBuilder() {
        if (generalRewardInfoBuilder_ != null) {
          return generalRewardInfoBuilder_.getMessageOrBuilder();
        } else {
          return generalRewardInfo_ == null ?
              emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward.getDefaultInstance() : generalRewardInfo_;
        }
      }
      /**
       * <code>.GeneralReward generalRewardInfo = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward, emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward.Builder, emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralRewardOrBuilder> 
          getGeneralRewardInfoFieldBuilder() {
        if (generalRewardInfoBuilder_ == null) {
          generalRewardInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward, emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralReward.Builder, emu.grasscutter.net.proto.GeneralRewardOuterClass.GeneralRewardOrBuilder>(
                  getGeneralRewardInfo(),
                  getParentForChildren(),
                  isClean());
          generalRewardInfo_ = null;
        }
        return generalRewardInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GadgetGeneralRewardInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:GadgetGeneralRewardInfoNotify)
    private static final emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify();
    }

    public static emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetGeneralRewardInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<GadgetGeneralRewardInfoNotify>() {
      @java.lang.Override
      public GadgetGeneralRewardInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GadgetGeneralRewardInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GadgetGeneralRewardInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetGeneralRewardInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GadgetGeneralRewardInfoNotifyOuterClass.GadgetGeneralRewardInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetGeneralRewardInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetGeneralRewardInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#GadgetGeneralRewardInfoNotify.proto\032\023G" +
      "eneralReward.proto\"\\\n\035GadgetGeneralRewar" +
      "dInfoNotify\022\020\n\010entityId\030\005 \001(\r\022)\n\021general" +
      "RewardInfo\030\017 \001(\0132\016.GeneralRewardB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GeneralRewardOuterClass.getDescriptor(),
        });
    internal_static_GadgetGeneralRewardInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetGeneralRewardInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetGeneralRewardInfoNotify_descriptor,
        new java.lang.String[] { "EntityId", "GeneralRewardInfo", });
    emu.grasscutter.net.proto.GeneralRewardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
