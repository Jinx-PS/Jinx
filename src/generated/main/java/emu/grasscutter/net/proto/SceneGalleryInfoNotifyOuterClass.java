// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryInfoNotify.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryInfoNotifyOuterClass {
  private SceneGalleryInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     * @return Whether the galleryInfo field is set.
     */
    boolean hasGalleryInfo();
    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     * @return The galleryInfo.
     */
    emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo getGalleryInfo();
    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     */
    emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder getGalleryInfoOrBuilder();
  }
  /**
   * <pre>
   *enum KHBMFBHDECI {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 5513;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code SceneGalleryInfoNotify}
   */
  public static final class SceneGalleryInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryInfoNotify)
      SceneGalleryInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryInfoNotify.newBuilder() to construct.
    private SceneGalleryInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryInfoNotify(
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
            case 58: {
              emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder subBuilder = null;
              if (galleryInfo_ != null) {
                subBuilder = galleryInfo_.toBuilder();
              }
              galleryInfo_ = input.readMessage(emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(galleryInfo_);
                galleryInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.internal_static_SceneGalleryInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.internal_static_SceneGalleryInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.class, emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.Builder.class);
    }

    public static final int GALLERYINFO_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo galleryInfo_;
    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     * @return Whether the galleryInfo field is set.
     */
    @java.lang.Override
    public boolean hasGalleryInfo() {
      return galleryInfo_ != null;
    }
    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     * @return The galleryInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo getGalleryInfo() {
      return galleryInfo_ == null ? emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo.getDefaultInstance() : galleryInfo_;
    }
    /**
     * <code>.SceneGalleryInfo galleryInfo = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder getGalleryInfoOrBuilder() {
      return getGalleryInfo();
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
      if (galleryInfo_ != null) {
        output.writeMessage(7, getGalleryInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getGalleryInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify other = (emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify) obj;

      if (hasGalleryInfo() != other.hasGalleryInfo()) return false;
      if (hasGalleryInfo()) {
        if (!getGalleryInfo()
            .equals(other.getGalleryInfo())) return false;
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
      if (hasGalleryInfo()) {
        hash = (37 * hash) + GALLERYINFO_FIELD_NUMBER;
        hash = (53 * hash) + getGalleryInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify prototype) {
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
     *enum KHBMFBHDECI {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 5513;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code SceneGalleryInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryInfoNotify)
        emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.internal_static_SceneGalleryInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.internal_static_SceneGalleryInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.class, emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.newBuilder()
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
        if (galleryInfoBuilder_ == null) {
          galleryInfo_ = null;
        } else {
          galleryInfo_ = null;
          galleryInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.internal_static_SceneGalleryInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify build() {
        emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify result = new emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify(this);
        if (galleryInfoBuilder_ == null) {
          result.galleryInfo_ = galleryInfo_;
        } else {
          result.galleryInfo_ = galleryInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify.getDefaultInstance()) return this;
        if (other.hasGalleryInfo()) {
          mergeGalleryInfo(other.getGalleryInfo());
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
        emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo galleryInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo, emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder, emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder> galleryInfoBuilder_;
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       * @return Whether the galleryInfo field is set.
       */
      public boolean hasGalleryInfo() {
        return galleryInfoBuilder_ != null || galleryInfo_ != null;
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       * @return The galleryInfo.
       */
      public emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo getGalleryInfo() {
        if (galleryInfoBuilder_ == null) {
          return galleryInfo_ == null ? emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo.getDefaultInstance() : galleryInfo_;
        } else {
          return galleryInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public Builder setGalleryInfo(emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo value) {
        if (galleryInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          galleryInfo_ = value;
          onChanged();
        } else {
          galleryInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public Builder setGalleryInfo(
          emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder builderForValue) {
        if (galleryInfoBuilder_ == null) {
          galleryInfo_ = builderForValue.build();
          onChanged();
        } else {
          galleryInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public Builder mergeGalleryInfo(emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo value) {
        if (galleryInfoBuilder_ == null) {
          if (galleryInfo_ != null) {
            galleryInfo_ =
              emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo.newBuilder(galleryInfo_).mergeFrom(value).buildPartial();
          } else {
            galleryInfo_ = value;
          }
          onChanged();
        } else {
          galleryInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public Builder clearGalleryInfo() {
        if (galleryInfoBuilder_ == null) {
          galleryInfo_ = null;
          onChanged();
        } else {
          galleryInfo_ = null;
          galleryInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder getGalleryInfoBuilder() {
        
        onChanged();
        return getGalleryInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      public emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder getGalleryInfoOrBuilder() {
        if (galleryInfoBuilder_ != null) {
          return galleryInfoBuilder_.getMessageOrBuilder();
        } else {
          return galleryInfo_ == null ?
              emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo.getDefaultInstance() : galleryInfo_;
        }
      }
      /**
       * <code>.SceneGalleryInfo galleryInfo = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo, emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder, emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder> 
          getGalleryInfoFieldBuilder() {
        if (galleryInfoBuilder_ == null) {
          galleryInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo, emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder, emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder>(
                  getGalleryInfo(),
                  getParentForChildren(),
                  isClean());
          galleryInfo_ = null;
        }
        return galleryInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryInfoNotify)
    private static final emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify();
    }

    public static emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryInfoNotify>() {
      @java.lang.Override
      public SceneGalleryInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryInfoNotifyOuterClass.SceneGalleryInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SceneGalleryInfoNotify.proto\032\026SceneGal" +
      "leryInfo.proto\"@\n\026SceneGalleryInfoNotify" +
      "\022&\n\013galleryInfo\030\007 \001(\0132\021.SceneGalleryInfo" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneGalleryInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryInfoNotify_descriptor,
        new java.lang.String[] { "GalleryInfo", });
    emu.grasscutter.net.proto.SceneGalleryInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
