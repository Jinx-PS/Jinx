// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryBounceConjuringHitNotify.proto

package emu.grasscutter.net.proto;

public final class GalleryBounceConjuringHitNotifyOuterClass {
  private GalleryBounceConjuringHitNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryBounceConjuringHitNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryBounceConjuringHitNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isPerfect = 15;</code>
     * @return The isPerfect.
     */
    boolean getIsPerfect();

    /**
     * <code>uint32 galleryId = 7;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 addScore = 14;</code>
     * @return The addScore.
     */
    int getAddScore();
  }
  /**
   * <pre>
   *enum OJKFGINDIOP {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 5569;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code GalleryBounceConjuringHitNotify}
   */
  public static final class GalleryBounceConjuringHitNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryBounceConjuringHitNotify)
      GalleryBounceConjuringHitNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryBounceConjuringHitNotify.newBuilder() to construct.
    private GalleryBounceConjuringHitNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryBounceConjuringHitNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryBounceConjuringHitNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GalleryBounceConjuringHitNotify(
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
            case 56: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 112: {

              addScore_ = input.readUInt32();
              break;
            }
            case 120: {

              isPerfect_ = input.readBool();
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
      return emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.internal_static_GalleryBounceConjuringHitNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.internal_static_GalleryBounceConjuringHitNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify.class, emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify.Builder.class);
    }

    public static final int ISPERFECT_FIELD_NUMBER = 15;
    private boolean isPerfect_;
    /**
     * <code>bool isPerfect = 15;</code>
     * @return The isPerfect.
     */
    @java.lang.Override
    public boolean getIsPerfect() {
      return isPerfect_;
    }

    public static final int GALLERYID_FIELD_NUMBER = 7;
    private int galleryId_;
    /**
     * <code>uint32 galleryId = 7;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int ADDSCORE_FIELD_NUMBER = 14;
    private int addScore_;
    /**
     * <code>uint32 addScore = 14;</code>
     * @return The addScore.
     */
    @java.lang.Override
    public int getAddScore() {
      return addScore_;
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
      if (galleryId_ != 0) {
        output.writeUInt32(7, galleryId_);
      }
      if (addScore_ != 0) {
        output.writeUInt32(14, addScore_);
      }
      if (isPerfect_ != false) {
        output.writeBool(15, isPerfect_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, galleryId_);
      }
      if (addScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, addScore_);
      }
      if (isPerfect_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isPerfect_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify other = (emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify) obj;

      if (getIsPerfect()
          != other.getIsPerfect()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getAddScore()
          != other.getAddScore()) return false;
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
      hash = (37 * hash) + ISPERFECT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPerfect());
      hash = (37 * hash) + GALLERYID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + ADDSCORE_FIELD_NUMBER;
      hash = (53 * hash) + getAddScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify prototype) {
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
     *enum OJKFGINDIOP {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 5569;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code GalleryBounceConjuringHitNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryBounceConjuringHitNotify)
        emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.internal_static_GalleryBounceConjuringHitNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.internal_static_GalleryBounceConjuringHitNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify.class, emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify.newBuilder()
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
        isPerfect_ = false;

        galleryId_ = 0;

        addScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.internal_static_GalleryBounceConjuringHitNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify build() {
        emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify buildPartial() {
        emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify result = new emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify(this);
        result.isPerfect_ = isPerfect_;
        result.galleryId_ = galleryId_;
        result.addScore_ = addScore_;
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
        if (other instanceof emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify other) {
        if (other == emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify.getDefaultInstance()) return this;
        if (other.getIsPerfect() != false) {
          setIsPerfect(other.getIsPerfect());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getAddScore() != 0) {
          setAddScore(other.getAddScore());
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
        emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isPerfect_ ;
      /**
       * <code>bool isPerfect = 15;</code>
       * @return The isPerfect.
       */
      @java.lang.Override
      public boolean getIsPerfect() {
        return isPerfect_;
      }
      /**
       * <code>bool isPerfect = 15;</code>
       * @param value The isPerfect to set.
       * @return This builder for chaining.
       */
      public Builder setIsPerfect(boolean value) {
        
        isPerfect_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isPerfect = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPerfect() {
        
        isPerfect_ = false;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 galleryId = 7;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 galleryId = 7;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 galleryId = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int addScore_ ;
      /**
       * <code>uint32 addScore = 14;</code>
       * @return The addScore.
       */
      @java.lang.Override
      public int getAddScore() {
        return addScore_;
      }
      /**
       * <code>uint32 addScore = 14;</code>
       * @param value The addScore to set.
       * @return This builder for chaining.
       */
      public Builder setAddScore(int value) {
        
        addScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 addScore = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddScore() {
        
        addScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GalleryBounceConjuringHitNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryBounceConjuringHitNotify)
    private static final emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify();
    }

    public static emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryBounceConjuringHitNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryBounceConjuringHitNotify>() {
      @java.lang.Override
      public GalleryBounceConjuringHitNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GalleryBounceConjuringHitNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GalleryBounceConjuringHitNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryBounceConjuringHitNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GalleryBounceConjuringHitNotifyOuterClass.GalleryBounceConjuringHitNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryBounceConjuringHitNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryBounceConjuringHitNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%GalleryBounceConjuringHitNotify.proto\"" +
      "Y\n\037GalleryBounceConjuringHitNotify\022\021\n\tis" +
      "Perfect\030\017 \001(\010\022\021\n\tgalleryId\030\007 \001(\r\022\020\n\010addS" +
      "core\030\016 \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GalleryBounceConjuringHitNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryBounceConjuringHitNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryBounceConjuringHitNotify_descriptor,
        new java.lang.String[] { "IsPerfect", "GalleryId", "AddScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
