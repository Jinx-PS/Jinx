// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InstableSprayLevelFinishNotify.proto

package emu.grasscutter.net.proto;

public final class InstableSprayLevelFinishNotifyOuterClass {
  private InstableSprayLevelFinishNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InstableSprayLevelFinishNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InstableSprayLevelFinishNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk3300_DHKHBKLBIPA = 14;</code>
     * @return The unk3300DHKHBKLBIPA.
     */
    boolean getUnk3300DHKHBKLBIPA();

    /**
     * <code>uint32 round = 2;</code>
     * @return The round.
     */
    int getRound();

    /**
     * <code>uint32 stageId = 11;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 levelId = 9;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool Unk3300_AMEBAPIPLGL = 6;</code>
     * @return The unk3300AMEBAPIPLGL.
     */
    boolean getUnk3300AMEBAPIPLGL();
  }
  /**
   * <pre>
   *enum EOIABCFNAIK {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 24172;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code InstableSprayLevelFinishNotify}
   */
  public static final class InstableSprayLevelFinishNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InstableSprayLevelFinishNotify)
      InstableSprayLevelFinishNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InstableSprayLevelFinishNotify.newBuilder() to construct.
    private InstableSprayLevelFinishNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InstableSprayLevelFinishNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InstableSprayLevelFinishNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InstableSprayLevelFinishNotify(
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
            case 16: {

              round_ = input.readUInt32();
              break;
            }
            case 48: {

              unk3300AMEBAPIPLGL_ = input.readBool();
              break;
            }
            case 72: {

              levelId_ = input.readUInt32();
              break;
            }
            case 88: {

              stageId_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3300DHKHBKLBIPA_ = input.readBool();
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
      return emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.internal_static_InstableSprayLevelFinishNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.internal_static_InstableSprayLevelFinishNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify.class, emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify.Builder.class);
    }

    public static final int UNK3300_DHKHBKLBIPA_FIELD_NUMBER = 14;
    private boolean unk3300DHKHBKLBIPA_;
    /**
     * <code>bool Unk3300_DHKHBKLBIPA = 14;</code>
     * @return The unk3300DHKHBKLBIPA.
     */
    @java.lang.Override
    public boolean getUnk3300DHKHBKLBIPA() {
      return unk3300DHKHBKLBIPA_;
    }

    public static final int ROUND_FIELD_NUMBER = 2;
    private int round_;
    /**
     * <code>uint32 round = 2;</code>
     * @return The round.
     */
    @java.lang.Override
    public int getRound() {
      return round_;
    }

    public static final int STAGEID_FIELD_NUMBER = 11;
    private int stageId_;
    /**
     * <code>uint32 stageId = 11;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int LEVELID_FIELD_NUMBER = 9;
    private int levelId_;
    /**
     * <code>uint32 levelId = 9;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int UNK3300_AMEBAPIPLGL_FIELD_NUMBER = 6;
    private boolean unk3300AMEBAPIPLGL_;
    /**
     * <code>bool Unk3300_AMEBAPIPLGL = 6;</code>
     * @return The unk3300AMEBAPIPLGL.
     */
    @java.lang.Override
    public boolean getUnk3300AMEBAPIPLGL() {
      return unk3300AMEBAPIPLGL_;
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
      if (round_ != 0) {
        output.writeUInt32(2, round_);
      }
      if (unk3300AMEBAPIPLGL_ != false) {
        output.writeBool(6, unk3300AMEBAPIPLGL_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(9, levelId_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(11, stageId_);
      }
      if (unk3300DHKHBKLBIPA_ != false) {
        output.writeBool(14, unk3300DHKHBKLBIPA_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (round_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, round_);
      }
      if (unk3300AMEBAPIPLGL_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, unk3300AMEBAPIPLGL_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, levelId_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, stageId_);
      }
      if (unk3300DHKHBKLBIPA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, unk3300DHKHBKLBIPA_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify other = (emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify) obj;

      if (getUnk3300DHKHBKLBIPA()
          != other.getUnk3300DHKHBKLBIPA()) return false;
      if (getRound()
          != other.getRound()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getUnk3300AMEBAPIPLGL()
          != other.getUnk3300AMEBAPIPLGL()) return false;
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
      hash = (37 * hash) + UNK3300_DHKHBKLBIPA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300DHKHBKLBIPA());
      hash = (37 * hash) + ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getRound();
      hash = (37 * hash) + STAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + LEVELID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + UNK3300_AMEBAPIPLGL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300AMEBAPIPLGL());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify prototype) {
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
     *enum EOIABCFNAIK {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 24172;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code InstableSprayLevelFinishNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InstableSprayLevelFinishNotify)
        emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.internal_static_InstableSprayLevelFinishNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.internal_static_InstableSprayLevelFinishNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify.class, emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify.newBuilder()
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
        unk3300DHKHBKLBIPA_ = false;

        round_ = 0;

        stageId_ = 0;

        levelId_ = 0;

        unk3300AMEBAPIPLGL_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.internal_static_InstableSprayLevelFinishNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify build() {
        emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify buildPartial() {
        emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify result = new emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify(this);
        result.unk3300DHKHBKLBIPA_ = unk3300DHKHBKLBIPA_;
        result.round_ = round_;
        result.stageId_ = stageId_;
        result.levelId_ = levelId_;
        result.unk3300AMEBAPIPLGL_ = unk3300AMEBAPIPLGL_;
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
        if (other instanceof emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify) {
          return mergeFrom((emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify other) {
        if (other == emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify.getDefaultInstance()) return this;
        if (other.getUnk3300DHKHBKLBIPA() != false) {
          setUnk3300DHKHBKLBIPA(other.getUnk3300DHKHBKLBIPA());
        }
        if (other.getRound() != 0) {
          setRound(other.getRound());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getUnk3300AMEBAPIPLGL() != false) {
          setUnk3300AMEBAPIPLGL(other.getUnk3300AMEBAPIPLGL());
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
        emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean unk3300DHKHBKLBIPA_ ;
      /**
       * <code>bool Unk3300_DHKHBKLBIPA = 14;</code>
       * @return The unk3300DHKHBKLBIPA.
       */
      @java.lang.Override
      public boolean getUnk3300DHKHBKLBIPA() {
        return unk3300DHKHBKLBIPA_;
      }
      /**
       * <code>bool Unk3300_DHKHBKLBIPA = 14;</code>
       * @param value The unk3300DHKHBKLBIPA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300DHKHBKLBIPA(boolean value) {
        
        unk3300DHKHBKLBIPA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_DHKHBKLBIPA = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300DHKHBKLBIPA() {
        
        unk3300DHKHBKLBIPA_ = false;
        onChanged();
        return this;
      }

      private int round_ ;
      /**
       * <code>uint32 round = 2;</code>
       * @return The round.
       */
      @java.lang.Override
      public int getRound() {
        return round_;
      }
      /**
       * <code>uint32 round = 2;</code>
       * @param value The round to set.
       * @return This builder for chaining.
       */
      public Builder setRound(int value) {
        
        round_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 round = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRound() {
        
        round_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stageId = 11;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stageId = 11;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stageId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 levelId = 9;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 levelId = 9;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 levelId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3300AMEBAPIPLGL_ ;
      /**
       * <code>bool Unk3300_AMEBAPIPLGL = 6;</code>
       * @return The unk3300AMEBAPIPLGL.
       */
      @java.lang.Override
      public boolean getUnk3300AMEBAPIPLGL() {
        return unk3300AMEBAPIPLGL_;
      }
      /**
       * <code>bool Unk3300_AMEBAPIPLGL = 6;</code>
       * @param value The unk3300AMEBAPIPLGL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300AMEBAPIPLGL(boolean value) {
        
        unk3300AMEBAPIPLGL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_AMEBAPIPLGL = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300AMEBAPIPLGL() {
        
        unk3300AMEBAPIPLGL_ = false;
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


      // @@protoc_insertion_point(builder_scope:InstableSprayLevelFinishNotify)
    }

    // @@protoc_insertion_point(class_scope:InstableSprayLevelFinishNotify)
    private static final emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify();
    }

    public static emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InstableSprayLevelFinishNotify>
        PARSER = new com.google.protobuf.AbstractParser<InstableSprayLevelFinishNotify>() {
      @java.lang.Override
      public InstableSprayLevelFinishNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InstableSprayLevelFinishNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InstableSprayLevelFinishNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InstableSprayLevelFinishNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InstableSprayLevelFinishNotifyOuterClass.InstableSprayLevelFinishNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InstableSprayLevelFinishNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InstableSprayLevelFinishNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$InstableSprayLevelFinishNotify.proto\"\213" +
      "\001\n\036InstableSprayLevelFinishNotify\022\033\n\023Unk" +
      "3300_DHKHBKLBIPA\030\016 \001(\010\022\r\n\005round\030\002 \001(\r\022\017\n" +
      "\007stageId\030\013 \001(\r\022\017\n\007levelId\030\t \001(\r\022\033\n\023Unk33" +
      "00_AMEBAPIPLGL\030\006 \001(\010B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InstableSprayLevelFinishNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InstableSprayLevelFinishNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InstableSprayLevelFinishNotify_descriptor,
        new java.lang.String[] { "Unk3300DHKHBKLBIPA", "Round", "StageId", "LevelId", "Unk3300AMEBAPIPLGL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
