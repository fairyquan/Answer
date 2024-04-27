package pattern.behavior.command;

interface Command {
	void execute();
	void undo();
}