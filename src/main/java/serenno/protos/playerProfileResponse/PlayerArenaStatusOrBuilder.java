// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerProfileResponse.proto

package serenno.protos.playerProfileResponse;

public interface PlayerArenaStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:serenno.protos.playerProfileResponse.PlayerArenaStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.serenno.protos.playerProfileResponse.PlayerArenaType arena_type = 1;</code>
   * @return The enum numeric value on the wire for arenaType.
   */
  int getArenaTypeValue();
  /**
   * <code>.serenno.protos.playerProfileResponse.PlayerArenaType arena_type = 1;</code>
   * @return The arenaType.
   */
  PlayerArenaType getArenaType();

  /**
   * <code>int32 place = 2;</code>
   * @return The place.
   */
  int getPlace();

  /**
   * <pre>
   * unknown = 4;
   * </pre>
   *
   * <code>.serenno.protos.playerProfileResponse.ArenaTeam arenaTeam = 3;</code>
   * @return Whether the arenaTeam field is set.
   */
  boolean hasArenaTeam();
  /**
   * <pre>
   * unknown = 4;
   * </pre>
   *
   * <code>.serenno.protos.playerProfileResponse.ArenaTeam arenaTeam = 3;</code>
   * @return The arenaTeam.
   */
  ArenaTeam getArenaTeam();
  /**
   * <pre>
   * unknown = 4;
   * </pre>
   *
   * <code>.serenno.protos.playerProfileResponse.ArenaTeam arenaTeam = 3;</code>
   */
  ArenaTeamOrBuilder getArenaTeamOrBuilder();
}