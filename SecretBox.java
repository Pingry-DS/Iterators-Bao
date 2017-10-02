public class SecretBox<T> extends Box
{
	private string password;
	private T secretCompartmentContents;
	
	public SecretBox()
	{
		super();
		password = "";
		secretCompartmentContents = null;
	}
	
	public SecretBox(T c, String p, T s)
	{
		super(c);
		password = p;
		secretCompartmentContents = s;
	}
	
	public void setPassword(String p)
	{
		password = p;
	}
	
	public void setSecretCompartmentContents(T s)
	{
		secretCompartmentContents = s;
	}
	
	public T getSecretCompartmentContents(string p)
	{
		if(password.equals(p))
		{
			return secretCompartmentContents;
		}
		else
		{
			return "nice try guy";
		}
	}
	
	public void burnEvidence(string p)
	{
		if(password.equals(p))
		{
			setSecretCompartmentContents(null);
		}
		return;
	}
}
