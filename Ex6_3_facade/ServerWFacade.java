public class ServerWFacade {
    public static void main(String[] args) {
	ScheduleServer scheduleServer = new ScheduleServer();
	ServerManager ServerManager = new ServerManager(scheduleServer);
	
	ServerManager.StartServer();
	System.out.println("Start working......");
	System.out.println("After work done.........");
	ServerManager.StopServer();
    }
    
}
