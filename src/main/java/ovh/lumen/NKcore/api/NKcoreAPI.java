package ovh.lumen.NKcore.api;

import ovh.lumen.NKcore.api.data.DBAccess;
import ovh.lumen.NKcore.api.data.NKServer;
import ovh.lumen.NKcore.api.data.NKWorld;
import ovh.lumen.NKcore.api.data.PlayerInfo;
import ovh.lumen.NKcore.api.data.packet.QueryType;

import java.util.Map;

/**
 * Interface used to communicate with NKcore plugin.
 */
public interface NKcoreAPI
{
	/**
	 * Return the server information where the plugin is
	 *
	 * @return Server information
	 *
	 * @see NKServer
	 */
	NKServer getNKServer();

	/**
	 * Return a map of world information
	 * Key is the world name
	 *
	 * @return Map of world information
	 *
	 * @see NKWorld
	 */
	Map<String, NKWorld> getNKWorlds();

	/**
	 * Return the player information of the specified player name
	 *
	 * @param name Player name
	 * @return Player information
	 */
	PlayerInfo getPlayerInfo(String name);

	/**
	 * Return the database access
	 *
	 * @return Database access
	 */
	DBAccess getDBAccess();

	/**
	 * Send data to a specified server and plugin using NKcore socket system
	 *
	 * @param serverTarget Server target name
	 * @param pluginTarget Plugin target name
	 * @param data Raw data as String
	 * @param pluginName Plugin name that sends data
	 */
	void sendNetworkData(String serverTarget, String pluginTarget, String data, String pluginName);

	/**
	 * Broadcast data to a specified plugin in all server connected using NKcore socket system
	 *
	 * @param pluginTarget Plugin target name
	 * @param data Raw data as String
	 * @param pluginName Plugin name that sends data
	 */
	void broadcastNetworkData(String pluginTarget, String data, String pluginName);

	/**
	 * Send data to a specified plugin where a specified player is connected using NKcore socket system
	 *
	 * @param playerName Player target name
	 * @param pluginTarget Plugin target name
	 * @param data Raw data as String
	 * @param pluginName Plugin name that sends data
	 */
	void sendNetworkDataForPlayer(String playerName, String pluginTarget, String data, String pluginName);

	/**
	 * Send a query to NKcoreBungee using NKcore socket system
	 *
	 * @param queryType Specific enum query type
	 * @param pluginName Plugin name that sends data
	 *
	 * @see QueryType
	 */
	void sendNetworkQuery( QueryType queryType, String pluginName);
}
