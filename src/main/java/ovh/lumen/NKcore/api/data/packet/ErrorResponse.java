package ovh.lumen.NKcore.api.data.packet;

/**
 * A Received data subclass used for error responses
 *
 * @see ReceivedData
 */
public class ErrorResponse extends ReceivedData
{
	ErrorResponseType errorResponseType;

	/**
	 * Error response constructor.
	 *
	 * @param serverSource Source server name
	 * @param pluginSource Source plugin name
	 * @param data Data to send as string
	 * @param errorResponseType Error response type from enum ErrorResponseType
	 *
	 * @see ErrorResponseType
	 */
	public ErrorResponse(String serverSource, String pluginSource, String data, ErrorResponseType errorResponseType)
	{
		super(serverSource, pluginSource, data);
		this.errorResponseType = errorResponseType;
	}

	/**
	 * Return the error response type as ErrorResponseType value
	 *
	 * @return Error response type
	 *
	 * @see ErrorResponseType
	 */
	public ErrorResponseType getErrorResponseType()
	{
		return errorResponseType;
	}
}
