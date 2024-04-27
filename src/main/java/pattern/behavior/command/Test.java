package pattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		TV tv = new TV();
		Command turnOnCommand=new TurnOnCommand(tv);
		Command turnOffCommand = new TurnOffCommand(tv);
		Command volumeUpCommand = new VolumeUpCommand(tv);
		Command volumeDownCommand = new VolumeDownCommand(tv);
		List<Command> commandList=new ArrayList<>();
		commandList.add(turnOnCommand);
		commandList.add(turnOffCommand);
		commandList.add(volumeUpCommand);
		commandList.add(volumeDownCommand);
		RemoteControl remoteControl = new RemoteControl(commandList);
		remoteControl.action(Button.ON);
		remoteControl.action(Button.OFF);
		remoteControl.action(Button.VOLUME_UP);
		remoteControl.action(Button.VOLUME_DOWN);
		remoteControl.action(Button.VOLUME_UP);
		remoteControl.action(Button.VOLUME_UP);
		remoteControl.action(Button.VOLUME_UP);





	}
}

