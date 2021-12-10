package ovh.lumen.NKcore.api.data;

/**
 * Contains all database access information used to connect to it.
 */
public class DBAccess
{
	private String host = "localhost";
	private String dbName = "minecraft";
	private String user = "root";
	private String password = "";
	private int port = 3306;

	/**
	 * Return the database host
	 *
	 * @return Database host
	 */
	public String getHost()
	{
		return host;
	}

	/**
	 * Return the database name
	 *
	 * @return Database name
	 */
	public String getDbName()
	{
		return dbName;
	}

	/**
	 * Return the database user
	 *
	 * @return Database user
	 */
	public String getUser()
	{
		return user;
	}

	/**
	 * Return the database password
	 *
	 * @return Database password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Return the database port
	 *
	 * @return Database port
	 */
	public int getPort()
	{
		return port;
	}

	/**
	 * Set the database host
	 *
	 * @param host Database host
	 */
	public void setHost(String host)
	{
		this.host = host;
	}

	/**
	 * Set the database name
	 *
	 * @param dbName Database name
	 */
	public void setDbName(String dbName)
	{
		this.dbName = dbName;
	}

	/**
	 * Set the database user
	 *
	 * @param user Database user
	 */
	public void setUser(String user)
	{
		this.user = user;
	}

	/**
	 * Set the database password
	 *
	 * @param password Database password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * Set the database port
	 *
	 * @param port Database port
	 */
	public void setPort(int port)
	{
		this.port = port;
	}
}
