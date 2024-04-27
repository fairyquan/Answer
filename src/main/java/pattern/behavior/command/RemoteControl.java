package pattern.behavior.command;

import java.util.List;

public class RemoteControl {
	private final List<Command> commandList;
	public RemoteControl(List<Command> commandList) {
		this.commandList=commandList;
	}
	
	public void action(Button button) {
		commandList.get(button.getIndex()).execute();
	}
	public void undo(Button button){
		commandList.get(button.getIndex()).undo();
	}
}