// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SyncFinishGame.proto

package emu.grasscutter.net.proto;

public final class SyncFinishGameOuterClass {
  private SyncFinishGameOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SyncFinishGameOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SyncFinishGame)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isWin = 1;</code>
     * @return The isWin.
     */
    boolean getIsWin();

    /**
     * <code>uint64 serverGameTime = 5;</code>
     * @return The serverGameTime.
     */
    long getServerGameTime();

    /**
     * <code>bool chbjiolfkil = 8;</code>
     * @return The chbjiolfkil.
     */
    boolean getChbjiolfkil();
  }
  /**
   * Protobuf type {@code SyncFinishGame}
   */
  public static final class SyncFinishGame extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SyncFinishGame)
      SyncFinishGameOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SyncFinishGame.newBuilder() to construct.
    private SyncFinishGame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SyncFinishGame() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SyncFinishGame();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SyncFinishGame(
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
            case 8: {

              isWin_ = input.readBool();
              break;
            }
            case 40: {

              serverGameTime_ = input.readUInt64();
              break;
            }
            case 64: {

              chbjiolfkil_ = input.readBool();
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
      return emu.grasscutter.net.proto.SyncFinishGameOuterClass.internal_static_SyncFinishGame_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SyncFinishGameOuterClass.internal_static_SyncFinishGame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame.class, emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame.Builder.class);
    }

    public static final int ISWIN_FIELD_NUMBER = 1;
    private boolean isWin_;
    /**
     * <code>bool isWin = 1;</code>
     * @return The isWin.
     */
    @java.lang.Override
    public boolean getIsWin() {
      return isWin_;
    }

    public static final int SERVERGAMETIME_FIELD_NUMBER = 5;
    private long serverGameTime_;
    /**
     * <code>uint64 serverGameTime = 5;</code>
     * @return The serverGameTime.
     */
    @java.lang.Override
    public long getServerGameTime() {
      return serverGameTime_;
    }

    public static final int CHBJIOLFKIL_FIELD_NUMBER = 8;
    private boolean chbjiolfkil_;
    /**
     * <code>bool chbjiolfkil = 8;</code>
     * @return The chbjiolfkil.
     */
    @java.lang.Override
    public boolean getChbjiolfkil() {
      return chbjiolfkil_;
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
      if (isWin_ != false) {
        output.writeBool(1, isWin_);
      }
      if (serverGameTime_ != 0L) {
        output.writeUInt64(5, serverGameTime_);
      }
      if (chbjiolfkil_ != false) {
        output.writeBool(8, chbjiolfkil_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isWin_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isWin_);
      }
      if (serverGameTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, serverGameTime_);
      }
      if (chbjiolfkil_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, chbjiolfkil_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame other = (emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame) obj;

      if (getIsWin()
          != other.getIsWin()) return false;
      if (getServerGameTime()
          != other.getServerGameTime()) return false;
      if (getChbjiolfkil()
          != other.getChbjiolfkil()) return false;
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
      hash = (37 * hash) + ISWIN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsWin());
      hash = (37 * hash) + SERVERGAMETIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getServerGameTime());
      hash = (37 * hash) + CHBJIOLFKIL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getChbjiolfkil());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame prototype) {
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
     * Protobuf type {@code SyncFinishGame}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SyncFinishGame)
        emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SyncFinishGameOuterClass.internal_static_SyncFinishGame_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SyncFinishGameOuterClass.internal_static_SyncFinishGame_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame.class, emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame.newBuilder()
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
        isWin_ = false;

        serverGameTime_ = 0L;

        chbjiolfkil_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SyncFinishGameOuterClass.internal_static_SyncFinishGame_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame build() {
        emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame buildPartial() {
        emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame result = new emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame(this);
        result.isWin_ = isWin_;
        result.serverGameTime_ = serverGameTime_;
        result.chbjiolfkil_ = chbjiolfkil_;
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
        if (other instanceof emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame) {
          return mergeFrom((emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame other) {
        if (other == emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame.getDefaultInstance()) return this;
        if (other.getIsWin() != false) {
          setIsWin(other.getIsWin());
        }
        if (other.getServerGameTime() != 0L) {
          setServerGameTime(other.getServerGameTime());
        }
        if (other.getChbjiolfkil() != false) {
          setChbjiolfkil(other.getChbjiolfkil());
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
        emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isWin_ ;
      /**
       * <code>bool isWin = 1;</code>
       * @return The isWin.
       */
      @java.lang.Override
      public boolean getIsWin() {
        return isWin_;
      }
      /**
       * <code>bool isWin = 1;</code>
       * @param value The isWin to set.
       * @return This builder for chaining.
       */
      public Builder setIsWin(boolean value) {
        
        isWin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isWin = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsWin() {
        
        isWin_ = false;
        onChanged();
        return this;
      }

      private long serverGameTime_ ;
      /**
       * <code>uint64 serverGameTime = 5;</code>
       * @return The serverGameTime.
       */
      @java.lang.Override
      public long getServerGameTime() {
        return serverGameTime_;
      }
      /**
       * <code>uint64 serverGameTime = 5;</code>
       * @param value The serverGameTime to set.
       * @return This builder for chaining.
       */
      public Builder setServerGameTime(long value) {
        
        serverGameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 serverGameTime = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerGameTime() {
        
        serverGameTime_ = 0L;
        onChanged();
        return this;
      }

      private boolean chbjiolfkil_ ;
      /**
       * <code>bool chbjiolfkil = 8;</code>
       * @return The chbjiolfkil.
       */
      @java.lang.Override
      public boolean getChbjiolfkil() {
        return chbjiolfkil_;
      }
      /**
       * <code>bool chbjiolfkil = 8;</code>
       * @param value The chbjiolfkil to set.
       * @return This builder for chaining.
       */
      public Builder setChbjiolfkil(boolean value) {
        
        chbjiolfkil_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool chbjiolfkil = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearChbjiolfkil() {
        
        chbjiolfkil_ = false;
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


      // @@protoc_insertion_point(builder_scope:SyncFinishGame)
    }

    // @@protoc_insertion_point(class_scope:SyncFinishGame)
    private static final emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame();
    }

    public static emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SyncFinishGame>
        PARSER = new com.google.protobuf.AbstractParser<SyncFinishGame>() {
      @java.lang.Override
      public SyncFinishGame parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SyncFinishGame(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SyncFinishGame> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SyncFinishGame> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SyncFinishGameOuterClass.SyncFinishGame getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SyncFinishGame_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SyncFinishGame_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024SyncFinishGame.proto\"L\n\016SyncFinishGame" +
      "\022\r\n\005isWin\030\001 \001(\010\022\026\n\016serverGameTime\030\005 \001(\004\022" +
      "\023\n\013chbjiolfkil\030\010 \001(\010B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SyncFinishGame_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SyncFinishGame_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SyncFinishGame_descriptor,
        new java.lang.String[] { "IsWin", "ServerGameTime", "Chbjiolfkil", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
