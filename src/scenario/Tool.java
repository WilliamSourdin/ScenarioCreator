package scenario;

public class Tool
{
	/**
	 * Get the current tab level
	 * @param tabLevel
	 * @return
	 */
	public static String getCurrentLineTab(int tabLevel)
	{
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i=0; i< tabLevel; i++)
		{
			stringBuilder.append(Constant.NEW_TAB);
		}
		
		return stringBuilder.toString();
	}
}
