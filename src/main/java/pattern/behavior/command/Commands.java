package pattern.behavior.command;

//开电视命令
class TurnOnCommand implements Command {
    private final TV tv;
 
    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }
 
    @Override
    public void execute() {
        tv.turnOn();
    }
 
    @Override
    public void undo() {
        tv.turnOff();
    }
}
 
//关电视命令
class TurnOffCommand implements Command {
    private final TV tv;
 
    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }
 
    @Override
    public void execute() {
        tv.turnOff();
    }
 
    @Override
    public void undo() {
        tv.turnOn();
    }
}
 
//音量增加命令
class VolumeUpCommand implements Command {
    private final TV tv;
 
    public VolumeUpCommand(TV tv) {
        this.tv = tv;
    }
 
    @Override
    public void execute() {
        tv.volumeUp();
    }
 
    @Override
    public void undo() {
        tv.volumeDown();
    }
}
 
//音量减小命令
class VolumeDownCommand implements Command {
    private final TV tv;
 
    public VolumeDownCommand(TV tv) {
        this.tv = tv;
    }
 
    @Override
    public void execute() {
        tv.volumeDown();
    }
 
    @Override
    public void undo() {
        tv.volumeUp();
    }
}