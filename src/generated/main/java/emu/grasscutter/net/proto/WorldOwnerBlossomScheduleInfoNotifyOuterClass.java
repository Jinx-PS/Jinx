// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldOwnerBlossomScheduleInfoNotify.proto

package emu.grasscutter.net.proto;

public final class WorldOwnerBlossomScheduleInfoNotifyOuterClass {
  private WorldOwnerBlossomScheduleInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldOwnerBlossomScheduleInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldOwnerBlossomScheduleInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
     * @return Whether the scheduleInfo field is set.
     */
    boolean hasScheduleInfo();
    /**
     * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
     * @return The scheduleInfo.
     */
    emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo getScheduleInfo();
    /**
     * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
     */
    emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfoOrBuilder getScheduleInfoOrBuilder();
  }
  /**
   * <pre>
   *enum BNGIMIJIMIM {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 2720;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code WorldOwnerBlossomScheduleInfoNotify}
   */
  public static final class WorldOwnerBlossomScheduleInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldOwnerBlossomScheduleInfoNotify)
      WorldOwnerBlossomScheduleInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldOwnerBlossomScheduleInfoNotify.newBuilder() to construct.
    private WorldOwnerBlossomScheduleInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldOwnerBlossomScheduleInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldOwnerBlossomScheduleInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WorldOwnerBlossomScheduleInfoNotify(
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
            case 34: {
              emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.Builder subBuilder = null;
              if (scheduleInfo_ != null) {
                subBuilder = scheduleInfo_.toBuilder();
              }
              scheduleInfo_ = input.readMessage(emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(scheduleInfo_);
                scheduleInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.internal_static_WorldOwnerBlossomScheduleInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.internal_static_WorldOwnerBlossomScheduleInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify.class, emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify.Builder.class);
    }

    public static final int SCHEDULEINFO_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo scheduleInfo_;
    /**
     * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
     * @return Whether the scheduleInfo field is set.
     */
    @java.lang.Override
    public boolean hasScheduleInfo() {
      return scheduleInfo_ != null;
    }
    /**
     * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
     * @return The scheduleInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo getScheduleInfo() {
      return scheduleInfo_ == null ? emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.getDefaultInstance() : scheduleInfo_;
    }
    /**
     * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfoOrBuilder getScheduleInfoOrBuilder() {
      return getScheduleInfo();
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
      if (scheduleInfo_ != null) {
        output.writeMessage(4, getScheduleInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scheduleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getScheduleInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify other = (emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify) obj;

      if (hasScheduleInfo() != other.hasScheduleInfo()) return false;
      if (hasScheduleInfo()) {
        if (!getScheduleInfo()
            .equals(other.getScheduleInfo())) return false;
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
      if (hasScheduleInfo()) {
        hash = (37 * hash) + SCHEDULEINFO_FIELD_NUMBER;
        hash = (53 * hash) + getScheduleInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify prototype) {
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
     *enum BNGIMIJIMIM {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 2720;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code WorldOwnerBlossomScheduleInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldOwnerBlossomScheduleInfoNotify)
        emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.internal_static_WorldOwnerBlossomScheduleInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.internal_static_WorldOwnerBlossomScheduleInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify.class, emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify.newBuilder()
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
        if (scheduleInfoBuilder_ == null) {
          scheduleInfo_ = null;
        } else {
          scheduleInfo_ = null;
          scheduleInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.internal_static_WorldOwnerBlossomScheduleInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify build() {
        emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify buildPartial() {
        emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify result = new emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify(this);
        if (scheduleInfoBuilder_ == null) {
          result.scheduleInfo_ = scheduleInfo_;
        } else {
          result.scheduleInfo_ = scheduleInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify other) {
        if (other == emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify.getDefaultInstance()) return this;
        if (other.hasScheduleInfo()) {
          mergeScheduleInfo(other.getScheduleInfo());
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
        emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo scheduleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo, emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.Builder, emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfoOrBuilder> scheduleInfoBuilder_;
      /**
       * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
       * @return Whether the scheduleInfo field is set.
       */
      public boolean hasScheduleInfo() {
        return scheduleInfoBuilder_ != null || scheduleInfo_ != null;
      }
      /**
       * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
       * @return The scheduleInfo.
       */
      public emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo getScheduleInfo() {
        if (scheduleInfoBuilder_ == null) {
          return scheduleInfo_ == null ? emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.getDefaultInstance() : scheduleInfo_;
        } else {
          return scheduleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
       */
      public Builder setScheduleInfo(emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo value) {
        if (scheduleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          scheduleInfo_ = value;
          onChanged();
        } else {
          scheduleInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
       */
      public Builder setScheduleInfo(
          emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.Builder builderForValue) {
        if (scheduleInfoBuilder_ == null) {
          scheduleInfo_ = builderForValue.build();
          onChanged();
        } else {
          scheduleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
       */
      public Builder mergeScheduleInfo(emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo value) {
        if (scheduleInfoBuilder_ == null) {
          if (scheduleInfo_ != null) {
            scheduleInfo_ =
              emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.newBuilder(scheduleInfo_).mergeFrom(value).buildPartial();
          } else {
            scheduleInfo_ = value;
          }
          onChanged();
        } else {
          scheduleInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
       */
      public Builder clearScheduleInfo() {
        if (scheduleInfoBuilder_ == null) {
          scheduleInfo_ = null;
          onChanged();
        } else {
          scheduleInfo_ = null;
          scheduleInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
       */
      public emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.Builder getScheduleInfoBuilder() {
        
        onChanged();
        return getScheduleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
       */
      public emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfoOrBuilder getScheduleInfoOrBuilder() {
        if (scheduleInfoBuilder_ != null) {
          return scheduleInfoBuilder_.getMessageOrBuilder();
        } else {
          return scheduleInfo_ == null ?
              emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.getDefaultInstance() : scheduleInfo_;
        }
      }
      /**
       * <code>.BlossomScheduleInfo scheduleInfo = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo, emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.Builder, emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfoOrBuilder> 
          getScheduleInfoFieldBuilder() {
        if (scheduleInfoBuilder_ == null) {
          scheduleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo, emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.Builder, emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.BlossomScheduleInfoOrBuilder>(
                  getScheduleInfo(),
                  getParentForChildren(),
                  isClean());
          scheduleInfo_ = null;
        }
        return scheduleInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WorldOwnerBlossomScheduleInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:WorldOwnerBlossomScheduleInfoNotify)
    private static final emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify();
    }

    public static emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldOwnerBlossomScheduleInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<WorldOwnerBlossomScheduleInfoNotify>() {
      @java.lang.Override
      public WorldOwnerBlossomScheduleInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorldOwnerBlossomScheduleInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WorldOwnerBlossomScheduleInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldOwnerBlossomScheduleInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WorldOwnerBlossomScheduleInfoNotifyOuterClass.WorldOwnerBlossomScheduleInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldOwnerBlossomScheduleInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldOwnerBlossomScheduleInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)WorldOwnerBlossomScheduleInfoNotify.pr" +
      "oto\032\031BlossomScheduleInfo.proto\"Q\n#WorldO" +
      "wnerBlossomScheduleInfoNotify\022*\n\014schedul" +
      "eInfo\030\004 \001(\0132\024.BlossomScheduleInfoB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.getDescriptor(),
        });
    internal_static_WorldOwnerBlossomScheduleInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldOwnerBlossomScheduleInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldOwnerBlossomScheduleInfoNotify_descriptor,
        new java.lang.String[] { "ScheduleInfo", });
    emu.grasscutter.net.proto.BlossomScheduleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
