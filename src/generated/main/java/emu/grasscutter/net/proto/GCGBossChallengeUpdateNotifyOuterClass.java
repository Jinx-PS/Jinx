// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGBossChallengeUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class GCGBossChallengeUpdateNotifyOuterClass {
  private GCGBossChallengeUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGBossChallengeUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGBossChallengeUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
     * @return Whether the jmpbgnfplkb field is set.
     */
    boolean hasJmpbgnfplkb();
    /**
     * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
     * @return The jmpbgnfplkb.
     */
    emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData getJmpbgnfplkb();
    /**
     * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
     */
    emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder getJmpbgnfplkbOrBuilder();
  }
  /**
   * <pre>
   *enum OGCPGBNLNOM {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 7119;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code GCGBossChallengeUpdateNotify}
   */
  public static final class GCGBossChallengeUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGBossChallengeUpdateNotify)
      GCGBossChallengeUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGBossChallengeUpdateNotify.newBuilder() to construct.
    private GCGBossChallengeUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGBossChallengeUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGBossChallengeUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGBossChallengeUpdateNotify(
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
            case 74: {
              emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder subBuilder = null;
              if (jmpbgnfplkb_ != null) {
                subBuilder = jmpbgnfplkb_.toBuilder();
              }
              jmpbgnfplkb_ = input.readMessage(emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(jmpbgnfplkb_);
                jmpbgnfplkb_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.internal_static_GCGBossChallengeUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.class, emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.Builder.class);
    }

    public static final int JMPBGNFPLKB_FIELD_NUMBER = 9;
    private emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData jmpbgnfplkb_;
    /**
     * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
     * @return Whether the jmpbgnfplkb field is set.
     */
    @java.lang.Override
    public boolean hasJmpbgnfplkb() {
      return jmpbgnfplkb_ != null;
    }
    /**
     * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
     * @return The jmpbgnfplkb.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData getJmpbgnfplkb() {
      return jmpbgnfplkb_ == null ? emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.getDefaultInstance() : jmpbgnfplkb_;
    }
    /**
     * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder getJmpbgnfplkbOrBuilder() {
      return getJmpbgnfplkb();
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
      if (jmpbgnfplkb_ != null) {
        output.writeMessage(9, getJmpbgnfplkb());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jmpbgnfplkb_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getJmpbgnfplkb());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify other = (emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify) obj;

      if (hasJmpbgnfplkb() != other.hasJmpbgnfplkb()) return false;
      if (hasJmpbgnfplkb()) {
        if (!getJmpbgnfplkb()
            .equals(other.getJmpbgnfplkb())) return false;
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
      if (hasJmpbgnfplkb()) {
        hash = (37 * hash) + JMPBGNFPLKB_FIELD_NUMBER;
        hash = (53 * hash) + getJmpbgnfplkb().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify prototype) {
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
     *enum OGCPGBNLNOM {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 7119;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code GCGBossChallengeUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGBossChallengeUpdateNotify)
        emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.internal_static_GCGBossChallengeUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.class, emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.newBuilder()
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
        if (jmpbgnfplkbBuilder_ == null) {
          jmpbgnfplkb_ = null;
        } else {
          jmpbgnfplkb_ = null;
          jmpbgnfplkbBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.internal_static_GCGBossChallengeUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify build() {
        emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify result = new emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify(this);
        if (jmpbgnfplkbBuilder_ == null) {
          result.jmpbgnfplkb_ = jmpbgnfplkb_;
        } else {
          result.jmpbgnfplkb_ = jmpbgnfplkbBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.getDefaultInstance()) return this;
        if (other.hasJmpbgnfplkb()) {
          mergeJmpbgnfplkb(other.getJmpbgnfplkb());
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
        emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData jmpbgnfplkb_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData, emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder, emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder> jmpbgnfplkbBuilder_;
      /**
       * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
       * @return Whether the jmpbgnfplkb field is set.
       */
      public boolean hasJmpbgnfplkb() {
        return jmpbgnfplkbBuilder_ != null || jmpbgnfplkb_ != null;
      }
      /**
       * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
       * @return The jmpbgnfplkb.
       */
      public emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData getJmpbgnfplkb() {
        if (jmpbgnfplkbBuilder_ == null) {
          return jmpbgnfplkb_ == null ? emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.getDefaultInstance() : jmpbgnfplkb_;
        } else {
          return jmpbgnfplkbBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
       */
      public Builder setJmpbgnfplkb(emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData value) {
        if (jmpbgnfplkbBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          jmpbgnfplkb_ = value;
          onChanged();
        } else {
          jmpbgnfplkbBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
       */
      public Builder setJmpbgnfplkb(
          emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder builderForValue) {
        if (jmpbgnfplkbBuilder_ == null) {
          jmpbgnfplkb_ = builderForValue.build();
          onChanged();
        } else {
          jmpbgnfplkbBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
       */
      public Builder mergeJmpbgnfplkb(emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData value) {
        if (jmpbgnfplkbBuilder_ == null) {
          if (jmpbgnfplkb_ != null) {
            jmpbgnfplkb_ =
              emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.newBuilder(jmpbgnfplkb_).mergeFrom(value).buildPartial();
          } else {
            jmpbgnfplkb_ = value;
          }
          onChanged();
        } else {
          jmpbgnfplkbBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
       */
      public Builder clearJmpbgnfplkb() {
        if (jmpbgnfplkbBuilder_ == null) {
          jmpbgnfplkb_ = null;
          onChanged();
        } else {
          jmpbgnfplkb_ = null;
          jmpbgnfplkbBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
       */
      public emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder getJmpbgnfplkbBuilder() {
        
        onChanged();
        return getJmpbgnfplkbFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
       */
      public emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder getJmpbgnfplkbOrBuilder() {
        if (jmpbgnfplkbBuilder_ != null) {
          return jmpbgnfplkbBuilder_.getMessageOrBuilder();
        } else {
          return jmpbgnfplkb_ == null ?
              emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.getDefaultInstance() : jmpbgnfplkb_;
        }
      }
      /**
       * <code>.GCGBossChallengeData jmpbgnfplkb = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData, emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder, emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder> 
          getJmpbgnfplkbFieldBuilder() {
        if (jmpbgnfplkbBuilder_ == null) {
          jmpbgnfplkbBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData, emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder, emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder>(
                  getJmpbgnfplkb(),
                  getParentForChildren(),
                  isClean());
          jmpbgnfplkb_ = null;
        }
        return jmpbgnfplkbBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGBossChallengeUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGBossChallengeUpdateNotify)
    private static final emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify();
    }

    public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGBossChallengeUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGBossChallengeUpdateNotify>() {
      @java.lang.Override
      public GCGBossChallengeUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGBossChallengeUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGBossChallengeUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGBossChallengeUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGBossChallengeUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GCGBossChallengeUpdateNotify.proto\032\032GC" +
      "GBossChallengeData.proto\"J\n\034GCGBossChall" +
      "engeUpdateNotify\022*\n\013jmpbgnfplkb\030\t \001(\0132\025." +
      "GCGBossChallengeDataB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.getDescriptor(),
        });
    internal_static_GCGBossChallengeUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGBossChallengeUpdateNotify_descriptor,
        new java.lang.String[] { "Jmpbgnfplkb", });
    emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
