// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FindHilichurlAcceptQuestNotify.proto

package emu.grasscutter.net.proto;

public final class FindHilichurlAcceptQuestNotifyOuterClass {
  private FindHilichurlAcceptQuestNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FindHilichurlAcceptQuestNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FindHilichurlAcceptQuestNotify)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code FindHilichurlAcceptQuestNotify}
   */
  public static final class FindHilichurlAcceptQuestNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FindHilichurlAcceptQuestNotify)
      FindHilichurlAcceptQuestNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FindHilichurlAcceptQuestNotify.newBuilder() to construct.
    private FindHilichurlAcceptQuestNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FindHilichurlAcceptQuestNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FindHilichurlAcceptQuestNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.internal_static_FindHilichurlAcceptQuestNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.internal_static_FindHilichurlAcceptQuestNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify.class, emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code FindHilichurlAcceptQuestNotify.POCGDCLDDMI}
     */
    public enum POCGDCLDDMI
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 8522;</code>
       */
      PEPPOHPHJOJ(1, 8522),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final POCGDCLDDMI DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 8522;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 8522;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static POCGDCLDDMI valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static POCGDCLDDMI forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 8522: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<POCGDCLDDMI>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          POCGDCLDDMI> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<POCGDCLDDMI>() {
              public POCGDCLDDMI findValueByNumber(int number) {
                return POCGDCLDDMI.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final POCGDCLDDMI[] VALUES = getStaticValuesArray();
      private static POCGDCLDDMI[] getStaticValuesArray() {
        return new POCGDCLDDMI[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static POCGDCLDDMI valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private POCGDCLDDMI(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:FindHilichurlAcceptQuestNotify.POCGDCLDDMI)
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
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify other = (emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify) obj;

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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify prototype) {
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
     * Protobuf type {@code FindHilichurlAcceptQuestNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FindHilichurlAcceptQuestNotify)
        emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.internal_static_FindHilichurlAcceptQuestNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.internal_static_FindHilichurlAcceptQuestNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify.class, emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.internal_static_FindHilichurlAcceptQuestNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify build() {
        emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify buildPartial() {
        emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify result = new emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify(this);
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
        if (other instanceof emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify) {
          return mergeFrom((emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify other) {
        if (other == emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:FindHilichurlAcceptQuestNotify)
    }

    // @@protoc_insertion_point(class_scope:FindHilichurlAcceptQuestNotify)
    private static final emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify();
    }

    public static emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FindHilichurlAcceptQuestNotify>
        PARSER = new com.google.protobuf.AbstractParser<FindHilichurlAcceptQuestNotify>() {
      @java.lang.Override
      public FindHilichurlAcceptQuestNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<FindHilichurlAcceptQuestNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FindHilichurlAcceptQuestNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FindHilichurlAcceptQuestNotifyOuterClass.FindHilichurlAcceptQuestNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FindHilichurlAcceptQuestNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FindHilichurlAcceptQuestNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$FindHilichurlAcceptQuestNotify.proto\"q" +
      "\n\036FindHilichurlAcceptQuestNotify\"O\n\013POCG" +
      "DCLDDMI\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\312B\022\017\n\013D" +
      "CDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FindHilichurlAcceptQuestNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FindHilichurlAcceptQuestNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FindHilichurlAcceptQuestNotify_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
