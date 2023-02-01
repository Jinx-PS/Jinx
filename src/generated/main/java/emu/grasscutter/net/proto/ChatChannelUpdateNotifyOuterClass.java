// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatChannelUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class ChatChannelUpdateNotifyOuterClass {
  private ChatChannelUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatChannelUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChatChannelUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isCreate = 13;</code>
     * @return The isCreate.
     */
    boolean getIsCreate();

    /**
     * <code>.ChatChannelInfo channelInfo = 6;</code>
     * @return Whether the channelInfo field is set.
     */
    boolean hasChannelInfo();
    /**
     * <code>.ChatChannelInfo channelInfo = 6;</code>
     * @return The channelInfo.
     */
    emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo getChannelInfo();
    /**
     * <code>.ChatChannelInfo channelInfo = 6;</code>
     */
    emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder getChannelInfoOrBuilder();

    /**
     * <code>uint32 channelId = 12;</code>
     * @return The channelId.
     */
    int getChannelId();
  }
  /**
   * <pre>
   *enum LJAJLOILCKG {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 4979;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code ChatChannelUpdateNotify}
   */
  public static final class ChatChannelUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChatChannelUpdateNotify)
      ChatChannelUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChatChannelUpdateNotify.newBuilder() to construct.
    private ChatChannelUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatChannelUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChatChannelUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChatChannelUpdateNotify(
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
            case 50: {
              emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder subBuilder = null;
              if (channelInfo_ != null) {
                subBuilder = channelInfo_.toBuilder();
              }
              channelInfo_ = input.readMessage(emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(channelInfo_);
                channelInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 96: {

              channelId_ = input.readUInt32();
              break;
            }
            case 104: {

              isCreate_ = input.readBool();
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
      return emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.internal_static_ChatChannelUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.internal_static_ChatChannelUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.class, emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.Builder.class);
    }

    public static final int ISCREATE_FIELD_NUMBER = 13;
    private boolean isCreate_;
    /**
     * <code>bool isCreate = 13;</code>
     * @return The isCreate.
     */
    @java.lang.Override
    public boolean getIsCreate() {
      return isCreate_;
    }

    public static final int CHANNELINFO_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo channelInfo_;
    /**
     * <code>.ChatChannelInfo channelInfo = 6;</code>
     * @return Whether the channelInfo field is set.
     */
    @java.lang.Override
    public boolean hasChannelInfo() {
      return channelInfo_ != null;
    }
    /**
     * <code>.ChatChannelInfo channelInfo = 6;</code>
     * @return The channelInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo getChannelInfo() {
      return channelInfo_ == null ? emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.getDefaultInstance() : channelInfo_;
    }
    /**
     * <code>.ChatChannelInfo channelInfo = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder getChannelInfoOrBuilder() {
      return getChannelInfo();
    }

    public static final int CHANNELID_FIELD_NUMBER = 12;
    private int channelId_;
    /**
     * <code>uint32 channelId = 12;</code>
     * @return The channelId.
     */
    @java.lang.Override
    public int getChannelId() {
      return channelId_;
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
      if (channelInfo_ != null) {
        output.writeMessage(6, getChannelInfo());
      }
      if (channelId_ != 0) {
        output.writeUInt32(12, channelId_);
      }
      if (isCreate_ != false) {
        output.writeBool(13, isCreate_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (channelInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getChannelInfo());
      }
      if (channelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, channelId_);
      }
      if (isCreate_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isCreate_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify other = (emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify) obj;

      if (getIsCreate()
          != other.getIsCreate()) return false;
      if (hasChannelInfo() != other.hasChannelInfo()) return false;
      if (hasChannelInfo()) {
        if (!getChannelInfo()
            .equals(other.getChannelInfo())) return false;
      }
      if (getChannelId()
          != other.getChannelId()) return false;
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
      hash = (37 * hash) + ISCREATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCreate());
      if (hasChannelInfo()) {
        hash = (37 * hash) + CHANNELINFO_FIELD_NUMBER;
        hash = (53 * hash) + getChannelInfo().hashCode();
      }
      hash = (37 * hash) + CHANNELID_FIELD_NUMBER;
      hash = (53 * hash) + getChannelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify prototype) {
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
     *enum LJAJLOILCKG {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 4979;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code ChatChannelUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChatChannelUpdateNotify)
        emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.internal_static_ChatChannelUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.internal_static_ChatChannelUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.class, emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.newBuilder()
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
        isCreate_ = false;

        if (channelInfoBuilder_ == null) {
          channelInfo_ = null;
        } else {
          channelInfo_ = null;
          channelInfoBuilder_ = null;
        }
        channelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.internal_static_ChatChannelUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify build() {
        emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify result = new emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify(this);
        result.isCreate_ = isCreate_;
        if (channelInfoBuilder_ == null) {
          result.channelInfo_ = channelInfo_;
        } else {
          result.channelInfo_ = channelInfoBuilder_.build();
        }
        result.channelId_ = channelId_;
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
        if (other instanceof emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.getDefaultInstance()) return this;
        if (other.getIsCreate() != false) {
          setIsCreate(other.getIsCreate());
        }
        if (other.hasChannelInfo()) {
          mergeChannelInfo(other.getChannelInfo());
        }
        if (other.getChannelId() != 0) {
          setChannelId(other.getChannelId());
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
        emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isCreate_ ;
      /**
       * <code>bool isCreate = 13;</code>
       * @return The isCreate.
       */
      @java.lang.Override
      public boolean getIsCreate() {
        return isCreate_;
      }
      /**
       * <code>bool isCreate = 13;</code>
       * @param value The isCreate to set.
       * @return This builder for chaining.
       */
      public Builder setIsCreate(boolean value) {
        
        isCreate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isCreate = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCreate() {
        
        isCreate_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo channelInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo, emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder, emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder> channelInfoBuilder_;
      /**
       * <code>.ChatChannelInfo channelInfo = 6;</code>
       * @return Whether the channelInfo field is set.
       */
      public boolean hasChannelInfo() {
        return channelInfoBuilder_ != null || channelInfo_ != null;
      }
      /**
       * <code>.ChatChannelInfo channelInfo = 6;</code>
       * @return The channelInfo.
       */
      public emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo getChannelInfo() {
        if (channelInfoBuilder_ == null) {
          return channelInfo_ == null ? emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.getDefaultInstance() : channelInfo_;
        } else {
          return channelInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ChatChannelInfo channelInfo = 6;</code>
       */
      public Builder setChannelInfo(emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo value) {
        if (channelInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          channelInfo_ = value;
          onChanged();
        } else {
          channelInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ChatChannelInfo channelInfo = 6;</code>
       */
      public Builder setChannelInfo(
          emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder builderForValue) {
        if (channelInfoBuilder_ == null) {
          channelInfo_ = builderForValue.build();
          onChanged();
        } else {
          channelInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ChatChannelInfo channelInfo = 6;</code>
       */
      public Builder mergeChannelInfo(emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo value) {
        if (channelInfoBuilder_ == null) {
          if (channelInfo_ != null) {
            channelInfo_ =
              emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.newBuilder(channelInfo_).mergeFrom(value).buildPartial();
          } else {
            channelInfo_ = value;
          }
          onChanged();
        } else {
          channelInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ChatChannelInfo channelInfo = 6;</code>
       */
      public Builder clearChannelInfo() {
        if (channelInfoBuilder_ == null) {
          channelInfo_ = null;
          onChanged();
        } else {
          channelInfo_ = null;
          channelInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ChatChannelInfo channelInfo = 6;</code>
       */
      public emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder getChannelInfoBuilder() {
        
        onChanged();
        return getChannelInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ChatChannelInfo channelInfo = 6;</code>
       */
      public emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder getChannelInfoOrBuilder() {
        if (channelInfoBuilder_ != null) {
          return channelInfoBuilder_.getMessageOrBuilder();
        } else {
          return channelInfo_ == null ?
              emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.getDefaultInstance() : channelInfo_;
        }
      }
      /**
       * <code>.ChatChannelInfo channelInfo = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo, emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder, emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder> 
          getChannelInfoFieldBuilder() {
        if (channelInfoBuilder_ == null) {
          channelInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo, emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder, emu.grasscutter.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder>(
                  getChannelInfo(),
                  getParentForChildren(),
                  isClean());
          channelInfo_ = null;
        }
        return channelInfoBuilder_;
      }

      private int channelId_ ;
      /**
       * <code>uint32 channelId = 12;</code>
       * @return The channelId.
       */
      @java.lang.Override
      public int getChannelId() {
        return channelId_;
      }
      /**
       * <code>uint32 channelId = 12;</code>
       * @param value The channelId to set.
       * @return This builder for chaining.
       */
      public Builder setChannelId(int value) {
        
        channelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 channelId = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearChannelId() {
        
        channelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChatChannelUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:ChatChannelUpdateNotify)
    private static final emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify();
    }

    public static emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatChannelUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChatChannelUpdateNotify>() {
      @java.lang.Override
      public ChatChannelUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatChannelUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChatChannelUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatChannelUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatChannelUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatChannelUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ChatChannelUpdateNotify.proto\032\025ChatCha" +
      "nnelInfo.proto\"e\n\027ChatChannelUpdateNotif" +
      "y\022\020\n\010isCreate\030\r \001(\010\022%\n\013channelInfo\030\006 \001(\013" +
      "2\020.ChatChannelInfo\022\021\n\tchannelId\030\014 \001(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ChatChannelInfoOuterClass.getDescriptor(),
        });
    internal_static_ChatChannelUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatChannelUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatChannelUpdateNotify_descriptor,
        new java.lang.String[] { "IsCreate", "ChannelInfo", "ChannelId", });
    emu.grasscutter.net.proto.ChatChannelInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
