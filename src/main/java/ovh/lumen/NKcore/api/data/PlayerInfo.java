package ovh.lumen.NKcore.api.data;

import java.util.UUID;

/**
 * Contains the players' information received after GET_ALL_CONNECTED_PLAYERS query
 */
public class PlayerInfo
{
	private final String name;
	private final UUID uuid;
	private final String serverName;

	/**
	 * Player information constructor
	 *
	 * @param name Player name
	 * @param uuid Player uuid
	 * @param serverName Server name where the player is connected
	 */
	public PlayerInfo(String name, UUID uuid, String serverName)
	{
		this.name = name;
		this.uuid = uuid;
		this.serverName = serverName;
	}

	/**
	 * Return the player name
	 *
	 * @return Player name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Return the player uuid
	 *
	 * @return Player uuid
	 *
	 * @see UUID
	 */
	public UUID getUuid()
	{
		return uuid;
	}

	/**
	 * Return the server name where the player is
	 *
	 * @return Server name
	 */
	public String getServerName()
	{
		return serverName;
	}
}
