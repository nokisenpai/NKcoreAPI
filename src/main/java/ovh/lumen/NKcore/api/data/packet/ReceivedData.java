package ovh.lumen.NKcore.api.data.packet;

/**
 * Parent class for data received from socket server
 */
public class ReceivedData
{
	private final String serverSource;
	private final String pluginSource;
	private final String data;

	/**
	 * Received data constructor
	 *
	 * @param serverSource Source server name
	 * @param pluginSource Source plugin name
	 * @param data Data to send as string
	 */
	public ReceivedData(String serverSource, String pluginSource, String data)
	{
		this.serverSource = serverSource;
		this.pluginSource = pluginSource;
		this.data = data;
	}

	/**
	 * Return the server source name
	 *
	 * @return Server source name
	 */
	public String getServerSource()
	{
		return serverSource;
	}

	/**
	 * Return the plugin source name
	 *
	 * @return Plugin source name
	 */
	public String getPluginSource()
	{
		return pluginSource;
	}

	/**
	 * Return the raw data as String
	 *
	 * @return Raw data
	 */
	public String getData()
	{
		return data;
	}
}
