package scenario;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.LinkedList;

import scenario.elements.DialogPart;
import scenario.elements.Message;
import scenario.elements.RolePart;
import scenario.elements.TablePart;

/**
 * Scenario class
 * @author William
 *
 */
public class Scenario
{
	private String scenarioName;
	private String format;
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
		this.format = Constant.DEFAULT_FORMAT;
		this.messageList = new LinkedList<>();
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

		// First scenario line
		stringBuilder.append(scenarioName).append(Constant.NEW_SPACE).append(format).append(Constant.NEW_LINE);

		// Open brace
		stringBuilder.append(Constant.OPEN_BRACE).append(Constant.NEW_LINE);

		// Dialog part
		//dialogPart.generateElement(stringBuilder);

		// Role part
		//rolePart.generateElement(stringBuilder);

		// Table part
		//tablePart.generateElement(stringBuilder);

		// Message part
		for(Message message : messageList)
		{
			message.generateElement(stringBuilder);
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
	}
}
