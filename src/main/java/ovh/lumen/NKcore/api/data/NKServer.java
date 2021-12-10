package ovh.lumen.NKcore.api.data;

/**
 * Contains server data stored by NKcore plugin in database.
 */
public class NKServer
{
	private int id;
	private String name;

	/**
	 * NKServer constructor
	 *
	 * @param id Server id from database
	 * @param name Server name
	 */
	public NKServer(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	/**
	 * Return the server id from database
	 *
	 * @return Server id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Return the server name
	 *
	 * @return Server name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Set the server id from database
	 *
	 * @param id Server id
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * Set the server name
	 *
	 * @param name Server name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
}
