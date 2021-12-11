package ovh.lumen.NKcore.api.data.packet;

import ovh.lumen.NKcore.api.data.PlayerInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * A Received data subclass used for player query responses
 *
 * @see ReceivedData
 */
public class PlayersQueryResponse extends ReceivedData
{
	private final List<PlayerInfo> playersInfo = new ArrayList<>();

	/**
	 * Player query response constructor
	 *
	 * @param serverSource Source server name
	 * @param pluginSource Source plugin name
	 * @param data Data to send as string
	 */
	public PlayersQueryResponse(String serverSource, String pluginSource, String data)
	{
		super(serverSource, pluginSource, data);
		savePlayersInfo(data);
	}

	/**
	 * Return the list of player information
	 *
	 * @return List of player information
	 */
	public List<PlayerInfo> getPlayersInfo()
	{
		return playersInfo;
	}

	/**
	 * Extract players information from data.
	 *
	 * @param data Raw data that contains players information
	 */
	private void savePlayersInfo(String data)
	{
		for(String subData : data.split("\\|"))
		{
			String[] playerData = subData.split(";");
			if(playerData.length == 3)
			{
				playersInfo.add(new PlayerInfo(playerData[0], UUID.fromString(playerData[1]), playerData[2]));
			}
		}
	}
}
