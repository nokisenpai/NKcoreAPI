package ovh.lumen.NKcore.api;

import ovh.lumen.NKcore.api.data.packet.ErrorResponse;
import ovh.lumen.NKcore.api.data.packet.PlayersQueryResponse;
import ovh.lumen.NKcore.api.data.packet.ReceivedData;
import ovh.lumen.NKcore.api.data.packet.ServersQueryResponse;

/**
 * Interface used to receive network data from NKcore socket system
 */
public interface NKcoreEventAPI
{
	/**
	 * Called by NKcore plugin when receiving data for the plugin that registered an implementation of this interface
	 *
	 * @param receivedData Data received by socket system
	 *
	 * @see ReceivedData
	 */
	void onDataReceive(ReceivedData receivedData);

	/**
	 * Called by NKcore plugin when receiving error response for the plugin that registered an implementation of this interface
	 *
	 * @param errorResponse Data received by socket system
	 *
	 * @see ErrorResponse
	 */
	void onErrorResponse(ErrorResponse errorResponse);

	/**
	 * Called by NKcore plugin when receiving player query response for the plugin that registered an implementation of this interface
	 *
	 * @param playersQueryResponse Data received by socket system
	 *
	 * @see PlayersQueryResponse
	 */
	void onPlayersQueryResponse(PlayersQueryResponse playersQueryResponse);

	/**
	 * Called by NKcore plugin when receiving server query response for the plugin that registered an implementation of this interface
	 *
	 * @param serversQueryResponse Data received by socket system
	 *
	 * @see ServersQueryResponse
	 */
	void onServersQueryResponse(ServersQueryResponse serversQueryResponse);
}
