/**
 * 
 */
package scenario.elements.table;

import scenario.Constant;
import scenario.IElement;
import scenario.Tool;

/**
 * @author William
 *
 */
public class TablePart implements IElement
{

	/**
	 * 
	 */
	public TablePart()
	{
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see element.IElement#generateElement(java.lang.StringBuilder, int tabLevel)
	 */
	@Override
	public void generateElement(StringBuilder stringBuilder, int tabLevel)
	{
		// Current line tab
		String currentLineTab = Tool.getCurrentLineTab(tabLevel);

		// First scenario line
		stringBuilder.append(currentLineTab).append(Constant.TABLE_PART_NAME).append(Constant.NEW_LINE);

		// Open brace
		stringBuilder.append(currentLineTab).append(Constant.OPEN_BRACE).append(Constant.NEW_LINE);

		// CLose brace
		stringBuilder.append(currentLineTab).append(Constant.CLOSE_BRACE).append(Constant.NEW_LINE);
	}
}
