package ovh.lumen.NKcore.api.data.packet;

/**
 * Enum class that contains query types
 */
public enum QueryType
{
	GET_ALL_CONNECTED_SERVERS("GET_ALL_CONNECTED_SERVERS"),
	GET_ALL_CONNECTED_PLAYERS("GET_ALL_CONNECTED_PLAYERS");

	private final String name;

	/**
	 * Enum query type constructor
	 *
	 * @param name Query type value
	 */
	QueryType(String name)
	{
		this.name = name;
	}

	/**
	 * Return the query type value as String
	 *
	 * @return Query type
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
		return QueryType.values().length;
	}

}
