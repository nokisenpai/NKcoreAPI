package ovh.lumen.NKcore.api.data.packet;

/**
 * Enum class that contains error response types
 */
public enum ErrorResponseType
{
	UNKNOWN_ERROR("UNKNOWN_ERROR"),
	UNKNOWN_SERVER("UNKNOWN_SERVER"),
	UNKNOWN_PLUGIN("UNKNOWN_PLUGIN"),
	UNKNOWN_QUERY("UNKNOWN_QUERY"),
	UNKNOWN_PLAYER("UNKNOWN_PLAYER"),
	WRONG_IMPLEMENT("WRONG_IMPLEMENT");

	private final String name;

	/**
	 * Enum error response type constructor
	 *
	 * @param name Error response type value
	 */
	ErrorResponseType(String name)
	{
		this.name = name;
	}

	/**
	 * Return the error response type value as String
	 *
	 * @return Error response type
	 */
	public String toString()
	{
		return name;
	}

	/**
	 * Return the amount of values of this enum
	 *
	 * @return Amount of values
	 */
	public static int size()
	{
		return ErrorResponseType.values().length;
	}
}
