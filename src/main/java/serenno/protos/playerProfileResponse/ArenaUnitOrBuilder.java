// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerProfileResponse.proto

package serenno.protos.playerProfileResponse;

public interface ArenaUnitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:serenno.protos.playerProfileResponse.ArenaUnit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string defId = 2;</code>
   * @return The defId.
   */
  String getDefId();
  /**
   * <code>string defId = 2;</code>
   * @return The bytes for defId.
   */
  com.google.protobuf.ByteString
      getDefIdBytes();

  /**
   * <code>int32 index = 3;</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <pre>
   * int32 unknown1 = 11;
   * </pre>
   *
   * <code>.serenno.protos.playerProfileResponse.SlotType slotType = 12;</code>
   * @return The enum numeric value on the wire for slotType.
   */
  int getSlotTypeValue();
  /**
   * <pre>
   * int32 unknown1 = 11;
   * </pre>
   *
   * <code>.serenno.protos.playerProfileResponse.SlotType slotType = 12;</code>
   * @return The slotType.
   */
  SlotType getSlotType();
}
