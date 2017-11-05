package scenario;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;

import scenario.elements.dialog.DialogPart;
import scenario.elements.message.Message;
import scenario.elements.role.RolePart;
import scenario.elements.table.TablePart;

/**
 * Scenario class
 * @author William
 *
 */
public class Scenario
{
	private String scenarioName;
	private DialogPart dialogPart;
	private RolePart rolePart;
	private TablePart tablePart;
	private LinkedList<Message> messageList;

	/**
	 *  Scenario constructor
	 * @param scenarioName
	 */
	public Scenario(String scenarioName)
	{
		this.scenarioName = scenarioName;
		this.messageList = new LinkedList<>();
		
		// TODO
		this.dialogPart = new DialogPart();
		this.rolePart = new RolePart();
		this.tablePart = new TablePart();
	}

	public void createDialogPart(DialogPart dialogPart)
	{

	}

	public void createRolePart(RolePart rolePart)
	{

	}

	public void createTablePart(TablePart tablePart)
	{

	}

	public void addMessage(Message message)
	{

	}

	/**
	 * Generate scenario element
	 * @param stringBuilder
	 * @return
	 */
	public void generateScenario() throws Exception
	{
		// Init string builder
		StringBuilder stringBuilder = new StringBuilder();
		
		// Next tab level
		int nextTabLevel = 1;

		// First scenario line
		stringBuilder.append(scenarioName).append(Constant.NEW_SPACE).append(Constant.DEFAULT_FORMAT).append(Constant.NEW_LINE);

		// Open brace
		stringBuilder.append(Constant.OPEN_BRACE).append(Constant.NEW_LINE);

		// Dialog part
		dialogPart.generateElement(stringBuilder, nextTabLevel);

		// Role part
		rolePart.generateElement(stringBuilder, nextTabLevel);

		// Table part
		tablePart.generateElement(stringBuilder, nextTabLevel);

		// Message part
		for(Message message : messageList)
		{
			message.generateElement(stringBuilder, nextTabLevel);
		}

		// Close brace
		stringBuilder.append(Constant.CLOSE_BRACE);

		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(scenarioName + Constant.FILE_EXTENSION), Constant.UTF8));
		try 
		{
			out.write(stringBuilder.toString());
		} 
		finally 
		{
			out.close();
		}
		
		// TODO 
		System.out.println(stringBuilder.toString());
	}
}
