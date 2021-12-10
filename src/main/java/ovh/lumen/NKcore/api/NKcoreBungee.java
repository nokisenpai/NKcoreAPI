package ovh.lumen.NKcore.api;

/**
 * Interface used to get NKcoreAPI and register NKcoreEventAPI for Bungee plugins
 */
public interface NKcoreBungee
{
	/**
	 * Return the api implementation of NKcore plugin
	 *
	 * @return Api implementation
	 */
	NKcoreAPI getApi();

	/**
	 * Register an event api implementation for NKcore plugin
	 *
	 * @param nKcoreEventAPI Event api implementation
	 * @param pluginName Plugin name that register
	 */
	void registerEventAPI(NKcoreEventAPI nKcoreEventAPI, String pluginName);
}
