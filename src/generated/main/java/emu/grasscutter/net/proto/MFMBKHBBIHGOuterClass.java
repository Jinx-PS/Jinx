// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MFMBKHBBIHG.proto

package emu.grasscutter.net.proto;

public final class MFMBKHBBIHGOuterClass {
  private MFMBKHBBIHGOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MFMBKHBBIHGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MFMBKHBBIHG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string actionType = 1;</code>
     * @return The actionType.
     */
    java.lang.String getActionType();
    /**
     * <code>string actionType = 1;</code>
     * @return The bytes for actionType.
     */
    com.google.protobuf.ByteString
        getActionTypeBytes();

    /**
     * <code>string eihhphgagke = 2;</code>
     * @return The eihhphgagke.
     */
    java.lang.String getEihhphgagke();
    /**
     * <code>string eihhphgagke = 2;</code>
     * @return The bytes for eihhphgagke.
     */
    com.google.protobuf.ByteString
        getEihhphgagkeBytes();

    /**
     * <code>uint32 nbefdipkjbd = 3;</code>
     * @return The nbefdipkjbd.
     */
    int getNbefdipkjbd();

    /**
     * <code>string fkncgjlkmef = 4;</code>
     * @return The fkncgjlkmef.
     */
    java.lang.String getFkncgjlkmef();
    /**
     * <code>string fkncgjlkmef = 4;</code>
     * @return The bytes for fkncgjlkmef.
     */
    com.google.protobuf.ByteString
        getFkncgjlkmefBytes();

    /**
     * <code>uint32 gdeakhcppgc = 5;</code>
     * @return The gdeakhcppgc.
     */
    int getGdeakhcppgc();

    /**
     * <code>string agidilehddc = 6;</code>
     * @return The agidilehddc.
     */
    java.lang.String getAgidilehddc();
    /**
     * <code>string agidilehddc = 6;</code>
     * @return The bytes for agidilehddc.
     */
    com.google.protobuf.ByteString
        getAgidilehddcBytes();
  }
  /**
   * Protobuf type {@code MFMBKHBBIHG}
   */
  public static final class MFMBKHBBIHG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MFMBKHBBIHG)
      MFMBKHBBIHGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MFMBKHBBIHG.newBuilder() to construct.
    private MFMBKHBBIHG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MFMBKHBBIHG() {
      actionType_ = "";
      eihhphgagke_ = "";
      fkncgjlkmef_ = "";
      agidilehddc_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MFMBKHBBIHG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MFMBKHBBIHG(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              actionType_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              eihhphgagke_ = s;
              break;
            }
            case 24: {

              nbefdipkjbd_ = input.readUInt32();
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              fkncgjlkmef_ = s;
              break;
            }
            case 40: {

              gdeakhcppgc_ = input.readUInt32();
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              agidilehddc_ = s;
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
      return emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.internal_static_MFMBKHBBIHG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.internal_static_MFMBKHBBIHG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG.class, emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG.Builder.class);
    }

    public static final int ACTIONTYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object actionType_;
    /**
     * <code>string actionType = 1;</code>
     * @return The actionType.
     */
    @java.lang.Override
    public java.lang.String getActionType() {
      java.lang.Object ref = actionType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionType_ = s;
        return s;
      }
    }
    /**
     * <code>string actionType = 1;</code>
     * @return The bytes for actionType.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getActionTypeBytes() {
      java.lang.Object ref = actionType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actionType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EIHHPHGAGKE_FIELD_NUMBER = 2;
    private volatile java.lang.Object eihhphgagke_;
    /**
     * <code>string eihhphgagke = 2;</code>
     * @return The eihhphgagke.
     */
    @java.lang.Override
    public java.lang.String getEihhphgagke() {
      java.lang.Object ref = eihhphgagke_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eihhphgagke_ = s;
        return s;
      }
    }
    /**
     * <code>string eihhphgagke = 2;</code>
     * @return The bytes for eihhphgagke.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEihhphgagkeBytes() {
      java.lang.Object ref = eihhphgagke_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eihhphgagke_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NBEFDIPKJBD_FIELD_NUMBER = 3;
    private int nbefdipkjbd_;
    /**
     * <code>uint32 nbefdipkjbd = 3;</code>
     * @return The nbefdipkjbd.
     */
    @java.lang.Override
    public int getNbefdipkjbd() {
      return nbefdipkjbd_;
    }

    public static final int FKNCGJLKMEF_FIELD_NUMBER = 4;
    private volatile java.lang.Object fkncgjlkmef_;
    /**
     * <code>string fkncgjlkmef = 4;</code>
     * @return The fkncgjlkmef.
     */
    @java.lang.Override
    public java.lang.String getFkncgjlkmef() {
      java.lang.Object ref = fkncgjlkmef_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fkncgjlkmef_ = s;
        return s;
      }
    }
    /**
     * <code>string fkncgjlkmef = 4;</code>
     * @return The bytes for fkncgjlkmef.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFkncgjlkmefBytes() {
      java.lang.Object ref = fkncgjlkmef_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fkncgjlkmef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GDEAKHCPPGC_FIELD_NUMBER = 5;
    private int gdeakhcppgc_;
    /**
     * <code>uint32 gdeakhcppgc = 5;</code>
     * @return The gdeakhcppgc.
     */
    @java.lang.Override
    public int getGdeakhcppgc() {
      return gdeakhcppgc_;
    }

    public static final int AGIDILEHDDC_FIELD_NUMBER = 6;
    private volatile java.lang.Object agidilehddc_;
    /**
     * <code>string agidilehddc = 6;</code>
     * @return The agidilehddc.
     */
    @java.lang.Override
    public java.lang.String getAgidilehddc() {
      java.lang.Object ref = agidilehddc_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agidilehddc_ = s;
        return s;
      }
    }
    /**
     * <code>string agidilehddc = 6;</code>
     * @return The bytes for agidilehddc.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAgidilehddcBytes() {
      java.lang.Object ref = agidilehddc_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agidilehddc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getActionTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, actionType_);
      }
      if (!getEihhphgagkeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, eihhphgagke_);
      }
      if (nbefdipkjbd_ != 0) {
        output.writeUInt32(3, nbefdipkjbd_);
      }
      if (!getFkncgjlkmefBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, fkncgjlkmef_);
      }
      if (gdeakhcppgc_ != 0) {
        output.writeUInt32(5, gdeakhcppgc_);
      }
      if (!getAgidilehddcBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, agidilehddc_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getActionTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, actionType_);
      }
      if (!getEihhphgagkeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, eihhphgagke_);
      }
      if (nbefdipkjbd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, nbefdipkjbd_);
      }
      if (!getFkncgjlkmefBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, fkncgjlkmef_);
      }
      if (gdeakhcppgc_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, gdeakhcppgc_);
      }
      if (!getAgidilehddcBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, agidilehddc_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG other = (emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG) obj;

      if (!getActionType()
          .equals(other.getActionType())) return false;
      if (!getEihhphgagke()
          .equals(other.getEihhphgagke())) return false;
      if (getNbefdipkjbd()
          != other.getNbefdipkjbd()) return false;
      if (!getFkncgjlkmef()
          .equals(other.getFkncgjlkmef())) return false;
      if (getGdeakhcppgc()
          != other.getGdeakhcppgc()) return false;
      if (!getAgidilehddc()
          .equals(other.getAgidilehddc())) return false;
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
      hash = (37 * hash) + ACTIONTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getActionType().hashCode();
      hash = (37 * hash) + EIHHPHGAGKE_FIELD_NUMBER;
      hash = (53 * hash) + getEihhphgagke().hashCode();
      hash = (37 * hash) + NBEFDIPKJBD_FIELD_NUMBER;
      hash = (53 * hash) + getNbefdipkjbd();
      hash = (37 * hash) + FKNCGJLKMEF_FIELD_NUMBER;
      hash = (53 * hash) + getFkncgjlkmef().hashCode();
      hash = (37 * hash) + GDEAKHCPPGC_FIELD_NUMBER;
      hash = (53 * hash) + getGdeakhcppgc();
      hash = (37 * hash) + AGIDILEHDDC_FIELD_NUMBER;
      hash = (53 * hash) + getAgidilehddc().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG prototype) {
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
     * Protobuf type {@code MFMBKHBBIHG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MFMBKHBBIHG)
        emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.internal_static_MFMBKHBBIHG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.internal_static_MFMBKHBBIHG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG.class, emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG.newBuilder()
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
        actionType_ = "";

        eihhphgagke_ = "";

        nbefdipkjbd_ = 0;

        fkncgjlkmef_ = "";

        gdeakhcppgc_ = 0;

        agidilehddc_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.internal_static_MFMBKHBBIHG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG build() {
        emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG buildPartial() {
        emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG result = new emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG(this);
        result.actionType_ = actionType_;
        result.eihhphgagke_ = eihhphgagke_;
        result.nbefdipkjbd_ = nbefdipkjbd_;
        result.fkncgjlkmef_ = fkncgjlkmef_;
        result.gdeakhcppgc_ = gdeakhcppgc_;
        result.agidilehddc_ = agidilehddc_;
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
        if (other instanceof emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG) {
          return mergeFrom((emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG other) {
        if (other == emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG.getDefaultInstance()) return this;
        if (!other.getActionType().isEmpty()) {
          actionType_ = other.actionType_;
          onChanged();
        }
        if (!other.getEihhphgagke().isEmpty()) {
          eihhphgagke_ = other.eihhphgagke_;
          onChanged();
        }
        if (other.getNbefdipkjbd() != 0) {
          setNbefdipkjbd(other.getNbefdipkjbd());
        }
        if (!other.getFkncgjlkmef().isEmpty()) {
          fkncgjlkmef_ = other.fkncgjlkmef_;
          onChanged();
        }
        if (other.getGdeakhcppgc() != 0) {
          setGdeakhcppgc(other.getGdeakhcppgc());
        }
        if (!other.getAgidilehddc().isEmpty()) {
          agidilehddc_ = other.agidilehddc_;
          onChanged();
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
        emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object actionType_ = "";
      /**
       * <code>string actionType = 1;</code>
       * @return The actionType.
       */
      public java.lang.String getActionType() {
        java.lang.Object ref = actionType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          actionType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string actionType = 1;</code>
       * @return The bytes for actionType.
       */
      public com.google.protobuf.ByteString
          getActionTypeBytes() {
        java.lang.Object ref = actionType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          actionType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string actionType = 1;</code>
       * @param value The actionType to set.
       * @return This builder for chaining.
       */
      public Builder setActionType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        actionType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string actionType = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearActionType() {
        
        actionType_ = getDefaultInstance().getActionType();
        onChanged();
        return this;
      }
      /**
       * <code>string actionType = 1;</code>
       * @param value The bytes for actionType to set.
       * @return This builder for chaining.
       */
      public Builder setActionTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        actionType_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object eihhphgagke_ = "";
      /**
       * <code>string eihhphgagke = 2;</code>
       * @return The eihhphgagke.
       */
      public java.lang.String getEihhphgagke() {
        java.lang.Object ref = eihhphgagke_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          eihhphgagke_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string eihhphgagke = 2;</code>
       * @return The bytes for eihhphgagke.
       */
      public com.google.protobuf.ByteString
          getEihhphgagkeBytes() {
        java.lang.Object ref = eihhphgagke_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          eihhphgagke_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string eihhphgagke = 2;</code>
       * @param value The eihhphgagke to set.
       * @return This builder for chaining.
       */
      public Builder setEihhphgagke(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        eihhphgagke_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string eihhphgagke = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEihhphgagke() {
        
        eihhphgagke_ = getDefaultInstance().getEihhphgagke();
        onChanged();
        return this;
      }
      /**
       * <code>string eihhphgagke = 2;</code>
       * @param value The bytes for eihhphgagke to set.
       * @return This builder for chaining.
       */
      public Builder setEihhphgagkeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        eihhphgagke_ = value;
        onChanged();
        return this;
      }

      private int nbefdipkjbd_ ;
      /**
       * <code>uint32 nbefdipkjbd = 3;</code>
       * @return The nbefdipkjbd.
       */
      @java.lang.Override
      public int getNbefdipkjbd() {
        return nbefdipkjbd_;
      }
      /**
       * <code>uint32 nbefdipkjbd = 3;</code>
       * @param value The nbefdipkjbd to set.
       * @return This builder for chaining.
       */
      public Builder setNbefdipkjbd(int value) {
        
        nbefdipkjbd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 nbefdipkjbd = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNbefdipkjbd() {
        
        nbefdipkjbd_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object fkncgjlkmef_ = "";
      /**
       * <code>string fkncgjlkmef = 4;</code>
       * @return The fkncgjlkmef.
       */
      public java.lang.String getFkncgjlkmef() {
        java.lang.Object ref = fkncgjlkmef_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          fkncgjlkmef_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string fkncgjlkmef = 4;</code>
       * @return The bytes for fkncgjlkmef.
       */
      public com.google.protobuf.ByteString
          getFkncgjlkmefBytes() {
        java.lang.Object ref = fkncgjlkmef_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fkncgjlkmef_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string fkncgjlkmef = 4;</code>
       * @param value The fkncgjlkmef to set.
       * @return This builder for chaining.
       */
      public Builder setFkncgjlkmef(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        fkncgjlkmef_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string fkncgjlkmef = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFkncgjlkmef() {
        
        fkncgjlkmef_ = getDefaultInstance().getFkncgjlkmef();
        onChanged();
        return this;
      }
      /**
       * <code>string fkncgjlkmef = 4;</code>
       * @param value The bytes for fkncgjlkmef to set.
       * @return This builder for chaining.
       */
      public Builder setFkncgjlkmefBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        fkncgjlkmef_ = value;
        onChanged();
        return this;
      }

      private int gdeakhcppgc_ ;
      /**
       * <code>uint32 gdeakhcppgc = 5;</code>
       * @return The gdeakhcppgc.
       */
      @java.lang.Override
      public int getGdeakhcppgc() {
        return gdeakhcppgc_;
      }
      /**
       * <code>uint32 gdeakhcppgc = 5;</code>
       * @param value The gdeakhcppgc to set.
       * @return This builder for chaining.
       */
      public Builder setGdeakhcppgc(int value) {
        
        gdeakhcppgc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gdeakhcppgc = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGdeakhcppgc() {
        
        gdeakhcppgc_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object agidilehddc_ = "";
      /**
       * <code>string agidilehddc = 6;</code>
       * @return The agidilehddc.
       */
      public java.lang.String getAgidilehddc() {
        java.lang.Object ref = agidilehddc_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          agidilehddc_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string agidilehddc = 6;</code>
       * @return The bytes for agidilehddc.
       */
      public com.google.protobuf.ByteString
          getAgidilehddcBytes() {
        java.lang.Object ref = agidilehddc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          agidilehddc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string agidilehddc = 6;</code>
       * @param value The agidilehddc to set.
       * @return This builder for chaining.
       */
      public Builder setAgidilehddc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        agidilehddc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string agidilehddc = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAgidilehddc() {
        
        agidilehddc_ = getDefaultInstance().getAgidilehddc();
        onChanged();
        return this;
      }
      /**
       * <code>string agidilehddc = 6;</code>
       * @param value The bytes for agidilehddc to set.
       * @return This builder for chaining.
       */
      public Builder setAgidilehddcBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        agidilehddc_ = value;
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


      // @@protoc_insertion_point(builder_scope:MFMBKHBBIHG)
    }

    // @@protoc_insertion_point(class_scope:MFMBKHBBIHG)
    private static final emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG();
    }

    public static emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MFMBKHBBIHG>
        PARSER = new com.google.protobuf.AbstractParser<MFMBKHBBIHG>() {
      @java.lang.Override
      public MFMBKHBBIHG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MFMBKHBBIHG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MFMBKHBBIHG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MFMBKHBBIHG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MFMBKHBBIHGOuterClass.MFMBKHBBIHG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MFMBKHBBIHG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MFMBKHBBIHG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MFMBKHBBIHG.proto\"\212\001\n\013MFMBKHBBIHG\022\022\n\na" +
      "ctionType\030\001 \001(\t\022\023\n\013eihhphgagke\030\002 \001(\t\022\023\n\013" +
      "nbefdipkjbd\030\003 \001(\r\022\023\n\013fkncgjlkmef\030\004 \001(\t\022\023" +
      "\n\013gdeakhcppgc\030\005 \001(\r\022\023\n\013agidilehddc\030\006 \001(\t" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MFMBKHBBIHG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MFMBKHBBIHG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MFMBKHBBIHG_descriptor,
        new java.lang.String[] { "ActionType", "Eihhphgagke", "Nbefdipkjbd", "Fkncgjlkmef", "Gdeakhcppgc", "Agidilehddc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
