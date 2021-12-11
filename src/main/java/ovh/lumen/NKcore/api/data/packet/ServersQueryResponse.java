package ovh.lumen.NKcore.api.data.packet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A Received data subclass used for servers query responses
 *
 * @see ReceivedData
 */
public class ServersQueryResponse extends ReceivedData
{
	private final List<String> servers = new ArrayList<>();

	/**
	 * Servers query response constructor
	 *
	 * @param serverSource Source server name
	 * @param pluginSource Source plugin name
	 * @param data Data to send as string
	 */
	public ServersQueryResponse(String serverSource, String pluginSource, String data)
	{
		super(serverSource, pluginSource, data);
		saveServersInfo(data);
	}

	/**
	 * Return the list of server name
	 *
	 * @return List of server name
	 */
	public List<String> getServers()
	{
		return servers;
	}

	/**
	 * Extract servers name from data.
	 *
	 * @param data Raw data that contains servers name
	 */
	private void saveServersInfo(String data)
	{
		servers.addAll(Arrays.asList(data.split("\\|")));
	}
}
