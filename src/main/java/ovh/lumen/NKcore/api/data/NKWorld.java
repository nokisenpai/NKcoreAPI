package ovh.lumen.NKcore.api.data;

/**
 * Contains world data stored by NKcore plugin in database.
 */
public class NKWorld
{
	private int id;
	private String name;
	private int serverId;

	/**
	 * NKWorld constructor
	 *
	 * @param id       World id from database
	 * @param name     World name
	 * @param serverId Server id from database
	 */
	public NKWorld(int id, String name, int serverId)
	{
		this.id = id;
		this.name = name;
		this.serverId = serverId;
	}

	/**
	 * Return the world id from database
	 *
	 * @return World id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Return the world name
	 *
	 * @return World name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Return the server id from database
	 *
	 * @return Server id
	 */
	public int getServerId()
	{
		return serverId;
	}

	/**
	 * Set the world id from database
	 *
	 * @param id World id
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * Set the world name
	 *
	 * @param name World name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Set the server id from database
	 *
	 * @param serverId Server id
	 */
	public void setServerId(int serverId)
	{
		this.serverId = serverId;
	}
}
